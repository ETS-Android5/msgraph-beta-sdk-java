// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ChangeType;
import com.microsoft.graph.models.ChangeNotificationEncryptedContent;
import com.microsoft.graph.models.LifecycleEventType;
import com.microsoft.graph.models.ResourceData;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Change Notification.
 */
public class ChangeNotification implements IJsonBackedObject {

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
     * The Change Type.
     * Indicates the type of change that will raise the change notification. The supported values are: created, updated, deleted. Required.
     */
    @SerializedName(value = "changeType", alternate = {"ChangeType"})
    @Expose
	@Nullable
    public ChangeType changeType;

    /**
     * The Client State.
     * Value of the clientState property sent specified in the subscription request (if any). The maximum length is 255 characters. The client can check whether the change notification came from the service by comparing the values of the clientState property. The value of the clientState property sent with the subscription is compared with the value of the clientState property received with each change notification. Optional.
     */
    @SerializedName(value = "clientState", alternate = {"ClientState"})
    @Expose
	@Nullable
    public String clientState;

    /**
     * The Encrypted Content.
     * (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and includeResourceData were defined during the subscription request and if the resource supports it. Optional.
     */
    @SerializedName(value = "encryptedContent", alternate = {"EncryptedContent"})
    @Expose
	@Nullable
    public ChangeNotificationEncryptedContent encryptedContent;

    /**
     * The Id.
     * Unique ID for the notification. Optional.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Lifecycle Event.
     * The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values are missed, subscriptionRemoved, reauthorizationRequired.
     */
    @SerializedName(value = "lifecycleEvent", alternate = {"LifecycleEvent"})
    @Expose
	@Nullable
    public LifecycleEventType lifecycleEvent;

    /**
     * The Resource.
     * The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public String resource;

    /**
     * The Resource Data.
     * The content of this property depends on the type of resource being subscribed to. Required.
     */
    @SerializedName(value = "resourceData", alternate = {"ResourceData"})
    @Expose
	@Nullable
    public ResourceData resourceData;

    /**
     * The Subscription Expiration Date Time.
     * The expiration time for the subscription. Required.
     */
    @SerializedName(value = "subscriptionExpirationDateTime", alternate = {"SubscriptionExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime subscriptionExpirationDateTime;

    /**
     * The Subscription Id.
     * The unique identifier of the subscription that generated the notification.
     */
    @SerializedName(value = "subscriptionId", alternate = {"SubscriptionId"})
    @Expose
	@Nullable
    public java.util.UUID subscriptionId;

    /**
     * The Tenant Id.
     * The unique identifier of the tenant from which the change notification originated.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public java.util.UUID tenantId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
