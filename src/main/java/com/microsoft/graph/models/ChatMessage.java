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
import com.microsoft.graph.models.ChatMessageAttachment;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.ChannelIdentity;
import com.microsoft.graph.models.EventMessageDetail;
import com.microsoft.graph.models.ChatMessageFromIdentitySet;
import com.microsoft.graph.models.ChatMessageImportance;
import com.microsoft.graph.models.ChatMessageMention;
import com.microsoft.graph.models.ChatMessageType;
import com.microsoft.graph.models.ChatMessagePolicyViolation;
import com.microsoft.graph.models.ChatMessageReaction;
import com.microsoft.graph.models.ChatMessageHostedContent;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ChatMessageHostedContentCollectionPage;
import com.microsoft.graph.requests.ChatMessageCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message.
 */
public class ChatMessage extends Entity implements IJsonBackedObject {


    /**
     * The Attachments.
     * 
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
	@Nullable
    public java.util.List<ChatMessageAttachment> attachments;

    /**
     * The Body.
     * 
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Channel Identity.
     * 
     */
    @SerializedName(value = "channelIdentity", alternate = {"ChannelIdentity"})
    @Expose
	@Nullable
    public ChannelIdentity channelIdentity;

    /**
     * The Chat Id.
     * 
     */
    @SerializedName(value = "chatId", alternate = {"ChatId"})
    @Expose
	@Nullable
    public String chatId;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Deleted Date Time.
     * 
     */
    @SerializedName(value = "deletedDateTime", alternate = {"DeletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime deletedDateTime;

    /**
     * The Etag.
     * 
     */
    @SerializedName(value = "etag", alternate = {"Etag"})
    @Expose
	@Nullable
    public String etag;

    /**
     * The Event Detail.
     * 
     */
    @SerializedName(value = "eventDetail", alternate = {"EventDetail"})
    @Expose
	@Nullable
    public EventMessageDetail eventDetail;

    /**
     * The From.
     * 
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
	@Nullable
    public ChatMessageFromIdentitySet from;

    /**
     * The Importance.
     * 
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
	@Nullable
    public ChatMessageImportance importance;

    /**
     * The Last Edited Date Time.
     * 
     */
    @SerializedName(value = "lastEditedDateTime", alternate = {"LastEditedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastEditedDateTime;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Locale.
     * 
     */
    @SerializedName(value = "locale", alternate = {"Locale"})
    @Expose
	@Nullable
    public String locale;

    /**
     * The Mentions.
     * 
     */
    @SerializedName(value = "mentions", alternate = {"Mentions"})
    @Expose
	@Nullable
    public java.util.List<ChatMessageMention> mentions;

    /**
     * The Message Type.
     * 
     */
    @SerializedName(value = "messageType", alternate = {"MessageType"})
    @Expose
	@Nullable
    public ChatMessageType messageType;

    /**
     * The Policy Violation.
     * 
     */
    @SerializedName(value = "policyViolation", alternate = {"PolicyViolation"})
    @Expose
	@Nullable
    public ChatMessagePolicyViolation policyViolation;

    /**
     * The Reactions.
     * 
     */
    @SerializedName(value = "reactions", alternate = {"Reactions"})
    @Expose
	@Nullable
    public java.util.List<ChatMessageReaction> reactions;

    /**
     * The Reply To Id.
     * 
     */
    @SerializedName(value = "replyToId", alternate = {"ReplyToId"})
    @Expose
	@Nullable
    public String replyToId;

    /**
     * The Subject.
     * 
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The Summary.
     * 
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
	@Nullable
    public String summary;

    /**
     * The Web Url.
     * 
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Hosted Contents.
     * 
     */
    @SerializedName(value = "hostedContents", alternate = {"HostedContents"})
    @Expose
	@Nullable
    public ChatMessageHostedContentCollectionPage hostedContents;

    /**
     * The Replies.
     * 
     */
    @SerializedName(value = "replies", alternate = {"Replies"})
    @Expose
	@Nullable
    public ChatMessageCollectionPage replies;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("hostedContents")) {
            hostedContents = serializer.deserializeObject(json.get("hostedContents"), ChatMessageHostedContentCollectionPage.class);
        }

        if (json.has("replies")) {
            replies = serializer.deserializeObject(json.get("replies"), ChatMessageCollectionPage.class);
        }
    }
}
