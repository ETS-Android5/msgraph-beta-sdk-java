// Template Source: BaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesQuoteLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Request Builder.
 */
public class SalesQuoteRequestBuilder extends BaseRequestBuilder implements ISalesQuoteRequestBuilder {

    /**
     * The request builder for the SalesQuote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesQuoteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISalesQuoteRequest instance
     */
    public ISalesQuoteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISalesQuoteRequest instance
     */
    public ISalesQuoteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SalesQuoteRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Currency
     *
     * @return the ICurrencyRequestBuilder instance
     */
    public ICurrencyRequestBuilder currency() {
        return new CurrencyRequestBuilder(getRequestUrlWithAdditionalSegment("currency"), getClient(), null);
    }

    /**
     * Gets the request builder for Customer
     *
     * @return the ICustomerRequestBuilder instance
     */
    public ICustomerRequestBuilder customer() {
        return new CustomerRequestBuilder(getRequestUrlWithAdditionalSegment("customer"), getClient(), null);
    }

    /**
     * Gets the request builder for PaymentTerm
     *
     * @return the IPaymentTermRequestBuilder instance
     */
    public IPaymentTermRequestBuilder paymentTerm() {
        return new PaymentTermRequestBuilder(getRequestUrlWithAdditionalSegment("paymentTerm"), getClient(), null);
    }
    public ISalesQuoteLineCollectionRequestBuilder salesQuoteLines() {
        return new SalesQuoteLineCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuoteLines"), getClient(), null);
    }

    public ISalesQuoteLineRequestBuilder salesQuoteLines(final String id) {
        return new SalesQuoteLineRequestBuilder(getRequestUrlWithAdditionalSegment("salesQuoteLines") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ShipmentMethod
     *
     * @return the IShipmentMethodRequestBuilder instance
     */
    public IShipmentMethodRequestBuilder shipmentMethod() {
        return new ShipmentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("shipmentMethod"), getClient(), null);
    }

    public ISalesQuoteSendRequestBuilder send() {
        return new SalesQuoteSendRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.send"), getClient(), null);
    }

    public ISalesQuoteMakeInvoiceRequestBuilder makeInvoice() {
        return new SalesQuoteMakeInvoiceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.makeInvoice"), getClient(), null);
    }
}
