// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.TeamsAsyncOperation;
import com.microsoft.graph.requests.TeamsAsyncOperationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.TeamsAsyncOperationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Async Operation Collection Page.
 */
public class TeamsAsyncOperationCollectionPage extends BaseCollectionPage<TeamsAsyncOperation, TeamsAsyncOperationCollectionRequestBuilder> {

    /**
     * A collection page for TeamsAsyncOperation
     *
     * @param response the serialized TeamsAsyncOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamsAsyncOperationCollectionPage(@Nonnull final TeamsAsyncOperationCollectionResponse response, @Nonnull final TeamsAsyncOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TeamsAsyncOperation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TeamsAsyncOperationCollectionPage(@Nonnull final java.util.List<TeamsAsyncOperation> pageContents, @Nullable final TeamsAsyncOperationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
