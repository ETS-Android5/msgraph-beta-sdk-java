// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeliveryOptimizationBandwidth;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delivery Optimization Bandwidth Percentage.
 */
public class DeliveryOptimizationBandwidthPercentage extends DeliveryOptimizationBandwidth implements IJsonBackedObject {


    /**
     * The Maximum Background Bandwidth Percentage.
     * The default value 0 (zero) means that Delivery Optimization dynamically adjusts to use the available bandwidth for background downloads. Valid values 0 to 100
     */
    @SerializedName(value = "maximumBackgroundBandwidthPercentage", alternate = {"MaximumBackgroundBandwidthPercentage"})
    @Expose
	@Nullable
    public Integer maximumBackgroundBandwidthPercentage;

    /**
     * The Maximum Foreground Bandwidth Percentage.
     * The default value 0 (zero) means that Delivery Optimization dynamically adjusts to use the available bandwidth for foreground downloads. Valid values 0 to 100
     */
    @SerializedName(value = "maximumForegroundBandwidthPercentage", alternate = {"MaximumForegroundBandwidthPercentage"})
    @Expose
	@Nullable
    public Integer maximumForegroundBandwidthPercentage;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
