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
import com.microsoft.graph.models.MobileContainedApp;
import com.microsoft.graph.models.MobileAppContentFile;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.MobileContainedAppCollectionPage;
import com.microsoft.graph.requests.MobileAppContentFileCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content.
 */
public class MobileAppContent extends Entity implements IJsonBackedObject {


    /**
     * The Contained Apps.
     * The collection of contained apps in a MobileLobApp acting as a package.
     */
    @SerializedName(value = "containedApps", alternate = {"ContainedApps"})
    @Expose
	@Nullable
    public MobileContainedAppCollectionPage containedApps;

    /**
     * The Files.
     * The list of files for this app content version.
     */
    @SerializedName(value = "files", alternate = {"Files"})
    @Expose
	@Nullable
    public MobileAppContentFileCollectionPage files;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("containedApps")) {
            containedApps = serializer.deserializeObject(json.get("containedApps"), MobileContainedAppCollectionPage.class);
        }

        if (json.has("files")) {
            files = serializer.deserializeObject(json.get("files"), MobileAppContentFileCollectionPage.class);
        }
    }
}
