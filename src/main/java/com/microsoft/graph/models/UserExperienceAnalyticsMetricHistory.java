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
 * The class for the User Experience Analytics Metric History.
 */
public class UserExperienceAnalyticsMetricHistory extends Entity implements IJsonBackedObject {


    /**
     * The Device Id.
     * The user experience analytics device id.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Metric Date Time.
     * The user experience analytics metric date time.
     */
    @SerializedName(value = "metricDateTime", alternate = {"MetricDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime metricDateTime;

    /**
     * The Metric Type.
     * The user experience analytics metric type.
     */
    @SerializedName(value = "metricType", alternate = {"MetricType"})
    @Expose
	@Nullable
    public String metricType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
