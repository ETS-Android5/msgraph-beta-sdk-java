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
import com.microsoft.graph.models.RequestSchedule;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
import com.microsoft.graph.models.AccessPackageAssignmentRequest;
import com.microsoft.graph.models.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.models.AccessPackageSubject;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentResourceRoleCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment.
 */
public class AccessPackageAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Access Package Id.
     * The identifier of the access package. Read-only.
     */
    @SerializedName(value = "accessPackageId", alternate = {"AccessPackageId"})
    @Expose
	@Nullable
    public String accessPackageId;

    /**
     * The Assignment Policy Id.
     * The identifier of the access package assignment policy. Read-only.
     */
    @SerializedName(value = "assignmentPolicyId", alternate = {"AssignmentPolicyId"})
    @Expose
	@Nullable
    public String assignmentPolicyId;

    /**
     * The Assignment State.
     * The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only.
     */
    @SerializedName(value = "assignmentState", alternate = {"AssignmentState"})
    @Expose
	@Nullable
    public String assignmentState;

    /**
     * The Assignment Status.
     * More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     */
    @SerializedName(value = "assignmentStatus", alternate = {"AssignmentStatus"})
    @Expose
	@Nullable
    public String assignmentStatus;

    /**
     * The Catalog Id.
     * The identifier of the catalog containing the access package. Read-only.
     */
    @SerializedName(value = "catalogId", alternate = {"CatalogId"})
    @Expose
	@Nullable
    public String catalogId;

    /**
     * The Expired Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "expiredDateTime", alternate = {"ExpiredDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expiredDateTime;

    /**
     * The Is Extended.
     * Indicates whether the access package assignment is extended. Read-only.
     */
    @SerializedName(value = "isExtended", alternate = {"IsExtended"})
    @Expose
	@Nullable
    public Boolean isExtended;

    /**
     * The Schedule.
     * When the access assignment is to be in place. Read-only.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
	@Nullable
    public RequestSchedule schedule;

    /**
     * The Target Id.
     * The ID of the subject with the assignment. Read-only.
     */
    @SerializedName(value = "targetId", alternate = {"TargetId"})
    @Expose
	@Nullable
    public String targetId;

    /**
     * The Access Package.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Access Package Assignment Policy.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageAssignmentPolicy", alternate = {"AccessPackageAssignmentPolicy"})
    @Expose
	@Nullable
    public AccessPackageAssignmentPolicy accessPackageAssignmentPolicy;

    /**
     * The Access Package Assignment Requests.
     * 
     */
    @SerializedName(value = "accessPackageAssignmentRequests", alternate = {"AccessPackageAssignmentRequests"})
    @Expose
	@Nullable
    public AccessPackageAssignmentRequestCollectionPage accessPackageAssignmentRequests;

    /**
     * The Access Package Assignment Resource Roles.
     * The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageAssignmentResourceRoles", alternate = {"AccessPackageAssignmentResourceRoles"})
    @Expose
	@Nullable
    public AccessPackageAssignmentResourceRoleCollectionPage accessPackageAssignmentResourceRoles;

    /**
     * The Target.
     * The subject of the access package assignment. Read-only. Nullable.
     */
    @SerializedName(value = "target", alternate = {"Target"})
    @Expose
	@Nullable
    public AccessPackageSubject target;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("accessPackageAssignmentRequests")) {
            accessPackageAssignmentRequests = serializer.deserializeObject(json.get("accessPackageAssignmentRequests"), AccessPackageAssignmentRequestCollectionPage.class);
        }

        if (json.has("accessPackageAssignmentResourceRoles")) {
            accessPackageAssignmentResourceRoles = serializer.deserializeObject(json.get("accessPackageAssignmentResourceRoles"), AccessPackageAssignmentResourceRoleCollectionPage.class);
        }
    }
}
