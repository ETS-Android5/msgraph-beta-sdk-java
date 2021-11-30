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
import com.microsoft.graph.models.PrivilegedRole;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request.
 */
public class PrivilegedRoleAssignmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Assignment State.
     * The state of the assignment. The value can be Eligible for eligible assignment Active - if it is directly assigned Active by administrators, or activated on an eligible assignment by the users.
     */
    @SerializedName(value = "assignmentState", alternate = {"AssignmentState"})
    @Expose
	@Nullable
    public String assignmentState;

    /**
     * The Duration.
     * The duration of a role assignment.
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public String duration;

    /**
     * The Reason.
     * The reason for the role assignment.
     */
    @SerializedName(value = "reason", alternate = {"Reason"})
    @Expose
	@Nullable
    public String reason;

    /**
     * The Requested Date Time.
     * Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "requestedDateTime", alternate = {"RequestedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime requestedDateTime;

    /**
     * The Role Id.
     * The id of the role.
     */
    @SerializedName(value = "roleId", alternate = {"RoleId"})
    @Expose
	@Nullable
    public String roleId;

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
     * Read-only.The status of the role assignment request. The value can be NotStarted,Completed,RequestedApproval,Scheduled,Approved,ApprovalDenied,ApprovalAborted,Cancelling,Cancelled,Revoked,RequestExpired.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Ticket Number.
     * The ticketNumber for the role assignment.
     */
    @SerializedName(value = "ticketNumber", alternate = {"TicketNumber"})
    @Expose
	@Nullable
    public String ticketNumber;

    /**
     * The Ticket System.
     * The ticketSystem for the role assignment.
     */
    @SerializedName(value = "ticketSystem", alternate = {"TicketSystem"})
    @Expose
	@Nullable
    public String ticketSystem;

    /**
     * The Type.
     * Representing the type of the operation on the role assignment. The value can be AdminAdd: Administrators add users to roles;UserAdd: Users add role assignments.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The User Id.
     * The id of the user.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The Role Info.
     * The roleInfo object of the role assignment request.
     */
    @SerializedName(value = "roleInfo", alternate = {"RoleInfo"})
    @Expose
	@Nullable
    public PrivilegedRole roleInfo;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
