// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ServiceHealth;
import com.microsoft.graph.models.ServiceHealthIssue;
import com.microsoft.graph.models.ServiceUpdateMessage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ServiceHealthCollectionPage;
import com.microsoft.graph.requests.ServiceHealthIssueCollectionPage;
import com.microsoft.graph.requests.ServiceUpdateMessageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Announcement.
 */
public class ServiceAnnouncement extends Entity implements IJsonBackedObject {


    /**
     * The Health Overviews.
     * A collection of service health information for tenant. This property is a contained navigation property, it is nullable and readonly.
     */
    @SerializedName(value = "healthOverviews", alternate = {"HealthOverviews"})
    @Expose
	@Nullable
    public ServiceHealthCollectionPage healthOverviews;

    /**
     * The Issues.
     * A collection of service issues for tenant. This property is a contained navigation property, it is nullable and readonly.
     */
    @SerializedName(value = "issues", alternate = {"Issues"})
    @Expose
	@Nullable
    public ServiceHealthIssueCollectionPage issues;

    /**
     * The Messages.
     * A collection of service messages for tenant. This property is a contained navigation property, it is nullable and readonly.
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
	@Nullable
    public ServiceUpdateMessageCollectionPage messages;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("healthOverviews")) {
            healthOverviews = serializer.deserializeObject(json.get("healthOverviews"), ServiceHealthCollectionPage.class);
        }

        if (json.has("issues")) {
            issues = serializer.deserializeObject(json.get("issues"), ServiceHealthIssueCollectionPage.class);
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages"), ServiceUpdateMessageCollectionPage.class);
        }
    }
}
