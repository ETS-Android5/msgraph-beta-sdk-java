// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PurchaseInvoice;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IVendorRequestBuilder;
import com.microsoft.graph.requests.extensions.VendorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Request Builder.
 */
public class PurchaseInvoiceRequestBuilder extends BaseRequestBuilder implements IPurchaseInvoiceRequestBuilder {

    /**
     * The request builder for the PurchaseInvoice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PurchaseInvoiceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPurchaseInvoiceRequest instance
     */
    public IPurchaseInvoiceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPurchaseInvoiceRequest instance
     */
    public IPurchaseInvoiceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PurchaseInvoiceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Currency
     *
     * @return the ICurrencyRequestBuilder instance
     */
    public ICurrencyRequestBuilder currency() {
        return new CurrencyRequestBuilder(getRequestUrlWithAdditionalSegment("currency"), getClient(), null);
    }
    public IPurchaseInvoiceLineCollectionRequestBuilder purchaseInvoiceLines() {
        return new PurchaseInvoiceLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoiceLines"), getClient(), null);
    }

    public IPurchaseInvoiceLineRequestBuilder purchaseInvoiceLines(final String id) {
        return new PurchaseInvoiceLineRequestBuilder(getRequestUrlWithAdditionalSegment("purchaseInvoiceLines") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Vendor
     *
     * @return the IVendorRequestBuilder instance
     */
    public IVendorRequestBuilder vendor() {
        return new VendorRequestBuilder(getRequestUrlWithAdditionalSegment("vendor"), getClient(), null);
    }

    public IPurchaseInvoicePostRequestBuilder post() {
        return new PurchaseInvoicePostRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.post"), getClient(), null);
    }
}
