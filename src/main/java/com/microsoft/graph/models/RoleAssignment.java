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
import com.microsoft.graph.models.RoleAssignmentScopeType;
import com.microsoft.graph.models.RoleDefinition;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Assignment.
 */
public class RoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Description of the Role Assignment.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display or friendly name of the role Assignment.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Resource Scopes.
     * List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     */
    @SerializedName(value = "resourceScopes", alternate = {"ResourceScopes"})
    @Expose
	@Nullable
    public java.util.List<String> resourceScopes;

    /**
     * The Scope Members.
     * List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     */
    @SerializedName(value = "scopeMembers", alternate = {"ScopeMembers"})
    @Expose
	@Nullable
    public java.util.List<String> scopeMembers;

    /**
     * The Scope Type.
     * Specifies the type of scope for a Role Assignment. Default type 'ResourceScope' allows assignment of ResourceScopes. For 'AllDevices', 'AllLicensedUsers', and 'AllDevicesAndLicensedUsers', the ResourceScopes property should be left empty. Possible values are: resourceScope, allDevices, allLicensedUsers, allDevicesAndLicensedUsers.
     */
    @SerializedName(value = "scopeType", alternate = {"ScopeType"})
    @Expose
	@Nullable
    public RoleAssignmentScopeType scopeType;

    /**
     * The Role Definition.
     * Role definition this assignment is part of.
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
	@Nullable
    public RoleDefinition roleDefinition;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
