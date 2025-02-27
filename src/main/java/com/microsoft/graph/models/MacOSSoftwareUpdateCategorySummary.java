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
import com.microsoft.graph.models.MacOSSoftwareUpdateCategory;
import com.microsoft.graph.models.MacOSSoftwareUpdateStateSummary;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.MacOSSoftwareUpdateStateSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Category Summary.
 */
public class MacOSSoftwareUpdateCategorySummary extends Entity implements IJsonBackedObject {


    /**
     * The Device Id.
     * The device ID.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Display Name.
     * The name of the report
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Failed Update Count.
     * Number of failed updates on the device
     */
    @SerializedName(value = "failedUpdateCount", alternate = {"FailedUpdateCount"})
    @Expose
	@Nullable
    public Integer failedUpdateCount;

    /**
     * The Last Updated Date Time.
     * Last date time the report for this device was updated.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Successful Update Count.
     * Number of successful updates on the device
     */
    @SerializedName(value = "successfulUpdateCount", alternate = {"SuccessfulUpdateCount"})
    @Expose
	@Nullable
    public Integer successfulUpdateCount;

    /**
     * The Total Update Count.
     * Number of total updates on the device
     */
    @SerializedName(value = "totalUpdateCount", alternate = {"TotalUpdateCount"})
    @Expose
	@Nullable
    public Integer totalUpdateCount;

    /**
     * The Update Category.
     * Software update type. Possible values are: critical, configurationDataFile, firmware, other.
     */
    @SerializedName(value = "updateCategory", alternate = {"UpdateCategory"})
    @Expose
	@Nullable
    public MacOSSoftwareUpdateCategory updateCategory;

    /**
     * The User Id.
     * The user ID.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The Update State Summaries.
     * Summary of the update states.
     */
    @SerializedName(value = "updateStateSummaries", alternate = {"UpdateStateSummaries"})
    @Expose
	@Nullable
    public MacOSSoftwareUpdateStateSummaryCollectionPage updateStateSummaries;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("updateStateSummaries")) {
            updateStateSummaries = serializer.deserializeObject(json.get("updateStateSummaries"), MacOSSoftwareUpdateStateSummaryCollectionPage.class);
        }
    }
}
