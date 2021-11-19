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
import com.microsoft.graph.models.StringKeyStringValuePair;
import com.microsoft.graph.models.MetadataEntry;
import com.microsoft.graph.models.Mutability;
import com.microsoft.graph.models.ReferencedObject;
import com.microsoft.graph.models.AttributeType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attribute Definition.
 */
public class AttributeDefinition implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Anchor.
     * 
     */
    @SerializedName(value = "anchor", alternate = {"Anchor"})
    @Expose
	@Nullable
    public Boolean anchor;

    /**
     * The Api Expressions.
     * 
     */
    @SerializedName(value = "apiExpressions", alternate = {"ApiExpressions"})
    @Expose
	@Nullable
    public java.util.List<StringKeyStringValuePair> apiExpressions;

    /**
     * The Case Exact.
     * 
     */
    @SerializedName(value = "caseExact", alternate = {"CaseExact"})
    @Expose
	@Nullable
    public Boolean caseExact;

    /**
     * The Default Value.
     * 
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
	@Nullable
    public String defaultValue;

    /**
     * The Flow Null Values.
     * 
     */
    @SerializedName(value = "flowNullValues", alternate = {"FlowNullValues"})
    @Expose
	@Nullable
    public Boolean flowNullValues;

    /**
     * The Metadata.
     * 
     */
    @SerializedName(value = "metadata", alternate = {"Metadata"})
    @Expose
	@Nullable
    public java.util.List<MetadataEntry> metadata;

    /**
     * The Multivalued.
     * 
     */
    @SerializedName(value = "multivalued", alternate = {"Multivalued"})
    @Expose
	@Nullable
    public Boolean multivalued;

    /**
     * The Mutability.
     * 
     */
    @SerializedName(value = "mutability", alternate = {"Mutability"})
    @Expose
	@Nullable
    public Mutability mutability;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Referenced Objects.
     * 
     */
    @SerializedName(value = "referencedObjects", alternate = {"ReferencedObjects"})
    @Expose
	@Nullable
    public java.util.List<ReferencedObject> referencedObjects;

    /**
     * The Required.
     * 
     */
    @SerializedName(value = "required", alternate = {"Required"})
    @Expose
	@Nullable
    public Boolean required;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public AttributeType type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
