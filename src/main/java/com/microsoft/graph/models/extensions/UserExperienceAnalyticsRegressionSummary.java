// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Regression Summary.
 */
public class UserExperienceAnalyticsRegressionSummary extends Entity implements IJsonBackedObject {


    /**
     * The Manufacturer Regression.
     * The metric values for the user experience analytics Manufacturer regression.
     */
    @SerializedName(value = "manufacturerRegression", alternate = {"ManufacturerRegression"})
    @Expose
    public UserExperienceAnalyticsMetricCollectionPage manufacturerRegression;

    /**
     * The Model Regression.
     * The metric values for the user experience analytics model regression.
     */
    @SerializedName(value = "modelRegression", alternate = {"ModelRegression"})
    @Expose
    public UserExperienceAnalyticsMetricCollectionPage modelRegression;

    /**
     * The Operating System Regression.
     * The metric values for the user experience analytics operating system regression.
     */
    @SerializedName(value = "operatingSystemRegression", alternate = {"OperatingSystemRegression"})
    @Expose
    public UserExperienceAnalyticsMetricCollectionPage operatingSystemRegression;


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


        if (json.has("manufacturerRegression")) {
            manufacturerRegression = serializer.deserializeObject(json.get("manufacturerRegression").toString(), UserExperienceAnalyticsMetricCollectionPage.class);
        }

        if (json.has("modelRegression")) {
            modelRegression = serializer.deserializeObject(json.get("modelRegression").toString(), UserExperienceAnalyticsMetricCollectionPage.class);
        }

        if (json.has("operatingSystemRegression")) {
            operatingSystemRegression = serializer.deserializeObject(json.get("operatingSystemRegression").toString(), UserExperienceAnalyticsMetricCollectionPage.class);
        }
    }
}
