// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserExperienceAnalyticsHealthState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Performance.
 */
public class UserExperienceAnalyticsAppHealthDevicePerformance extends Entity implements IJsonBackedObject {


    /**
     * The App Crash Count.
     * The number of app crashes for the device. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appCrashCount", alternate = {"AppCrashCount"})
    @Expose
	@Nullable
    public Integer appCrashCount;

    /**
     * The App Hang Count.
     * The number of app hangs for the device. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appHangCount", alternate = {"AppHangCount"})
    @Expose
	@Nullable
    public Integer appHangCount;

    /**
     * The Crashed App Count.
     * The number of distinct app crashes for the device. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "crashedAppCount", alternate = {"CrashedAppCount"})
    @Expose
	@Nullable
    public Integer crashedAppCount;

    /**
     * The Device App Health Score.
     * The app health score of the device. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "deviceAppHealthScore", alternate = {"DeviceAppHealthScore"})
    @Expose
	@Nullable
    public Double deviceAppHealthScore;

    /**
     * The Device App Health Status.
     * The overall app health status of the device.
     */
    @SerializedName(value = "deviceAppHealthStatus", alternate = {"DeviceAppHealthStatus"})
    @Expose
	@Nullable
    public String deviceAppHealthStatus;

    /**
     * The Device Display Name.
     * The name of the device.
     */
    @SerializedName(value = "deviceDisplayName", alternate = {"DeviceDisplayName"})
    @Expose
	@Nullable
    public String deviceDisplayName;

    /**
     * The Device Id.
     * The id of the device.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Device Manufacturer.
     * The manufacturer name of the device.
     */
    @SerializedName(value = "deviceManufacturer", alternate = {"DeviceManufacturer"})
    @Expose
	@Nullable
    public String deviceManufacturer;

    /**
     * The Device Model.
     * The model name of the device.
     */
    @SerializedName(value = "deviceModel", alternate = {"DeviceModel"})
    @Expose
	@Nullable
    public String deviceModel;

    /**
     * The Health Status.
     * The health state of the user experience analytics device. Possible values are: unknown, insufficientData, needsAttention, meetingGoals.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsHealthState healthStatus;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the device in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "meanTimeToFailureInMinutes", alternate = {"MeanTimeToFailureInMinutes"})
    @Expose
	@Nullable
    public Integer meanTimeToFailureInMinutes;

    /**
     * The Processed Date Time.
     * The date and time when the statistics were last computed.
     */
    @SerializedName(value = "processedDateTime", alternate = {"ProcessedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime processedDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
