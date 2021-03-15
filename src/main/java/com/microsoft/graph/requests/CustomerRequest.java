// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Customer;
import com.microsoft.graph.requests.CurrencyRequestBuilder;
import com.microsoft.graph.requests.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.PictureRequestBuilder;
import com.microsoft.graph.requests.ShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Request.
 */
public class CustomerRequest extends BaseRequest<Customer> {
	
    /**
     * The request for the Customer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Customer.class);
    }

    /**
     * Gets the Customer from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Customer> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Customer from the service
     *
     * @return the Customer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Customer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Customer> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Customer delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Customer with a source
     *
     * @param sourceCustomer the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Customer> patchAsync(@Nonnull final Customer sourceCustomer) {
        return sendAsync(HttpMethod.PATCH, sourceCustomer);
    }

    /**
     * Patches this Customer with a source
     *
     * @param sourceCustomer the source object with updates
     * @return the updated Customer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Customer patch(@Nonnull final Customer sourceCustomer) throws ClientException {
        return send(HttpMethod.PATCH, sourceCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Customer> postAsync(@Nonnull final Customer newCustomer) {
        return sendAsync(HttpMethod.POST, newCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the new object to create
     * @return the created Customer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Customer post(@Nonnull final Customer newCustomer) throws ClientException {
        return send(HttpMethod.POST, newCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Customer> putAsync(@Nonnull final Customer newCustomer) {
        return sendAsync(HttpMethod.PUT, newCustomer);
    }

    /**
     * Creates a Customer with a new object
     *
     * @param newCustomer the object to create/update
     * @return the created Customer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Customer put(@Nonnull final Customer newCustomer) throws ClientException {
        return send(HttpMethod.PUT, newCustomer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CustomerRequest select(@Nonnull final String value) {
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
     public CustomerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

