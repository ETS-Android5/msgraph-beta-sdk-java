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
import com.microsoft.graph.models.AccessReviewApplyAction;
import com.microsoft.graph.models.PatternedRecurrence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Settings.
 */
public class AccessReviewScheduleSettings implements IJsonBackedObject {

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
     * The Apply Actions.
     * Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction. See accessReviewApplyAction.
     */
    @SerializedName(value = "applyActions", alternate = {"ApplyActions"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewApplyAction> applyActions;

    /**
     * The Auto Apply Decisions Enabled.
     * Indicates whether decisions are automatically applied. When set to false, a user must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false.
     */
    @SerializedName(value = "autoApplyDecisionsEnabled", alternate = {"AutoApplyDecisionsEnabled"})
    @Expose
	@Nullable
    public Boolean autoApplyDecisionsEnabled;

    /**
     * The Default Decision.
     * Decision chosen if defaultDecisionEnabled is true. Can be one of Approve, Deny, or Recommendation.
     */
    @SerializedName(value = "defaultDecision", alternate = {"DefaultDecision"})
    @Expose
	@Nullable
    public String defaultDecision;

    /**
     * The Default Decision Enabled.
     * Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.
     */
    @SerializedName(value = "defaultDecisionEnabled", alternate = {"DefaultDecisionEnabled"})
    @Expose
	@Nullable
    public Boolean defaultDecisionEnabled;

    /**
     * The Instance Duration In Days.
     * Duration of each recurrence of review (accessReviewInstance) in number of days.
     */
    @SerializedName(value = "instanceDurationInDays", alternate = {"InstanceDurationInDays"})
    @Expose
	@Nullable
    public Integer instanceDurationInDays;

    /**
     * The Justification Required On Approval.
     * Indicates whether reviewers are required to provide justification with their decision. Default value is false.
     */
    @SerializedName(value = "justificationRequiredOnApproval", alternate = {"JustificationRequiredOnApproval"})
    @Expose
	@Nullable
    public Boolean justificationRequiredOnApproval;

    /**
     * The Mail Notifications Enabled.
     * Indicates whether emails are enabled or disabled. Default value is false.
     */
    @SerializedName(value = "mailNotificationsEnabled", alternate = {"MailNotificationsEnabled"})
    @Expose
	@Nullable
    public Boolean mailNotificationsEnabled;

    /**
     * The Recommendation Look Back Duration.
     * Optional field. Indicates the time period of inactivity (with respect to the start date of the review instance) that recommendations will be configured from. The recommendation will be to deny if the user is inactive during the look back duration. Supported durations are 30, 60, or 90 days.
     */
    @SerializedName(value = "recommendationLookBackDuration", alternate = {"RecommendationLookBackDuration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration recommendationLookBackDuration;

    /**
     * The Recommendations Enabled.
     * Indicates whether decision recommendations are enabled or disabled.
     */
    @SerializedName(value = "recommendationsEnabled", alternate = {"RecommendationsEnabled"})
    @Expose
	@Nullable
    public Boolean recommendationsEnabled;

    /**
     * The Recurrence.
     * Detailed settings for recurrence using the standard Outlook recurrence object. Only weekly and absoluteMonthly on recurrencePattern are supported. Use the property startDate on recurrenceRange to determine the day the review starts.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
	@Nullable
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Notifications Enabled.
     * Indicates whether reminders are enabled or disabled. Default value is false.
     */
    @SerializedName(value = "reminderNotificationsEnabled", alternate = {"ReminderNotificationsEnabled"})
    @Expose
	@Nullable
    public Boolean reminderNotificationsEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
