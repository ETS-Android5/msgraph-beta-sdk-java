// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.windowsupdates.models.UpdatableAsset;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.windowsupdates.requests.UpdatableAssetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Deployment Audience.
 */
public class DeploymentAudience extends Entity implements IJsonBackedObject {


    /**
     * The Exclusions.
     * 
     */
    @SerializedName(value = "exclusions", alternate = {"Exclusions"})
    @Expose
	@Nullable
    public UpdatableAssetCollectionPage exclusions;

    /**
     * The Members.
     * 
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
	@Nullable
    public UpdatableAssetCollectionPage members;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("exclusions")) {
            exclusions = serializer.deserializeObject(json.get("exclusions"), UpdatableAssetCollectionPage.class);
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), UpdatableAssetCollectionPage.class);
        }
    }
}
