// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AttributeMapping;
import com.microsoft.graph.models.generated.ObjectFlowTypes;
import com.microsoft.graph.models.extensions.MetadataEntry;
import com.microsoft.graph.models.extensions.Filter;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Object Mapping.
 */
public class ObjectMapping implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attribute Mappings.
     * Attribute mappings define which attributes to map from the source object into the target object and how they should flow. A number of functions are available to support the transformation of the original source values.
     */
    @SerializedName(value = "attributeMappings", alternate = {"AttributeMappings"})
    @Expose
    public java.util.List<AttributeMapping> attributeMappings;

    /**
     * The Enabled.
     * When true, this object mapping will be processed during synchronization. When false, this object mapping will be skipped.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
    public Boolean enabled;

    /**
     * The Flow Types.
     * Which flow types are enabled for this object mapping. Add creates new objects in the target directory, Update modifies existing objects, and Delete deprovisions existing users. The default is Add, Update, Delete.
     */
    @SerializedName(value = "flowTypes", alternate = {"FlowTypes"})
    @Expose
    public EnumSet<ObjectFlowTypes> flowTypes;

    /**
     * The Metadata.
     * Additional extension properties. Unless mentioned explicitly, metadata values should not be changed.
     */
    @SerializedName(value = "metadata", alternate = {"Metadata"})
    @Expose
    public java.util.List<MetadataEntry> metadata;

    /**
     * The Name.
     * Human-friendly name of the object mapping.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Scope.
     * Defines a filter to be used when deciding whether a given object should be provisioned. For example, you might want to only provision users that are located in the US.
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
    public Filter scope;

    /**
     * The Source Object Name.
     * Name of the object in the source directory. Must match the object name from the source directory definition.
     */
    @SerializedName(value = "sourceObjectName", alternate = {"SourceObjectName"})
    @Expose
    public String sourceObjectName;

    /**
     * The Target Object Name.
     * Name of the object in target directory. Must match the object name from the target directory definition.
     */
    @SerializedName(value = "targetObjectName", alternate = {"TargetObjectName"})
    @Expose
    public String targetObjectName;


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
