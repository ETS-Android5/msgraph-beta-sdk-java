// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesInvoice;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Invoice Request.
 */
public class SalesInvoiceRequest extends BaseRequest implements ISalesInvoiceRequest {
	
    /**
     * The request for the SalesInvoice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesInvoiceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesInvoice.class);
    }

    /**
     * Gets the SalesInvoice from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SalesInvoice> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SalesInvoice from the service
     *
     * @return the SalesInvoice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesInvoice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SalesInvoice> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SalesInvoice with a source
     *
     * @param sourceSalesInvoice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SalesInvoice sourceSalesInvoice, final ICallback<? super SalesInvoice> callback) {
        send(HttpMethod.PATCH, callback, sourceSalesInvoice);
    }

    /**
     * Patches this SalesInvoice with a source
     *
     * @param sourceSalesInvoice the source object with updates
     * @return the updated SalesInvoice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesInvoice patch(final SalesInvoice sourceSalesInvoice) throws ClientException {
        return send(HttpMethod.PATCH, sourceSalesInvoice);
    }

    /**
     * Creates a SalesInvoice with a new object
     *
     * @param newSalesInvoice the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SalesInvoice newSalesInvoice, final ICallback<? super SalesInvoice> callback) {
        send(HttpMethod.POST, callback, newSalesInvoice);
    }

    /**
     * Creates a SalesInvoice with a new object
     *
     * @param newSalesInvoice the new object to create
     * @return the created SalesInvoice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesInvoice post(final SalesInvoice newSalesInvoice) throws ClientException {
        return send(HttpMethod.POST, newSalesInvoice);
    }

    /**
     * Creates a SalesInvoice with a new object
     *
     * @param newSalesInvoice the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SalesInvoice newSalesInvoice, final ICallback<? super SalesInvoice> callback) {
        send(HttpMethod.PUT, callback, newSalesInvoice);
    }

    /**
     * Creates a SalesInvoice with a new object
     *
     * @param newSalesInvoice the object to create/update
     * @return the created SalesInvoice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesInvoice put(final SalesInvoice newSalesInvoice) throws ClientException {
        return send(HttpMethod.PUT, newSalesInvoice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISalesInvoiceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SalesInvoiceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISalesInvoiceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SalesInvoiceRequest)this;
     }

}

