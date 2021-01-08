// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RequestSchedule;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentPolicy;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentRequest;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.models.extensions.AccessPackageSubject;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

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
    public String accessPackageId;

    /**
     * The Assignment Policy Id.
     * The identifier of the access package assignment policy. Read-only.
     */
    @SerializedName(value = "assignmentPolicyId", alternate = {"AssignmentPolicyId"})
    @Expose
    public String assignmentPolicyId;

    /**
     * The Assignment State.
     * The state of the access package assignment. Possible values are Delivering, Delivered, or Expired. Read-only.
     */
    @SerializedName(value = "assignmentState", alternate = {"AssignmentState"})
    @Expose
    public String assignmentState;

    /**
     * The Assignment Status.
     * More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     */
    @SerializedName(value = "assignmentStatus", alternate = {"AssignmentStatus"})
    @Expose
    public String assignmentStatus;

    /**
     * The Catalog Id.
     * The identifier of the catalog containing the access package. Read-only.
     */
    @SerializedName(value = "catalogId", alternate = {"CatalogId"})
    @Expose
    public String catalogId;

    /**
     * The Expired Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "expiredDateTime", alternate = {"ExpiredDateTime"})
    @Expose
    public java.util.Calendar expiredDateTime;

    /**
     * The Is Extended.
     * Indicates whether the access package assignment is extended. Read-only.
     */
    @SerializedName(value = "isExtended", alternate = {"IsExtended"})
    @Expose
    public Boolean isExtended;

    /**
     * The Schedule.
     * When the access assignment is to be in place. Read-only.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
    public RequestSchedule schedule;

    /**
     * The Target Id.
     * The ID of the subject with the assignment. Read-only.
     */
    @SerializedName(value = "targetId", alternate = {"TargetId"})
    @Expose
    public String targetId;

    /**
     * The Access Package.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
    public AccessPackage accessPackage;

    /**
     * The Access Package Assignment Policy.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageAssignmentPolicy", alternate = {"AccessPackageAssignmentPolicy"})
    @Expose
    public AccessPackageAssignmentPolicy accessPackageAssignmentPolicy;

    /**
     * The Access Package Assignment Requests.
     * 
     */
    @SerializedName(value = "accessPackageAssignmentRequests", alternate = {"AccessPackageAssignmentRequests"})
    @Expose
    public AccessPackageAssignmentRequestCollectionPage accessPackageAssignmentRequests;

    /**
     * The Access Package Assignment Resource Roles.
     * The resource roles delivered to the target user for this assignment. Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageAssignmentResourceRoles", alternate = {"AccessPackageAssignmentResourceRoles"})
    @Expose
    public AccessPackageAssignmentResourceRoleCollectionPage accessPackageAssignmentResourceRoles;

    /**
     * The Target.
     * The subject of the access package assignment. Read-only. Nullable.
     */
    @SerializedName(value = "target", alternate = {"Target"})
    @Expose
    public AccessPackageSubject target;


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


        if (json.has("accessPackageAssignmentRequests")) {
            accessPackageAssignmentRequests = serializer.deserializeObject(json.get("accessPackageAssignmentRequests").toString(), AccessPackageAssignmentRequestCollectionPage.class);
        }

        if (json.has("accessPackageAssignmentResourceRoles")) {
            accessPackageAssignmentResourceRoles = serializer.deserializeObject(json.get("accessPackageAssignmentResourceRoles").toString(), AccessPackageAssignmentResourceRoleCollectionPage.class);
        }
    }
}
