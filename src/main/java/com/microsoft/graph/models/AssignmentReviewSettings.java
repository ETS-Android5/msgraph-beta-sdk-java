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
import com.microsoft.graph.models.AccessReviewTimeoutBehavior;
import com.microsoft.graph.models.UserSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Assignment Review Settings.
 */
public class AssignmentReviewSettings implements IJsonBackedObject {

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
     * The Access Review Timeout Behavior.
     * 
     */
    @SerializedName(value = "accessReviewTimeoutBehavior", alternate = {"AccessReviewTimeoutBehavior"})
    @Expose
	@Nullable
    public AccessReviewTimeoutBehavior accessReviewTimeoutBehavior;

    /**
     * The Duration In Days.
     * The number of days to allow input from reviewers.
     */
    @SerializedName(value = "durationInDays", alternate = {"DurationInDays"})
    @Expose
	@Nullable
    public Integer durationInDays;

    /**
     * The Is Access Recommendation Enabled.
     * 
     */
    @SerializedName(value = "isAccessRecommendationEnabled", alternate = {"IsAccessRecommendationEnabled"})
    @Expose
	@Nullable
    public Boolean isAccessRecommendationEnabled;

    /**
     * The Is Approval Justification Required.
     * 
     */
    @SerializedName(value = "isApprovalJustificationRequired", alternate = {"IsApprovalJustificationRequired"})
    @Expose
	@Nullable
    public Boolean isApprovalJustificationRequired;

    /**
     * The Is Enabled.
     * If true, access reviews are required for assignments from this policy.
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Recurrence Type.
     * The interval for recurrence, such as monthly or quarterly.
     */
    @SerializedName(value = "recurrenceType", alternate = {"RecurrenceType"})
    @Expose
	@Nullable
    public String recurrenceType;

    /**
     * The Reviewers.
     * If the reviewerType is Reviewers, this collection specifies the users who will be reviewers, either by ID or as members of a group, using a collection of singleUser and groupMembers.
     */
    @SerializedName(value = "reviewers", alternate = {"Reviewers"})
    @Expose
	@Nullable
    public java.util.List<UserSet> reviewers;

    /**
     * The Reviewer Type.
     * Who should be asked to do the review, either Self or Reviewers.
     */
    @SerializedName(value = "reviewerType", alternate = {"ReviewerType"})
    @Expose
	@Nullable
    public String reviewerType;

    /**
     * The Start Date Time.
     * When the first review should start.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
