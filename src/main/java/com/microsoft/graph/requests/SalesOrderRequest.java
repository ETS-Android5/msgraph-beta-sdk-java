// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SalesOrder;
import com.microsoft.graph.requests.CurrencyRequestBuilder;
import com.microsoft.graph.requests.CustomerRequestBuilder;
import com.microsoft.graph.requests.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.SalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.SalesOrderLineRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Order Request.
 */
public class SalesOrderRequest extends BaseRequest<SalesOrder> {
	
    /**
     * The request for the SalesOrder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesOrderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesOrder.class);
    }

    /**
     * Gets the SalesOrder from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SalesOrder> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SalesOrder from the service
     *
     * @return the SalesOrder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SalesOrder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SalesOrder> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SalesOrder delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SalesOrder with a source
     *
     * @param sourceSalesOrder the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SalesOrder> patchAsync(@Nonnull final SalesOrder sourceSalesOrder) {
        return sendAsync(HttpMethod.PATCH, sourceSalesOrder);
    }

    /**
     * Patches this SalesOrder with a source
     *
     * @param sourceSalesOrder the source object with updates
     * @return the updated SalesOrder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SalesOrder patch(@Nonnull final SalesOrder sourceSalesOrder) throws ClientException {
        return send(HttpMethod.PATCH, sourceSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SalesOrder> postAsync(@Nonnull final SalesOrder newSalesOrder) {
        return sendAsync(HttpMethod.POST, newSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the new object to create
     * @return the created SalesOrder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SalesOrder post(@Nonnull final SalesOrder newSalesOrder) throws ClientException {
        return send(HttpMethod.POST, newSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SalesOrder> putAsync(@Nonnull final SalesOrder newSalesOrder) {
        return sendAsync(HttpMethod.PUT, newSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the object to create/update
     * @return the created SalesOrder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SalesOrder put(@Nonnull final SalesOrder newSalesOrder) throws ClientException {
        return send(HttpMethod.PUT, newSalesOrder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SalesOrderRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public SalesOrderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

