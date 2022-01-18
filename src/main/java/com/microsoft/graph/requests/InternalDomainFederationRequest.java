// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.InternalDomainFederation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Internal Domain Federation Request.
 */
public class InternalDomainFederationRequest extends BaseRequest<InternalDomainFederation> {
	
    /**
     * The request for the InternalDomainFederation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InternalDomainFederationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InternalDomainFederation.class);
    }

    /**
     * Gets the InternalDomainFederation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InternalDomainFederation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the InternalDomainFederation from the service
     *
     * @return the InternalDomainFederation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InternalDomainFederation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InternalDomainFederation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public InternalDomainFederation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this InternalDomainFederation with a source
     *
     * @param sourceInternalDomainFederation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InternalDomainFederation> patchAsync(@Nonnull final InternalDomainFederation sourceInternalDomainFederation) {
        return sendAsync(HttpMethod.PATCH, sourceInternalDomainFederation);
    }

    /**
     * Patches this InternalDomainFederation with a source
     *
     * @param sourceInternalDomainFederation the source object with updates
     * @return the updated InternalDomainFederation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InternalDomainFederation patch(@Nonnull final InternalDomainFederation sourceInternalDomainFederation) throws ClientException {
        return send(HttpMethod.PATCH, sourceInternalDomainFederation);
    }

    /**
     * Creates a InternalDomainFederation with a new object
     *
     * @param newInternalDomainFederation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InternalDomainFederation> postAsync(@Nonnull final InternalDomainFederation newInternalDomainFederation) {
        return sendAsync(HttpMethod.POST, newInternalDomainFederation);
    }

    /**
     * Creates a InternalDomainFederation with a new object
     *
     * @param newInternalDomainFederation the new object to create
     * @return the created InternalDomainFederation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InternalDomainFederation post(@Nonnull final InternalDomainFederation newInternalDomainFederation) throws ClientException {
        return send(HttpMethod.POST, newInternalDomainFederation);
    }

    /**
     * Creates a InternalDomainFederation with a new object
     *
     * @param newInternalDomainFederation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InternalDomainFederation> putAsync(@Nonnull final InternalDomainFederation newInternalDomainFederation) {
        return sendAsync(HttpMethod.PUT, newInternalDomainFederation);
    }

    /**
     * Creates a InternalDomainFederation with a new object
     *
     * @param newInternalDomainFederation the object to create/update
     * @return the created InternalDomainFederation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InternalDomainFederation put(@Nonnull final InternalDomainFederation newInternalDomainFederation) throws ClientException {
        return send(HttpMethod.PUT, newInternalDomainFederation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public InternalDomainFederationRequest select(@Nonnull final String value) {
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
     public InternalDomainFederationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

