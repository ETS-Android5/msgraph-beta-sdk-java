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
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Announcement Base.
 */
public class ServiceAnnouncementBase extends Entity implements IJsonBackedObject {


    /**
     * The Details.
     * Additional details about service event. This property doesn't support filters.
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
	@Nullable
    public java.util.List<KeyValuePair> details;

    /**
     * The End Date Time.
     * The end time of the service event.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Last Modified Date Time.
     * The last modified time of the service event.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Start Date Time.
     * The start time of the service event.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Title.
     * The title of the service event.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
