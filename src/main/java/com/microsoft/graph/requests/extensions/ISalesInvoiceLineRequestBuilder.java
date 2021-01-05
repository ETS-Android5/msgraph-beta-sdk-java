// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesInvoiceLine;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Invoice Line Request Builder.
 */
public interface ISalesInvoiceLineRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISalesInvoiceLineRequest instance
     */
    ISalesInvoiceLineRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISalesInvoiceLineRequest instance
     */
    ISalesInvoiceLineRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Account
     *
     * @return the IAccountRequestBuilder instance
     */
    IAccountRequestBuilder account();

    /**
     * Gets the request builder for Item
     *
     * @return the IItemRequestBuilder instance
     */
    IItemRequestBuilder item();

}