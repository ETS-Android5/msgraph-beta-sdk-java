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
import com.microsoft.graph.models.AggregationOption;
import com.microsoft.graph.models.EntityType;
import com.microsoft.graph.models.SearchQuery;
import com.microsoft.graph.models.ResultTemplateOption;
import com.microsoft.graph.models.SortProperty;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Request.
 */
public class SearchRequest implements IJsonBackedObject {

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
     * The Aggregation Filters.
     * Contains one or more filters to obtain search results aggregated and filtered to a specific value of a field. Optional.Build this filter based on a prior search that aggregates by the same field. From the response of the prior search, identify the searchBucket that filters results to the specific value of the field, use the string in its aggregationFilterToken property, and build an aggregation filter string in the format '{field}:/'{aggregationFilterToken}/''. If multiple values for the same field need to be provided, use the strings in its aggregationFilterToken property and build an aggregation filter string in the format '{field}:or(/'{aggregationFilterToken1}/',/'{aggregationFilterToken2}/')'. For example, searching and aggregating drive items by file type returns a searchBucket for the file type docx in the response. You can conveniently use the aggregationFilterToken returned for this searchBucket in a subsequent search query and filter matches down to drive items of the docx file type. Example 1 and example 2 show the actual requests and responses.
     */
    @SerializedName(value = "aggregationFilters", alternate = {"AggregationFilters"})
    @Expose
	@Nullable
    public java.util.List<String> aggregationFilters;

    /**
     * The Aggregations.
     * Specifies aggregations (also known as refiners) to be returned alongside search results. Optional.
     */
    @SerializedName(value = "aggregations", alternate = {"Aggregations"})
    @Expose
	@Nullable
    public java.util.List<AggregationOption> aggregations;

    /**
     * The Content Sources.
     * Contains the connection to be targeted. Respects the following format : /external/connections/connectionid where connectionid is the ConnectionId defined in the Connectors Administration.  Note: contentSource is only applicable when entityType=externalItem. Optional.
     */
    @SerializedName(value = "contentSources", alternate = {"ContentSources"})
    @Expose
	@Nullable
    public java.util.List<String> contentSources;

    /**
     * The Enable Top Results.
     * This triggers hybrid sort for messages: the first 3 messages are the most relevant. This property is only applicable to entityType=message. Optional.
     */
    @SerializedName(value = "enableTopResults", alternate = {"EnableTopResults"})
    @Expose
	@Nullable
    public Boolean enableTopResults;

    /**
     * The Entity Types.
     * One or more types of resources expected in the response. Possible values are: list, site, listItem, message, event, drive, driveItem, person, externalItem. See known limitations for those combinations of two or more entity types that are supported in the same search request. Required.
     */
    @SerializedName(value = "entityTypes", alternate = {"EntityTypes"})
    @Expose
	@Nullable
    public java.util.List<EntityType> entityTypes;

    /**
     * The Fields.
     * Contains the fields to be returned for each resource object specified in entityTypes, allowing customization of the fields returned by default otherwise, including additional fields such as custom managed properties from SharePoint and OneDrive, or custom fields in externalItem from content that Microsoft Graph connectors bring in. The fields property can be using the semantic labels applied to properties. For example, if a property is label as title, you can retrieve it using the following syntax : label_title.Optional.
     */
    @SerializedName(value = "fields", alternate = {"Fields"})
    @Expose
	@Nullable
    public java.util.List<String> fields;

    /**
     * The From.
     * Specifies the offset for the search results. Offset 0 returns the very first result. Optional.
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
	@Nullable
    public Integer from;

    /**
     * The Query.
     * Contains the query terms. Required.
     */
    @SerializedName(value = "query", alternate = {"Query"})
    @Expose
	@Nullable
    public SearchQuery query;

    /**
     * The Result Template Options.
     * Provides the search result templates options for rendering connectors search results.
     */
    @SerializedName(value = "resultTemplateOptions", alternate = {"ResultTemplateOptions"})
    @Expose
	@Nullable
    public ResultTemplateOption resultTemplateOptions;

    /**
     * The Size.
     * The size of the page to be retrieved. Optional.
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Integer size;

    /**
     * The Sort Properties.
     * Contains the ordered collection of fields and direction to sort results. There can be at most 5 sort properties in the collection. Optional.
     */
    @SerializedName(value = "sortProperties", alternate = {"SortProperties"})
    @Expose
	@Nullable
    public java.util.List<SortProperty> sortProperties;

    /**
     * The Stored_fields.
     * 
     */
    @SerializedName(value = "stored_fields", alternate = {"Stored_fields"})
    @Expose
	@Nullable
    public java.util.List<String> stored_fields;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
