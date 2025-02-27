// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BusinessFlow;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow Request.
 */
public class BusinessFlowRequest extends BaseRequest<BusinessFlow> {
	
    /**
     * The request for the BusinessFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BusinessFlowRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BusinessFlow.class);
    }

    /**
     * Gets the BusinessFlow from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BusinessFlow> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the BusinessFlow from the service
     *
     * @return the BusinessFlow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BusinessFlow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BusinessFlow> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public BusinessFlow delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this BusinessFlow with a source
     *
     * @param sourceBusinessFlow the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BusinessFlow> patchAsync(@Nonnull final BusinessFlow sourceBusinessFlow) {
        return sendAsync(HttpMethod.PATCH, sourceBusinessFlow);
    }

    /**
     * Patches this BusinessFlow with a source
     *
     * @param sourceBusinessFlow the source object with updates
     * @return the updated BusinessFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BusinessFlow patch(@Nonnull final BusinessFlow sourceBusinessFlow) throws ClientException {
        return send(HttpMethod.PATCH, sourceBusinessFlow);
    }

    /**
     * Creates a BusinessFlow with a new object
     *
     * @param newBusinessFlow the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BusinessFlow> postAsync(@Nonnull final BusinessFlow newBusinessFlow) {
        return sendAsync(HttpMethod.POST, newBusinessFlow);
    }

    /**
     * Creates a BusinessFlow with a new object
     *
     * @param newBusinessFlow the new object to create
     * @return the created BusinessFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BusinessFlow post(@Nonnull final BusinessFlow newBusinessFlow) throws ClientException {
        return send(HttpMethod.POST, newBusinessFlow);
    }

    /**
     * Creates a BusinessFlow with a new object
     *
     * @param newBusinessFlow the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BusinessFlow> putAsync(@Nonnull final BusinessFlow newBusinessFlow) {
        return sendAsync(HttpMethod.PUT, newBusinessFlow);
    }

    /**
     * Creates a BusinessFlow with a new object
     *
     * @param newBusinessFlow the object to create/update
     * @return the created BusinessFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public BusinessFlow put(@Nonnull final BusinessFlow newBusinessFlow) throws ClientException {
        return send(HttpMethod.PUT, newBusinessFlow);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public BusinessFlowRequest select(@Nonnull final String value) {
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
     public BusinessFlowRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

