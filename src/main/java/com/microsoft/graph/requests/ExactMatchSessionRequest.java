// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ExactMatchSession;
import com.microsoft.graph.requests.ExactMatchUploadAgentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session Request.
 */
public class ExactMatchSessionRequest extends BaseRequest<ExactMatchSession> {
	
    /**
     * The request for the ExactMatchSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchSessionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExactMatchSession.class);
    }

    /**
     * Gets the ExactMatchSession from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSession> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ExactMatchSession from the service
     *
     * @return the ExactMatchSession from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSession get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSession> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ExactMatchSession delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExactMatchSession with a source
     *
     * @param sourceExactMatchSession the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSession> patchAsync(@Nonnull final ExactMatchSession sourceExactMatchSession) {
        return sendAsync(HttpMethod.PATCH, sourceExactMatchSession);
    }

    /**
     * Patches this ExactMatchSession with a source
     *
     * @param sourceExactMatchSession the source object with updates
     * @return the updated ExactMatchSession
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSession patch(@Nonnull final ExactMatchSession sourceExactMatchSession) throws ClientException {
        return send(HttpMethod.PATCH, sourceExactMatchSession);
    }

    /**
     * Creates a ExactMatchSession with a new object
     *
     * @param newExactMatchSession the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSession> postAsync(@Nonnull final ExactMatchSession newExactMatchSession) {
        return sendAsync(HttpMethod.POST, newExactMatchSession);
    }

    /**
     * Creates a ExactMatchSession with a new object
     *
     * @param newExactMatchSession the new object to create
     * @return the created ExactMatchSession
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSession post(@Nonnull final ExactMatchSession newExactMatchSession) throws ClientException {
        return send(HttpMethod.POST, newExactMatchSession);
    }

    /**
     * Creates a ExactMatchSession with a new object
     *
     * @param newExactMatchSession the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSession> putAsync(@Nonnull final ExactMatchSession newExactMatchSession) {
        return sendAsync(HttpMethod.PUT, newExactMatchSession);
    }

    /**
     * Creates a ExactMatchSession with a new object
     *
     * @param newExactMatchSession the object to create/update
     * @return the created ExactMatchSession
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSession put(@Nonnull final ExactMatchSession newExactMatchSession) throws ClientException {
        return send(HttpMethod.PUT, newExactMatchSession);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExactMatchSessionRequest select(@Nonnull final String value) {
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
     public ExactMatchSessionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

