// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Update Definition Values Body.
 */
public class GroupPolicyConfigurationUpdateDefinitionValuesBody {

    /**
     * The added.
     * 
     */
    @SerializedName(value = "added", alternate = {"Added"})
    @Expose
    public java.util.List<GroupPolicyDefinitionValue> added;

    /**
     * The updated.
     * 
     */
    @SerializedName(value = "updated", alternate = {"Updated"})
    @Expose
    public java.util.List<GroupPolicyDefinitionValue> updated;

    /**
     * The deleted Ids.
     * 
     */
    @SerializedName(value = "deletedIds", alternate = {"DeletedIds"})
    @Expose
    public java.util.List<String> deletedIds;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
