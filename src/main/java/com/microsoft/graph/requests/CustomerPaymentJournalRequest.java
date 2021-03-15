// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CustomerPaymentJournal;
import com.microsoft.graph.requests.AccountRequestBuilder;
import com.microsoft.graph.requests.CustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomerPaymentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Payment Journal Request.
 */
public class CustomerPaymentJournalRequest extends BaseRequest<CustomerPaymentJournal> {
	
    /**
     * The request for the CustomerPaymentJournal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomerPaymentJournalRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CustomerPaymentJournal.class);
    }

    /**
     * Gets the CustomerPaymentJournal from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomerPaymentJournal> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CustomerPaymentJournal from the service
     *
     * @return the CustomerPaymentJournal from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomerPaymentJournal get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomerPaymentJournal> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CustomerPaymentJournal delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CustomerPaymentJournal with a source
     *
     * @param sourceCustomerPaymentJournal the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomerPaymentJournal> patchAsync(@Nonnull final CustomerPaymentJournal sourceCustomerPaymentJournal) {
        return sendAsync(HttpMethod.PATCH, sourceCustomerPaymentJournal);
    }

    /**
     * Patches this CustomerPaymentJournal with a source
     *
     * @param sourceCustomerPaymentJournal the source object with updates
     * @return the updated CustomerPaymentJournal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomerPaymentJournal patch(@Nonnull final CustomerPaymentJournal sourceCustomerPaymentJournal) throws ClientException {
        return send(HttpMethod.PATCH, sourceCustomerPaymentJournal);
    }

    /**
     * Creates a CustomerPaymentJournal with a new object
     *
     * @param newCustomerPaymentJournal the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomerPaymentJournal> postAsync(@Nonnull final CustomerPaymentJournal newCustomerPaymentJournal) {
        return sendAsync(HttpMethod.POST, newCustomerPaymentJournal);
    }

    /**
     * Creates a CustomerPaymentJournal with a new object
     *
     * @param newCustomerPaymentJournal the new object to create
     * @return the created CustomerPaymentJournal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomerPaymentJournal post(@Nonnull final CustomerPaymentJournal newCustomerPaymentJournal) throws ClientException {
        return send(HttpMethod.POST, newCustomerPaymentJournal);
    }

    /**
     * Creates a CustomerPaymentJournal with a new object
     *
     * @param newCustomerPaymentJournal the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomerPaymentJournal> putAsync(@Nonnull final CustomerPaymentJournal newCustomerPaymentJournal) {
        return sendAsync(HttpMethod.PUT, newCustomerPaymentJournal);
    }

    /**
     * Creates a CustomerPaymentJournal with a new object
     *
     * @param newCustomerPaymentJournal the object to create/update
     * @return the created CustomerPaymentJournal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CustomerPaymentJournal put(@Nonnull final CustomerPaymentJournal newCustomerPaymentJournal) throws ClientException {
        return send(HttpMethod.PUT, newCustomerPaymentJournal);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CustomerPaymentJournalRequest select(@Nonnull final String value) {
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
     public CustomerPaymentJournalRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

