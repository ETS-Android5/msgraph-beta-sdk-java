// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.EventMessageDetail;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Transcript Event Message Detail.
 */
public class CallTranscriptEventMessageDetail extends EventMessageDetail implements IJsonBackedObject {


    /**
     * The Call Id.
     * 
     */
    @SerializedName(value = "callId", alternate = {"CallId"})
    @Expose
	@Nullable
    public String callId;

    /**
     * The Call Transcript ICal Uid.
     * 
     */
    @SerializedName(value = "callTranscriptICalUid", alternate = {"CallTranscriptICalUid"})
    @Expose
	@Nullable
    public String callTranscriptICalUid;

    /**
     * The Meeting Organizer.
     * 
     */
    @SerializedName(value = "meetingOrganizer", alternate = {"MeetingOrganizer"})
    @Expose
	@Nullable
    public IdentitySet meetingOrganizer;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
