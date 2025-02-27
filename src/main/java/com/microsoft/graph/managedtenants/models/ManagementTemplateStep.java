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
import com.microsoft.graph.models.ActionUrl;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStepVersion;
import com.microsoft.graph.managedtenants.models.ManagementTemplate;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepVersionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Step.
 */
public class ManagementTemplateStep extends Entity implements IJsonBackedObject {


    /**
     * The Category.
     * 
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public ManagementCategory category;

    /**
     * The Created By User Id.
     * 
     */
    @SerializedName(value = "createdByUserId", alternate = {"CreatedByUserId"})
    @Expose
	@Nullable
    public String createdByUserId;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

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
     * The Last Action By User Id.
     * 
     */
    @SerializedName(value = "lastActionByUserId", alternate = {"LastActionByUserId"})
    @Expose
	@Nullable
    public String lastActionByUserId;

    /**
     * The Last Action Date Time.
     * 
     */
    @SerializedName(value = "lastActionDateTime", alternate = {"LastActionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastActionDateTime;

    /**
     * The Portal Link.
     * 
     */
    @SerializedName(value = "portalLink", alternate = {"PortalLink"})
    @Expose
	@Nullable
    public ActionUrl portalLink;

    /**
     * The Priority.
     * 
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;

    /**
     * The Accepted Version.
     * 
     */
    @SerializedName(value = "acceptedVersion", alternate = {"AcceptedVersion"})
    @Expose
	@Nullable
    public ManagementTemplateStepVersion acceptedVersion;

    /**
     * The Management Template.
     * 
     */
    @SerializedName(value = "managementTemplate", alternate = {"ManagementTemplate"})
    @Expose
	@Nullable
    public ManagementTemplate managementTemplate;

    /**
     * The Versions.
     * 
     */
	@Nullable
    public ManagementTemplateStepVersionCollectionPage versions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("versions")) {
            versions = serializer.deserializeObject(json.get("versions"), ManagementTemplateStepVersionCollectionPage.class);
        }
    }
}
