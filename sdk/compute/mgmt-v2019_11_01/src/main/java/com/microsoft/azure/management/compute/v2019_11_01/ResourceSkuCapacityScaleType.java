/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResourceSkuCapacityScaleType.
 */
public enum ResourceSkuCapacityScaleType {
    /** Enum value Automatic. */
    AUTOMATIC("Automatic"),

    /** Enum value Manual. */
    MANUAL("Manual"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ResourceSkuCapacityScaleType instance. */
    private String value;

    ResourceSkuCapacityScaleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceSkuCapacityScaleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceSkuCapacityScaleType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceSkuCapacityScaleType fromString(String value) {
        ResourceSkuCapacityScaleType[] items = ResourceSkuCapacityScaleType.values();
        for (ResourceSkuCapacityScaleType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
