// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DayOfWeek;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Update Time Window.
 */
public class CustomUpdateTimeWindow implements IJsonBackedObject {

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
     * The End Day.
     * End day of the time window
     */
    @SerializedName(value = "endDay", alternate = {"EndDay"})
    @Expose
	@Nullable
    public DayOfWeek endDay;

    /**
     * The End Time.
     * End time of the time window
     */
    @SerializedName(value = "endTime", alternate = {"EndTime"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.TimeOfDay endTime;

    /**
     * The Start Day.
     * Start day of the time window
     */
    @SerializedName(value = "startDay", alternate = {"StartDay"})
    @Expose
	@Nullable
    public DayOfWeek startDay;

    /**
     * The Start Time.
     * Start time of the time window
     */
    @SerializedName(value = "startTime", alternate = {"StartTime"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.TimeOfDay startTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
