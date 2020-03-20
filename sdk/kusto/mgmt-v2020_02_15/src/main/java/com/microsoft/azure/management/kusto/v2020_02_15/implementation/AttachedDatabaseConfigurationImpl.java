/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15.implementation;

import com.microsoft.azure.management.kusto.v2020_02_15.AttachedDatabaseConfiguration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.kusto.v2020_02_15.ProvisioningState;
import java.util.List;
import com.microsoft.azure.management.kusto.v2020_02_15.DefaultPrincipalsModificationKind;

class AttachedDatabaseConfigurationImpl extends CreatableUpdatableImpl<AttachedDatabaseConfiguration, AttachedDatabaseConfigurationInner, AttachedDatabaseConfigurationImpl> implements AttachedDatabaseConfiguration, AttachedDatabaseConfiguration.Definition, AttachedDatabaseConfiguration.Update {
    private final KustoManager manager;
    private String resourceGroupName;
    private String clusterName;
    private String attachedDatabaseConfigurationName;

    AttachedDatabaseConfigurationImpl(String name, KustoManager manager) {
        super(name, new AttachedDatabaseConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.attachedDatabaseConfigurationName = name;
        //
    }

    AttachedDatabaseConfigurationImpl(AttachedDatabaseConfigurationInner inner, KustoManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.attachedDatabaseConfigurationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.clusterName = IdParsingUtils.getValueFromIdByName(inner.id(), "clusters");
        this.attachedDatabaseConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "attachedDatabaseConfigurations");
        //
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AttachedDatabaseConfiguration> createResourceAsync() {
        AttachedDatabaseConfigurationsInner client = this.manager().inner().attachedDatabaseConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.clusterName, this.attachedDatabaseConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AttachedDatabaseConfiguration> updateResourceAsync() {
        AttachedDatabaseConfigurationsInner client = this.manager().inner().attachedDatabaseConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.clusterName, this.attachedDatabaseConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AttachedDatabaseConfigurationInner> getInnerAsync() {
        AttachedDatabaseConfigurationsInner client = this.manager().inner().attachedDatabaseConfigurations();
        return client.getAsync(this.resourceGroupName, this.clusterName, this.attachedDatabaseConfigurationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> attachedDatabaseNames() {
        return this.inner().attachedDatabaseNames();
    }

    @Override
    public String clusterResourceId() {
        return this.inner().clusterResourceId();
    }

    @Override
    public String databaseName() {
        return this.inner().databaseName();
    }

    @Override
    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.inner().defaultPrincipalsModificationKind();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AttachedDatabaseConfigurationImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    @Override
    public AttachedDatabaseConfigurationImpl withClusterResourceId(String clusterResourceId) {
        this.inner().withClusterResourceId(clusterResourceId);
        return this;
    }

    @Override
    public AttachedDatabaseConfigurationImpl withDatabaseName(String databaseName) {
        this.inner().withDatabaseName(databaseName);
        return this;
    }

    @Override
    public AttachedDatabaseConfigurationImpl withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.inner().withDefaultPrincipalsModificationKind(defaultPrincipalsModificationKind);
        return this;
    }

    @Override
    public AttachedDatabaseConfigurationImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

}
