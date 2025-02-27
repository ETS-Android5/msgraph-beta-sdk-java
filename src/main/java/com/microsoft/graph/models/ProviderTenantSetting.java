// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provider Tenant Setting.
 */
public class ProviderTenantSetting extends Entity implements IJsonBackedObject {


    /**
     * The Azure Tenant Id.
     * 
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
	@Nullable
    public String azureTenantId;

    /**
     * The Enabled.
     * 
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
	@Nullable
    public Boolean enabled;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Provider.
     * 
     */
    @SerializedName(value = "provider", alternate = {"Provider"})
    @Expose
	@Nullable
    public String provider;

    /**
     * The Vendor.
     * 
     */
    @SerializedName(value = "vendor", alternate = {"Vendor"})
    @Expose
	@Nullable
    public String vendor;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
