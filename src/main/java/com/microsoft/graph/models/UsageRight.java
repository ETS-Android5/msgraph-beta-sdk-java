// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UsageRightState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Usage Right.
 */
public class UsageRight extends Entity implements IJsonBackedObject {


    /**
     * The Catalog Id.
     * Product id corresponding to the usage right.
     */
    @SerializedName(value = "catalogId", alternate = {"CatalogId"})
    @Expose
	@Nullable
    public String catalogId;

    /**
     * The Service Identifier.
     * Identifier of the service corresponding to the usage right.
     */
    @SerializedName(value = "serviceIdentifier", alternate = {"ServiceIdentifier"})
    @Expose
	@Nullable
    public String serviceIdentifier;

    /**
     * The State.
     * The state of the usage right. Possible values are: active, inactive, warning, suspended.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public UsageRightState state;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
