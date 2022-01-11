// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SearchRequest;
import com.microsoft.graph.models.SearchResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.SearchEntityQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.SearchEntityQueryCollectionPage;
import com.microsoft.graph.requests.SearchEntityQueryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity Query Collection Page.
 */
public class SearchEntityQueryCollectionPage extends BaseCollectionPage<SearchResponse, SearchEntityQueryCollectionRequestBuilder> {

    /**
     * A collection page for SearchResponse.
     *
     * @param response The serialized SearchEntityQueryCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SearchEntityQueryCollectionPage(@Nonnull final SearchEntityQueryCollectionResponse response, @Nonnull final SearchEntityQueryCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for SearchEntityQuery
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SearchEntityQueryCollectionPage(@Nonnull final java.util.List<SearchResponse> pageContents, @Nullable final SearchEntityQueryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
