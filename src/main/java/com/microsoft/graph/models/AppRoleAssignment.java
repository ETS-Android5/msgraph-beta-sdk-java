// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment.
 */
public class AppRoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The App Role Id.
     * The identifier (id) for the app role which is assigned to the principal. This app role must be exposed in the appRoles property on the resource application's service principal (resourceId). If the resource application has not declared any app roles, a default app role ID of 00000000-0000-0000-0000-000000000000 can be specified to signal that the principal is assigned to the resource app without any specific app roles. Required on create.
     */
    @SerializedName(value = "appRoleId", alternate = {"AppRoleId"})
    @Expose
	@Nullable
    public java.util.UUID appRoleId;

    /**
     * The Creation Timestamp.
     * The time when the app role assignment was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    @SerializedName(value = "creationTimestamp", alternate = {"CreationTimestamp"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime creationTimestamp;

    /**
     * The Principal Display Name.
     * The display name of the user, group, or service principal that was granted the app role assignment. Read-only. Supports $filter (eq and startswith).
     */
    @SerializedName(value = "principalDisplayName", alternate = {"PrincipalDisplayName"})
    @Expose
	@Nullable
    public String principalDisplayName;

    /**
     * The Principal Id.
     * The unique identifier (id) for the user, group, or service principal being granted the app role. Required on create.
     */
    @SerializedName(value = "principalId", alternate = {"PrincipalId"})
    @Expose
	@Nullable
    public java.util.UUID principalId;

    /**
     * The Principal Type.
     * The type of the assigned principal. This can either be User, Group, or ServicePrincipal. Read-only.
     */
    @SerializedName(value = "principalType", alternate = {"PrincipalType"})
    @Expose
	@Nullable
    public String principalType;

    /**
     * The Resource Display Name.
     * The display name of the resource app's service principal to which the assignment is made.
     */
    @SerializedName(value = "resourceDisplayName", alternate = {"ResourceDisplayName"})
    @Expose
	@Nullable
    public String resourceDisplayName;

    /**
     * The Resource Id.
     * The unique identifier (id) for the resource service principal for which the assignment is made. Required on create. Supports $filter (eq only).
     */
    @SerializedName(value = "resourceId", alternate = {"ResourceId"})
    @Expose
	@Nullable
    public java.util.UUID resourceId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
