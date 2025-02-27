// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ItemCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Category Request.
 */
public class ItemCategoryRequest extends BaseRequest<ItemCategory> {
	
    /**
     * The request for the ItemCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemCategory.class);
    }

    /**
     * Gets the ItemCategory from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemCategory> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ItemCategory from the service
     *
     * @return the ItemCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemCategory> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ItemCategory delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ItemCategory with a source
     *
     * @param sourceItemCategory the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemCategory> patchAsync(@Nonnull final ItemCategory sourceItemCategory) {
        return sendAsync(HttpMethod.PATCH, sourceItemCategory);
    }

    /**
     * Patches this ItemCategory with a source
     *
     * @param sourceItemCategory the source object with updates
     * @return the updated ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemCategory patch(@Nonnull final ItemCategory sourceItemCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemCategory> postAsync(@Nonnull final ItemCategory newItemCategory) {
        return sendAsync(HttpMethod.POST, newItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the new object to create
     * @return the created ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemCategory post(@Nonnull final ItemCategory newItemCategory) throws ClientException {
        return send(HttpMethod.POST, newItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemCategory> putAsync(@Nonnull final ItemCategory newItemCategory) {
        return sendAsync(HttpMethod.PUT, newItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the object to create/update
     * @return the created ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemCategory put(@Nonnull final ItemCategory newItemCategory) throws ClientException {
        return send(HttpMethod.PUT, newItemCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ItemCategoryRequest select(@Nonnull final String value) {
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
     public ItemCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

