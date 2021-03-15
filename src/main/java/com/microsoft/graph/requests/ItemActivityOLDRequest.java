// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ItemActivityOLD;
import com.microsoft.graph.requests.DriveItemRequestBuilder;
import com.microsoft.graph.requests.ListItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity OLDRequest.
 */
public class ItemActivityOLDRequest extends BaseRequest<ItemActivityOLD> {
	
    /**
     * The request for the ItemActivityOLD
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityOLDRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityOLD.class);
    }

    /**
     * Gets the ItemActivityOLD from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityOLD> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ItemActivityOLD from the service
     *
     * @return the ItemActivityOLD from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityOLD get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityOLD> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ItemActivityOLD delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ItemActivityOLD with a source
     *
     * @param sourceItemActivityOLD the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityOLD> patchAsync(@Nonnull final ItemActivityOLD sourceItemActivityOLD) {
        return sendAsync(HttpMethod.PATCH, sourceItemActivityOLD);
    }

    /**
     * Patches this ItemActivityOLD with a source
     *
     * @param sourceItemActivityOLD the source object with updates
     * @return the updated ItemActivityOLD
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityOLD patch(@Nonnull final ItemActivityOLD sourceItemActivityOLD) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemActivityOLD);
    }

    /**
     * Creates a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityOLD> postAsync(@Nonnull final ItemActivityOLD newItemActivityOLD) {
        return sendAsync(HttpMethod.POST, newItemActivityOLD);
    }

    /**
     * Creates a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the new object to create
     * @return the created ItemActivityOLD
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityOLD post(@Nonnull final ItemActivityOLD newItemActivityOLD) throws ClientException {
        return send(HttpMethod.POST, newItemActivityOLD);
    }

    /**
     * Creates a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ItemActivityOLD> putAsync(@Nonnull final ItemActivityOLD newItemActivityOLD) {
        return sendAsync(HttpMethod.PUT, newItemActivityOLD);
    }

    /**
     * Creates a ItemActivityOLD with a new object
     *
     * @param newItemActivityOLD the object to create/update
     * @return the created ItemActivityOLD
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ItemActivityOLD put(@Nonnull final ItemActivityOLD newItemActivityOLD) throws ClientException {
        return send(HttpMethod.PUT, newItemActivityOLD);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ItemActivityOLDRequest select(@Nonnull final String value) {
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
     public ItemActivityOLDRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

