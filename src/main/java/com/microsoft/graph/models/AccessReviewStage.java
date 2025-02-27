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
import com.microsoft.graph.models.AccessReviewReviewerScope;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItem;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Stage.
 */
public class AccessReviewStage extends Entity implements IJsonBackedObject {


    /**
     * The End Date Time.
     * DateTime when review stage is scheduled to end. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. This property is the cumulative total of the durationInDays for all stages. Read-only.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Fallback Reviewers.
     * This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist.
     */
    @SerializedName(value = "fallbackReviewers", alternate = {"FallbackReviewers"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewReviewerScope> fallbackReviewers;

    /**
     * The Reviewers.
     * This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     */
    @SerializedName(value = "reviewers", alternate = {"Reviewers"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewReviewerScope> reviewers;

    /**
     * The Start Date Time.
     * DateTime when review stage is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Status.
     * Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Decisions.
     * Each user reviewed in an accessReviewStage has a decision item representing if they were approved, denied, or not yet reviewed.
     */
    @SerializedName(value = "decisions", alternate = {"Decisions"})
    @Expose
	@Nullable
    public AccessReviewInstanceDecisionItemCollectionPage decisions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("decisions")) {
            decisions = serializer.deserializeObject(json.get("decisions"), AccessReviewInstanceDecisionItemCollectionPage.class);
        }
    }
}
