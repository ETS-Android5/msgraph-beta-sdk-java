// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryEstimateOperation;
import com.microsoft.graph.security.requests.EdiscoverySearchWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Estimate Operation Request.
 */
public class EdiscoveryEstimateOperationRequest extends BaseRequest<EdiscoveryEstimateOperation> {
	
    /**
     * The request for the EdiscoveryEstimateOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryEstimateOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryEstimateOperation.class);
    }

    /**
     * Gets the EdiscoveryEstimateOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryEstimateOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EdiscoveryEstimateOperation from the service
     *
     * @return the EdiscoveryEstimateOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryEstimateOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryEstimateOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EdiscoveryEstimateOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EdiscoveryEstimateOperation with a source
     *
     * @param sourceEdiscoveryEstimateOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryEstimateOperation> patchAsync(@Nonnull final EdiscoveryEstimateOperation sourceEdiscoveryEstimateOperation) {
        return sendAsync(HttpMethod.PATCH, sourceEdiscoveryEstimateOperation);
    }

    /**
     * Patches this EdiscoveryEstimateOperation with a source
     *
     * @param sourceEdiscoveryEstimateOperation the source object with updates
     * @return the updated EdiscoveryEstimateOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryEstimateOperation patch(@Nonnull final EdiscoveryEstimateOperation sourceEdiscoveryEstimateOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceEdiscoveryEstimateOperation);
    }

    /**
     * Creates a EdiscoveryEstimateOperation with a new object
     *
     * @param newEdiscoveryEstimateOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryEstimateOperation> postAsync(@Nonnull final EdiscoveryEstimateOperation newEdiscoveryEstimateOperation) {
        return sendAsync(HttpMethod.POST, newEdiscoveryEstimateOperation);
    }

    /**
     * Creates a EdiscoveryEstimateOperation with a new object
     *
     * @param newEdiscoveryEstimateOperation the new object to create
     * @return the created EdiscoveryEstimateOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryEstimateOperation post(@Nonnull final EdiscoveryEstimateOperation newEdiscoveryEstimateOperation) throws ClientException {
        return send(HttpMethod.POST, newEdiscoveryEstimateOperation);
    }

    /**
     * Creates a EdiscoveryEstimateOperation with a new object
     *
     * @param newEdiscoveryEstimateOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryEstimateOperation> putAsync(@Nonnull final EdiscoveryEstimateOperation newEdiscoveryEstimateOperation) {
        return sendAsync(HttpMethod.PUT, newEdiscoveryEstimateOperation);
    }

    /**
     * Creates a EdiscoveryEstimateOperation with a new object
     *
     * @param newEdiscoveryEstimateOperation the object to create/update
     * @return the created EdiscoveryEstimateOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryEstimateOperation put(@Nonnull final EdiscoveryEstimateOperation newEdiscoveryEstimateOperation) throws ClientException {
        return send(HttpMethod.PUT, newEdiscoveryEstimateOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryEstimateOperationRequest select(@Nonnull final String value) {
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
     public EdiscoveryEstimateOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

