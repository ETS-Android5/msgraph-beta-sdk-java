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
 * The class for the User Experience Analytics App Health App Performance By App Version.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion extends Entity implements IJsonBackedObject {


    /**
     * The App Crash Count.
     * The number of crashes for the app. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appCrashCount", alternate = {"AppCrashCount"})
    @Expose
	@Nullable
    public Integer appCrashCount;

    /**
     * The App Display Name.
     * The friendly name of the application.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The App Name.
     * The name of the application.
     */
    @SerializedName(value = "appName", alternate = {"AppName"})
    @Expose
	@Nullable
    public String appName;

    /**
     * The App Publisher.
     * The publisher of the application.
     */
    @SerializedName(value = "appPublisher", alternate = {"AppPublisher"})
    @Expose
	@Nullable
    public String appPublisher;

    /**
     * The App Usage Duration.
     * The total usage time of the application in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appUsageDuration", alternate = {"AppUsageDuration"})
    @Expose
	@Nullable
    public Integer appUsageDuration;

    /**
     * The App Version.
     * The version of the application.
     */
    @SerializedName(value = "appVersion", alternate = {"AppVersion"})
    @Expose
	@Nullable
    public String appVersion;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "meanTimeToFailureInMinutes", alternate = {"MeanTimeToFailureInMinutes"})
    @Expose
	@Nullable
    public Integer meanTimeToFailureInMinutes;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
