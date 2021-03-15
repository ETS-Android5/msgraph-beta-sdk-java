// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageResourceEnvironment;
import com.microsoft.graph.requests.AccessPackageResourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Environment Request.
 */
public class AccessPackageResourceEnvironmentRequest extends BaseRequest<AccessPackageResourceEnvironment> {
	
    /**
     * The request for the AccessPackageResourceEnvironment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceEnvironmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceEnvironment.class);
    }

    /**
     * Gets the AccessPackageResourceEnvironment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceEnvironment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AccessPackageResourceEnvironment from the service
     *
     * @return the AccessPackageResourceEnvironment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceEnvironment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceEnvironment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AccessPackageResourceEnvironment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessPackageResourceEnvironment with a source
     *
     * @param sourceAccessPackageResourceEnvironment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceEnvironment> patchAsync(@Nonnull final AccessPackageResourceEnvironment sourceAccessPackageResourceEnvironment) {
        return sendAsync(HttpMethod.PATCH, sourceAccessPackageResourceEnvironment);
    }

    /**
     * Patches this AccessPackageResourceEnvironment with a source
     *
     * @param sourceAccessPackageResourceEnvironment the source object with updates
     * @return the updated AccessPackageResourceEnvironment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceEnvironment patch(@Nonnull final AccessPackageResourceEnvironment sourceAccessPackageResourceEnvironment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceEnvironment> postAsync(@Nonnull final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment) {
        return sendAsync(HttpMethod.POST, newAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the new object to create
     * @return the created AccessPackageResourceEnvironment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceEnvironment post(@Nonnull final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceEnvironment> putAsync(@Nonnull final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment) {
        return sendAsync(HttpMethod.PUT, newAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the object to create/update
     * @return the created AccessPackageResourceEnvironment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceEnvironment put(@Nonnull final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageResourceEnvironment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessPackageResourceEnvironmentRequest select(@Nonnull final String value) {
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
     public AccessPackageResourceEnvironmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

