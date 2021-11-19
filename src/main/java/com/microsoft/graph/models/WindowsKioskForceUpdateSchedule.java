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
import com.microsoft.graph.models.Windows10AppsUpdateRecurrence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Kiosk Force Update Schedule.
 */
public class WindowsKioskForceUpdateSchedule implements IJsonBackedObject {

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
     * The Dayof Month.
     * Day of month. Valid values 1 to 31
     */
    @SerializedName(value = "dayofMonth", alternate = {"DayofMonth"})
    @Expose
	@Nullable
    public Integer dayofMonth;

    /**
     * The Dayof Week.
     * Day of week.
     */
    @SerializedName(value = "dayofWeek", alternate = {"DayofWeek"})
    @Expose
	@Nullable
    public DayOfWeek dayofWeek;

    /**
     * The Recurrence.
     * Recurrence schedule.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
	@Nullable
    public Windows10AppsUpdateRecurrence recurrence;

    /**
     * The Run Immediately If After Start Date Time.
     * If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.
     */
    @SerializedName(value = "runImmediatelyIfAfterStartDateTime", alternate = {"RunImmediatelyIfAfterStartDateTime"})
    @Expose
	@Nullable
    public Boolean runImmediatelyIfAfterStartDateTime;

    /**
     * The Start Date Time.
     * The start time for the force restart.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
