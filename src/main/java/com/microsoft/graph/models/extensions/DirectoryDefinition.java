// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DirectoryDefinitionDiscoverabilities;
import com.microsoft.graph.models.extensions.ObjectDefinition;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Definition.
 */
public class DirectoryDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Discoverabilities.
     * 
     */
    @SerializedName(value = "discoverabilities", alternate = {"Discoverabilities"})
    @Expose
    public EnumSet<DirectoryDefinitionDiscoverabilities> discoverabilities;

    /**
     * The Discovery Date Time.
     * 
     */
    @SerializedName(value = "discoveryDateTime", alternate = {"DiscoveryDateTime"})
    @Expose
    public java.util.Calendar discoveryDateTime;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Objects.
     * 
     */
    @SerializedName(value = "objects", alternate = {"Objects"})
    @Expose
    public java.util.List<ObjectDefinition> objects;

    /**
     * The Read Only.
     * 
     */
    @SerializedName(value = "readOnly", alternate = {"ReadOnly"})
    @Expose
    public Boolean readOnly;

    /**
     * The Version.
     * 
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
    public String version;


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
