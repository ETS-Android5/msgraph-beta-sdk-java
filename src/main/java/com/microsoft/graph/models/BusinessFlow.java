// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.GovernancePolicy;
import com.microsoft.graph.models.BusinessFlowSettings;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow.
 */
public class BusinessFlow extends Entity implements IJsonBackedObject {


    /**
     * The Custom Data.
     * 
     */
    @SerializedName(value = "customData", alternate = {"CustomData"})
    @Expose
	@Nullable
    public String customData;

    /**
     * The De Duplication Id.
     * 
     */
    @SerializedName(value = "deDuplicationId", alternate = {"DeDuplicationId"})
    @Expose
	@Nullable
    public String deDuplicationId;

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
     * The Policy.
     * 
     */
    @SerializedName(value = "policy", alternate = {"Policy"})
    @Expose
	@Nullable
    public GovernancePolicy policy;

    /**
     * The Policy Template Id.
     * 
     */
    @SerializedName(value = "policyTemplateId", alternate = {"PolicyTemplateId"})
    @Expose
	@Nullable
    public String policyTemplateId;

    /**
     * The Record Version.
     * 
     */
    @SerializedName(value = "recordVersion", alternate = {"RecordVersion"})
    @Expose
	@Nullable
    public String recordVersion;

    /**
     * The Schema Id.
     * 
     */
    @SerializedName(value = "schemaId", alternate = {"SchemaId"})
    @Expose
	@Nullable
    public String schemaId;

    /**
     * The Settings.
     * 
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public BusinessFlowSettings settings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
