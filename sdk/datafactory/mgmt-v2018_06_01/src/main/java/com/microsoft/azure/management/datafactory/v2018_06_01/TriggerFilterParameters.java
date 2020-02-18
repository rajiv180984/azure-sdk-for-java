/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query parameters for triggers.
 */
public class TriggerFilterParameters {
    /**
     * The continuation token for getting the next page of results. Null for
     * first page.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * The name of the parent TumblingWindowTrigger to get the child rerun
     * triggers.
     */
    @JsonProperty(value = "parentTriggerName")
    private String parentTriggerName;

    /**
     * Get the continuation token for getting the next page of results. Null for first page.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuation token for getting the next page of results. Null for first page.
     *
     * @param continuationToken the continuationToken value to set
     * @return the TriggerFilterParameters object itself.
     */
    public TriggerFilterParameters withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the name of the parent TumblingWindowTrigger to get the child rerun triggers.
     *
     * @return the parentTriggerName value
     */
    public String parentTriggerName() {
        return this.parentTriggerName;
    }

    /**
     * Set the name of the parent TumblingWindowTrigger to get the child rerun triggers.
     *
     * @param parentTriggerName the parentTriggerName value to set
     * @return the TriggerFilterParameters object itself.
     */
    public TriggerFilterParameters withParentTriggerName(String parentTriggerName) {
        this.parentTriggerName = parentTriggerName;
        return this;
    }

}
