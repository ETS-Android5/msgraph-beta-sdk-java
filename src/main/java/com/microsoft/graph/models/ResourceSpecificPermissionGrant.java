// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DirectoryObject;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Resource Specific Permission Grant.
 */
public class ResourceSpecificPermissionGrant extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Client App Id.
     * ID of the service principal of the Azure AD app that has been granted access. Read-only.
     */
    @SerializedName(value = "clientAppId", alternate = {"ClientAppId"})
    @Expose
	@Nullable
    public String clientAppId;

    /**
     * The Client Id.
     * ID of the Azure AD app that has been granted access. Read-only.
     */
    @SerializedName(value = "clientId", alternate = {"ClientId"})
    @Expose
	@Nullable
    public String clientId;

    /**
     * The Permission.
     * The name of the permission. Read-only.
     */
    @SerializedName(value = "permission", alternate = {"Permission"})
    @Expose
	@Nullable
    public String permission;

    /**
     * The Permission Type.
     * The type of permission. Possible values are: Application, Delegated. Read-only.
     */
    @SerializedName(value = "permissionType", alternate = {"PermissionType"})
    @Expose
	@Nullable
    public String permissionType;

    /**
     * The Resource App Id.
     * ID of the Azure AD app that is hosting the resource. Read-only.
     */
    @SerializedName(value = "resourceAppId", alternate = {"ResourceAppId"})
    @Expose
	@Nullable
    public String resourceAppId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
