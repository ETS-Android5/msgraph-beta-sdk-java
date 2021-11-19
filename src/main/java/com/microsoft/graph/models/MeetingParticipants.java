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
import com.microsoft.graph.models.MeetingParticipantInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Meeting Participants.
 */
public class MeetingParticipants implements IJsonBackedObject {

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
     * The Attendees.
     * 
     */
    @SerializedName(value = "attendees", alternate = {"Attendees"})
    @Expose
	@Nullable
    public java.util.List<MeetingParticipantInfo> attendees;

    /**
     * The Contributors.
     * 
     */
    @SerializedName(value = "contributors", alternate = {"Contributors"})
    @Expose
	@Nullable
    public java.util.List<MeetingParticipantInfo> contributors;

    /**
     * The Organizer.
     * 
     */
    @SerializedName(value = "organizer", alternate = {"Organizer"})
    @Expose
	@Nullable
    public MeetingParticipantInfo organizer;

    /**
     * The Producers.
     * 
     */
    @SerializedName(value = "producers", alternate = {"Producers"})
    @Expose
	@Nullable
    public java.util.List<MeetingParticipantInfo> producers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
