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
import com.microsoft.graph.models.UnifiedRbacResourceNamespace;
import com.microsoft.graph.models.UnifiedRoleAssignment;
import com.microsoft.graph.models.UnifiedRoleDefinition;
import com.microsoft.graph.models.Approval;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleInstance;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleRequest;
import com.microsoft.graph.models.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;
import com.microsoft.graph.models.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.UnifiedRbacResourceNamespaceCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleDefinitionCollectionPage;
import com.microsoft.graph.requests.ApprovalCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleRequestCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleInstanceCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rbac Application.
 */
public class RbacApplication extends Entity implements IJsonBackedObject {


    /**
     * The Resource Namespaces.
     * 
     */
    @SerializedName(value = "resourceNamespaces", alternate = {"ResourceNamespaces"})
    @Expose
	@Nullable
    public UnifiedRbacResourceNamespaceCollectionPage resourceNamespaces;

    /**
     * The Role Assignments.
     * Resource to grant access to users or groups.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public UnifiedRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public UnifiedRoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Transitive Role Assignments.
     * 
     */
    @SerializedName(value = "transitiveRoleAssignments", alternate = {"TransitiveRoleAssignments"})
    @Expose
	@Nullable
    public UnifiedRoleAssignmentCollectionPage transitiveRoleAssignments;

    /**
     * The Role Assignment Approvals.
     * 
     */
    @SerializedName(value = "roleAssignmentApprovals", alternate = {"RoleAssignmentApprovals"})
    @Expose
	@Nullable
    public ApprovalCollectionPage roleAssignmentApprovals;

    /**
     * The Role Assignment Schedule Instances.
     * Instances for active role assignments.
     */
    @SerializedName(value = "roleAssignmentScheduleInstances", alternate = {"RoleAssignmentScheduleInstances"})
    @Expose
	@Nullable
    public UnifiedRoleAssignmentScheduleInstanceCollectionPage roleAssignmentScheduleInstances;

    /**
     * The Role Assignment Schedule Requests.
     * Requests for active role assignments to principals through PIM.
     */
    @SerializedName(value = "roleAssignmentScheduleRequests", alternate = {"RoleAssignmentScheduleRequests"})
    @Expose
	@Nullable
    public UnifiedRoleAssignmentScheduleRequestCollectionPage roleAssignmentScheduleRequests;

    /**
     * The Role Assignment Schedules.
     * Schedules for active role assignment operations.
     */
    @SerializedName(value = "roleAssignmentSchedules", alternate = {"RoleAssignmentSchedules"})
    @Expose
	@Nullable
    public UnifiedRoleAssignmentScheduleCollectionPage roleAssignmentSchedules;

    /**
     * The Role Eligibility Schedule Instances.
     * Instances for role eligibility requests.
     */
    @SerializedName(value = "roleEligibilityScheduleInstances", alternate = {"RoleEligibilityScheduleInstances"})
    @Expose
	@Nullable
    public UnifiedRoleEligibilityScheduleInstanceCollectionPage roleEligibilityScheduleInstances;

    /**
     * The Role Eligibility Schedule Requests.
     * Requests for role eligibilities for principals through PIM.
     */
    @SerializedName(value = "roleEligibilityScheduleRequests", alternate = {"RoleEligibilityScheduleRequests"})
    @Expose
	@Nullable
    public UnifiedRoleEligibilityScheduleRequestCollectionPage roleEligibilityScheduleRequests;

    /**
     * The Role Eligibility Schedules.
     * Schedules for role eligibility operations.
     */
    @SerializedName(value = "roleEligibilitySchedules", alternate = {"RoleEligibilitySchedules"})
    @Expose
	@Nullable
    public UnifiedRoleEligibilityScheduleCollectionPage roleEligibilitySchedules;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("resourceNamespaces")) {
            resourceNamespaces = serializer.deserializeObject(json.get("resourceNamespaces"), UnifiedRbacResourceNamespaceCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments"), UnifiedRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions"), UnifiedRoleDefinitionCollectionPage.class);
        }

        if (json.has("transitiveRoleAssignments")) {
            transitiveRoleAssignments = serializer.deserializeObject(json.get("transitiveRoleAssignments"), UnifiedRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleAssignmentApprovals")) {
            roleAssignmentApprovals = serializer.deserializeObject(json.get("roleAssignmentApprovals"), ApprovalCollectionPage.class);
        }

        if (json.has("roleAssignmentScheduleInstances")) {
            roleAssignmentScheduleInstances = serializer.deserializeObject(json.get("roleAssignmentScheduleInstances"), UnifiedRoleAssignmentScheduleInstanceCollectionPage.class);
        }

        if (json.has("roleAssignmentScheduleRequests")) {
            roleAssignmentScheduleRequests = serializer.deserializeObject(json.get("roleAssignmentScheduleRequests"), UnifiedRoleAssignmentScheduleRequestCollectionPage.class);
        }

        if (json.has("roleAssignmentSchedules")) {
            roleAssignmentSchedules = serializer.deserializeObject(json.get("roleAssignmentSchedules"), UnifiedRoleAssignmentScheduleCollectionPage.class);
        }

        if (json.has("roleEligibilityScheduleInstances")) {
            roleEligibilityScheduleInstances = serializer.deserializeObject(json.get("roleEligibilityScheduleInstances"), UnifiedRoleEligibilityScheduleInstanceCollectionPage.class);
        }

        if (json.has("roleEligibilityScheduleRequests")) {
            roleEligibilityScheduleRequests = serializer.deserializeObject(json.get("roleEligibilityScheduleRequests"), UnifiedRoleEligibilityScheduleRequestCollectionPage.class);
        }

        if (json.has("roleEligibilitySchedules")) {
            roleEligibilitySchedules = serializer.deserializeObject(json.get("roleEligibilitySchedules"), UnifiedRoleEligibilityScheduleCollectionPage.class);
        }
    }
}
