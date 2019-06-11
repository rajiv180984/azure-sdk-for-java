/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiOperationPolicys;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.apimanagement.v2019_01_01.PolicyCollection;
import com.microsoft.azure.management.apimanagement.v2019_01_01.OperationApiPolicyContract;

class ApiOperationPolicysImpl extends WrapperImpl<ApiOperationPolicysInner> implements ApiOperationPolicys {
    private final ApiManagementManager manager;

    ApiOperationPolicysImpl(ApiManagementManager manager) {
        super(manager.inner().apiOperationPolicys());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public OperationApiPolicyContractImpl define(String name) {
        return wrapModel(name);
    }

    private OperationApiPolicyContractImpl wrapModel(PolicyContractInner inner) {
        return  new OperationApiPolicyContractImpl(inner, manager());
    }

    private OperationApiPolicyContractImpl wrapModel(String name) {
        return new OperationApiPolicyContractImpl(name, this.manager());
    }

    @Override
    public Observable<PolicyCollection> listByOperationAsync(String resourceGroupName, String serviceName, String apiId, String operationId) {
        ApiOperationPolicysInner client = this.inner();
        return client.listByOperationAsync(resourceGroupName, serviceName, apiId, operationId)
        .map(new Func1<PolicyCollectionInner, PolicyCollection>() {
            @Override
            public PolicyCollection call(PolicyCollectionInner inner) {
                return new PolicyCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String operationId) {
        ApiOperationPolicysInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId, operationId).toCompletable();
    }

    @Override
    public Observable<OperationApiPolicyContract> getAsync(String resourceGroupName, String serviceName, String apiId, String operationId) {
        ApiOperationPolicysInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId, operationId)
        .map(new Func1<PolicyContractInner, OperationApiPolicyContract>() {
            @Override
            public OperationApiPolicyContract call(PolicyContractInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String operationId, String ifMatch) {
        ApiOperationPolicysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, operationId, ifMatch).toCompletable();
    }

}