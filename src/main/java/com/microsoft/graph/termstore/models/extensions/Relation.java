// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.termstore.models.generated.RelationType;
import com.microsoft.graph.termstore.models.extensions.Term;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relation.
 */
public class Relation extends Entity implements IJsonBackedObject {


    /**
     * The Relationship.
     * 
     */
    @SerializedName(value = "relationship", alternate = {"Relationship"})
    @Expose
    public RelationType relationship;

    /**
     * The From Term.
     * 
     */
    @SerializedName(value = "fromTerm", alternate = {"FromTerm"})
    @Expose
    public Term fromTerm;

    /**
     * The Set.
     * 
     */
    @SerializedName(value = "set", alternate = {"Set"})
    @Expose
    public Set set;

    /**
     * The To Term.
     * 
     */
    @SerializedName(value = "toTerm", alternate = {"ToTerm"})
    @Expose
    public Term toTerm;


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
