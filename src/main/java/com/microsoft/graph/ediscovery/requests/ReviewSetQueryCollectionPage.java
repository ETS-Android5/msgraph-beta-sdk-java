// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.models.ReviewSetQuery;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Query Collection Page.
 */
public class ReviewSetQueryCollectionPage extends BaseCollectionPage<ReviewSetQuery, ReviewSetQueryCollectionRequestBuilder> {

    /**
     * A collection page for ReviewSetQuery
     *
     * @param response the serialized ReviewSetQueryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ReviewSetQueryCollectionPage(@Nonnull final ReviewSetQueryCollectionResponse response, @Nonnull final ReviewSetQueryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ReviewSetQuery
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReviewSetQueryCollectionPage(@Nonnull final java.util.List<ReviewSetQuery> pageContents, @Nullable final ReviewSetQueryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
