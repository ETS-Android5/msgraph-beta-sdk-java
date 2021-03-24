// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserExperienceAnalyticsOperatingSystemRestartCategory;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Startup History.
 */
public class UserExperienceAnalyticsDeviceStartupHistory extends Entity implements IJsonBackedObject {


    /**
     * The Core Boot Time In Ms.
     * The user experience analytics device core boot time in milliseconds.
     */
    @SerializedName(value = "coreBootTimeInMs", alternate = {"CoreBootTimeInMs"})
    @Expose
	@Nullable
    public Integer coreBootTimeInMs;

    /**
     * The Core Login Time In Ms.
     * The user experience analytics device core login time in milliseconds.
     */
    @SerializedName(value = "coreLoginTimeInMs", alternate = {"CoreLoginTimeInMs"})
    @Expose
	@Nullable
    public Integer coreLoginTimeInMs;

    /**
     * The Device Id.
     * The user experience analytics device id.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Feature Update Boot Time In Ms.
     * The user experience analytics device feature update time in milliseconds.
     */
    @SerializedName(value = "featureUpdateBootTimeInMs", alternate = {"FeatureUpdateBootTimeInMs"})
    @Expose
	@Nullable
    public Integer featureUpdateBootTimeInMs;

    /**
     * The Group Policy Boot Time In Ms.
     * The User experience analytics Device group policy boot time in milliseconds.
     */
    @SerializedName(value = "groupPolicyBootTimeInMs", alternate = {"GroupPolicyBootTimeInMs"})
    @Expose
	@Nullable
    public Integer groupPolicyBootTimeInMs;

    /**
     * The Group Policy Login Time In Ms.
     * The User experience analytics Device group policy login time in milliseconds.
     */
    @SerializedName(value = "groupPolicyLoginTimeInMs", alternate = {"GroupPolicyLoginTimeInMs"})
    @Expose
	@Nullable
    public Integer groupPolicyLoginTimeInMs;

    /**
     * The Is Feature Update.
     * The user experience analytics device boot record is a feature update.
     */
    @SerializedName(value = "isFeatureUpdate", alternate = {"IsFeatureUpdate"})
    @Expose
	@Nullable
    public Boolean isFeatureUpdate;

    /**
     * The Is First Login.
     * The user experience analytics device first login.
     */
    @SerializedName(value = "isFirstLogin", alternate = {"IsFirstLogin"})
    @Expose
	@Nullable
    public Boolean isFirstLogin;

    /**
     * The Operating System Version.
     * The user experience analytics device boot record's operating system version.
     */
    @SerializedName(value = "operatingSystemVersion", alternate = {"OperatingSystemVersion"})
    @Expose
	@Nullable
    public String operatingSystemVersion;

    /**
     * The Responsive Desktop Time In Ms.
     * The user experience analytics responsive desktop time in milliseconds.
     */
    @SerializedName(value = "responsiveDesktopTimeInMs", alternate = {"ResponsiveDesktopTimeInMs"})
    @Expose
	@Nullable
    public Integer responsiveDesktopTimeInMs;

    /**
     * The Restart Category.
     * OS restart category. Possible values are: unknown, restartWithUpdate, restartWithoutUpdate, blueScreen, shutdownWithUpdate, shutdownWithoutUpdate, longPowerButtonPress, bootError, update.
     */
    @SerializedName(value = "restartCategory", alternate = {"RestartCategory"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsOperatingSystemRestartCategory restartCategory;

    /**
     * The Restart Fault Bucket.
     * OS restart fault bucket. The fault bucket is used to find additional information about a system crash.
     */
    @SerializedName(value = "restartFaultBucket", alternate = {"RestartFaultBucket"})
    @Expose
	@Nullable
    public String restartFaultBucket;

    /**
     * The Restart Stop Code.
     * OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.
     */
    @SerializedName(value = "restartStopCode", alternate = {"RestartStopCode"})
    @Expose
	@Nullable
    public String restartStopCode;

    /**
     * The Start Time.
     * The user experience analytics device boot start time.
     */
    @SerializedName(value = "startTime", alternate = {"StartTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startTime;

    /**
     * The Total Boot Time In Ms.
     * The user experience analytics device total boot time in milliseconds.
     */
    @SerializedName(value = "totalBootTimeInMs", alternate = {"TotalBootTimeInMs"})
    @Expose
	@Nullable
    public Integer totalBootTimeInMs;

    /**
     * The Total Login Time In Ms.
     * The user experience analytics device total login time in milliseconds.
     */
    @SerializedName(value = "totalLoginTimeInMs", alternate = {"TotalLoginTimeInMs"})
    @Expose
	@Nullable
    public Integer totalLoginTimeInMs;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
