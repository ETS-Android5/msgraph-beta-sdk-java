// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AppScope;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Scope Request.
 */
public class AppScopeRequest extends BaseRequest<AppScope> {
	
    /**
     * The request for the AppScope
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppScopeRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppScope.class);
    }

    /**
     * Gets the AppScope from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppScope> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AppScope from the service
     *
     * @return the AppScope from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppScope get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppScope> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AppScope delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AppScope with a source
     *
     * @param sourceAppScope the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppScope> patchAsync(@Nonnull final AppScope sourceAppScope) {
        return sendAsync(HttpMethod.PATCH, sourceAppScope);
    }

    /**
     * Patches this AppScope with a source
     *
     * @param sourceAppScope the source object with updates
     * @return the updated AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppScope patch(@Nonnull final AppScope sourceAppScope) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppScope);
    }

    /**
     * Creates a AppScope with a new object
     *
     * @param newAppScope the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppScope> postAsync(@Nonnull final AppScope newAppScope) {
        return sendAsync(HttpMethod.POST, newAppScope);
    }

    /**
     * Creates a AppScope with a new object
     *
     * @param newAppScope the new object to create
     * @return the created AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppScope post(@Nonnull final AppScope newAppScope) throws ClientException {
        return send(HttpMethod.POST, newAppScope);
    }

    /**
     * Creates a AppScope with a new object
     *
     * @param newAppScope the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppScope> putAsync(@Nonnull final AppScope newAppScope) {
        return sendAsync(HttpMethod.PUT, newAppScope);
    }

    /**
     * Creates a AppScope with a new object
     *
     * @param newAppScope the object to create/update
     * @return the created AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppScope put(@Nonnull final AppScope newAppScope) throws ClientException {
        return send(HttpMethod.PUT, newAppScope);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AppScopeRequest select(@Nonnull final String value) {
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
     public AppScopeRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

