// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PurchaseInvoice;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Collection Page.
 */
public class PurchaseInvoiceCollectionPage extends BaseCollectionPage<PurchaseInvoice, IPurchaseInvoiceCollectionRequestBuilder> implements IPurchaseInvoiceCollectionPage {

    /**
     * A collection page for PurchaseInvoice
     *
     * @param response the serialized PurchaseInvoiceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PurchaseInvoiceCollectionPage(final PurchaseInvoiceCollectionResponse response, final IPurchaseInvoiceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
