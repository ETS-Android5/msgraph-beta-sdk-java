// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;
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
 * The class for the Catalog Entry.
 */
public class CatalogEntry extends Entity implements IJsonBackedObject {


    /**
     * The Deployable Until Date Time.
     * The date on which the content is no longer available to deploy using the service. Read-only.
     */
    @SerializedName(value = "deployableUntilDateTime", alternate = {"DeployableUntilDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deployableUntilDateTime;

    /**
     * The Display Name.
     * The display name of the content. Read-only.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Release Date Time.
     * The release date for the content. Read-only.
     */
    @SerializedName(value = "releaseDateTime", alternate = {"ReleaseDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime releaseDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
