// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ExactMatchSession;
import com.microsoft.graph.requests.ExactMatchSessionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ExactMatchSessionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session Collection Page.
 */
public class ExactMatchSessionCollectionPage extends BaseCollectionPage<ExactMatchSession, ExactMatchSessionCollectionRequestBuilder> {

    /**
     * A collection page for ExactMatchSession
     *
     * @param response the serialized ExactMatchSessionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExactMatchSessionCollectionPage(@Nonnull final ExactMatchSessionCollectionResponse response, @Nonnull final ExactMatchSessionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ExactMatchSession
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ExactMatchSessionCollectionPage(@Nonnull final java.util.List<ExactMatchSession> pageContents, @Nullable final ExactMatchSessionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
