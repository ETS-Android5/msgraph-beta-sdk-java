// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AnalyticsActivityType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Statistics.
 */
public class ActivityStatistics extends Entity implements IJsonBackedObject {


    /**
     * The Activity.
     * The type of activity for which statistics are returned. The possible values are: call, chat, email, focus, and meeting.
     */
    @SerializedName(value = "activity", alternate = {"Activity"})
    @Expose
	@Nullable
    public AnalyticsActivityType activity;

    /**
     * The Duration.
     * Total hours spent on the activity. The value is represented in ISO 8601 format for durations.
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration duration;

    /**
     * The End Date.
     * Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format.
     */
    @SerializedName(value = "endDate", alternate = {"EndDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly endDate;

    /**
     * The Start Date.
     * Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format.
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly startDate;

    /**
     * The Time Zone Used.
     * The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.'
     */
    @SerializedName(value = "timeZoneUsed", alternate = {"TimeZoneUsed"})
    @Expose
	@Nullable
    public String timeZoneUsed;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
