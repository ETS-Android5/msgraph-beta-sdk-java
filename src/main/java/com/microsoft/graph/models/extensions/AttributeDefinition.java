// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.StringKeyStringValuePair;
import com.microsoft.graph.models.extensions.MetadataEntry;
import com.microsoft.graph.models.generated.Mutability;
import com.microsoft.graph.models.extensions.ReferencedObject;
import com.microsoft.graph.models.generated.AttributeType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attribute Definition.
 */
public class AttributeDefinition implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Anchor.
     * 
     */
    @SerializedName(value = "anchor", alternate = {"Anchor"})
    @Expose
    public Boolean anchor;

    /**
     * The Api Expressions.
     * 
     */
    @SerializedName(value = "apiExpressions", alternate = {"ApiExpressions"})
    @Expose
    public java.util.List<StringKeyStringValuePair> apiExpressions;

    /**
     * The Case Exact.
     * 
     */
    @SerializedName(value = "caseExact", alternate = {"CaseExact"})
    @Expose
    public Boolean caseExact;

    /**
     * The Default Value.
     * 
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
    public String defaultValue;

    /**
     * The Flow Null Values.
     * 
     */
    @SerializedName(value = "flowNullValues", alternate = {"FlowNullValues"})
    @Expose
    public Boolean flowNullValues;

    /**
     * The Metadata.
     * 
     */
    @SerializedName(value = "metadata", alternate = {"Metadata"})
    @Expose
    public java.util.List<MetadataEntry> metadata;

    /**
     * The Multivalued.
     * 
     */
    @SerializedName(value = "multivalued", alternate = {"Multivalued"})
    @Expose
    public Boolean multivalued;

    /**
     * The Mutability.
     * 
     */
    @SerializedName(value = "mutability", alternate = {"Mutability"})
    @Expose
    public Mutability mutability;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Referenced Objects.
     * 
     */
    @SerializedName(value = "referencedObjects", alternate = {"ReferencedObjects"})
    @Expose
    public java.util.List<ReferencedObject> referencedObjects;

    /**
     * The Required.
     * 
     */
    @SerializedName(value = "required", alternate = {"Required"})
    @Expose
    public Boolean required;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
    public AttributeType type;


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
