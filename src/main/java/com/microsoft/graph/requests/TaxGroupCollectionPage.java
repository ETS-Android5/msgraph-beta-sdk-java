// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.TaxGroup;
import com.microsoft.graph.requests.TaxGroupCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.TaxGroupCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tax Group Collection Page.
 */
public class TaxGroupCollectionPage extends BaseCollectionPage<TaxGroup, TaxGroupCollectionRequestBuilder> {

    /**
     * A collection page for TaxGroup
     *
     * @param response the serialized TaxGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TaxGroupCollectionPage(@Nonnull final TaxGroupCollectionResponse response, @Nonnull final TaxGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TaxGroup
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TaxGroupCollectionPage(@Nonnull final java.util.List<TaxGroup> pageContents, @Nullable final TaxGroupCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
