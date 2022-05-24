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
import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.DataSubject;
import com.microsoft.graph.models.DataSubjectType;
import com.microsoft.graph.models.SubjectRightsRequestHistory;
import com.microsoft.graph.models.SubjectRightsRequestDetail;
import com.microsoft.graph.models.SubjectRightsRequestMailboxLocation;
import com.microsoft.graph.models.SubjectRightsRequestSiteLocation;
import com.microsoft.graph.models.SubjectRightsRequestStageDetail;
import com.microsoft.graph.models.SubjectRightsRequestStatus;
import com.microsoft.graph.models.SubjectRightsRequestType;
import com.microsoft.graph.models.AuthoredNote;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AuthoredNoteCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subject Rights Request.
 */
public class SubjectRightsRequest extends Entity implements IJsonBackedObject {


    /**
     * The Assigned To.
     * Identity that the request is assigned to.
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
	@Nullable
    public Identity assignedTo;

    /**
     * The Closed Date Time.
     * The date and time when the request was closed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "closedDateTime", alternate = {"ClosedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime closedDateTime;

    /**
     * The Content Query.
     * KQL based content query that should be used for search. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     */
    @SerializedName(value = "contentQuery", alternate = {"ContentQuery"})
    @Expose
	@Nullable
    public String contentQuery;

    /**
     * The Created By.
     * Identity information for the entity that created the request.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * The date and time when the request was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Data Subject.
     * Information about the data subject.
     */
    @SerializedName(value = "dataSubject", alternate = {"DataSubject"})
    @Expose
	@Nullable
    public DataSubject dataSubject;

    /**
     * The Data Subject Type.
     * The type of the data subject. Possible values are: customer, currentEmployee, formerEmployee, prospectiveEmployee, student, teacher, faculty, other, unknownFutureValue.
     */
    @SerializedName(value = "dataSubjectType", alternate = {"DataSubjectType"})
    @Expose
	@Nullable
    public DataSubjectType dataSubjectType;

    /**
     * The Description.
     * Description for the request.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The name of the request.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The External Id.
     * The external ID for the request that is immutable after creation and is used for tracking the request for the external system. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The History.
     * Collection of history change events.
     */
    @SerializedName(value = "history", alternate = {"History"})
    @Expose
	@Nullable
    public java.util.List<SubjectRightsRequestHistory> history;

    /**
     * The Include All Versions.
     * Include all versions of the documents. By default, the current copies of the documents will be returned. If SharePoint sites have versioning enabled, including all versions will include the historical copies of the documents. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     */
    @SerializedName(value = "includeAllVersions", alternate = {"IncludeAllVersions"})
    @Expose
	@Nullable
    public Boolean includeAllVersions;

    /**
     * The Include Authored Content.
     * Include content authored by the data subject. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     */
    @SerializedName(value = "includeAuthoredContent", alternate = {"IncludeAuthoredContent"})
    @Expose
	@Nullable
    public Boolean includeAuthoredContent;

    /**
     * The Insight.
     * Insight about the request.
     */
    @SerializedName(value = "insight", alternate = {"Insight"})
    @Expose
	@Nullable
    public SubjectRightsRequestDetail insight;

    /**
     * The Internal Due Date Time.
     * The date and time when the request is internally due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "internalDueDateTime", alternate = {"InternalDueDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime internalDueDateTime;

    /**
     * The Last Modified By.
     * Identity information for the entity that last modified the request.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * The date and time when the request was last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Mailboxlocations.
     * 
     */
    @SerializedName(value = "mailboxlocations", alternate = {"Mailboxlocations"})
    @Expose
	@Nullable
    public SubjectRightsRequestMailboxLocation mailboxlocations;

    /**
     * The Pause After Estimate.
     * Pause the request after estimate has finished. By default, the data estimate will run and then pause, allowing you to preview results and then select the option to retrieve data in the UI. You can set this property to false if you want it to perform the estimate and then automatically begin with the retrieval of the content. This property is defined only for APIs accessed using the /security query path and not the /privacy query path.
     */
    @SerializedName(value = "pauseAfterEstimate", alternate = {"PauseAfterEstimate"})
    @Expose
	@Nullable
    public Boolean pauseAfterEstimate;

    /**
     * The Regulations.
     * List of regulations that this request will fulfill.
     */
    @SerializedName(value = "regulations", alternate = {"Regulations"})
    @Expose
	@Nullable
    public java.util.List<String> regulations;

    /**
     * The Sitelocations.
     * 
     */
    @SerializedName(value = "sitelocations", alternate = {"Sitelocations"})
    @Expose
	@Nullable
    public SubjectRightsRequestSiteLocation sitelocations;

    /**
     * The Stages.
     * Information about the different stages for the request.
     */
    @SerializedName(value = "stages", alternate = {"Stages"})
    @Expose
	@Nullable
    public java.util.List<SubjectRightsRequestStageDetail> stages;

    /**
     * The Status.
     * The status of the request. Possible values are: active, closed, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SubjectRightsRequestStatus status;

    /**
     * The Type.
     * The type of the request. Possible values are: export, delete, access, tagForAction, unknownFutureValue.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public SubjectRightsRequestType type;

    /**
     * The Notes.
     * List of notes associated with the request.
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public AuthoredNoteCollectionPage notes;

    /**
     * The Team.
     * Information about the Microsoft Teams team that was created for the request.
     */
    @SerializedName(value = "team", alternate = {"Team"})
    @Expose
	@Nullable
    public Team team;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("notes")) {
            notes = serializer.deserializeObject(json.get("notes"), AuthoredNoteCollectionPage.class);
        }
    }
}
