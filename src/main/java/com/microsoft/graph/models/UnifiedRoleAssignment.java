// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AppScope;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.UnifiedRoleDefinition;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment.
 */
public class UnifiedRoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The App Scope Id.
     * Identifier of the app specific scope when the assignment scope is app specific. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. Use / for tenant-wide scope. App scopes are scopes that are defined and understood by this application only.  For the entitlement management provider, use app scopes to specify a catalog, for example /AccessPackageCatalog/beedadfe-01d5-4025-910b-84abb9369997.
     */
    @SerializedName(value = "appScopeId", alternate = {"AppScopeId"})
    @Expose
	@Nullable
    public String appScopeId;

    /**
     * The Condition.
     * 
     */
    @SerializedName(value = "condition", alternate = {"Condition"})
    @Expose
	@Nullable
    public String condition;

    /**
     * The Directory Scope Id.
     * Identifier of the directory object representing the scope of the assignment. The scope of an assignment determines the set of resources for which the principal has been granted access. Directory scopes are shared scopes stored in the directory that are understood by multiple applications. App scopes are scopes that are defined and understood by this application only.
     */
    @SerializedName(value = "directoryScopeId", alternate = {"DirectoryScopeId"})
    @Expose
	@Nullable
    public String directoryScopeId;

    /**
     * The Principal Id.
     * Identifier of the principal to which the assignment is granted. Supports $filter (eq operator only).
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
	@Nullable
    public String principalId;

    /**
     * The Principal Organization Id.
     * 
     */
    @SerializedName(value = "principalOrganizationId", alternate = {"PrincipalOrganizationId"})
    @Expose
	@Nullable
    public String principalOrganizationId;

    /**
     * The Resource Scope.
     * The scope at which the unifiedRoleAssignment applies. This is / for service-wide. DO NOT USE. This property will be deprecated soon.
     */
    @SerializedName(value = "resourceScope", alternate = {"ResourceScope"})
    @Expose
	@Nullable
    public String resourceScope;

    /**
     * The Role Definition Id.
     * Identifier of the unifiedRoleDefinition the assignment is for. Read-only. Supports $filter (eq operator only).
     */
    @SerializedName(value = "roleDefinitionId", alternate = {"RoleDefinitionId"})
    @Expose
	@Nullable
    public String roleDefinitionId;

    /**
     * The App Scope.
     * Details of the app specific scope when the assignment scope is app specific. Containment entity.
     */
    @SerializedName(value = "appScope", alternate = {"AppScope"})
    @Expose
	@Nullable
    public AppScope appScope;

    /**
     * The Directory Scope.
     * The directory object that is the scope of the assignment. Provided so that callers can get the directory object using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     */
    @SerializedName(value = "directoryScope", alternate = {"DirectoryScope"})
    @Expose
	@Nullable
    public DirectoryObject directoryScope;

    /**
     * The Principal.
     * The assigned principal. Provided so that callers can get the principal using $expand at the same time as getting the role assignment. Read-only. Supports $expand.
     */
    @SerializedName(value = "principal", alternate = {"Principal"})
    @Expose
	@Nullable
    public DirectoryObject principal;

    /**
     * The Role Definition.
     * The roleDefinition the assignment is for. Provided so that callers can get the role definition using $expand at the same time as getting the role assignment. roleDefinition.id will be auto expanded. Supports $expand.
     */
    @SerializedName(value = "roleDefinition", alternate = {"RoleDefinition"})
    @Expose
	@Nullable
    public UnifiedRoleDefinition roleDefinition;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
