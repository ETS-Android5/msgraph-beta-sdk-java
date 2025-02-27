// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ZebraFotaConnector;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Zebra Fota Connector Request.
 */
public class ZebraFotaConnectorRequest extends BaseRequest<ZebraFotaConnector> {
	
    /**
     * The request for the ZebraFotaConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ZebraFotaConnectorRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ZebraFotaConnector.class);
    }

    /**
     * Gets the ZebraFotaConnector from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ZebraFotaConnector> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ZebraFotaConnector from the service
     *
     * @return the ZebraFotaConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ZebraFotaConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ZebraFotaConnector> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ZebraFotaConnector delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ZebraFotaConnector with a source
     *
     * @param sourceZebraFotaConnector the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ZebraFotaConnector> patchAsync(@Nonnull final ZebraFotaConnector sourceZebraFotaConnector) {
        return sendAsync(HttpMethod.PATCH, sourceZebraFotaConnector);
    }

    /**
     * Patches this ZebraFotaConnector with a source
     *
     * @param sourceZebraFotaConnector the source object with updates
     * @return the updated ZebraFotaConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ZebraFotaConnector patch(@Nonnull final ZebraFotaConnector sourceZebraFotaConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourceZebraFotaConnector);
    }

    /**
     * Creates a ZebraFotaConnector with a new object
     *
     * @param newZebraFotaConnector the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ZebraFotaConnector> postAsync(@Nonnull final ZebraFotaConnector newZebraFotaConnector) {
        return sendAsync(HttpMethod.POST, newZebraFotaConnector);
    }

    /**
     * Creates a ZebraFotaConnector with a new object
     *
     * @param newZebraFotaConnector the new object to create
     * @return the created ZebraFotaConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ZebraFotaConnector post(@Nonnull final ZebraFotaConnector newZebraFotaConnector) throws ClientException {
        return send(HttpMethod.POST, newZebraFotaConnector);
    }

    /**
     * Creates a ZebraFotaConnector with a new object
     *
     * @param newZebraFotaConnector the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ZebraFotaConnector> putAsync(@Nonnull final ZebraFotaConnector newZebraFotaConnector) {
        return sendAsync(HttpMethod.PUT, newZebraFotaConnector);
    }

    /**
     * Creates a ZebraFotaConnector with a new object
     *
     * @param newZebraFotaConnector the object to create/update
     * @return the created ZebraFotaConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ZebraFotaConnector put(@Nonnull final ZebraFotaConnector newZebraFotaConnector) throws ClientException {
        return send(HttpMethod.PUT, newZebraFotaConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ZebraFotaConnectorRequest select(@Nonnull final String value) {
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
     public ZebraFotaConnectorRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

