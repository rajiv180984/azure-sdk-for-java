/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.PolicyContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;

/**
 * Type representing ApiPolicyContract.
 */
public interface ApiPolicyContract extends HasInner<PolicyContractInner>, Indexable, Refreshable<ApiPolicyContract>, Updatable<ApiPolicyContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the format value.
     */
    PolicyContentFormat format();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the value value.
     */
    String value();

    /**
     * The entirety of the ApiPolicyContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithIfMatch, DefinitionStages.WithValue, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ApiPolicyContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ApiPolicyContract definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the apipolicycontract definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, serviceName, apiId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number
            * @return the next definition stage
            */
            WithIfMatch withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the apipolicycontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithValue withIfMatch(String ifMatch);
        }

        /**
         * The stage of the apipolicycontract definition allowing to specify Value.
         */
        interface WithValue {
           /**
            * Specifies value.
            * @param value Contents of the Policy as defined by the format
            * @return the next definition stage
            */
            WithCreate withValue(String value);
        }

        /**
         * The stage of the apipolicycontract definition allowing to specify Format.
         */
        interface WithFormat {
            /**
             * Specifies format.
             * @param format Format of the policyContent. Possible values include: 'xml', 'xml-link', 'rawxml', 'rawxml-link'
             * @return the next definition stage
             */
            WithCreate withFormat(PolicyContentFormat format);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ApiPolicyContract>, DefinitionStages.WithFormat {
        }
    }
    /**
     * The template for a ApiPolicyContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ApiPolicyContract>, UpdateStages.WithIfMatch, UpdateStages.WithFormat {
    }

    /**
     * Grouping of ApiPolicyContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the apipolicycontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the apipolicycontract update allowing to specify Format.
         */
        interface WithFormat {
            /**
             * Specifies format.
             * @param format Format of the policyContent. Possible values include: 'xml', 'xml-link', 'rawxml', 'rawxml-link'
             * @return the next update stage
             */
            Update withFormat(PolicyContentFormat format);
        }

    }
}
