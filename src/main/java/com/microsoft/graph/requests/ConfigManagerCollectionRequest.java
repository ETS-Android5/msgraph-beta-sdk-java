// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ConfigManagerCollection;
import com.microsoft.graph.models.ConfigManagerPolicySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Config Manager Collection Request.
 */
public class ConfigManagerCollectionRequest extends BaseRequest<ConfigManagerCollection> {
	
    /**
     * The request for the ConfigManagerCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConfigManagerCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConfigManagerCollection.class);
    }

    /**
     * Gets the ConfigManagerCollection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerCollection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ConfigManagerCollection from the service
     *
     * @return the ConfigManagerCollection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConfigManagerCollection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerCollection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ConfigManagerCollection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ConfigManagerCollection with a source
     *
     * @param sourceConfigManagerCollection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerCollection> patchAsync(@Nonnull final ConfigManagerCollection sourceConfigManagerCollection) {
        return sendAsync(HttpMethod.PATCH, sourceConfigManagerCollection);
    }

    /**
     * Patches this ConfigManagerCollection with a source
     *
     * @param sourceConfigManagerCollection the source object with updates
     * @return the updated ConfigManagerCollection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConfigManagerCollection patch(@Nonnull final ConfigManagerCollection sourceConfigManagerCollection) throws ClientException {
        return send(HttpMethod.PATCH, sourceConfigManagerCollection);
    }

    /**
     * Creates a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerCollection> postAsync(@Nonnull final ConfigManagerCollection newConfigManagerCollection) {
        return sendAsync(HttpMethod.POST, newConfigManagerCollection);
    }

    /**
     * Creates a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the new object to create
     * @return the created ConfigManagerCollection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConfigManagerCollection post(@Nonnull final ConfigManagerCollection newConfigManagerCollection) throws ClientException {
        return send(HttpMethod.POST, newConfigManagerCollection);
    }

    /**
     * Creates a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerCollection> putAsync(@Nonnull final ConfigManagerCollection newConfigManagerCollection) {
        return sendAsync(HttpMethod.PUT, newConfigManagerCollection);
    }

    /**
     * Creates a ConfigManagerCollection with a new object
     *
     * @param newConfigManagerCollection the object to create/update
     * @return the created ConfigManagerCollection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConfigManagerCollection put(@Nonnull final ConfigManagerCollection newConfigManagerCollection) throws ClientException {
        return send(HttpMethod.PUT, newConfigManagerCollection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ConfigManagerCollectionRequest select(@Nonnull final String value) {
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
     public ConfigManagerCollectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

