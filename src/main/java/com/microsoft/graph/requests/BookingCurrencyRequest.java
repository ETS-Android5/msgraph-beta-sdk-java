// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BookingCurrency;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Currency Request.
 */
public class BookingCurrencyRequest extends BaseRequest<BookingCurrency> {
	
    /**
     * The request for the BookingCurrency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingCurrencyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingCurrency.class);
    }

    /**
     * Gets the BookingCurrency from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCurrency> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the BookingCurrency from the service
     *
     * @return the BookingCurrency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCurrency get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCurrency> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public BookingCurrency delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this BookingCurrency with a source
     *
     * @param sourceBookingCurrency the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCurrency> patchAsync(@Nonnull final BookingCurrency sourceBookingCurrency) {
        return sendAsync(HttpMethod.PATCH, sourceBookingCurrency);
    }

    /**
     * Patches this BookingCurrency with a source
     *
     * @param sourceBookingCurrency the source object with updates
     * @return the updated BookingCurrency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCurrency patch(@Nonnull final BookingCurrency sourceBookingCurrency) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCurrency> postAsync(@Nonnull final BookingCurrency newBookingCurrency) {
        return sendAsync(HttpMethod.POST, newBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the new object to create
     * @return the created BookingCurrency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCurrency post(@Nonnull final BookingCurrency newBookingCurrency) throws ClientException {
        return send(HttpMethod.POST, newBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BookingCurrency> putAsync(@Nonnull final BookingCurrency newBookingCurrency) {
        return sendAsync(HttpMethod.PUT, newBookingCurrency);
    }

    /**
     * Creates a BookingCurrency with a new object
     *
     * @param newBookingCurrency the object to create/update
     * @return the created BookingCurrency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BookingCurrency put(@Nonnull final BookingCurrency newBookingCurrency) throws ClientException {
        return send(HttpMethod.PUT, newBookingCurrency);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public BookingCurrencyRequest select(@Nonnull final String value) {
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
     public BookingCurrencyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

