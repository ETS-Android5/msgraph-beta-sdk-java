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
import com.microsoft.graph.models.TimeCardBreak;
import com.microsoft.graph.models.TimeCardEvent;
import com.microsoft.graph.models.ConfirmedBy;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.TimeCardEntry;
import com.microsoft.graph.models.TimeCardState;
import com.microsoft.graph.models.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Card.
 */
public class TimeCard extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Breaks.
     * 
     */
    @SerializedName(value = "breaks", alternate = {"Breaks"})
    @Expose
	@Nullable
    public java.util.List<TimeCardBreak> breaks;

    /**
     * The Clock In Event.
     * 
     */
    @SerializedName(value = "clockInEvent", alternate = {"ClockInEvent"})
    @Expose
	@Nullable
    public TimeCardEvent clockInEvent;

    /**
     * The Clock Out Event.
     * 
     */
    @SerializedName(value = "clockOutEvent", alternate = {"ClockOutEvent"})
    @Expose
	@Nullable
    public TimeCardEvent clockOutEvent;

    /**
     * The Confirmed By.
     * 
     */
    @SerializedName(value = "confirmedBy", alternate = {"ConfirmedBy"})
    @Expose
	@Nullable
    public EnumSet<ConfirmedBy> confirmedBy;

    /**
     * The Notes.
     * 
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public ItemBody notes;

    /**
     * The Original Entry.
     * 
     */
    @SerializedName(value = "originalEntry", alternate = {"OriginalEntry"})
    @Expose
	@Nullable
    public TimeCardEntry originalEntry;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public TimeCardState state;

    /**
     * The User Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
