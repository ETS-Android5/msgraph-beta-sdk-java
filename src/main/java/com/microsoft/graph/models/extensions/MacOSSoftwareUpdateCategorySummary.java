// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MacOSSoftwareUpdateCategory;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateStateSummary;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

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
    public String deviceId;

    /**
     * The Display Name.
     * The name of the report
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Failed Update Count.
     * Number of failed updates on the device
     */
    @SerializedName(value = "failedUpdateCount", alternate = {"FailedUpdateCount"})
    @Expose
    public Integer failedUpdateCount;

    /**
     * The Last Updated Date Time.
     * Last date time the report for this device was updated.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
    public java.util.Calendar lastUpdatedDateTime;

    /**
     * The Successful Update Count.
     * Number of successful updates on the device
     */
    @SerializedName(value = "successfulUpdateCount", alternate = {"SuccessfulUpdateCount"})
    @Expose
    public Integer successfulUpdateCount;

    /**
     * The Total Update Count.
     * Number of total updates on the device
     */
    @SerializedName(value = "totalUpdateCount", alternate = {"TotalUpdateCount"})
    @Expose
    public Integer totalUpdateCount;

    /**
     * The Update Category.
     * Software update type
     */
    @SerializedName(value = "updateCategory", alternate = {"UpdateCategory"})
    @Expose
    public MacOSSoftwareUpdateCategory updateCategory;

    /**
     * The User Id.
     * The user ID.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The Update State Summaries.
     * Summary of the update states.
     */
    @SerializedName(value = "updateStateSummaries", alternate = {"UpdateStateSummaries"})
    @Expose
    public MacOSSoftwareUpdateStateSummaryCollectionPage updateStateSummaries;


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


        if (json.has("updateStateSummaries")) {
            updateStateSummaries = serializer.deserializeObject(json.get("updateStateSummaries").toString(), MacOSSoftwareUpdateStateSummaryCollectionPage.class);
        }
    }
}
