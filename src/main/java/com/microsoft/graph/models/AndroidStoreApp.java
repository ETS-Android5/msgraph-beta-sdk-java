// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AndroidMinimumOperatingSystem;
import com.microsoft.graph.models.MobileApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Store App.
 */
public class AndroidStoreApp extends MobileApp implements IJsonBackedObject {


    /**
     * The App Identifier.
     * The Identity Name.
     */
    @SerializedName(value = "appIdentifier", alternate = {"AppIdentifier"})
    @Expose
	@Nullable
    public String appIdentifier;

    /**
     * The App Store Url.
     * The Android app store URL.
     */
    @SerializedName(value = "appStoreUrl", alternate = {"AppStoreUrl"})
    @Expose
	@Nullable
    public String appStoreUrl;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public AndroidMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Package Id.
     * The package identifier.
     */
    @SerializedName(value = "packageId", alternate = {"PackageId"})
    @Expose
	@Nullable
    public String packageId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
