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
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.EducationSubmissionRecipient;
import com.microsoft.graph.models.EducationSubmissionStatus;
import com.microsoft.graph.models.EducationOutcome;
import com.microsoft.graph.models.EducationSubmissionResource;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EducationOutcomeCollectionPage;
import com.microsoft.graph.requests.EducationSubmissionResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission.
 */
public class EducationSubmission extends Entity implements IJsonBackedObject {


    /**
     * The Reassigned By.
     * 
     */
    @SerializedName(value = "reassignedBy", alternate = {"ReassignedBy"})
    @Expose
	@Nullable
    public IdentitySet reassignedBy;

    /**
     * The Reassigned Date Time.
     * 
     */
    @SerializedName(value = "reassignedDateTime", alternate = {"ReassignedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime reassignedDateTime;

    /**
     * The Recipient.
     * Who this submission is assigned to.
     */
    @SerializedName(value = "recipient", alternate = {"Recipient"})
    @Expose
	@Nullable
    public EducationSubmissionRecipient recipient;

    /**
     * The Resources Folder Url.
     * Folder where all file resources for this submission need to be stored.
     */
    @SerializedName(value = "resourcesFolderUrl", alternate = {"ResourcesFolderUrl"})
    @Expose
	@Nullable
    public String resourcesFolderUrl;

    /**
     * The Returned By.
     * User who moved the status of this submission to returned.
     */
    @SerializedName(value = "returnedBy", alternate = {"ReturnedBy"})
    @Expose
	@Nullable
    public IdentitySet returnedBy;

    /**
     * The Returned Date Time.
     * Moment in time when the submission was returned. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "returnedDateTime", alternate = {"ReturnedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime returnedDateTime;

    /**
     * The Status.
     * Read-Only. Possible values are: working, submitted, released, returned.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public EducationSubmissionStatus status;

    /**
     * The Submitted By.
     * User who moved the resource into the submitted state.
     */
    @SerializedName(value = "submittedBy", alternate = {"SubmittedBy"})
    @Expose
	@Nullable
    public IdentitySet submittedBy;

    /**
     * The Submitted Date Time.
     * Moment in time when the submission was moved into the submitted state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "submittedDateTime", alternate = {"SubmittedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime submittedDateTime;

    /**
     * The Unsubmitted By.
     * User who moved the resource from submitted into the working state.
     */
    @SerializedName(value = "unsubmittedBy", alternate = {"UnsubmittedBy"})
    @Expose
	@Nullable
    public IdentitySet unsubmittedBy;

    /**
     * The Unsubmitted Date Time.
     * Moment in time when the submission was moved from submitted into the working state. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "unsubmittedDateTime", alternate = {"UnsubmittedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime unsubmittedDateTime;

    /**
     * The Outcomes.
     * Read-Write. Nullable.
     */
    @SerializedName(value = "outcomes", alternate = {"Outcomes"})
    @Expose
	@Nullable
    public EducationOutcomeCollectionPage outcomes;

    /**
     * The Resources.
     * Nullable.
     */
    @SerializedName(value = "resources", alternate = {"Resources"})
    @Expose
	@Nullable
    public EducationSubmissionResourceCollectionPage resources;

    /**
     * The Submitted Resources.
     * Read-only. Nullable.
     */
    @SerializedName(value = "submittedResources", alternate = {"SubmittedResources"})
    @Expose
	@Nullable
    public EducationSubmissionResourceCollectionPage submittedResources;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("outcomes")) {
            outcomes = serializer.deserializeObject(json.get("outcomes"), EducationOutcomeCollectionPage.class);
        }

        if (json.has("resources")) {
            resources = serializer.deserializeObject(json.get("resources"), EducationSubmissionResourceCollectionPage.class);
        }

        if (json.has("submittedResources")) {
            submittedResources = serializer.deserializeObject(json.get("submittedResources"), EducationSubmissionResourceCollectionPage.class);
        }
    }
}
