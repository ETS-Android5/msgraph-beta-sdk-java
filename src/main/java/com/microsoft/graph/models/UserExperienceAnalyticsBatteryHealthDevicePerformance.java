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
 * The class for the User Experience Analytics Battery Health Device Performance.
 */
public class UserExperienceAnalyticsBatteryHealthDevicePerformance extends Entity implements IJsonBackedObject {


    /**
     * The Battery Age In Days.
     * Estimated battery age. Unit in days. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "batteryAgeInDays", alternate = {"BatteryAgeInDays"})
    @Expose
	@Nullable
    public Integer batteryAgeInDays;

    /**
     * The Device Battery Health Score.
     * A weighted average of a device’s maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "deviceBatteryHealthScore", alternate = {"DeviceBatteryHealthScore"})
    @Expose
	@Nullable
    public Integer deviceBatteryHealthScore;

    /**
     * The Device Id.
     * The unique identifier of the device, Intune DeviceID.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Device Name.
     * Device friendly name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Estimated Runtime In Minutes.
     * The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "estimatedRuntimeInMinutes", alternate = {"EstimatedRuntimeInMinutes"})
    @Expose
	@Nullable
    public Integer estimatedRuntimeInMinutes;

    /**
     * The Health Status.
     * The overall battery health status of the device.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public String healthStatus;

    /**
     * The Max Capacity Percentage.
     * Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "maxCapacityPercentage", alternate = {"MaxCapacityPercentage"})
    @Expose
	@Nullable
    public Integer maxCapacityPercentage;

    /**
     * The Model.
     * The model name of the device.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
