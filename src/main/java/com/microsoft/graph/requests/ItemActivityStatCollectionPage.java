// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ItemActivityStat;
import com.microsoft.graph.requests.ItemActivityStatCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ItemActivityStatCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat Collection Page.
 */
public class ItemActivityStatCollectionPage extends BaseCollectionPage<ItemActivityStat, ItemActivityStatCollectionRequestBuilder> {

    /**
     * A collection page for ItemActivityStat
     *
     * @param response the serialized ItemActivityStatCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemActivityStatCollectionPage(@Nonnull final ItemActivityStatCollectionResponse response, @Nonnull final ItemActivityStatCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ItemActivityStat
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ItemActivityStatCollectionPage(@Nonnull final java.util.List<ItemActivityStat> pageContents, @Nullable final ItemActivityStatCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
