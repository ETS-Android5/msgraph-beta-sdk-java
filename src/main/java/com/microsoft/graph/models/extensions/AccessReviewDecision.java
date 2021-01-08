// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserIdentity;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Decision.
 */
public class AccessReviewDecision extends Entity implements IJsonBackedObject {


    /**
     * The Access Recommendation.
     * The feature- generated recommendation shown to the reviewer, one of Approve, Deny or NotAvailable.
     */
    @SerializedName(value = "accessRecommendation", alternate = {"AccessRecommendation"})
    @Expose
    public String accessRecommendation;

    /**
     * The Access Review Id.
     * The feature-generated id of the access review.
     */
    @SerializedName(value = "accessReviewId", alternate = {"AccessReviewId"})
    @Expose
    public String accessReviewId;

    /**
     * The Applied By.
     * When the review completes, if the results were manually applied, the user identity of the user who applied the decision. If the review was auto-applied, the userPrincipalName is empty.
     */
    @SerializedName(value = "appliedBy", alternate = {"AppliedBy"})
    @Expose
    public UserIdentity appliedBy;

    /**
     * The Applied Date Time.
     * The date and time when the review decision was applied.
     */
    @SerializedName(value = "appliedDateTime", alternate = {"AppliedDateTime"})
    @Expose
    public java.util.Calendar appliedDateTime;

    /**
     * The Apply Result.
     * The outcome of applying the decision, one of NotApplied, Success, Failed, NotFound or NotSupported.
     */
    @SerializedName(value = "applyResult", alternate = {"ApplyResult"})
    @Expose
    public String applyResult;

    /**
     * The Justification.
     * The reviewer's business justification, if supplied.
     */
    @SerializedName(value = "justification", alternate = {"Justification"})
    @Expose
    public String justification;

    /**
     * The Reviewed By.
     * The identity of the reviewer. If the recommendation was used as the review, the userPrincipalName is empty.
     */
    @SerializedName(value = "reviewedBy", alternate = {"ReviewedBy"})
    @Expose
    public UserIdentity reviewedBy;

    /**
     * The Reviewed Date Time.
     * 
     */
    @SerializedName(value = "reviewedDateTime", alternate = {"ReviewedDateTime"})
    @Expose
    public java.util.Calendar reviewedDateTime;

    /**
     * The Review Result.
     * The result of the review, one of NotReviewed, Deny, DontKnow or Approve.
     */
    @SerializedName(value = "reviewResult", alternate = {"ReviewResult"})
    @Expose
    public String reviewResult;


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

    }
}
