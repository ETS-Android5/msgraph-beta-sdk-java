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
import com.microsoft.graph.models.Label;
import com.microsoft.graph.models.PropertyType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Property.
 */
public class Property implements IJsonBackedObject {

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
     * The Aliases.
     * 
     */
    @SerializedName(value = "aliases", alternate = {"Aliases"})
    @Expose
	@Nullable
    public java.util.List<String> aliases;

    /**
     * The Is Queryable.
     * 
     */
    @SerializedName(value = "isQueryable", alternate = {"IsQueryable"})
    @Expose
	@Nullable
    public Boolean isQueryable;

    /**
     * The Is Refinable.
     * 
     */
    @SerializedName(value = "isRefinable", alternate = {"IsRefinable"})
    @Expose
	@Nullable
    public Boolean isRefinable;

    /**
     * The Is Retrievable.
     * 
     */
    @SerializedName(value = "isRetrievable", alternate = {"IsRetrievable"})
    @Expose
	@Nullable
    public Boolean isRetrievable;

    /**
     * The Is Searchable.
     * 
     */
    @SerializedName(value = "isSearchable", alternate = {"IsSearchable"})
    @Expose
	@Nullable
    public Boolean isSearchable;

    /**
     * The Labels.
     * 
     */
    @SerializedName(value = "labels", alternate = {"Labels"})
    @Expose
	@Nullable
    public java.util.List<Label> labels;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public PropertyType type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
