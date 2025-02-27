// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TenantRelationshipAccessPolicyBase;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Relationship Access Policy Base Request.
 */
public class TenantRelationshipAccessPolicyBaseRequest extends BaseRequest<TenantRelationshipAccessPolicyBase> {
	
    /**
     * The request for the TenantRelationshipAccessPolicyBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public TenantRelationshipAccessPolicyBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends TenantRelationshipAccessPolicyBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the TenantRelationshipAccessPolicyBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TenantRelationshipAccessPolicyBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TenantRelationshipAccessPolicyBase.class);
    }

    /**
     * Gets the TenantRelationshipAccessPolicyBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationshipAccessPolicyBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TenantRelationshipAccessPolicyBase from the service
     *
     * @return the TenantRelationshipAccessPolicyBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantRelationshipAccessPolicyBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationshipAccessPolicyBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TenantRelationshipAccessPolicyBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TenantRelationshipAccessPolicyBase with a source
     *
     * @param sourceTenantRelationshipAccessPolicyBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationshipAccessPolicyBase> patchAsync(@Nonnull final TenantRelationshipAccessPolicyBase sourceTenantRelationshipAccessPolicyBase) {
        return sendAsync(HttpMethod.PATCH, sourceTenantRelationshipAccessPolicyBase);
    }

    /**
     * Patches this TenantRelationshipAccessPolicyBase with a source
     *
     * @param sourceTenantRelationshipAccessPolicyBase the source object with updates
     * @return the updated TenantRelationshipAccessPolicyBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantRelationshipAccessPolicyBase patch(@Nonnull final TenantRelationshipAccessPolicyBase sourceTenantRelationshipAccessPolicyBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceTenantRelationshipAccessPolicyBase);
    }

    /**
     * Creates a TenantRelationshipAccessPolicyBase with a new object
     *
     * @param newTenantRelationshipAccessPolicyBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationshipAccessPolicyBase> postAsync(@Nonnull final TenantRelationshipAccessPolicyBase newTenantRelationshipAccessPolicyBase) {
        return sendAsync(HttpMethod.POST, newTenantRelationshipAccessPolicyBase);
    }

    /**
     * Creates a TenantRelationshipAccessPolicyBase with a new object
     *
     * @param newTenantRelationshipAccessPolicyBase the new object to create
     * @return the created TenantRelationshipAccessPolicyBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantRelationshipAccessPolicyBase post(@Nonnull final TenantRelationshipAccessPolicyBase newTenantRelationshipAccessPolicyBase) throws ClientException {
        return send(HttpMethod.POST, newTenantRelationshipAccessPolicyBase);
    }

    /**
     * Creates a TenantRelationshipAccessPolicyBase with a new object
     *
     * @param newTenantRelationshipAccessPolicyBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationshipAccessPolicyBase> putAsync(@Nonnull final TenantRelationshipAccessPolicyBase newTenantRelationshipAccessPolicyBase) {
        return sendAsync(HttpMethod.PUT, newTenantRelationshipAccessPolicyBase);
    }

    /**
     * Creates a TenantRelationshipAccessPolicyBase with a new object
     *
     * @param newTenantRelationshipAccessPolicyBase the object to create/update
     * @return the created TenantRelationshipAccessPolicyBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TenantRelationshipAccessPolicyBase put(@Nonnull final TenantRelationshipAccessPolicyBase newTenantRelationshipAccessPolicyBase) throws ClientException {
        return send(HttpMethod.PUT, newTenantRelationshipAccessPolicyBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TenantRelationshipAccessPolicyBaseRequest select(@Nonnull final String value) {
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
     public TenantRelationshipAccessPolicyBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

