// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.termstore.models.extensions.LocalizedDescription;
import com.microsoft.graph.termstore.models.extensions.LocalizedLabel;
import com.microsoft.graph.models.extensions.KeyValue;
import com.microsoft.graph.termstore.models.extensions.Term;
import com.microsoft.graph.termstore.models.extensions.Relation;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.termstore.requests.extensions.TermCollectionPage;
import com.microsoft.graph.termstore.requests.extensions.RelationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Term.
 */
public class Term extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Descriptions.
     * 
     */
    @SerializedName(value = "descriptions", alternate = {"Descriptions"})
    @Expose
    public java.util.List<LocalizedDescription> descriptions;

    /**
     * The Labels.
     * 
     */
    @SerializedName(value = "labels", alternate = {"Labels"})
    @Expose
    public java.util.List<LocalizedLabel> labels;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Properties.
     * 
     */
    @SerializedName(value = "properties", alternate = {"Properties"})
    @Expose
    public java.util.List<KeyValue> properties;

    /**
     * The Children.
     * 
     */
    @SerializedName(value = "children", alternate = {"Children"})
    @Expose
    public TermCollectionPage children;

    /**
     * The Relations.
     * 
     */
    @SerializedName(value = "relations", alternate = {"Relations"})
    @Expose
    public RelationCollectionPage relations;

    /**
     * The Set.
     * 
     */
    @SerializedName(value = "set", alternate = {"Set"})
    @Expose
    public Set set;


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


        if (json.has("children")) {
            children = serializer.deserializeObject(json.get("children").toString(), TermCollectionPage.class);
        }

        if (json.has("relations")) {
            relations = serializer.deserializeObject(json.get("relations").toString(), RelationCollectionPage.class);
        }
    }
}
