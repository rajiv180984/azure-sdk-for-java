/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.azure.common.implementation.serializer.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.azure.common.implementation.util.TypeUtil;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Custom serializer for deserializing complex types with additional properties.
 * If a complex type has a property named "additionalProperties" with serialized
 * name empty ("") of type Map&lt;String, Object&gt;, all extra properties on the
 * payload will be stored in this map.
 */
final class AdditionalPropertiesDeserializer extends StdDeserializer<Object> implements ResolvableDeserializer {
    /**
     * The default mapperAdapter for the current type.
     */
    private final JsonDeserializer<?> defaultDeserializer;

    /**
     * The object mapper for default deserializations.
     */
    private final ObjectMapper mapper;

    /**
     * Creates FlatteningDeserializer.
     * @param vc handled type
     * @param defaultDeserializer the default JSON mapperAdapter
     * @param mapper the object mapper for default deserializations
     */
    protected AdditionalPropertiesDeserializer(Class<?> vc, JsonDeserializer<?> defaultDeserializer, ObjectMapper mapper) {
        super(vc);
        this.defaultDeserializer = defaultDeserializer;
        this.mapper = mapper;
    }

    /**
     * Gets a module wrapping this serializer as an adapter for the Jackson
     * ObjectMapper.
     *
     * @param mapper the object mapper for default deserializations
     * @return a simple module to be plugged onto Jackson ObjectMapper.
     */
    public static SimpleModule getModule(final ObjectMapper mapper) {
        SimpleModule module = new SimpleModule();
        module.setDeserializerModifier(new BeanDeserializerModifier() {
            @Override
            public JsonDeserializer<?> modifyDeserializer(DeserializationConfig config, BeanDescription beanDesc, JsonDeserializer<?> deserializer) {
                for (Class<?> c : TypeUtil.getAllClasses(beanDesc.getBeanClass())) {
                    Field[] fields = c.getDeclaredFields();
                    for (Field field : fields) {
                        if ("additionalProperties".equalsIgnoreCase(field.getName())) {
                            JsonProperty property = field.getAnnotation(JsonProperty.class);
                            if (property != null && property.value().isEmpty()) {
                                return new AdditionalPropertiesDeserializer(beanDesc.getBeanClass(), deserializer, mapper);
                            }
                        }
                    }
                }
                return deserializer;
            }
        });
        return module;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        ObjectNode root = mapper.readTree(jp);
        ObjectNode copy = root.deepCopy();

        // compare top level fields and keep only missing fields
        final Class<?> tClass = this.defaultDeserializer.handledType();
        for (Class<?> c : TypeUtil.getAllClasses(tClass)) {
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                JsonProperty property = field.getAnnotation(JsonProperty.class);
                String key = property.value().split("((?<!\\\\))\\.")[0];
                if (!key.isEmpty()) {
                    if (copy.has(key)) {
                        copy.remove(key);
                    }
                }
            }
        }

        // put into additional properties
        root.put("additionalProperties", copy);

        JsonParser parser = new JsonFactory().createParser(root.toString());
        parser.nextToken();
        return defaultDeserializer.deserialize(parser, ctxt);
    }

    @Override
    public void resolve(DeserializationContext ctxt) throws JsonMappingException {
        ((ResolvableDeserializer) defaultDeserializer).resolve(ctxt);
    }
}