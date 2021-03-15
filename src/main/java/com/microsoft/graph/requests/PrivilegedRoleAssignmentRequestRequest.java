// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.requests.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Request.
 */
public class PrivilegedRoleAssignmentRequestRequest extends BaseRequest<PrivilegedRoleAssignmentRequest> {
	
    /**
     * The request for the PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentRequest.class);
    }

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignmentRequest> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @return the PrivilegedRoleAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignmentRequest> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignmentRequest> patchAsync(@Nonnull final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) {
        return sendAsync(HttpMethod.PATCH, sourcePrivilegedRoleAssignmentRequest);
    }

    /**
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @return the updated PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest patch(@Nonnull final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignmentRequest> postAsync(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) {
        return sendAsync(HttpMethod.POST, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest post(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrivilegedRoleAssignmentRequest> putAsync(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) {
        return sendAsync(HttpMethod.PUT, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Creates a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrivilegedRoleAssignmentRequest put(@Nonnull final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrivilegedRoleAssignmentRequestRequest select(@Nonnull final String value) {
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
     public PrivilegedRoleAssignmentRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

