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
import com.microsoft.graph.models.AccessPackageAnswer;
import com.microsoft.graph.models.CustomExtensionHandlerInstance;
import com.microsoft.graph.models.RequestSchedule;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageAssignment;
import com.microsoft.graph.models.AccessPackageSubject;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request.
 */
public class AccessPackageAssignmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Answers.
     * Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     */
    @SerializedName(value = "answers", alternate = {"Answers"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageAnswer> answers;

    /**
     * The Completed Date.
     * The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "completedDate", alternate = {"CompletedDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDate;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Custom Extension Handler Instances.
     * A collection of custom workflow extension instances being run on an assignment request. Read-only.
     */
    @SerializedName(value = "customExtensionHandlerInstances", alternate = {"CustomExtensionHandlerInstances"})
    @Expose
	@Nullable
    public java.util.List<CustomExtensionHandlerInstance> customExtensionHandlerInstances;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Is Validation Only.
     * True if the request is not to be processed for assignment.
     */
    @SerializedName(value = "isValidationOnly", alternate = {"IsValidationOnly"})
    @Expose
	@Nullable
    public Boolean isValidationOnly;

    /**
     * The Justification.
     * The requestor's supplied justification.
     */
    @SerializedName(value = "justification", alternate = {"Justification"})
    @Expose
	@Nullable
    public String justification;

    /**
     * The Request State.
     * One of PendingApproval, Canceled,  Denied, Delivering, Delivered, PartiallyDelivered, DeliveryFailed, Submitted or Scheduled. Read-only.
     */
    @SerializedName(value = "requestState", alternate = {"RequestState"})
    @Expose
	@Nullable
    public String requestState;

    /**
     * The Request Status.
     * More information on the request processing status. Read-only.
     */
    @SerializedName(value = "requestStatus", alternate = {"RequestStatus"})
    @Expose
	@Nullable
    public String requestStatus;

    /**
     * The Request Type.
     * The type of the request. The possible values are: notSpecified, userAdd, userUpdate, userRemove, adminAdd, adminUpdate, adminRemove, systemAdd, systemUpdate, systemRemove, onBehalfAdd, unknownFutureValue. A request from the user themselves would have requestType of UserAdd or UserRemove. This property cannot be changed once set.
     */
    @SerializedName(value = "requestType", alternate = {"RequestType"})
    @Expose
	@Nullable
    public String requestType;

    /**
     * The Schedule.
     * The range of dates that access is to be assigned to the requestor. This property cannot be changed once set.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public RequestSchedule schedule;

    /**
     * The Access Package.
     * The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable.  Supports $expand.
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Access Package Assignment.
     * For a requestType of UserAdd or AdminAdd, this is an access package assignment requested to be created.  For a requestType of UserRemove, AdminRemove or SystemRemove, this has the id property of an existing assignment to be removed.  Supports $expand.
     */
    @SerializedName(value = "accessPackageAssignment", alternate = {"AccessPackageAssignment"})
    @Expose
	@Nullable
    public AccessPackageAssignment accessPackageAssignment;

    /**
     * The Requestor.
     * The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "requestor", alternate = {"Requestor"})
    @Expose
	@Nullable
    public AccessPackageSubject requestor;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
