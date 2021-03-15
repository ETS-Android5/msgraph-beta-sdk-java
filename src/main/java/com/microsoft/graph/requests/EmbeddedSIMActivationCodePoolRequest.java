// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EmbeddedSIMActivationCodePool;
import com.microsoft.graph.models.EmbeddedSIMActivationCodePoolAssignment;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.EmbeddedSIMActivationCodePoolAssignmentRequestBuilder;
import com.microsoft.graph.requests.EmbeddedSIMDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.EmbeddedSIMDeviceStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool Request.
 */
public class EmbeddedSIMActivationCodePoolRequest extends BaseRequest<EmbeddedSIMActivationCodePool> {
	
    /**
     * The request for the EmbeddedSIMActivationCodePool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmbeddedSIMActivationCodePoolRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmbeddedSIMActivationCodePool.class);
    }

    /**
     * Gets the EmbeddedSIMActivationCodePool from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmbeddedSIMActivationCodePool> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EmbeddedSIMActivationCodePool from the service
     *
     * @return the EmbeddedSIMActivationCodePool from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmbeddedSIMActivationCodePool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmbeddedSIMActivationCodePool> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EmbeddedSIMActivationCodePool delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EmbeddedSIMActivationCodePool with a source
     *
     * @param sourceEmbeddedSIMActivationCodePool the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmbeddedSIMActivationCodePool> patchAsync(@Nonnull final EmbeddedSIMActivationCodePool sourceEmbeddedSIMActivationCodePool) {
        return sendAsync(HttpMethod.PATCH, sourceEmbeddedSIMActivationCodePool);
    }

    /**
     * Patches this EmbeddedSIMActivationCodePool with a source
     *
     * @param sourceEmbeddedSIMActivationCodePool the source object with updates
     * @return the updated EmbeddedSIMActivationCodePool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmbeddedSIMActivationCodePool patch(@Nonnull final EmbeddedSIMActivationCodePool sourceEmbeddedSIMActivationCodePool) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmbeddedSIMActivationCodePool);
    }

    /**
     * Creates a EmbeddedSIMActivationCodePool with a new object
     *
     * @param newEmbeddedSIMActivationCodePool the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmbeddedSIMActivationCodePool> postAsync(@Nonnull final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool) {
        return sendAsync(HttpMethod.POST, newEmbeddedSIMActivationCodePool);
    }

    /**
     * Creates a EmbeddedSIMActivationCodePool with a new object
     *
     * @param newEmbeddedSIMActivationCodePool the new object to create
     * @return the created EmbeddedSIMActivationCodePool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmbeddedSIMActivationCodePool post(@Nonnull final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool) throws ClientException {
        return send(HttpMethod.POST, newEmbeddedSIMActivationCodePool);
    }

    /**
     * Creates a EmbeddedSIMActivationCodePool with a new object
     *
     * @param newEmbeddedSIMActivationCodePool the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmbeddedSIMActivationCodePool> putAsync(@Nonnull final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool) {
        return sendAsync(HttpMethod.PUT, newEmbeddedSIMActivationCodePool);
    }

    /**
     * Creates a EmbeddedSIMActivationCodePool with a new object
     *
     * @param newEmbeddedSIMActivationCodePool the object to create/update
     * @return the created EmbeddedSIMActivationCodePool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmbeddedSIMActivationCodePool put(@Nonnull final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool) throws ClientException {
        return send(HttpMethod.PUT, newEmbeddedSIMActivationCodePool);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EmbeddedSIMActivationCodePoolRequest select(@Nonnull final String value) {
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
     public EmbeddedSIMActivationCodePoolRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

