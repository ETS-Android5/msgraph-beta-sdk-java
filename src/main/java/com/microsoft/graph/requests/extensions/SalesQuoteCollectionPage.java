// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SalesQuote;
import com.microsoft.graph.requests.extensions.ISalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Collection Page.
 */
public class SalesQuoteCollectionPage extends BaseCollectionPage<SalesQuote, ISalesQuoteCollectionRequestBuilder> implements ISalesQuoteCollectionPage {

    /**
     * A collection page for SalesQuote
     *
     * @param response the serialized SalesQuoteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SalesQuoteCollectionPage(final SalesQuoteCollectionResponse response, final ISalesQuoteCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
