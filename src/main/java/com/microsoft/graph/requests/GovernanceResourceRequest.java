// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GovernanceResource;
import com.microsoft.graph.requests.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource Request.
 */
public class GovernanceResourceRequest extends BaseRequest<GovernanceResource> {
	
    /**
     * The request for the GovernanceResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceResourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceResource.class);
    }

    /**
     * Gets the GovernanceResource from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceResource> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GovernanceResource from the service
     *
     * @return the GovernanceResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GovernanceResource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceResource> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GovernanceResource delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GovernanceResource with a source
     *
     * @param sourceGovernanceResource the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceResource> patchAsync(@Nonnull final GovernanceResource sourceGovernanceResource) {
        return sendAsync(HttpMethod.PATCH, sourceGovernanceResource);
    }

    /**
     * Patches this GovernanceResource with a source
     *
     * @param sourceGovernanceResource the source object with updates
     * @return the updated GovernanceResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GovernanceResource patch(@Nonnull final GovernanceResource sourceGovernanceResource) throws ClientException {
        return send(HttpMethod.PATCH, sourceGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceResource> postAsync(@Nonnull final GovernanceResource newGovernanceResource) {
        return sendAsync(HttpMethod.POST, newGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the new object to create
     * @return the created GovernanceResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GovernanceResource post(@Nonnull final GovernanceResource newGovernanceResource) throws ClientException {
        return send(HttpMethod.POST, newGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GovernanceResource> putAsync(@Nonnull final GovernanceResource newGovernanceResource) {
        return sendAsync(HttpMethod.PUT, newGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the object to create/update
     * @return the created GovernanceResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GovernanceResource put(@Nonnull final GovernanceResource newGovernanceResource) throws ClientException {
        return send(HttpMethod.PUT, newGovernanceResource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GovernanceResourceRequest select(@Nonnull final String value) {
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
     public GovernanceResourceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

