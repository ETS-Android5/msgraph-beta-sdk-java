// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.windowsupdates.models.CatalogEntry;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Catalog Entry Request.
 */
public class CatalogEntryRequest extends BaseRequest<CatalogEntry> {
	
    /**
     * The request for the CatalogEntry
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public CatalogEntryRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends CatalogEntry> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the CatalogEntry
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CatalogEntryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CatalogEntry.class);
    }

    /**
     * Gets the CatalogEntry from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CatalogEntry> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CatalogEntry from the service
     *
     * @return the CatalogEntry from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CatalogEntry get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CatalogEntry> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CatalogEntry delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CatalogEntry with a source
     *
     * @param sourceCatalogEntry the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CatalogEntry> patchAsync(@Nonnull final CatalogEntry sourceCatalogEntry) {
        return sendAsync(HttpMethod.PATCH, sourceCatalogEntry);
    }

    /**
     * Patches this CatalogEntry with a source
     *
     * @param sourceCatalogEntry the source object with updates
     * @return the updated CatalogEntry
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CatalogEntry patch(@Nonnull final CatalogEntry sourceCatalogEntry) throws ClientException {
        return send(HttpMethod.PATCH, sourceCatalogEntry);
    }

    /**
     * Creates a CatalogEntry with a new object
     *
     * @param newCatalogEntry the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CatalogEntry> postAsync(@Nonnull final CatalogEntry newCatalogEntry) {
        return sendAsync(HttpMethod.POST, newCatalogEntry);
    }

    /**
     * Creates a CatalogEntry with a new object
     *
     * @param newCatalogEntry the new object to create
     * @return the created CatalogEntry
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CatalogEntry post(@Nonnull final CatalogEntry newCatalogEntry) throws ClientException {
        return send(HttpMethod.POST, newCatalogEntry);
    }

    /**
     * Creates a CatalogEntry with a new object
     *
     * @param newCatalogEntry the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CatalogEntry> putAsync(@Nonnull final CatalogEntry newCatalogEntry) {
        return sendAsync(HttpMethod.PUT, newCatalogEntry);
    }

    /**
     * Creates a CatalogEntry with a new object
     *
     * @param newCatalogEntry the object to create/update
     * @return the created CatalogEntry
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CatalogEntry put(@Nonnull final CatalogEntry newCatalogEntry) throws ClientException {
        return send(HttpMethod.PUT, newCatalogEntry);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CatalogEntryRequest select(@Nonnull final String value) {
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
     public CatalogEntryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

