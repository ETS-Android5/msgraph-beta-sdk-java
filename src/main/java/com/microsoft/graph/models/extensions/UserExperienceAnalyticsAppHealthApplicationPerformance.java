// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Application Performance.
 */
public class UserExperienceAnalyticsAppHealthApplicationPerformance extends Entity implements IJsonBackedObject {


    /**
     * The Active Device Count.
     * The number of devices where the app has been active. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "activeDeviceCount", alternate = {"ActiveDeviceCount"})
    @Expose
    public Integer activeDeviceCount;

    /**
     * The App Crash Count.
     * The number of crashes for the app. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appCrashCount", alternate = {"AppCrashCount"})
    @Expose
    public Integer appCrashCount;

    /**
     * The App Display Name.
     * The friendly name of the application.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
    public String appDisplayName;

    /**
     * The App Hang Count.
     * The number of hangs for the app. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appHangCount", alternate = {"AppHangCount"})
    @Expose
    public Integer appHangCount;

    /**
     * The App Health Score.
     * The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "appHealthScore", alternate = {"AppHealthScore"})
    @Expose
    public Double appHealthScore;

    /**
     * The App Health Status.
     * The overall health status of the app.
     */
    @SerializedName(value = "appHealthStatus", alternate = {"AppHealthStatus"})
    @Expose
    public String appHealthStatus;

    /**
     * The App Name.
     * The name of the application.
     */
    @SerializedName(value = "appName", alternate = {"AppName"})
    @Expose
    public String appName;

    /**
     * The App Publisher.
     * The publisher of the application.
     */
    @SerializedName(value = "appPublisher", alternate = {"AppPublisher"})
    @Expose
    public String appPublisher;

    /**
     * The App Usage Duration.
     * The total usage time of the application in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "appUsageDuration", alternate = {"AppUsageDuration"})
    @Expose
    public Integer appUsageDuration;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "meanTimeToFailureInMinutes", alternate = {"MeanTimeToFailureInMinutes"})
    @Expose
    public Integer meanTimeToFailureInMinutes;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
