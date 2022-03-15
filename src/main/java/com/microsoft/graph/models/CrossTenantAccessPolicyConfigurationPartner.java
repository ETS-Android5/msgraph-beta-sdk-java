// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CrossTenantAccessPolicyConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cross Tenant Access Policy Configuration Partner.
 */
public class CrossTenantAccessPolicyConfigurationPartner extends CrossTenantAccessPolicyConfigurationBase implements IJsonBackedObject {


    /**
     * The Is Service Provider.
     * Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
     */
    @SerializedName(value = "isServiceProvider", alternate = {"IsServiceProvider"})
    @Expose
	@Nullable
    public Boolean isServiceProvider;

    /**
     * The Tenant Id.
     * The tenant identifier for the partner Azure AD organization. Read-only. Key.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
