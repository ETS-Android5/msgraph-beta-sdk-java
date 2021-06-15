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
import com.microsoft.graph.managedtenants.models.ManagementCategory;
import com.microsoft.graph.managedtenants.models.WorkloadAction;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Action.
 */
public class ManagementAction extends Entity implements IJsonBackedObject {


    /**
     * The Category.
     * 
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public ManagementCategory category;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Reference Template Id.
     * 
     */
    @SerializedName(value = "referenceTemplateId", alternate = {"ReferenceTemplateId"})
    @Expose
	@Nullable
    public String referenceTemplateId;

    /**
     * The Workload Actions.
     * 
     */
    @SerializedName(value = "workloadActions", alternate = {"WorkloadActions"})
    @Expose
	@Nullable
    public java.util.List<WorkloadAction> workloadActions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
