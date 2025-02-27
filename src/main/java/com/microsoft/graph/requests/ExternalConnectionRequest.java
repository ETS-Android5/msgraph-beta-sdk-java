// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ExternalConnection;
import com.microsoft.graph.requests.ExternalGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.ExternalGroupRequestBuilder;
import com.microsoft.graph.requests.ExternalItemCollectionRequestBuilder;
import com.microsoft.graph.requests.ExternalItemRequestBuilder;
import com.microsoft.graph.requests.ConnectionOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.ConnectionOperationRequestBuilder;
import com.microsoft.graph.requests.SchemaRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection Request.
 * @deprecated The OData type annotation for this entity is being deprecated by Aug 2021. Please strip the @odata.type annotations for this specific entity from your request payloads before the deprecation date.
 */
@Deprecated
public class ExternalConnectionRequest extends BaseRequest<ExternalConnection> {
	
    /**
     * The request for the ExternalConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalConnectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExternalConnection.class);
    }

    /**
     * Gets the ExternalConnection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ExternalConnection from the service
     *
     * @return the ExternalConnection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalConnection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ExternalConnection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExternalConnection with a source
     *
     * @param sourceExternalConnection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> patchAsync(@Nonnull final ExternalConnection sourceExternalConnection) {
        return sendAsync(HttpMethod.PATCH, sourceExternalConnection);
    }

    /**
     * Patches this ExternalConnection with a source
     *
     * @param sourceExternalConnection the source object with updates
     * @return the updated ExternalConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalConnection patch(@Nonnull final ExternalConnection sourceExternalConnection) throws ClientException {
        return send(HttpMethod.PATCH, sourceExternalConnection);
    }

    /**
     * Creates a ExternalConnection with a new object
     *
     * @param newExternalConnection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> postAsync(@Nonnull final ExternalConnection newExternalConnection) {
        return sendAsync(HttpMethod.POST, newExternalConnection);
    }

    /**
     * Creates a ExternalConnection with a new object
     *
     * @param newExternalConnection the new object to create
     * @return the created ExternalConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalConnection post(@Nonnull final ExternalConnection newExternalConnection) throws ClientException {
        return send(HttpMethod.POST, newExternalConnection);
    }

    /**
     * Creates a ExternalConnection with a new object
     *
     * @param newExternalConnection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> putAsync(@Nonnull final ExternalConnection newExternalConnection) {
        return sendAsync(HttpMethod.PUT, newExternalConnection);
    }

    /**
     * Creates a ExternalConnection with a new object
     *
     * @param newExternalConnection the object to create/update
     * @return the created ExternalConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalConnection put(@Nonnull final ExternalConnection newExternalConnection) throws ClientException {
        return send(HttpMethod.PUT, newExternalConnection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExternalConnectionRequest select(@Nonnull final String value) {
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
     public ExternalConnectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

