// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.RecommendationResource;
import com.microsoft.graph.requests.RecommendationResourceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.RecommendationResourceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recommendation Resource Collection Page.
 */
public class RecommendationResourceCollectionPage extends BaseCollectionPage<RecommendationResource, RecommendationResourceCollectionRequestBuilder> {

    /**
     * A collection page for RecommendationResource
     *
     * @param response the serialized RecommendationResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RecommendationResourceCollectionPage(@Nonnull final RecommendationResourceCollectionResponse response, @Nonnull final RecommendationResourceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for RecommendationResource
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RecommendationResourceCollectionPage(@Nonnull final java.util.List<RecommendationResource> pageContents, @Nullable final RecommendationResourceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
