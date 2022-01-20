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
 * The class for the Chat Info.
 */
public class ChatInfo implements IJsonBackedObject {

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
     * The Message Id.
     * The unique identifier for a message in a Microsoft Teams channel.
     */
    @SerializedName(value = "messageId", alternate = {"MessageId"})
    @Expose
	@Nullable
    public String messageId;

    /**
     * The Reply Chain Message Id.
     * The ID of the reply message.
     */
    @SerializedName(value = "replyChainMessageId", alternate = {"ReplyChainMessageId"})
    @Expose
	@Nullable
    public String replyChainMessageId;

    /**
     * The Thread Id.
     * The unique identifier for a thread in Microsoft Teams.
     */
    @SerializedName(value = "threadId", alternate = {"ThreadId"})
    @Expose
	@Nullable
    public String threadId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
