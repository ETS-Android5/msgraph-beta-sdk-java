// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ManagedEBookCategory;
import com.microsoft.graph.requests.ManagedEBookCategoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ManagedEBookCategoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Category Collection Page.
 */
public class ManagedEBookCategoryCollectionPage extends BaseCollectionPage<ManagedEBookCategory, ManagedEBookCategoryCollectionRequestBuilder> {

    /**
     * A collection page for ManagedEBookCategory
     *
     * @param response the serialized ManagedEBookCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedEBookCategoryCollectionPage(@Nonnull final ManagedEBookCategoryCollectionResponse response, @Nonnull final ManagedEBookCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ManagedEBookCategory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedEBookCategoryCollectionPage(@Nonnull final java.util.List<ManagedEBookCategory> pageContents, @Nullable final ManagedEBookCategoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
