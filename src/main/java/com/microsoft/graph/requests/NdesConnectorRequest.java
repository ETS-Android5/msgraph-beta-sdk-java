// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.NdesConnector;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ndes Connector Request.
 */
public class NdesConnectorRequest extends BaseRequest<NdesConnector> {
	
    /**
     * The request for the NdesConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NdesConnectorRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NdesConnector.class);
    }

    /**
     * Gets the NdesConnector from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NdesConnector> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the NdesConnector from the service
     *
     * @return the NdesConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NdesConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NdesConnector> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public NdesConnector delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this NdesConnector with a source
     *
     * @param sourceNdesConnector the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NdesConnector> patchAsync(@Nonnull final NdesConnector sourceNdesConnector) {
        return sendAsync(HttpMethod.PATCH, sourceNdesConnector);
    }

    /**
     * Patches this NdesConnector with a source
     *
     * @param sourceNdesConnector the source object with updates
     * @return the updated NdesConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NdesConnector patch(@Nonnull final NdesConnector sourceNdesConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NdesConnector> postAsync(@Nonnull final NdesConnector newNdesConnector) {
        return sendAsync(HttpMethod.POST, newNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the new object to create
     * @return the created NdesConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NdesConnector post(@Nonnull final NdesConnector newNdesConnector) throws ClientException {
        return send(HttpMethod.POST, newNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NdesConnector> putAsync(@Nonnull final NdesConnector newNdesConnector) {
        return sendAsync(HttpMethod.PUT, newNdesConnector);
    }

    /**
     * Creates a NdesConnector with a new object
     *
     * @param newNdesConnector the object to create/update
     * @return the created NdesConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NdesConnector put(@Nonnull final NdesConnector newNdesConnector) throws ClientException {
        return send(HttpMethod.PUT, newNdesConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public NdesConnectorRequest select(@Nonnull final String value) {
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
     public NdesConnectorRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

