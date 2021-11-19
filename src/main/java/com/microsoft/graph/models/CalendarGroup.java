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
import com.microsoft.graph.models.Calendar;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.CalendarCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group.
 */
public class CalendarGroup extends Entity implements IJsonBackedObject {


    /**
     * The Change Key.
     * 
     */
    @SerializedName(value = "changeKey", alternate = {"ChangeKey"})
    @Expose
	@Nullable
    public String changeKey;

    /**
     * The Class Id.
     * 
     */
    @SerializedName(value = "classId", alternate = {"ClassId"})
    @Expose
	@Nullable
    public java.util.UUID classId;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Calendars.
     * 
     */
    @SerializedName(value = "calendars", alternate = {"Calendars"})
    @Expose
	@Nullable
    public CalendarCollectionPage calendars;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("calendars")) {
            calendars = serializer.deserializeObject(json.get("calendars"), CalendarCollectionPage.class);
        }
    }
}
