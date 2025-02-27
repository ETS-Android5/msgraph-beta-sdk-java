// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.UnifiedGroupSource;
import com.microsoft.graph.requests.GroupWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Group Source Request.
 */
public class UnifiedGroupSourceRequest extends BaseRequest<UnifiedGroupSource> {
	
    /**
     * The request for the UnifiedGroupSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedGroupSourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedGroupSource.class);
    }

    /**
     * Gets the UnifiedGroupSource from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedGroupSource from the service
     *
     * @return the UnifiedGroupSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedGroupSource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedGroupSource delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedGroupSource with a source
     *
     * @param sourceUnifiedGroupSource the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> patchAsync(@Nonnull final UnifiedGroupSource sourceUnifiedGroupSource) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedGroupSource);
    }

    /**
     * Patches this UnifiedGroupSource with a source
     *
     * @param sourceUnifiedGroupSource the source object with updates
     * @return the updated UnifiedGroupSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedGroupSource patch(@Nonnull final UnifiedGroupSource sourceUnifiedGroupSource) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedGroupSource);
    }

    /**
     * Creates a UnifiedGroupSource with a new object
     *
     * @param newUnifiedGroupSource the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> postAsync(@Nonnull final UnifiedGroupSource newUnifiedGroupSource) {
        return sendAsync(HttpMethod.POST, newUnifiedGroupSource);
    }

    /**
     * Creates a UnifiedGroupSource with a new object
     *
     * @param newUnifiedGroupSource the new object to create
     * @return the created UnifiedGroupSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedGroupSource post(@Nonnull final UnifiedGroupSource newUnifiedGroupSource) throws ClientException {
        return send(HttpMethod.POST, newUnifiedGroupSource);
    }

    /**
     * Creates a UnifiedGroupSource with a new object
     *
     * @param newUnifiedGroupSource the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedGroupSource> putAsync(@Nonnull final UnifiedGroupSource newUnifiedGroupSource) {
        return sendAsync(HttpMethod.PUT, newUnifiedGroupSource);
    }

    /**
     * Creates a UnifiedGroupSource with a new object
     *
     * @param newUnifiedGroupSource the object to create/update
     * @return the created UnifiedGroupSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedGroupSource put(@Nonnull final UnifiedGroupSource newUnifiedGroupSource) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedGroupSource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedGroupSourceRequest select(@Nonnull final String value) {
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
     public UnifiedGroupSourceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

