// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ItemCategory;
import com.microsoft.graph.requests.ItemCategoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ItemCategoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Category Collection Page.
 */
public class ItemCategoryCollectionPage extends BaseCollectionPage<ItemCategory, ItemCategoryCollectionRequestBuilder> {

    /**
     * A collection page for ItemCategory
     *
     * @param response the serialized ItemCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemCategoryCollectionPage(@Nonnull final ItemCategoryCollectionResponse response, @Nonnull final ItemCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ItemCategory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ItemCategoryCollectionPage(@Nonnull final java.util.List<ItemCategory> pageContents, @Nullable final ItemCategoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
