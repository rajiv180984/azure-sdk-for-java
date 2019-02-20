/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a size category supported by this Lab Account (small, medium or
 * large).
 */
public class EnvironmentSizeFragment {
    /**
     * The size category. Possible values include: 'Basic', 'Standard',
     * 'Performance'.
     */
    @JsonProperty(value = "name")
    private ManagedLabVmSize name;

    /**
     * Represents a set of compute sizes that can serve this given size type.
     */
    @JsonProperty(value = "vmSizes")
    private List<SizeInfoFragment> vmSizes;

    /**
     * Get the size category. Possible values include: 'Basic', 'Standard', 'Performance'.
     *
     * @return the name value
     */
    public ManagedLabVmSize name() {
        return this.name;
    }

    /**
     * Set the size category. Possible values include: 'Basic', 'Standard', 'Performance'.
     *
     * @param name the name value to set
     * @return the EnvironmentSizeFragment object itself.
     */
    public EnvironmentSizeFragment withName(ManagedLabVmSize name) {
        this.name = name;
        return this;
    }

    /**
     * Get represents a set of compute sizes that can serve this given size type.
     *
     * @return the vmSizes value
     */
    public List<SizeInfoFragment> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set represents a set of compute sizes that can serve this given size type.
     *
     * @param vmSizes the vmSizes value to set
     * @return the EnvironmentSizeFragment object itself.
     */
    public EnvironmentSizeFragment withVmSizes(List<SizeInfoFragment> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

}