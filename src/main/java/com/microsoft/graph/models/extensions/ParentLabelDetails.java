// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ParentLabelDetails;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Parent Label Details.
 */
public class ParentLabelDetails implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Color.
     * 
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
    public String color;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Is Active.
     * 
     */
    @SerializedName(value = "isActive", alternate = {"IsActive"})
    @Expose
    public Boolean isActive;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Parent.
     * 
     */
    @SerializedName(value = "parent", alternate = {"Parent"})
    @Expose
    public ParentLabelDetails parent;

    /**
     * The Sensitivity.
     * 
     */
    @SerializedName(value = "sensitivity", alternate = {"Sensitivity"})
    @Expose
    public Integer sensitivity;

    /**
     * The Tooltip.
     * 
     */
    @SerializedName(value = "tooltip", alternate = {"Tooltip"})
    @Expose
    public String tooltip;


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
