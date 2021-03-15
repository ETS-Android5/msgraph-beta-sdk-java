// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SkypeForBusinessDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Device Usage User Detail Request.
 */
public class SkypeForBusinessDeviceUsageUserDetailRequest extends BaseRequest<SkypeForBusinessDeviceUsageUserDetail> {
	
    /**
     * The request for the SkypeForBusinessDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessDeviceUsageUserDetailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessDeviceUsageUserDetail.class);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserDetail from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserDetail> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserDetail from the service
     *
     * @return the SkypeForBusinessDeviceUsageUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserDetail> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserDetail delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SkypeForBusinessDeviceUsageUserDetail with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserDetail the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserDetail> patchAsync(@Nonnull final SkypeForBusinessDeviceUsageUserDetail sourceSkypeForBusinessDeviceUsageUserDetail) {
        return sendAsync(HttpMethod.PATCH, sourceSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Patches this SkypeForBusinessDeviceUsageUserDetail with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserDetail the source object with updates
     * @return the updated SkypeForBusinessDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserDetail patch(@Nonnull final SkypeForBusinessDeviceUsageUserDetail sourceSkypeForBusinessDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserDetail with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserDetail the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserDetail> postAsync(@Nonnull final SkypeForBusinessDeviceUsageUserDetail newSkypeForBusinessDeviceUsageUserDetail) {
        return sendAsync(HttpMethod.POST, newSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserDetail with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserDetail the new object to create
     * @return the created SkypeForBusinessDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserDetail post(@Nonnull final SkypeForBusinessDeviceUsageUserDetail newSkypeForBusinessDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserDetail with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserDetail the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SkypeForBusinessDeviceUsageUserDetail> putAsync(@Nonnull final SkypeForBusinessDeviceUsageUserDetail newSkypeForBusinessDeviceUsageUserDetail) {
        return sendAsync(HttpMethod.PUT, newSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserDetail with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserDetail the object to create/update
     * @return the created SkypeForBusinessDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SkypeForBusinessDeviceUsageUserDetail put(@Nonnull final SkypeForBusinessDeviceUsageUserDetail newSkypeForBusinessDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SkypeForBusinessDeviceUsageUserDetailRequest select(@Nonnull final String value) {
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
     public SkypeForBusinessDeviceUsageUserDetailRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

