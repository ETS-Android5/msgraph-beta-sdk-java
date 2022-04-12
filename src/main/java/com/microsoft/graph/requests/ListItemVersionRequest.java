// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ListItemVersion;
import com.microsoft.graph.requests.FieldValueSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Request.
 */
public class ListItemVersionRequest extends BaseRequest<ListItemVersion> {
	
    /**
     * The request for the ListItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ListItemVersionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ListItemVersion> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ListItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemVersionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItemVersion.class);
    }

    /**
     * Gets the ListItemVersion from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItemVersion> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ListItemVersion from the service
     *
     * @return the ListItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItemVersion get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItemVersion> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ListItemVersion delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ListItemVersion with a source
     *
     * @param sourceListItemVersion the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItemVersion> patchAsync(@Nonnull final ListItemVersion sourceListItemVersion) {
        return sendAsync(HttpMethod.PATCH, sourceListItemVersion);
    }

    /**
     * Patches this ListItemVersion with a source
     *
     * @param sourceListItemVersion the source object with updates
     * @return the updated ListItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItemVersion patch(@Nonnull final ListItemVersion sourceListItemVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItemVersion> postAsync(@Nonnull final ListItemVersion newListItemVersion) {
        return sendAsync(HttpMethod.POST, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the new object to create
     * @return the created ListItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItemVersion post(@Nonnull final ListItemVersion newListItemVersion) throws ClientException {
        return send(HttpMethod.POST, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ListItemVersion> putAsync(@Nonnull final ListItemVersion newListItemVersion) {
        return sendAsync(HttpMethod.PUT, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the object to create/update
     * @return the created ListItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ListItemVersion put(@Nonnull final ListItemVersion newListItemVersion) throws ClientException {
        return send(HttpMethod.PUT, newListItemVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ListItemVersionRequest select(@Nonnull final String value) {
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
     public ListItemVersionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

