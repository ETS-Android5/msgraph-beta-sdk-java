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
 * The class for the Device Configuration User Overview.
 */
public class DeviceConfigurationUserOverview extends Entity implements IJsonBackedObject {


    /**
     * The Configuration Version.
     * Version of the policy for that overview
     */
    @SerializedName(value = "configurationVersion", alternate = {"ConfigurationVersion"})
    @Expose
	@Nullable
    public Integer configurationVersion;

    /**
     * The Conflict Count.
     * Number of users in conflict
     */
    @SerializedName(value = "conflictCount", alternate = {"ConflictCount"})
    @Expose
	@Nullable
    public Integer conflictCount;

    /**
     * The Error Count.
     * Number of error Users
     */
    @SerializedName(value = "errorCount", alternate = {"ErrorCount"})
    @Expose
	@Nullable
    public Integer errorCount;

    /**
     * The Failed Count.
     * Number of failed Users
     */
    @SerializedName(value = "failedCount", alternate = {"FailedCount"})
    @Expose
	@Nullable
    public Integer failedCount;

    /**
     * The Last Update Date Time.
     * Last update time
     */
    @SerializedName(value = "lastUpdateDateTime", alternate = {"LastUpdateDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdateDateTime;

    /**
     * The Not Applicable Count.
     * Number of not applicable users
     */
    @SerializedName(value = "notApplicableCount", alternate = {"NotApplicableCount"})
    @Expose
	@Nullable
    public Integer notApplicableCount;

    /**
     * The Pending Count.
     * Number of pending Users
     */
    @SerializedName(value = "pendingCount", alternate = {"PendingCount"})
    @Expose
	@Nullable
    public Integer pendingCount;

    /**
     * The Success Count.
     * Number of succeeded Users
     */
    @SerializedName(value = "successCount", alternate = {"SuccessCount"})
    @Expose
	@Nullable
    public Integer successCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
