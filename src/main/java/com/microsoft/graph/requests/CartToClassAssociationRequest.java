// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CartToClassAssociation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cart To Class Association Request.
 */
public class CartToClassAssociationRequest extends BaseRequest<CartToClassAssociation> {
	
    /**
     * The request for the CartToClassAssociation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CartToClassAssociationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CartToClassAssociation.class);
    }

    /**
     * Gets the CartToClassAssociation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CartToClassAssociation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CartToClassAssociation from the service
     *
     * @return the CartToClassAssociation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CartToClassAssociation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CartToClassAssociation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CartToClassAssociation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CartToClassAssociation with a source
     *
     * @param sourceCartToClassAssociation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CartToClassAssociation> patchAsync(@Nonnull final CartToClassAssociation sourceCartToClassAssociation) {
        return sendAsync(HttpMethod.PATCH, sourceCartToClassAssociation);
    }

    /**
     * Patches this CartToClassAssociation with a source
     *
     * @param sourceCartToClassAssociation the source object with updates
     * @return the updated CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CartToClassAssociation patch(@Nonnull final CartToClassAssociation sourceCartToClassAssociation) throws ClientException {
        return send(HttpMethod.PATCH, sourceCartToClassAssociation);
    }

    /**
     * Creates a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CartToClassAssociation> postAsync(@Nonnull final CartToClassAssociation newCartToClassAssociation) {
        return sendAsync(HttpMethod.POST, newCartToClassAssociation);
    }

    /**
     * Creates a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the new object to create
     * @return the created CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CartToClassAssociation post(@Nonnull final CartToClassAssociation newCartToClassAssociation) throws ClientException {
        return send(HttpMethod.POST, newCartToClassAssociation);
    }

    /**
     * Creates a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CartToClassAssociation> putAsync(@Nonnull final CartToClassAssociation newCartToClassAssociation) {
        return sendAsync(HttpMethod.PUT, newCartToClassAssociation);
    }

    /**
     * Creates a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the object to create/update
     * @return the created CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CartToClassAssociation put(@Nonnull final CartToClassAssociation newCartToClassAssociation) throws ClientException {
        return send(HttpMethod.PUT, newCartToClassAssociation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CartToClassAssociationRequest select(@Nonnull final String value) {
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
     public CartToClassAssociationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

