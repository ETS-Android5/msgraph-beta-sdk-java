// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryExportOperation;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetQueryWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Export Operation Request.
 */
public class EdiscoveryExportOperationRequest extends BaseRequest<EdiscoveryExportOperation> {
	
    /**
     * The request for the EdiscoveryExportOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryExportOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryExportOperation.class);
    }

    /**
     * Gets the EdiscoveryExportOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryExportOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EdiscoveryExportOperation from the service
     *
     * @return the EdiscoveryExportOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryExportOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryExportOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EdiscoveryExportOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EdiscoveryExportOperation with a source
     *
     * @param sourceEdiscoveryExportOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryExportOperation> patchAsync(@Nonnull final EdiscoveryExportOperation sourceEdiscoveryExportOperation) {
        return sendAsync(HttpMethod.PATCH, sourceEdiscoveryExportOperation);
    }

    /**
     * Patches this EdiscoveryExportOperation with a source
     *
     * @param sourceEdiscoveryExportOperation the source object with updates
     * @return the updated EdiscoveryExportOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryExportOperation patch(@Nonnull final EdiscoveryExportOperation sourceEdiscoveryExportOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceEdiscoveryExportOperation);
    }

    /**
     * Creates a EdiscoveryExportOperation with a new object
     *
     * @param newEdiscoveryExportOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryExportOperation> postAsync(@Nonnull final EdiscoveryExportOperation newEdiscoveryExportOperation) {
        return sendAsync(HttpMethod.POST, newEdiscoveryExportOperation);
    }

    /**
     * Creates a EdiscoveryExportOperation with a new object
     *
     * @param newEdiscoveryExportOperation the new object to create
     * @return the created EdiscoveryExportOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryExportOperation post(@Nonnull final EdiscoveryExportOperation newEdiscoveryExportOperation) throws ClientException {
        return send(HttpMethod.POST, newEdiscoveryExportOperation);
    }

    /**
     * Creates a EdiscoveryExportOperation with a new object
     *
     * @param newEdiscoveryExportOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryExportOperation> putAsync(@Nonnull final EdiscoveryExportOperation newEdiscoveryExportOperation) {
        return sendAsync(HttpMethod.PUT, newEdiscoveryExportOperation);
    }

    /**
     * Creates a EdiscoveryExportOperation with a new object
     *
     * @param newEdiscoveryExportOperation the object to create/update
     * @return the created EdiscoveryExportOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryExportOperation put(@Nonnull final EdiscoveryExportOperation newEdiscoveryExportOperation) throws ClientException {
        return send(HttpMethod.PUT, newEdiscoveryExportOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryExportOperationRequest select(@Nonnull final String value) {
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
     public EdiscoveryExportOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

