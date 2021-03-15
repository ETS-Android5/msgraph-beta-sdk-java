// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ItemInsightsSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Insights Settings Request.
 */
public class ItemInsightsSettingsRequest extends BaseRequest<ItemInsightsSettings> {
	
    /**
     * The request for the ItemInsightsSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemInsightsSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemInsightsSettings.class);
    }

    /**
     * Gets the ItemInsightsSettings from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemInsightsSettings> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ItemInsightsSettings from the service
     *
     * @return the ItemInsightsSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemInsightsSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemInsightsSettings> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ItemInsightsSettings delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ItemInsightsSettings with a source
     *
     * @param sourceItemInsightsSettings the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemInsightsSettings> patchAsync(@Nonnull final ItemInsightsSettings sourceItemInsightsSettings) {
        return sendAsync(HttpMethod.PATCH, sourceItemInsightsSettings);
    }

    /**
     * Patches this ItemInsightsSettings with a source
     *
     * @param sourceItemInsightsSettings the source object with updates
     * @return the updated ItemInsightsSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemInsightsSettings patch(@Nonnull final ItemInsightsSettings sourceItemInsightsSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemInsightsSettings);
    }

    /**
     * Creates a ItemInsightsSettings with a new object
     *
     * @param newItemInsightsSettings the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemInsightsSettings> postAsync(@Nonnull final ItemInsightsSettings newItemInsightsSettings) {
        return sendAsync(HttpMethod.POST, newItemInsightsSettings);
    }

    /**
     * Creates a ItemInsightsSettings with a new object
     *
     * @param newItemInsightsSettings the new object to create
     * @return the created ItemInsightsSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemInsightsSettings post(@Nonnull final ItemInsightsSettings newItemInsightsSettings) throws ClientException {
        return send(HttpMethod.POST, newItemInsightsSettings);
    }

    /**
     * Creates a ItemInsightsSettings with a new object
     *
     * @param newItemInsightsSettings the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemInsightsSettings> putAsync(@Nonnull final ItemInsightsSettings newItemInsightsSettings) {
        return sendAsync(HttpMethod.PUT, newItemInsightsSettings);
    }

    /**
     * Creates a ItemInsightsSettings with a new object
     *
     * @param newItemInsightsSettings the object to create/update
     * @return the created ItemInsightsSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemInsightsSettings put(@Nonnull final ItemInsightsSettings newItemInsightsSettings) throws ClientException {
        return send(HttpMethod.PUT, newItemInsightsSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ItemInsightsSettingsRequest select(@Nonnull final String value) {
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
     public ItemInsightsSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

