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
import com.microsoft.graph.models.UserIdentity;
import com.microsoft.graph.models.AccessReviewHistoryDecisionFilter;
import com.microsoft.graph.models.AccessReviewHistoryScheduleSettings;
import com.microsoft.graph.models.AccessReviewScope;
import com.microsoft.graph.models.AccessReviewHistoryStatus;
import com.microsoft.graph.models.AccessReviewHistoryInstance;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessReviewHistoryInstanceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review History Definition.
 */
public class AccessReviewHistoryDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * User who created this review history definition.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public UserIdentity createdBy;

    /**
     * The Created Date Time.
     * Timestamp when the access review definition was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Decisions.
     * Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     */
    @SerializedName(value = "decisions", alternate = {"Decisions"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewHistoryDecisionFilter> decisions;

    /**
     * The Display Name.
     * Name for the access review history data collection. Required.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Download Uri.
     * Uri which can be used to retrieve review history data. This URI will be active for 24 hours after being generated.
     * @deprecated This property is being deprecated. Use the downloadUri value in the individual report instance instead
     */
    @Deprecated
    @SerializedName(value = "downloadUri", alternate = {"DownloadUri"})
    @Expose
	@Nullable
    public String downloadUri;

    /**
     * The Fulfilled Date Time.
     * Timestamp when all of the available data for this definition was collected. This will be set after this definition's status is set to done.
     * @deprecated This property is being deprecated. Use the fulfilledDateTime value in the individual report instance instead
     */
    @Deprecated
    @SerializedName(value = "fulfilledDateTime", alternate = {"FulfilledDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime fulfilledDateTime;

    /**
     * The Review History Period End Date Time.
     * Timestamp, reviews starting on or after this date will be included in the fetched history data. Required.
     */
    @SerializedName(value = "reviewHistoryPeriodEndDateTime", alternate = {"ReviewHistoryPeriodEndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime reviewHistoryPeriodEndDateTime;

    /**
     * The Review History Period Start Date Time.
     * Timestamp, reviews starting on or before this date will be included in the fetched history data. Required.
     */
    @SerializedName(value = "reviewHistoryPeriodStartDateTime", alternate = {"ReviewHistoryPeriodStartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime reviewHistoryPeriodStartDateTime;

    /**
     * The Schedule Settings.
     * 
     */
    @SerializedName(value = "scheduleSettings", alternate = {"ScheduleSettings"})
    @Expose
	@Nullable
    public AccessReviewHistoryScheduleSettings scheduleSettings;

    /**
     * The Scopes.
     * Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     */
    @SerializedName(value = "scopes", alternate = {"Scopes"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewScope> scopes;

    /**
     * The Status.
     * Represents the status of the review history data collection. Possible values are: done, inprogress, error, requested.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AccessReviewHistoryStatus status;

    /**
     * The Instances.
     * 
     */
    @SerializedName(value = "instances", alternate = {"Instances"})
    @Expose
	@Nullable
    public AccessReviewHistoryInstanceCollectionPage instances;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("instances")) {
            instances = serializer.deserializeObject(json.get("instances"), AccessReviewHistoryInstanceCollectionPage.class);
        }
    }
}
