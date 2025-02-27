// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.search.requests;
import com.microsoft.graph.search.models.Bookmark;
import com.microsoft.graph.search.requests.BookmarkCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.search.requests.BookmarkCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bookmark Collection Page.
 */
public class BookmarkCollectionPage extends BaseCollectionPage<Bookmark, BookmarkCollectionRequestBuilder> {

    /**
     * A collection page for Bookmark
     *
     * @param response the serialized BookmarkCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BookmarkCollectionPage(@Nonnull final BookmarkCollectionResponse response, @Nonnull final BookmarkCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Bookmark
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public BookmarkCollectionPage(@Nonnull final java.util.List<Bookmark> pageContents, @Nullable final BookmarkCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
