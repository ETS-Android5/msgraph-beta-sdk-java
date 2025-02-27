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
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Intent.
 */
public class ManagementIntent extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The display name for the management intent. Optional. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Global.
     * A flag indicating whether the management intent is global. Required. Read-only.
     */
    @SerializedName(value = "isGlobal", alternate = {"IsGlobal"})
    @Expose
	@Nullable
    public Boolean isGlobal;

    /**
     * The Management Templates.
     * The collection of management templates associated with the management intent. Optional. Read-only.
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
