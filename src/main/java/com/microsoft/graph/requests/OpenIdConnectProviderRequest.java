// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OpenIdConnectProvider;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Id Connect Provider Request.
 * @deprecated The identityProvider API is deprecated and will stop returning data on March 2023. Please use the new identityProviderBase API.
 */
@Deprecated
public class OpenIdConnectProviderRequest extends BaseRequest<OpenIdConnectProvider> {
	
    /**
     * The request for the OpenIdConnectProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OpenIdConnectProviderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OpenIdConnectProvider.class);
    }

    /**
     * Gets the OpenIdConnectProvider from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenIdConnectProvider> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OpenIdConnectProvider from the service
     *
     * @return the OpenIdConnectProvider from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenIdConnectProvider get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenIdConnectProvider> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OpenIdConnectProvider delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OpenIdConnectProvider with a source
     *
     * @param sourceOpenIdConnectProvider the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenIdConnectProvider> patchAsync(@Nonnull final OpenIdConnectProvider sourceOpenIdConnectProvider) {
        return sendAsync(HttpMethod.PATCH, sourceOpenIdConnectProvider);
    }

    /**
     * Patches this OpenIdConnectProvider with a source
     *
     * @param sourceOpenIdConnectProvider the source object with updates
     * @return the updated OpenIdConnectProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenIdConnectProvider patch(@Nonnull final OpenIdConnectProvider sourceOpenIdConnectProvider) throws ClientException {
        return send(HttpMethod.PATCH, sourceOpenIdConnectProvider);
    }

    /**
     * Creates a OpenIdConnectProvider with a new object
     *
     * @param newOpenIdConnectProvider the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenIdConnectProvider> postAsync(@Nonnull final OpenIdConnectProvider newOpenIdConnectProvider) {
        return sendAsync(HttpMethod.POST, newOpenIdConnectProvider);
    }

    /**
     * Creates a OpenIdConnectProvider with a new object
     *
     * @param newOpenIdConnectProvider the new object to create
     * @return the created OpenIdConnectProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenIdConnectProvider post(@Nonnull final OpenIdConnectProvider newOpenIdConnectProvider) throws ClientException {
        return send(HttpMethod.POST, newOpenIdConnectProvider);
    }

    /**
     * Creates a OpenIdConnectProvider with a new object
     *
     * @param newOpenIdConnectProvider the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenIdConnectProvider> putAsync(@Nonnull final OpenIdConnectProvider newOpenIdConnectProvider) {
        return sendAsync(HttpMethod.PUT, newOpenIdConnectProvider);
    }

    /**
     * Creates a OpenIdConnectProvider with a new object
     *
     * @param newOpenIdConnectProvider the object to create/update
     * @return the created OpenIdConnectProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OpenIdConnectProvider put(@Nonnull final OpenIdConnectProvider newOpenIdConnectProvider) throws ClientException {
        return send(HttpMethod.PUT, newOpenIdConnectProvider);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OpenIdConnectProviderRequest select(@Nonnull final String value) {
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
     public OpenIdConnectProviderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

