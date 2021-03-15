// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SkypeForBusinessDeviceUsageUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Device Usage User Counts Request.
 */
public class SkypeForBusinessDeviceUsageUserCountsRequest extends BaseRequest<SkypeForBusinessDeviceUsageUserCounts> {
	
    /**
     * The request for the SkypeForBusinessDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessDeviceUsageUserCountsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessDeviceUsageUserCounts.class);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserCounts from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserCounts> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserCounts from the service
     *
     * @return the SkypeForBusinessDeviceUsageUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserCounts> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserCounts delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SkypeForBusinessDeviceUsageUserCounts with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserCounts the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserCounts> patchAsync(@Nonnull final SkypeForBusinessDeviceUsageUserCounts sourceSkypeForBusinessDeviceUsageUserCounts) {
        return sendAsync(HttpMethod.PATCH, sourceSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Patches this SkypeForBusinessDeviceUsageUserCounts with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserCounts the source object with updates
     * @return the updated SkypeForBusinessDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserCounts patch(@Nonnull final SkypeForBusinessDeviceUsageUserCounts sourceSkypeForBusinessDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserCounts> postAsync(@Nonnull final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts) {
        return sendAsync(HttpMethod.POST, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the new object to create
     * @return the created SkypeForBusinessDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserCounts post(@Nonnull final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserCounts> putAsync(@Nonnull final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts) {
        return sendAsync(HttpMethod.PUT, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the object to create/update
     * @return the created SkypeForBusinessDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserCounts put(@Nonnull final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SkypeForBusinessDeviceUsageUserCountsRequest select(@Nonnull final String value) {
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
     public SkypeForBusinessDeviceUsageUserCountsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

