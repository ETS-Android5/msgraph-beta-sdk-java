// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Allowed Data Location.
 */
public class AllowedDataLocation extends Entity implements IJsonBackedObject {


    /**
     * The App Id.
     * 
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Domain.
     * 
     */
    @SerializedName(value = "domain", alternate = {"Domain"})
    @Expose
	@Nullable
    public String domain;

    /**
     * The Is Default.
     * 
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
	@Nullable
    public Boolean isDefault;

    /**
     * The Location.
     * 
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public String location;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
