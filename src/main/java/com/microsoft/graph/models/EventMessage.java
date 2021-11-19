// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.Location;
import com.microsoft.graph.models.MeetingMessageType;
import com.microsoft.graph.models.PatternedRecurrence;
import com.microsoft.graph.models.EventType;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.Message;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message.
 */
public class EventMessage extends Message implements IJsonBackedObject {


    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone endDateTime;

    /**
     * The Is All Day.
     * 
     */
    @SerializedName(value = "isAllDay", alternate = {"IsAllDay"})
    @Expose
	@Nullable
    public Boolean isAllDay;

    /**
     * The Is Delegated.
     * 
     */
    @SerializedName(value = "isDelegated", alternate = {"IsDelegated"})
    @Expose
	@Nullable
    public Boolean isDelegated;

    /**
     * The Is Out Of Date.
     * 
     */
    @SerializedName(value = "isOutOfDate", alternate = {"IsOutOfDate"})
    @Expose
	@Nullable
    public Boolean isOutOfDate;

    /**
     * The Location.
     * 
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public Location location;

    /**
     * The Meeting Message Type.
     * 
     */
    @SerializedName(value = "meetingMessageType", alternate = {"MeetingMessageType"})
    @Expose
	@Nullable
    public MeetingMessageType meetingMessageType;

    /**
     * The Recurrence.
     * 
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
	@Nullable
    public PatternedRecurrence recurrence;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone startDateTime;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public EventType type;

    /**
     * The Event.
     * 
     */
    @SerializedName(value = "event", alternate = {"Event"})
    @Expose
	@Nullable
    public Event event;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
