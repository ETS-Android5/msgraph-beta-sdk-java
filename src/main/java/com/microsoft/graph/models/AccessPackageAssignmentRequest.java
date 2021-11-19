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
     * 
     */
    @SerializedName(value = "answers", alternate = {"Answers"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageAnswer> answers;

    /**
     * The Completed Date.
     * 
     */
    @SerializedName(value = "completedDate", alternate = {"CompletedDate"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDate;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

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
     * 
     */
    @SerializedName(value = "isValidationOnly", alternate = {"IsValidationOnly"})
    @Expose
	@Nullable
    public Boolean isValidationOnly;

    /**
     * The Justification.
     * 
     */
    @SerializedName(value = "justification", alternate = {"Justification"})
    @Expose
	@Nullable
    public String justification;

    /**
     * The Request State.
     * 
     */
    @SerializedName(value = "requestState", alternate = {"RequestState"})
    @Expose
	@Nullable
    public String requestState;

    /**
     * The Request Status.
     * 
     */
    @SerializedName(value = "requestStatus", alternate = {"RequestStatus"})
    @Expose
	@Nullable
    public String requestStatus;

    /**
     * The Request Type.
     * 
     */
    @SerializedName(value = "requestType", alternate = {"RequestType"})
    @Expose
	@Nullable
    public String requestType;

    /**
     * The Schedule.
     * 
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public RequestSchedule schedule;

    /**
     * The Access Package.
     * 
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Access Package Assignment.
     * 
     */
    @SerializedName(value = "accessPackageAssignment", alternate = {"AccessPackageAssignment"})
    @Expose
	@Nullable
    public AccessPackageAssignment accessPackageAssignment;

    /**
     * The Requestor.
     * 
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
