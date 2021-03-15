// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Currency;
import com.microsoft.graph.requests.CurrencyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CurrencyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Currency Collection Page.
 */
public class CurrencyCollectionPage extends BaseCollectionPage<Currency, CurrencyCollectionRequestBuilder> {

    /**
     * A collection page for Currency
     *
     * @param response the serialized CurrencyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CurrencyCollectionPage(@Nonnull final CurrencyCollectionResponse response, @Nonnull final CurrencyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Currency
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CurrencyCollectionPage(@Nonnull final java.util.List<Currency> pageContents, @Nullable final CurrencyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
