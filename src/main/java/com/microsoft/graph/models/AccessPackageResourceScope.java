// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AccessPackageResource;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Scope.
 */
public class AccessPackageResourceScope extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * The description of the scope.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the scope.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Root Scope.
     * True if the scopes are arranged in a hierarchy and this is the top or root scope of the resource.
     */
    @SerializedName(value = "isRootScope", alternate = {"IsRootScope"})
    @Expose
	@Nullable
    public Boolean isRootScope;

    /**
     * The Origin Id.
     * The unique identifier for the scope in the resource as defined in the origin system.
     */
    @SerializedName(value = "originId", alternate = {"OriginId"})
    @Expose
	@Nullable
    public String originId;

    /**
     * The Origin System.
     * The origin system for the scope.
     */
    @SerializedName(value = "originSystem", alternate = {"OriginSystem"})
    @Expose
	@Nullable
    public String originSystem;

    /**
     * The Role Origin Id.
     * The origin system for the role, if different.
     */
    @SerializedName(value = "roleOriginId", alternate = {"RoleOriginId"})
    @Expose
	@Nullable
    public String roleOriginId;

    /**
     * The Url.
     * A resource locator for the scope.
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
	@Nullable
    public String url;

    /**
     * The Access Package Resource.
     * Read-only. Nullable.
     */
    @SerializedName(value = "accessPackageResource", alternate = {"AccessPackageResource"})
    @Expose
	@Nullable
    public AccessPackageResource accessPackageResource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
