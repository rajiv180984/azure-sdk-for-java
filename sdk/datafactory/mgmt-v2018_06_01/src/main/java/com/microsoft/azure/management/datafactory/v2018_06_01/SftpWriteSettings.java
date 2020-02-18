/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Sftp write settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SftpWriteSettings.class)
@JsonTypeName("SftpWriteSettings")
public class SftpWriteSettings extends StoreWriteSettings {
    /**
     * Specifies the timeout for writing each chunk to SFTP server. Default
     * value: 01:00:00 (one hour). Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "operationTimeout")
    private Object operationTimeout;

    /**
     * Get specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     *
     * @return the operationTimeout value
     */
    public Object operationTimeout() {
        return this.operationTimeout;
    }

    /**
     * Set specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     *
     * @param operationTimeout the operationTimeout value to set
     * @return the SftpWriteSettings object itself.
     */
    public SftpWriteSettings withOperationTimeout(Object operationTimeout) {
        this.operationTimeout = operationTimeout;
        return this;
    }

}
