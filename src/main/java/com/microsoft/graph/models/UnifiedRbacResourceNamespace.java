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
import com.microsoft.graph.models.UnifiedRbacResourceAction;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.UnifiedRbacResourceActionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Namespace.
 */
public class UnifiedRbacResourceNamespace extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * Name of the resource namespace. Typically, the same name as the id property, such as microsoft.aad.b2c. Required. Supports $filter (eq, startsWith).
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Resource Actions.
     * Operations that an authorized principal are allowed to perform.
     */
    @SerializedName(value = "resourceActions", alternate = {"ResourceActions"})
    @Expose
	@Nullable
    public UnifiedRbacResourceActionCollectionPage resourceActions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("resourceActions")) {
            resourceActions = serializer.deserializeObject(json.get("resourceActions"), UnifiedRbacResourceActionCollectionPage.class);
        }
    }
}
