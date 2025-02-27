// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TaxGroup;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tax Group Request.
 */
public class TaxGroupRequest extends BaseRequest<TaxGroup> {
	
    /**
     * The request for the TaxGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TaxGroupRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TaxGroup.class);
    }

    /**
     * Gets the TaxGroup from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaxGroup> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TaxGroup from the service
     *
     * @return the TaxGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaxGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaxGroup> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TaxGroup delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TaxGroup with a source
     *
     * @param sourceTaxGroup the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaxGroup> patchAsync(@Nonnull final TaxGroup sourceTaxGroup) {
        return sendAsync(HttpMethod.PATCH, sourceTaxGroup);
    }

    /**
     * Patches this TaxGroup with a source
     *
     * @param sourceTaxGroup the source object with updates
     * @return the updated TaxGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaxGroup patch(@Nonnull final TaxGroup sourceTaxGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceTaxGroup);
    }

    /**
     * Creates a TaxGroup with a new object
     *
     * @param newTaxGroup the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaxGroup> postAsync(@Nonnull final TaxGroup newTaxGroup) {
        return sendAsync(HttpMethod.POST, newTaxGroup);
    }

    /**
     * Creates a TaxGroup with a new object
     *
     * @param newTaxGroup the new object to create
     * @return the created TaxGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaxGroup post(@Nonnull final TaxGroup newTaxGroup) throws ClientException {
        return send(HttpMethod.POST, newTaxGroup);
    }

    /**
     * Creates a TaxGroup with a new object
     *
     * @param newTaxGroup the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TaxGroup> putAsync(@Nonnull final TaxGroup newTaxGroup) {
        return sendAsync(HttpMethod.PUT, newTaxGroup);
    }

    /**
     * Creates a TaxGroup with a new object
     *
     * @param newTaxGroup the object to create/update
     * @return the created TaxGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TaxGroup put(@Nonnull final TaxGroup newTaxGroup) throws ClientException {
        return send(HttpMethod.PUT, newTaxGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TaxGroupRequest select(@Nonnull final String value) {
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
     public TaxGroupRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

