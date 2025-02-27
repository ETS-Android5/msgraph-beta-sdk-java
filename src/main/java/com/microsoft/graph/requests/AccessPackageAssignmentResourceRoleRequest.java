// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.requests.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.AccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role Request.
 */
public class AccessPackageAssignmentResourceRoleRequest extends BaseRequest<AccessPackageAssignmentResourceRole> {
	
    /**
     * The request for the AccessPackageAssignmentResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentResourceRoleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentResourceRole.class);
    }

    /**
     * Gets the AccessPackageAssignmentResourceRole from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentResourceRole> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AccessPackageAssignmentResourceRole from the service
     *
     * @return the AccessPackageAssignmentResourceRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageAssignmentResourceRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentResourceRole> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AccessPackageAssignmentResourceRole delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessPackageAssignmentResourceRole with a source
     *
     * @param sourceAccessPackageAssignmentResourceRole the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentResourceRole> patchAsync(@Nonnull final AccessPackageAssignmentResourceRole sourceAccessPackageAssignmentResourceRole) {
        return sendAsync(HttpMethod.PATCH, sourceAccessPackageAssignmentResourceRole);
    }

    /**
     * Patches this AccessPackageAssignmentResourceRole with a source
     *
     * @param sourceAccessPackageAssignmentResourceRole the source object with updates
     * @return the updated AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageAssignmentResourceRole patch(@Nonnull final AccessPackageAssignmentResourceRole sourceAccessPackageAssignmentResourceRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageAssignmentResourceRole);
    }

    /**
     * Creates a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentResourceRole> postAsync(@Nonnull final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) {
        return sendAsync(HttpMethod.POST, newAccessPackageAssignmentResourceRole);
    }

    /**
     * Creates a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the new object to create
     * @return the created AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageAssignmentResourceRole post(@Nonnull final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageAssignmentResourceRole);
    }

    /**
     * Creates a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageAssignmentResourceRole> putAsync(@Nonnull final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) {
        return sendAsync(HttpMethod.PUT, newAccessPackageAssignmentResourceRole);
    }

    /**
     * Creates a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the object to create/update
     * @return the created AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageAssignmentResourceRole put(@Nonnull final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageAssignmentResourceRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessPackageAssignmentResourceRoleRequest select(@Nonnull final String value) {
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
     public AccessPackageAssignmentResourceRoleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

