// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Hit.
 */
public class SearchHit implements IJsonBackedObject {

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
     * The Content Source.
     * The name of the content source which the externalItem is part of .
     */
    @SerializedName(value = "contentSource", alternate = {"ContentSource"})
    @Expose
	@Nullable
    public String contentSource;

    /**
     * The Hit Id.
     * The internal identifier for the item.
     */
    @SerializedName(value = "hitId", alternate = {"HitId"})
    @Expose
	@Nullable
    public String hitId;

    /**
     * The Rank.
     * The rank or the order of the result.
     */
    @SerializedName(value = "rank", alternate = {"Rank"})
    @Expose
	@Nullable
    public Integer rank;

    /**
     * The Result Template Id.
     * ID of the result template for rendering the search result. This ID must map to a display layout in the resultTemplates dictionary, included in the searchresponse as well.
     */
    @SerializedName(value = "resultTemplateId", alternate = {"ResultTemplateId"})
    @Expose
	@Nullable
    public String resultTemplateId;

    /**
     * The Summary.
     * A summary of the result, if a summary is available.
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
	@Nullable
    public String summary;

    /**
     * The _id.
     * 
     * @deprecated The _id will be removed on December 31, 2022. Use the id instead.
     */
    @Deprecated
    @SerializedName(value = "_id", alternate = {"_id"})
    @Expose
	@Nullable
    public String _id;

    /**
     * The _score.
     * 
     * @deprecated The _score will be removed on December 31, 2022. Use the rank instead.
     */
    @Deprecated
    @SerializedName(value = "_score", alternate = {"_score"})
    @Expose
	@Nullable
    public Integer _score;

    /**
     * The _summary.
     * 
     * @deprecated The _summary will be removed on December 31, 2022. Use the summary instead.
     */
    @Deprecated
    @SerializedName(value = "_summary", alternate = {"_summary"})
    @Expose
	@Nullable
    public String _summary;

    /**
     * The Resource.
     * 
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public Entity resource;

    /**
     * The _source.
     * 
     * @deprecated The _source property is deprecated and will stop supporting on December 15, 2020. Please use the new property resource.
     */
    @Deprecated
    @SerializedName(value = "_source", alternate = {"_source"})
    @Expose
	@Nullable
    public Entity _source;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
