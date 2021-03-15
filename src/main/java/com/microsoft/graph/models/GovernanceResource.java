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
import com.microsoft.graph.models.GovernanceResource;
import com.microsoft.graph.models.GovernanceRoleAssignmentRequest;
import com.microsoft.graph.models.GovernanceRoleAssignment;
import com.microsoft.graph.models.GovernanceRoleDefinition;
import com.microsoft.graph.models.GovernanceRoleSetting;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.GovernanceRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.GovernanceRoleDefinitionCollectionPage;
import com.microsoft.graph.requests.GovernanceRoleSettingCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource.
 */
public class GovernanceResource extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The display name of the resource.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The External Id.
     * The external id of the resource, representing its original id in the external system. For example, a subscription resource's external id can be '/subscriptions/c14ae696-5e0c-4e5d-88cc-bef6637737ac'.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Registered Date Time.
     * Represents the date time when the resource is registered in PIM.
     */
    @SerializedName(value = "registeredDateTime", alternate = {"RegisteredDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime registeredDateTime;

    /**
     * The Registered Root.
     * The externalId of the resource's root scope that is registered in PIM. The root scope can be the parent, grandparent, or higher ancestor resources.
     */
    @SerializedName(value = "registeredRoot", alternate = {"RegisteredRoot"})
    @Expose
	@Nullable
    public String registeredRoot;

    /**
     * The Status.
     * The status of a given resource. For example, it could represent whether the resource is locked or not (values: Active/Locked). Note: This property may be extended in the future to support more scenarios.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The Type.
     * Required. Resource type. For example, for Azure resources, the type could be 'Subscription', 'ResourceGroup', 'Microsoft.Sql/server', etc.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The Parent.
     * Read-only. The parent resource. for pimforazurerbac scenario, it can represent the subscription the resource belongs to.
     */
    @SerializedName(value = "parent", alternate = {"Parent"})
    @Expose
	@Nullable
    public GovernanceResource parent;

    /**
     * The Role Assignment Requests.
     * The collection of role assignment requests for the resource.
     */
    @SerializedName(value = "roleAssignmentRequests", alternate = {"RoleAssignmentRequests"})
    @Expose
	@Nullable
    public GovernanceRoleAssignmentRequestCollectionPage roleAssignmentRequests;

    /**
     * The Role Assignments.
     * The collection of role assignments for the resource.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public GovernanceRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * The collection of role defintions for the resource.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public GovernanceRoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Settings.
     * The collection of role settings for the resource.
     */
    @SerializedName(value = "roleSettings", alternate = {"RoleSettings"})
    @Expose
	@Nullable
    public GovernanceRoleSettingCollectionPage roleSettings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("roleAssignmentRequests")) {
            roleAssignmentRequests = serializer.deserializeObject(json.get("roleAssignmentRequests"), GovernanceRoleAssignmentRequestCollectionPage.class);
        }

        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments"), GovernanceRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions"), GovernanceRoleDefinitionCollectionPage.class);
        }

        if (json.has("roleSettings")) {
            roleSettings = serializer.deserializeObject(json.get("roleSettings"), GovernanceRoleSettingCollectionPage.class);
        }
    }
}
