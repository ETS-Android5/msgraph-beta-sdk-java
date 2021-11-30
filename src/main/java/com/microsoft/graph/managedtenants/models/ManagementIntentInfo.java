// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.managedtenants.models.ManagementTemplateDetailedInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Intent Info.
 */
public class ManagementIntentInfo implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Management Intent Display Name.
     * The display name for the management intent. Optional. Read-only.
     */
    @SerializedName(value = "managementIntentDisplayName", alternate = {"ManagementIntentDisplayName"})
    @Expose
	@Nullable
    public String managementIntentDisplayName;

    /**
     * The Management Intent Id.
     * The identifier for the management intent. Required. Read-only.
     */
    @SerializedName(value = "managementIntentId", alternate = {"ManagementIntentId"})
    @Expose
	@Nullable
    public String managementIntentId;

    /**
     * The Management Templates.
     * The collection of management template information associated with the management intent. Optional. Read-only.
     */
    @SerializedName(value = "managementTemplates", alternate = {"ManagementTemplates"})
    @Expose
	@Nullable
    public java.util.List<ManagementTemplateDetailedInfo> managementTemplates;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
