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
import com.microsoft.graph.requests.GovernanceResourceCollectionPage;
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
 * The class for the Privileged Access.
 */
public class PrivilegedAccess extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The display name of the provider managed by PIM.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Resources.
     * A collection of resources for the provider.
     */
    @SerializedName(value = "resources", alternate = {"Resources"})
    @Expose
	@Nullable
    public GovernanceResourceCollectionPage resources;

    /**
     * The Role Assignment Requests.
     * A collection of role assignment requests for the provider.
     */
    @SerializedName(value = "roleAssignmentRequests", alternate = {"RoleAssignmentRequests"})
    @Expose
	@Nullable
    public GovernanceRoleAssignmentRequestCollectionPage roleAssignmentRequests;

    /**
     * The Role Assignments.
     * A collection of role assignments for the provider.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public GovernanceRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * A collection of role defintions for the provider.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public GovernanceRoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Settings.
     * A collection of role settings for the provider.
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


        if (json.has("resources")) {
            resources = serializer.deserializeObject(json.get("resources"), GovernanceResourceCollectionPage.class);
        }

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
