// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PaymentMethod;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payment Method Request.
 */
public class PaymentMethodRequest extends BaseRequest<PaymentMethod> {
	
    /**
     * The request for the PaymentMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PaymentMethodRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PaymentMethod.class);
    }

    /**
     * Gets the PaymentMethod from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PaymentMethod> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PaymentMethod from the service
     *
     * @return the PaymentMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PaymentMethod get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PaymentMethod> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PaymentMethod delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PaymentMethod with a source
     *
     * @param sourcePaymentMethod the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PaymentMethod> patchAsync(@Nonnull final PaymentMethod sourcePaymentMethod) {
        return sendAsync(HttpMethod.PATCH, sourcePaymentMethod);
    }

    /**
     * Patches this PaymentMethod with a source
     *
     * @param sourcePaymentMethod the source object with updates
     * @return the updated PaymentMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PaymentMethod patch(@Nonnull final PaymentMethod sourcePaymentMethod) throws ClientException {
        return send(HttpMethod.PATCH, sourcePaymentMethod);
    }

    /**
     * Creates a PaymentMethod with a new object
     *
     * @param newPaymentMethod the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PaymentMethod> postAsync(@Nonnull final PaymentMethod newPaymentMethod) {
        return sendAsync(HttpMethod.POST, newPaymentMethod);
    }

    /**
     * Creates a PaymentMethod with a new object
     *
     * @param newPaymentMethod the new object to create
     * @return the created PaymentMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PaymentMethod post(@Nonnull final PaymentMethod newPaymentMethod) throws ClientException {
        return send(HttpMethod.POST, newPaymentMethod);
    }

    /**
     * Creates a PaymentMethod with a new object
     *
     * @param newPaymentMethod the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PaymentMethod> putAsync(@Nonnull final PaymentMethod newPaymentMethod) {
        return sendAsync(HttpMethod.PUT, newPaymentMethod);
    }

    /**
     * Creates a PaymentMethod with a new object
     *
     * @param newPaymentMethod the object to create/update
     * @return the created PaymentMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PaymentMethod put(@Nonnull final PaymentMethod newPaymentMethod) throws ClientException {
        return send(HttpMethod.PUT, newPaymentMethod);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PaymentMethodRequest select(@Nonnull final String value) {
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
     public PaymentMethodRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

