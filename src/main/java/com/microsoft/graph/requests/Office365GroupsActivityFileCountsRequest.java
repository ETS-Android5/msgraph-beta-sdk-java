// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365GroupsActivityFileCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Groups Activity File Counts Request.
 */
public class Office365GroupsActivityFileCountsRequest extends BaseRequest<Office365GroupsActivityFileCounts> {
	
    /**
     * The request for the Office365GroupsActivityFileCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Office365GroupsActivityFileCountsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Office365GroupsActivityFileCounts.class);
    }

    /**
     * Gets the Office365GroupsActivityFileCounts from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Office365GroupsActivityFileCounts> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Office365GroupsActivityFileCounts from the service
     *
     * @return the Office365GroupsActivityFileCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Office365GroupsActivityFileCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Office365GroupsActivityFileCounts> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Office365GroupsActivityFileCounts delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Office365GroupsActivityFileCounts with a source
     *
     * @param sourceOffice365GroupsActivityFileCounts the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Office365GroupsActivityFileCounts> patchAsync(@Nonnull final Office365GroupsActivityFileCounts sourceOffice365GroupsActivityFileCounts) {
        return sendAsync(HttpMethod.PATCH, sourceOffice365GroupsActivityFileCounts);
    }

    /**
     * Patches this Office365GroupsActivityFileCounts with a source
     *
     * @param sourceOffice365GroupsActivityFileCounts the source object with updates
     * @return the updated Office365GroupsActivityFileCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Office365GroupsActivityFileCounts patch(@Nonnull final Office365GroupsActivityFileCounts sourceOffice365GroupsActivityFileCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceOffice365GroupsActivityFileCounts);
    }

    /**
     * Creates a Office365GroupsActivityFileCounts with a new object
     *
     * @param newOffice365GroupsActivityFileCounts the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Office365GroupsActivityFileCounts> postAsync(@Nonnull final Office365GroupsActivityFileCounts newOffice365GroupsActivityFileCounts) {
        return sendAsync(HttpMethod.POST, newOffice365GroupsActivityFileCounts);
    }

    /**
     * Creates a Office365GroupsActivityFileCounts with a new object
     *
     * @param newOffice365GroupsActivityFileCounts the new object to create
     * @return the created Office365GroupsActivityFileCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Office365GroupsActivityFileCounts post(@Nonnull final Office365GroupsActivityFileCounts newOffice365GroupsActivityFileCounts) throws ClientException {
        return send(HttpMethod.POST, newOffice365GroupsActivityFileCounts);
    }

    /**
     * Creates a Office365GroupsActivityFileCounts with a new object
     *
     * @param newOffice365GroupsActivityFileCounts the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Office365GroupsActivityFileCounts> putAsync(@Nonnull final Office365GroupsActivityFileCounts newOffice365GroupsActivityFileCounts) {
        return sendAsync(HttpMethod.PUT, newOffice365GroupsActivityFileCounts);
    }

    /**
     * Creates a Office365GroupsActivityFileCounts with a new object
     *
     * @param newOffice365GroupsActivityFileCounts the object to create/update
     * @return the created Office365GroupsActivityFileCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Office365GroupsActivityFileCounts put(@Nonnull final Office365GroupsActivityFileCounts newOffice365GroupsActivityFileCounts) throws ClientException {
        return send(HttpMethod.PUT, newOffice365GroupsActivityFileCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Office365GroupsActivityFileCountsRequest select(@Nonnull final String value) {
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
     public Office365GroupsActivityFileCountsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

