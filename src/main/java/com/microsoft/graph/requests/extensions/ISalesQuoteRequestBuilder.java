// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesQuote;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Quote Request Builder.
 */
public interface ISalesQuoteRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISalesQuoteRequest instance
     */
    ISalesQuoteRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISalesQuoteRequest instance
     */
    ISalesQuoteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ISalesQuoteLineCollectionRequestBuilder salesQuoteLines();

    ISalesQuoteLineRequestBuilder salesQuoteLines(final String id);

    /**
     * Gets the request builder for Customer
     *
     * @return the ICustomerRequestBuilder instance
     */
    ICustomerRequestBuilder customer();

    /**
     * Gets the request builder for Currency
     *
     * @return the ICurrencyRequestBuilder instance
     */
    ICurrencyRequestBuilder currency();

    /**
     * Gets the request builder for PaymentTerm
     *
     * @return the IPaymentTermRequestBuilder instance
     */
    IPaymentTermRequestBuilder paymentTerm();

    /**
     * Gets the request builder for ShipmentMethod
     *
     * @return the IShipmentMethodRequestBuilder instance
     */
    IShipmentMethodRequestBuilder shipmentMethod();
    ISalesQuoteMakeInvoiceRequestBuilder makeInvoice();
    ISalesQuoteSendRequestBuilder send();

}