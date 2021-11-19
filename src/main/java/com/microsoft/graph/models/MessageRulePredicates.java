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
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Importance;
import com.microsoft.graph.models.MessageActionFlag;
import com.microsoft.graph.models.Sensitivity;
import com.microsoft.graph.models.SizeRange;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Rule Predicates.
 */
public class MessageRulePredicates implements IJsonBackedObject {

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
     * The Body Contains.
     * 
     */
    @SerializedName(value = "bodyContains", alternate = {"BodyContains"})
    @Expose
	@Nullable
    public java.util.List<String> bodyContains;

    /**
     * The Body Or Subject Contains.
     * 
     */
    @SerializedName(value = "bodyOrSubjectContains", alternate = {"BodyOrSubjectContains"})
    @Expose
	@Nullable
    public java.util.List<String> bodyOrSubjectContains;

    /**
     * The Categories.
     * 
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public java.util.List<String> categories;

    /**
     * The From Addresses.
     * 
     */
    @SerializedName(value = "fromAddresses", alternate = {"FromAddresses"})
    @Expose
	@Nullable
    public java.util.List<Recipient> fromAddresses;

    /**
     * The Has Attachments.
     * 
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
	@Nullable
    public Boolean hasAttachments;

    /**
     * The Header Contains.
     * 
     */
    @SerializedName(value = "headerContains", alternate = {"HeaderContains"})
    @Expose
	@Nullable
    public java.util.List<String> headerContains;

    /**
     * The Importance.
     * 
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
	@Nullable
    public Importance importance;

    /**
     * The Is Approval Request.
     * 
     */
    @SerializedName(value = "isApprovalRequest", alternate = {"IsApprovalRequest"})
    @Expose
	@Nullable
    public Boolean isApprovalRequest;

    /**
     * The Is Automatic Forward.
     * 
     */
    @SerializedName(value = "isAutomaticForward", alternate = {"IsAutomaticForward"})
    @Expose
	@Nullable
    public Boolean isAutomaticForward;

    /**
     * The Is Automatic Reply.
     * 
     */
    @SerializedName(value = "isAutomaticReply", alternate = {"IsAutomaticReply"})
    @Expose
	@Nullable
    public Boolean isAutomaticReply;

    /**
     * The Is Encrypted.
     * 
     */
    @SerializedName(value = "isEncrypted", alternate = {"IsEncrypted"})
    @Expose
	@Nullable
    public Boolean isEncrypted;

    /**
     * The Is Meeting Request.
     * 
     */
    @SerializedName(value = "isMeetingRequest", alternate = {"IsMeetingRequest"})
    @Expose
	@Nullable
    public Boolean isMeetingRequest;

    /**
     * The Is Meeting Response.
     * 
     */
    @SerializedName(value = "isMeetingResponse", alternate = {"IsMeetingResponse"})
    @Expose
	@Nullable
    public Boolean isMeetingResponse;

    /**
     * The Is Non Delivery Report.
     * 
     */
    @SerializedName(value = "isNonDeliveryReport", alternate = {"IsNonDeliveryReport"})
    @Expose
	@Nullable
    public Boolean isNonDeliveryReport;

    /**
     * The Is Permission Controlled.
     * 
     */
    @SerializedName(value = "isPermissionControlled", alternate = {"IsPermissionControlled"})
    @Expose
	@Nullable
    public Boolean isPermissionControlled;

    /**
     * The Is Read Receipt.
     * 
     */
    @SerializedName(value = "isReadReceipt", alternate = {"IsReadReceipt"})
    @Expose
	@Nullable
    public Boolean isReadReceipt;

    /**
     * The Is Signed.
     * 
     */
    @SerializedName(value = "isSigned", alternate = {"IsSigned"})
    @Expose
	@Nullable
    public Boolean isSigned;

    /**
     * The Is Voicemail.
     * 
     */
    @SerializedName(value = "isVoicemail", alternate = {"IsVoicemail"})
    @Expose
	@Nullable
    public Boolean isVoicemail;

    /**
     * The Message Action Flag.
     * 
     */
    @SerializedName(value = "messageActionFlag", alternate = {"MessageActionFlag"})
    @Expose
	@Nullable
    public MessageActionFlag messageActionFlag;

    /**
     * The Not Sent To Me.
     * 
     */
    @SerializedName(value = "notSentToMe", alternate = {"NotSentToMe"})
    @Expose
	@Nullable
    public Boolean notSentToMe;

    /**
     * The Recipient Contains.
     * 
     */
    @SerializedName(value = "recipientContains", alternate = {"RecipientContains"})
    @Expose
	@Nullable
    public java.util.List<String> recipientContains;

    /**
     * The Sender Contains.
     * 
     */
    @SerializedName(value = "senderContains", alternate = {"SenderContains"})
    @Expose
	@Nullable
    public java.util.List<String> senderContains;

    /**
     * The Sensitivity.
     * 
     */
    @SerializedName(value = "sensitivity", alternate = {"Sensitivity"})
    @Expose
	@Nullable
    public Sensitivity sensitivity;

    /**
     * The Sent Cc Me.
     * 
     */
    @SerializedName(value = "sentCcMe", alternate = {"SentCcMe"})
    @Expose
	@Nullable
    public Boolean sentCcMe;

    /**
     * The Sent Only To Me.
     * 
     */
    @SerializedName(value = "sentOnlyToMe", alternate = {"SentOnlyToMe"})
    @Expose
	@Nullable
    public Boolean sentOnlyToMe;

    /**
     * The Sent To Addresses.
     * 
     */
    @SerializedName(value = "sentToAddresses", alternate = {"SentToAddresses"})
    @Expose
	@Nullable
    public java.util.List<Recipient> sentToAddresses;

    /**
     * The Sent To Me.
     * 
     */
    @SerializedName(value = "sentToMe", alternate = {"SentToMe"})
    @Expose
	@Nullable
    public Boolean sentToMe;

    /**
     * The Sent To Or Cc Me.
     * 
     */
    @SerializedName(value = "sentToOrCcMe", alternate = {"SentToOrCcMe"})
    @Expose
	@Nullable
    public Boolean sentToOrCcMe;

    /**
     * The Subject Contains.
     * 
     */
    @SerializedName(value = "subjectContains", alternate = {"SubjectContains"})
    @Expose
	@Nullable
    public java.util.List<String> subjectContains;

    /**
     * The Within Size Range.
     * 
     */
    @SerializedName(value = "withinSizeRange", alternate = {"WithinSizeRange"})
    @Expose
	@Nullable
    public SizeRange withinSizeRange;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
