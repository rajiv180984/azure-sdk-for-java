/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An traffic selector policy for a virtual network gateway connection.
 */
public class TrafficSelectorPolicy {
    /**
     * A collection of local address spaces in CIDR format.
     */
    @JsonProperty(value = "localAddressRanges", required = true)
    private List<String> localAddressRanges;

    /**
     * A collection of remote address spaces in CIDR format.
     */
    @JsonProperty(value = "remoteAddressRanges", required = true)
    private List<String> remoteAddressRanges;

    /**
     * Get a collection of local address spaces in CIDR format.
     *
     * @return the localAddressRanges value
     */
    public List<String> localAddressRanges() {
        return this.localAddressRanges;
    }

    /**
     * Set a collection of local address spaces in CIDR format.
     *
     * @param localAddressRanges the localAddressRanges value to set
     * @return the TrafficSelectorPolicy object itself.
     */
    public TrafficSelectorPolicy withLocalAddressRanges(List<String> localAddressRanges) {
        this.localAddressRanges = localAddressRanges;
        return this;
    }

    /**
     * Get a collection of remote address spaces in CIDR format.
     *
     * @return the remoteAddressRanges value
     */
    public List<String> remoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    /**
     * Set a collection of remote address spaces in CIDR format.
     *
     * @param remoteAddressRanges the remoteAddressRanges value to set
     * @return the TrafficSelectorPolicy object itself.
     */
    public TrafficSelectorPolicy withRemoteAddressRanges(List<String> remoteAddressRanges) {
        this.remoteAddressRanges = remoteAddressRanges;
        return this;
    }

}
