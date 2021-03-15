// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAppStatusRaw;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Status Raw Request.
 */
public class ManagedAppStatusRawRequest extends BaseRequest<ManagedAppStatusRaw> {
	
    /**
     * The request for the ManagedAppStatusRaw
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppStatusRawRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppStatusRaw.class);
    }

    /**
     * Gets the ManagedAppStatusRaw from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppStatusRaw> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedAppStatusRaw from the service
     *
     * @return the ManagedAppStatusRaw from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatusRaw get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppStatusRaw> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedAppStatusRaw delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedAppStatusRaw with a source
     *
     * @param sourceManagedAppStatusRaw the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppStatusRaw> patchAsync(@Nonnull final ManagedAppStatusRaw sourceManagedAppStatusRaw) {
        return sendAsync(HttpMethod.PATCH, sourceManagedAppStatusRaw);
    }

    /**
     * Patches this ManagedAppStatusRaw with a source
     *
     * @param sourceManagedAppStatusRaw the source object with updates
     * @return the updated ManagedAppStatusRaw
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatusRaw patch(@Nonnull final ManagedAppStatusRaw sourceManagedAppStatusRaw) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppStatusRaw);
    }

    /**
     * Creates a ManagedAppStatusRaw with a new object
     *
     * @param newManagedAppStatusRaw the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppStatusRaw> postAsync(@Nonnull final ManagedAppStatusRaw newManagedAppStatusRaw) {
        return sendAsync(HttpMethod.POST, newManagedAppStatusRaw);
    }

    /**
     * Creates a ManagedAppStatusRaw with a new object
     *
     * @param newManagedAppStatusRaw the new object to create
     * @return the created ManagedAppStatusRaw
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatusRaw post(@Nonnull final ManagedAppStatusRaw newManagedAppStatusRaw) throws ClientException {
        return send(HttpMethod.POST, newManagedAppStatusRaw);
    }

    /**
     * Creates a ManagedAppStatusRaw with a new object
     *
     * @param newManagedAppStatusRaw the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedAppStatusRaw> putAsync(@Nonnull final ManagedAppStatusRaw newManagedAppStatusRaw) {
        return sendAsync(HttpMethod.PUT, newManagedAppStatusRaw);
    }

    /**
     * Creates a ManagedAppStatusRaw with a new object
     *
     * @param newManagedAppStatusRaw the object to create/update
     * @return the created ManagedAppStatusRaw
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatusRaw put(@Nonnull final ManagedAppStatusRaw newManagedAppStatusRaw) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppStatusRaw);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAppStatusRawRequest select(@Nonnull final String value) {
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
     public ManagedAppStatusRawRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

