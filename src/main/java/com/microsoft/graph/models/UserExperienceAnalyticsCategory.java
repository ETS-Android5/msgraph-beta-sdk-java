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
import com.microsoft.graph.models.UserExperienceAnalyticsInsight;
import com.microsoft.graph.models.UserExperienceAnalyticsMetric;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Category.
 */
public class UserExperienceAnalyticsCategory extends Entity implements IJsonBackedObject {


    /**
     * The Insights.
     * The insights for the user experience analytics category.
     */
    @SerializedName(value = "insights", alternate = {"Insights"})
    @Expose
	@Nullable
    public java.util.List<UserExperienceAnalyticsInsight> insights;

    /**
     * The Metric Values.
     * The metric values for the user experience analytics category.
     */
    @SerializedName(value = "metricValues", alternate = {"MetricValues"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsMetricCollectionPage metricValues;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("metricValues")) {
            metricValues = serializer.deserializeObject(json.get("metricValues"), UserExperienceAnalyticsMetricCollectionPage.class);
        }
    }
}
