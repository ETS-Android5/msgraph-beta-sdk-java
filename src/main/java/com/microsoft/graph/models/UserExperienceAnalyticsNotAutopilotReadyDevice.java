// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Not Autopilot Ready Device.
 */
public class UserExperienceAnalyticsNotAutopilotReadyDevice extends Entity implements IJsonBackedObject {


    /**
     * The Auto Pilot Profile Assigned.
     * The intune device's autopilotProfileAssigned.
     */
    @SerializedName(value = "autoPilotProfileAssigned", alternate = {"AutoPilotProfileAssigned"})
    @Expose
	@Nullable
    public Boolean autoPilotProfileAssigned;

    /**
     * The Auto Pilot Registered.
     * The intune device's autopilotRegistered.
     */
    @SerializedName(value = "autoPilotRegistered", alternate = {"AutoPilotRegistered"})
    @Expose
	@Nullable
    public Boolean autoPilotRegistered;

    /**
     * The Azure Ad Join Type.
     * The intune device's azure Ad joinType.
     */
    @SerializedName(value = "azureAdJoinType", alternate = {"AzureAdJoinType"})
    @Expose
	@Nullable
    public String azureAdJoinType;

    /**
     * The Azure Ad Registered.
     * The intune device's azureAdRegistered.
     */
    @SerializedName(value = "azureAdRegistered", alternate = {"AzureAdRegistered"})
    @Expose
	@Nullable
    public Boolean azureAdRegistered;

    /**
     * The Device Name.
     * The intune device's name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Managed By.
     * The intune device's managed by.
     */
    @SerializedName(value = "managedBy", alternate = {"ManagedBy"})
    @Expose
	@Nullable
    public String managedBy;

    /**
     * The Manufacturer.
     * The intune device's manufacturer.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * The intune device's model.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Serial Number.
     * The intune device's serial number.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public String serialNumber;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
