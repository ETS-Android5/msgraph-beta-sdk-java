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
import com.microsoft.graph.models.DevicePlatformType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Assignment Filter Evaluate Request.
 */
public class AssignmentFilterEvaluateRequest implements IJsonBackedObject {

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
     * The Order By.
     * Order the devices should be sorted in. Default is ascending on device name.
     */
    @SerializedName(value = "orderBy", alternate = {"OrderBy"})
    @Expose
	@Nullable
    public java.util.List<String> orderBy;

    /**
     * The Platform.
     * Platform type of the devices on which the Assignment Filter will be applicable. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, unknown.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public DevicePlatformType platform;

    /**
     * The Rule.
     * Rule definition of the Assignment Filter.
     */
    @SerializedName(value = "rule", alternate = {"Rule"})
    @Expose
	@Nullable
    public String rule;

    /**
     * The Skip.
     * Number of records to skip. Default value is 0
     */
    @SerializedName(value = "skip", alternate = {"Skip"})
    @Expose
	@Nullable
    public Integer skip;

    /**
     * The Top.
     * Limit of records per request. Default value is 100, if provided less than 0 or greater than 100
     */
    @SerializedName(value = "top", alternate = {"Top"})
    @Expose
	@Nullable
    public Integer top;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
