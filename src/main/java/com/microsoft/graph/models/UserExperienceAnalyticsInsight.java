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
import com.microsoft.graph.models.UserExperienceAnalyticsInsightSeverity;
import com.microsoft.graph.models.UserExperienceAnalyticsInsightValue;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Insight.
 */
public class UserExperienceAnalyticsInsight implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Insight Id.
     * The unique identifier of the user experience analytics insight.
     */
    @SerializedName(value = "insightId", alternate = {"InsightId"})
    @Expose
	@Nullable
    public String insightId;

    /**
     * The Severity.
     * The value of the user experience analytics insight. Possible values are: none, informational, warning, error.
     */
    @SerializedName(value = "severity", alternate = {"Severity"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsInsightSeverity severity;

    /**
     * The User Experience Analytics Metric Id.
     * The unique identifier of the user experience analytics insight.
     */
    @SerializedName(value = "userExperienceAnalyticsMetricId", alternate = {"UserExperienceAnalyticsMetricId"})
    @Expose
	@Nullable
    public String userExperienceAnalyticsMetricId;

    /**
     * The Values.
     * The value of the user experience analytics insight.
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public java.util.List<UserExperienceAnalyticsInsightValue> values;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
