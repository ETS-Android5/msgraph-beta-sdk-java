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
import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.AccessReviewSettings;
import com.microsoft.graph.models.AccessReviewDecision;
import com.microsoft.graph.models.AccessReview;
import com.microsoft.graph.models.AccessReviewReviewer;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessReviewDecisionCollectionPage;
import com.microsoft.graph.requests.AccessReviewCollectionPage;
import com.microsoft.graph.requests.AccessReviewReviewerCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review.
 */
public class AccessReview extends Entity implements IJsonBackedObject {


    /**
     * The Business Flow Template Id.
     * The business flow template identifier. Required on create.  This value is case sensitive.
     */
    @SerializedName(value = "businessFlowTemplateId", alternate = {"BusinessFlowTemplateId"})
    @Expose
	@Nullable
    public String businessFlowTemplateId;

    /**
     * The Created By.
     * The user who created this review.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public UserIdentity createdBy;

    /**
     * The Description.
     * The description provided by the access review creator, to show to the reviewers.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The access review name. Required on create.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The End Date Time.
     * The DateTime when the review is scheduled to end. This must be at least one day later than the start date.  Required on create.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Reviewed Entity.
     * The object for which the access reviews is reviewing the access rights assignments. This can be the group for the review of memberships of users in a group, or the app for a review of assignments of users to an application. Required on create.
     */
    @SerializedName(value = "reviewedEntity", alternate = {"ReviewedEntity"})
    @Expose
	@Nullable
    public Identity reviewedEntity;

    /**
     * The Reviewer Type.
     * The relationship type of reviewer to the target object, one of self, delegated or entityOwners. Required on create.
     */
    @SerializedName(value = "reviewerType", alternate = {"ReviewerType"})
    @Expose
	@Nullable
    public String reviewerType;

    /**
     * The Settings.
     * The settings of an accessReview, see type definition below.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public AccessReviewSettings settings;

    /**
     * The Start Date Time.
     * The DateTime when the review is scheduled to be start.  This could be a date in the future.  Required on create.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Status.
     * This read-only field specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting,InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Decisions.
     * The collection of decisions for this access review.
     */
    @SerializedName(value = "decisions", alternate = {"Decisions"})
    @Expose
	@Nullable
    public AccessReviewDecisionCollectionPage decisions;

    /**
     * The Instances.
     * The collection of access reviews instances past, present and future, if this object is a recurring access review.
     */
    @SerializedName(value = "instances", alternate = {"Instances"})
    @Expose
	@Nullable
    public AccessReviewCollectionPage instances;

    /**
     * The My Decisions.
     * The collection of decisions for the caller, if the caller is a reviewer.
     */
    @SerializedName(value = "myDecisions", alternate = {"MyDecisions"})
    @Expose
	@Nullable
    public AccessReviewDecisionCollectionPage myDecisions;

    /**
     * The Reviewers.
     * The collection of reviewers for an access review, if access review reviewerType is of type delegated.
     */
    @SerializedName(value = "reviewers", alternate = {"Reviewers"})
    @Expose
	@Nullable
    public AccessReviewReviewerCollectionPage reviewers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("decisions")) {
            decisions = serializer.deserializeObject(json.get("decisions"), AccessReviewDecisionCollectionPage.class);
        }

        if (json.has("instances")) {
            instances = serializer.deserializeObject(json.get("instances"), AccessReviewCollectionPage.class);
        }

        if (json.has("myDecisions")) {
            myDecisions = serializer.deserializeObject(json.get("myDecisions"), AccessReviewDecisionCollectionPage.class);
        }

        if (json.has("reviewers")) {
            reviewers = serializer.deserializeObject(json.get("reviewers"), AccessReviewReviewerCollectionPage.class);
        }
    }
}
