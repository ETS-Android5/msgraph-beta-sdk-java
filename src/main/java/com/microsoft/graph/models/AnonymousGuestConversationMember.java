// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ConversationMember;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Anonymous Guest Conversation Member.
 */
public class AnonymousGuestConversationMember extends ConversationMember implements IJsonBackedObject {


    /**
     * The Anonymous Guest Id.
     * Unique ID that represents the user. Note: This ID can change if the user leaves and rejoins the meeting, or joins from a different device.
     */
    @SerializedName(value = "anonymousGuestId", alternate = {"AnonymousGuestId"})
    @Expose
	@Nullable
    public String anonymousGuestId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
