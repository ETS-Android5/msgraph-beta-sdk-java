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
import com.microsoft.graph.managedtenants.models.ManagementTemplateStep;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStepDeployment;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepDeploymentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Step Version.
 */
public class ManagementTemplateStepVersion extends Entity implements IJsonBackedObject {


    /**
     * The Content Markdown.
     * 
     */
    @SerializedName(value = "contentMarkdown", alternate = {"ContentMarkdown"})
    @Expose
	@Nullable
    public String contentMarkdown;

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
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Version.
     * 
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;

    /**
     * The Version Information.
     * 
     */
    @SerializedName(value = "versionInformation", alternate = {"VersionInformation"})
    @Expose
	@Nullable
    public String versionInformation;

    /**
     * The Accepted For.
     * 
     */
    @SerializedName(value = "acceptedFor", alternate = {"AcceptedFor"})
    @Expose
	@Nullable
    public ManagementTemplateStep acceptedFor;

    /**
     * The Deployments.
     * 
     */
    @SerializedName(value = "deployments", alternate = {"Deployments"})
    @Expose
	@Nullable
    public ManagementTemplateStepDeploymentCollectionPage deployments;

    /**
     * The Template Step.
     * 
     */
    @SerializedName(value = "templateStep", alternate = {"TemplateStep"})
    @Expose
	@Nullable
    public ManagementTemplateStep templateStep;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("deployments")) {
            deployments = serializer.deserializeObject(json.get("deployments"), ManagementTemplateStepDeploymentCollectionPage.class);
        }
    }
}
