// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TenantAttachRBAC;
import com.microsoft.graph.models.TenantAttachRBACState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Attach RBACRequest.
 */
public class TenantAttachRBACRequest extends BaseRequest<TenantAttachRBAC> {
	
    /**
     * The request for the TenantAttachRBAC
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TenantAttachRBACRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TenantAttachRBAC.class);
    }

    /**
     * Gets the TenantAttachRBAC from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantAttachRBAC> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TenantAttachRBAC from the service
     *
     * @return the TenantAttachRBAC from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantAttachRBAC get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantAttachRBAC> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TenantAttachRBAC delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TenantAttachRBAC with a source
     *
     * @param sourceTenantAttachRBAC the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantAttachRBAC> patchAsync(@Nonnull final TenantAttachRBAC sourceTenantAttachRBAC) {
        return sendAsync(HttpMethod.PATCH, sourceTenantAttachRBAC);
    }

    /**
     * Patches this TenantAttachRBAC with a source
     *
     * @param sourceTenantAttachRBAC the source object with updates
     * @return the updated TenantAttachRBAC
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantAttachRBAC patch(@Nonnull final TenantAttachRBAC sourceTenantAttachRBAC) throws ClientException {
        return send(HttpMethod.PATCH, sourceTenantAttachRBAC);
    }

    /**
     * Creates a TenantAttachRBAC with a new object
     *
     * @param newTenantAttachRBAC the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantAttachRBAC> postAsync(@Nonnull final TenantAttachRBAC newTenantAttachRBAC) {
        return sendAsync(HttpMethod.POST, newTenantAttachRBAC);
    }

    /**
     * Creates a TenantAttachRBAC with a new object
     *
     * @param newTenantAttachRBAC the new object to create
     * @return the created TenantAttachRBAC
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantAttachRBAC post(@Nonnull final TenantAttachRBAC newTenantAttachRBAC) throws ClientException {
        return send(HttpMethod.POST, newTenantAttachRBAC);
    }

    /**
     * Creates a TenantAttachRBAC with a new object
     *
     * @param newTenantAttachRBAC the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantAttachRBAC> putAsync(@Nonnull final TenantAttachRBAC newTenantAttachRBAC) {
        return sendAsync(HttpMethod.PUT, newTenantAttachRBAC);
    }

    /**
     * Creates a TenantAttachRBAC with a new object
     *
     * @param newTenantAttachRBAC the object to create/update
     * @return the created TenantAttachRBAC
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantAttachRBAC put(@Nonnull final TenantAttachRBAC newTenantAttachRBAC) throws ClientException {
        return send(HttpMethod.PUT, newTenantAttachRBAC);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TenantAttachRBACRequest select(@Nonnull final String value) {
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
     public TenantAttachRBACRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

