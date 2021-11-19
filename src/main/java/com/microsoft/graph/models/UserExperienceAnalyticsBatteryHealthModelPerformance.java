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
 * The class for the User Experience Analytics Battery Health Model Performance.
 */
public class UserExperienceAnalyticsBatteryHealthModelPerformance extends Entity implements IJsonBackedObject {


    /**
     * The Active Devices.
     * Number of active devices for that model. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "activeDevices", alternate = {"ActiveDevices"})
    @Expose
	@Nullable
    public Integer activeDevices;

    /**
     * The Average Battery Age In Days.
     * The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "averageBatteryAgeInDays", alternate = {"AverageBatteryAgeInDays"})
    @Expose
	@Nullable
    public Integer averageBatteryAgeInDays;

    /**
     * The Average Estimated Runtime In Minutes.
     * The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "averageEstimatedRuntimeInMinutes", alternate = {"AverageEstimatedRuntimeInMinutes"})
    @Expose
	@Nullable
    public Integer averageEstimatedRuntimeInMinutes;

    /**
     * The Average Max Capacity Percentage.
     * The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a device’s batteries.. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "averageMaxCapacityPercentage", alternate = {"AverageMaxCapacityPercentage"})
    @Expose
	@Nullable
    public Integer averageMaxCapacityPercentage;

    /**
     * The Manufacturer.
     * Name of the device manufacturer.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

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
