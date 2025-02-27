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
import com.microsoft.graph.models.ConditionalAccessDevicePlatform;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Platforms.
 */
public class ConditionalAccessPlatforms implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Exclude Platforms.
     * Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue, linux.
     */
    @SerializedName(value = "excludePlatforms", alternate = {"ExcludePlatforms"})
    @Expose
	@Nullable
    public java.util.List<ConditionalAccessDevicePlatform> excludePlatforms;

    /**
     * The Include Platforms.
     * Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue,linux``.
     */
    @SerializedName(value = "includePlatforms", alternate = {"IncludePlatforms"})
    @Expose
	@Nullable
    public java.util.List<ConditionalAccessDevicePlatform> includePlatforms;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
