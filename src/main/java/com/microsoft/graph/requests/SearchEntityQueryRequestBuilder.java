// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.SearchEntityQueryRequest;
import com.microsoft.graph.models.SearchEntity;
import com.microsoft.graph.models.SearchRequest;
import com.microsoft.graph.models.SearchAlterationOptions;
import com.microsoft.graph.models.SearchResponse;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.SearchEntityQueryParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity Query Request Builder.
 */
public class SearchEntityQueryRequestBuilder extends BaseActionRequestBuilder<SearchResponse> {

    /**
     * The request builder for this SearchEntityQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SearchEntityQueryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private SearchEntityQueryParameterSet body;
    /**
     * The request builder for this SearchEntityQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SearchEntityQueryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SearchEntityQueryParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the SearchEntityQueryRequest
     *
     * @param requestOptions the options for the request
     * @return the SearchEntityQueryRequest instance
     */
    @Nonnull
    public SearchEntityQueryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SearchEntityQueryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SearchEntityQueryRequest instance
     */
    @Nonnull
    public SearchEntityQueryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SearchEntityQueryRequest request = new SearchEntityQueryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
