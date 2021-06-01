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
import com.microsoft.graph.models.ServiceHealthStatus;
import com.microsoft.graph.models.ServiceHealthIssue;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ServiceHealthIssueCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Health.
 */
public class ServiceHealth extends Entity implements IJsonBackedObject {


    /**
     * The Service.
     * 
     */
    @SerializedName(value = "service", alternate = {"Service"})
    @Expose
	@Nullable
    public String service;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public ServiceHealthStatus status;

    /**
     * The Issues.
     * 
     */
    @SerializedName(value = "issues", alternate = {"Issues"})
    @Expose
	@Nullable
    public ServiceHealthIssueCollectionPage issues;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("issues")) {
            issues = serializer.deserializeObject(json.get("issues"), ServiceHealthIssueCollectionPage.class);
        }
    }
}
