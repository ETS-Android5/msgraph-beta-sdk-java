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
import com.microsoft.graph.models.SearchHitsContainer;
import com.microsoft.graph.models.AlterationResponse;
import com.microsoft.graph.models.ResultTemplateDictionary;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Response.
 */
public class SearchResponse implements IJsonBackedObject {

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
     * The Hits Containers.
     * A collection of search results.
     */
    @SerializedName(value = "hitsContainers", alternate = {"HitsContainers"})
    @Expose
	@Nullable
    public java.util.List<SearchHitsContainer> hitsContainers;

    /**
     * The Query Alteration Response.
     * Provides details of query alteration response for spelling correction.
     */
    @SerializedName(value = "queryAlterationResponse", alternate = {"QueryAlterationResponse"})
    @Expose
	@Nullable
    public AlterationResponse queryAlterationResponse;

    /**
     * The Result Templates.
     * A dictionary of resultTemplateIds and associated values, which include the name and JSON schema of the result templates.
     */
    @SerializedName(value = "resultTemplates", alternate = {"ResultTemplates"})
    @Expose
	@Nullable
    public ResultTemplateDictionary resultTemplates;

    /**
     * The Search Terms.
     * Contains the search terms sent in the initial search query.
     */
    @SerializedName(value = "searchTerms", alternate = {"SearchTerms"})
    @Expose
	@Nullable
    public java.util.List<String> searchTerms;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
