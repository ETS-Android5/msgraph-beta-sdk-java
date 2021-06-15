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
import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.EventMessageDetail;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Member Role Updated Event Message Detail.
 */
public class ConversationMemberRoleUpdatedEventMessageDetail extends EventMessageDetail implements IJsonBackedObject {


    /**
     * The Conversation Member Roles.
     * 
     */
    @SerializedName(value = "conversationMemberRoles", alternate = {"ConversationMemberRoles"})
    @Expose
	@Nullable
    public java.util.List<String> conversationMemberRoles;

    /**
     * The Conversation Member User.
     * 
     */
    @SerializedName(value = "conversationMemberUser", alternate = {"ConversationMemberUser"})
    @Expose
	@Nullable
    public Identity conversationMemberUser;

    /**
     * The Initiator.
     * 
     */
    @SerializedName(value = "initiator", alternate = {"Initiator"})
    @Expose
	@Nullable
    public IdentitySet initiator;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
