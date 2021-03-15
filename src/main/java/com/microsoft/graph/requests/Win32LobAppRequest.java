// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Win32LobApp;
import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.MobileAppRelationshipState;
import com.microsoft.graph.models.MobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Request.
 */
public class Win32LobAppRequest extends BaseRequest<Win32LobApp> {
	
    /**
     * The request for the Win32LobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Win32LobAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Win32LobApp.class);
    }

    /**
     * Gets the Win32LobApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Win32LobApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Win32LobApp from the service
     *
     * @return the Win32LobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Win32LobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Win32LobApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Win32LobApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Win32LobApp with a source
     *
     * @param sourceWin32LobApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Win32LobApp> patchAsync(@Nonnull final Win32LobApp sourceWin32LobApp) {
        return sendAsync(HttpMethod.PATCH, sourceWin32LobApp);
    }

    /**
     * Patches this Win32LobApp with a source
     *
     * @param sourceWin32LobApp the source object with updates
     * @return the updated Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Win32LobApp patch(@Nonnull final Win32LobApp sourceWin32LobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Win32LobApp> postAsync(@Nonnull final Win32LobApp newWin32LobApp) {
        return sendAsync(HttpMethod.POST, newWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the new object to create
     * @return the created Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Win32LobApp post(@Nonnull final Win32LobApp newWin32LobApp) throws ClientException {
        return send(HttpMethod.POST, newWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Win32LobApp> putAsync(@Nonnull final Win32LobApp newWin32LobApp) {
        return sendAsync(HttpMethod.PUT, newWin32LobApp);
    }

    /**
     * Creates a Win32LobApp with a new object
     *
     * @param newWin32LobApp the object to create/update
     * @return the created Win32LobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Win32LobApp put(@Nonnull final Win32LobApp newWin32LobApp) throws ClientException {
        return send(HttpMethod.PUT, newWin32LobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Win32LobAppRequest select(@Nonnull final String value) {
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
     public Win32LobAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

