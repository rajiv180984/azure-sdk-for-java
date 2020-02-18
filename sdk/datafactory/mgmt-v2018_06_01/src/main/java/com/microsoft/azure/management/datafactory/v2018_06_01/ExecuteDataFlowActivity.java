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
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Execute data flow activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ExecuteDataFlowActivity.class)
@JsonTypeName("ExecuteDataFlow")
@JsonFlatten
public class ExecuteDataFlowActivity extends ExecutionActivity {
    /**
     * Data flow reference.
     */
    @JsonProperty(value = "typeProperties.dataFlow", required = true)
    private DataFlowReference dataFlow;

    /**
     * Staging info for execute data flow activity.
     */
    @JsonProperty(value = "typeProperties.staging")
    private DataFlowStagingInfo staging;

    /**
     * The integration runtime reference.
     */
    @JsonProperty(value = "typeProperties.integrationRuntime")
    private IntegrationRuntimeReference integrationRuntime;

    /**
     * Compute properties for data flow activity.
     */
    @JsonProperty(value = "typeProperties.compute")
    private ExecuteDataFlowActivityTypePropertiesCompute compute;

    /**
     * Get data flow reference.
     *
     * @return the dataFlow value
     */
    public DataFlowReference dataFlow() {
        return this.dataFlow;
    }

    /**
     * Set data flow reference.
     *
     * @param dataFlow the dataFlow value to set
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withDataFlow(DataFlowReference dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get staging info for execute data flow activity.
     *
     * @return the staging value
     */
    public DataFlowStagingInfo staging() {
        return this.staging;
    }

    /**
     * Set staging info for execute data flow activity.
     *
     * @param staging the staging value to set
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withStaging(DataFlowStagingInfo staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the integration runtime reference.
     *
     * @return the integrationRuntime value
     */
    public IntegrationRuntimeReference integrationRuntime() {
        return this.integrationRuntime;
    }

    /**
     * Set the integration runtime reference.
     *
     * @param integrationRuntime the integrationRuntime value to set
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withIntegrationRuntime(IntegrationRuntimeReference integrationRuntime) {
        this.integrationRuntime = integrationRuntime;
        return this;
    }

    /**
     * Get compute properties for data flow activity.
     *
     * @return the compute value
     */
    public ExecuteDataFlowActivityTypePropertiesCompute compute() {
        return this.compute;
    }

    /**
     * Set compute properties for data flow activity.
     *
     * @param compute the compute value to set
     * @return the ExecuteDataFlowActivity object itself.
     */
    public ExecuteDataFlowActivity withCompute(ExecuteDataFlowActivityTypePropertiesCompute compute) {
        this.compute = compute;
        return this;
    }

}
