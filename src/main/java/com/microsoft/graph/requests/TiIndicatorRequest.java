// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TiIndicator;
import com.microsoft.graph.models.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Request.
 */
public class TiIndicatorRequest extends BaseRequest<TiIndicator> {
	
    /**
     * The request for the TiIndicator
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TiIndicatorRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TiIndicator.class);
    }

    /**
     * Gets the TiIndicator from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TiIndicator> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TiIndicator from the service
     *
     * @return the TiIndicator from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TiIndicator get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TiIndicator> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TiIndicator delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TiIndicator with a source
     *
     * @param sourceTiIndicator the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TiIndicator> patchAsync(@Nonnull final TiIndicator sourceTiIndicator) {
        return sendAsync(HttpMethod.PATCH, sourceTiIndicator);
    }

    /**
     * Patches this TiIndicator with a source
     *
     * @param sourceTiIndicator the source object with updates
     * @return the updated TiIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TiIndicator patch(@Nonnull final TiIndicator sourceTiIndicator) throws ClientException {
        return send(HttpMethod.PATCH, sourceTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TiIndicator> postAsync(@Nonnull final TiIndicator newTiIndicator) {
        return sendAsync(HttpMethod.POST, newTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the new object to create
     * @return the created TiIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TiIndicator post(@Nonnull final TiIndicator newTiIndicator) throws ClientException {
        return send(HttpMethod.POST, newTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TiIndicator> putAsync(@Nonnull final TiIndicator newTiIndicator) {
        return sendAsync(HttpMethod.PUT, newTiIndicator);
    }

    /**
     * Creates a TiIndicator with a new object
     *
     * @param newTiIndicator the object to create/update
     * @return the created TiIndicator
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TiIndicator put(@Nonnull final TiIndicator newTiIndicator) throws ClientException {
        return send(HttpMethod.PUT, newTiIndicator);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TiIndicatorRequest select(@Nonnull final String value) {
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
     public TiIndicatorRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

