// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UnifiedRbacResourceScope;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Action.
 */
public class UnifiedRbacResourceAction extends Entity implements IJsonBackedObject {


    /**
     * The Action Verb.
     * HTTP method for the action, such as DELETE, GET, PATCH, POST, PUT, or null. Supports $filter (eq) but not for null values.
     */
    @SerializedName(value = "actionVerb", alternate = {"ActionVerb"})
    @Expose
	@Nullable
    public String actionVerb;

    /**
     * The Description.
     * Description for the action. Supports $filter (eq).
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Name.
     * Name for the action within the resource namespace, such as microsoft.insights/programs/update. Can include slash character (/). Case insensitive. Required. Supports $filter (eq).
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Resource Scope Id.
     * Not implemented.
     */
    @SerializedName(value = "resourceScopeId", alternate = {"ResourceScopeId"})
    @Expose
	@Nullable
    public String resourceScopeId;

    /**
     * The Resource Scope.
     * 
     */
    @SerializedName(value = "resourceScope", alternate = {"ResourceScope"})
    @Expose
	@Nullable
    public UnifiedRbacResourceScope resourceScope;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
