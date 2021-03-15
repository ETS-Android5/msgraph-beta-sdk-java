// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.SalesInvoiceCancelRequest;
import com.microsoft.graph.models.SalesInvoice;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Invoice Cancel Request Builder.
 */
public class SalesInvoiceCancelRequestBuilder extends BaseActionRequestBuilder<SalesInvoice> {

    /**
     * The request builder for this SalesInvoiceCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesInvoiceCancelRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the SalesInvoiceCancelRequest
     *
     * @param requestOptions the options for the request
     * @return the SalesInvoiceCancelRequest instance
     */
    @Nonnull
    public SalesInvoiceCancelRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SalesInvoiceCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SalesInvoiceCancelRequest instance
     */
    @Nonnull
    public SalesInvoiceCancelRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SalesInvoiceCancelRequest request = new SalesInvoiceCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
