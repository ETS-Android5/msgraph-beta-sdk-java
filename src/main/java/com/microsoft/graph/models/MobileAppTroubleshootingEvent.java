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
import com.microsoft.graph.models.MobileAppTroubleshootingHistoryItem;
import com.microsoft.graph.models.AppLogCollectionRequest;
import com.microsoft.graph.models.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.requests.AppLogCollectionRequestCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Troubleshooting Event.
 */
public class MobileAppTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements IJsonBackedObject {


    /**
     * The Application Id.
     * Intune application identifier.
     */
    @SerializedName(value = "applicationId", alternate = {"ApplicationId"})
    @Expose
	@Nullable
    public String applicationId;

    /**
     * The History.
     * Intune Mobile Application Troubleshooting History Item
     */
    @SerializedName(value = "history", alternate = {"History"})
    @Expose
	@Nullable
    public java.util.List<MobileAppTroubleshootingHistoryItem> history;

    /**
     * The Managed Device Identifier.
     * Device identifier created or collected by Intune.
     */
    @SerializedName(value = "managedDeviceIdentifier", alternate = {"ManagedDeviceIdentifier"})
    @Expose
	@Nullable
    public String managedDeviceIdentifier;

    /**
     * The User Id.
     * Identifier for the user that tried to enroll the device.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The App Log Collection Requests.
     * The collection property of AppLogUploadRequest.
     */
    @SerializedName(value = "appLogCollectionRequests", alternate = {"AppLogCollectionRequests"})
    @Expose
	@Nullable
    public AppLogCollectionRequestCollectionPage appLogCollectionRequests;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appLogCollectionRequests")) {
            appLogCollectionRequests = serializer.deserializeObject(json.get("appLogCollectionRequests"), AppLogCollectionRequestCollectionPage.class);
        }
    }
}
