// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.GovernanceSchedule;
import com.microsoft.graph.models.GovernanceRoleAssignmentRequestStatus;
import com.microsoft.graph.models.GovernanceResource;
import com.microsoft.graph.models.GovernanceRoleDefinition;
import com.microsoft.graph.models.GovernanceSubject;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Request.
 */
public class GovernanceRoleAssignmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Assignment State.
     * Required. The state of the assignment. The possible values are: Eligible (for eligible assignment),  Active (if it is directly assigned), Active (by administrators, or activated on an eligible assignment by the users).
     */
    @SerializedName(value = "assignmentState", alternate = {"AssignmentState"})
    @Expose
	@Nullable
    public String assignmentState;

    /**
     * The Linked Eligible Role Assignment Id.
     * If this is a request for role activation, it represents the id of the eligible assignment being referred; Otherwise, the value is null.
     */
    @SerializedName(value = "linkedEligibleRoleAssignmentId", alternate = {"LinkedEligibleRoleAssignmentId"})
    @Expose
	@Nullable
    public String linkedEligibleRoleAssignmentId;

    /**
     * The Reason.
     * A message provided by users and administrators when create the request about why it is needed.
     */
    @SerializedName(value = "reason", alternate = {"Reason"})
    @Expose
	@Nullable
    public String reason;

    /**
     * The Requested Date Time.
     * Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "requestedDateTime", alternate = {"RequestedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime requestedDateTime;

    /**
     * The Resource Id.
     * Required. The unique identifier of the Azure resource that is associated with the role assignment request. Azure resources can include subscriptions, resource groups, virtual machines, and SQL databases.
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
	@Nullable
    public String resourceId;

    /**
     * The Role Definition Id.
     * Required. The identifier of the Azure role definition that the role assignment request is associated with.
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
	@Nullable
    public String roleDefinitionId;

    /**
     * The Schedule.
     * The schedule object of the role assignment request.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public GovernanceSchedule schedule;

    /**
     * The Status.
     * The status of the role assignment request.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public GovernanceRoleAssignmentRequestStatus status;

    /**
     * The Subject Id.
     * Required. The unique identifier of the principal or subject that the role assignment request is associated with. Principals can be users, groups, or service principals.
     */
    @SerializedName(value = "subjectId", alternate = {"SubjectId"})
    @Expose
	@Nullable
    public String subjectId;

    /**
     * The Type.
     * Required. Representing the type of the operation on the role assignment. The possible values are: AdminAdd , UserAdd , AdminUpdate , AdminRemove , UserRemove , UserExtend , AdminExtend , UserRenew , AdminRenew.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The Resource.
     * Read-only. The resource that the request aims to.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public GovernanceResource resource;

    /**
     * The Role Definition.
     * Read-only. The role definition that the request aims to.
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
	@Nullable
    public GovernanceRoleDefinition roleDefinition;

    /**
     * The Subject.
     * Read-only. The user/group principal.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public GovernanceSubject subject;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
