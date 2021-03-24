// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Recurrence Settings.
 */
public class AccessReviewRecurrenceSettings implements IJsonBackedObject {

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
     * The Duration In Days.
     * The duration in days for recurrence.
     */
    @SerializedName(value = "durationInDays", alternate = {"DurationInDays"})
    @Expose
	@Nullable
    public Integer durationInDays;

    /**
     * The Recurrence Count.
     * The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     */
    @SerializedName(value = "recurrenceCount", alternate = {"RecurrenceCount"})
    @Expose
	@Nullable
    public Integer recurrenceCount;

    /**
     * The Recurrence End Type.
     * How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed.
     */
    @SerializedName(value = "recurrenceEndType", alternate = {"RecurrenceEndType"})
    @Expose
	@Nullable
    public String recurrenceEndType;

    /**
     * The Recurrence Type.
     * The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual.
     */
    @SerializedName(value = "recurrenceType", alternate = {"RecurrenceType"})
    @Expose
	@Nullable
    public String recurrenceType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
