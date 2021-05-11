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
import com.microsoft.graph.models.UnifiedRoleManagementPolicyRule;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Notification Rule.
 */
public class UnifiedRoleManagementPolicyNotificationRule extends UnifiedRoleManagementPolicyRule implements IJsonBackedObject {


    /**
     * The Is Default Recipients Enabled.
     * Whether default recipient is receiving the email or not.
     */
    @SerializedName(value = "isDefaultRecipientsEnabled", alternate = {"IsDefaultRecipientsEnabled"})
    @Expose
	@Nullable
    public Boolean isDefaultRecipientsEnabled;

    /**
     * The Notification Level.
     * The level of notification. One of None, Critical, All.
     */
    @SerializedName(value = "notificationLevel", alternate = {"NotificationLevel"})
    @Expose
	@Nullable
    public String notificationLevel;

    /**
     * The Notification Recipients.
     * The list of notification recepients like email.
     */
    @SerializedName(value = "notificationRecipients", alternate = {"NotificationRecipients"})
    @Expose
	@Nullable
    public java.util.List<String> notificationRecipients;

    /**
     * The Notification Type.
     * The type of notification. One of Email.
     */
    @SerializedName(value = "notificationType", alternate = {"NotificationType"})
    @Expose
	@Nullable
    public String notificationType;

    /**
     * The Recipient Type.
     * The type of recipient. One of Requestor, Approver, Admin.
     */
    @SerializedName(value = "recipientType", alternate = {"RecipientType"})
    @Expose
	@Nullable
    public String recipientType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
