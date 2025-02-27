// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuthorizationPolicy;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.DefaultUserRoleOverrideCollectionRequestBuilder;
import com.microsoft.graph.requests.DefaultUserRoleOverrideRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authorization Policy Request.
 */
public class AuthorizationPolicyRequest extends BaseRequest<AuthorizationPolicy> {
	
    /**
     * The request for the AuthorizationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthorizationPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthorizationPolicy.class);
    }

    /**
     * Gets the AuthorizationPolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthorizationPolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AuthorizationPolicy from the service
     *
     * @return the AuthorizationPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthorizationPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthorizationPolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AuthorizationPolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuthorizationPolicy with a source
     *
     * @param sourceAuthorizationPolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthorizationPolicy> patchAsync(@Nonnull final AuthorizationPolicy sourceAuthorizationPolicy) {
        return sendAsync(HttpMethod.PATCH, sourceAuthorizationPolicy);
    }

    /**
     * Patches this AuthorizationPolicy with a source
     *
     * @param sourceAuthorizationPolicy the source object with updates
     * @return the updated AuthorizationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthorizationPolicy patch(@Nonnull final AuthorizationPolicy sourceAuthorizationPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthorizationPolicy);
    }

    /**
     * Creates a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthorizationPolicy> postAsync(@Nonnull final AuthorizationPolicy newAuthorizationPolicy) {
        return sendAsync(HttpMethod.POST, newAuthorizationPolicy);
    }

    /**
     * Creates a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the new object to create
     * @return the created AuthorizationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthorizationPolicy post(@Nonnull final AuthorizationPolicy newAuthorizationPolicy) throws ClientException {
        return send(HttpMethod.POST, newAuthorizationPolicy);
    }

    /**
     * Creates a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthorizationPolicy> putAsync(@Nonnull final AuthorizationPolicy newAuthorizationPolicy) {
        return sendAsync(HttpMethod.PUT, newAuthorizationPolicy);
    }

    /**
     * Creates a AuthorizationPolicy with a new object
     *
     * @param newAuthorizationPolicy the object to create/update
     * @return the created AuthorizationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthorizationPolicy put(@Nonnull final AuthorizationPolicy newAuthorizationPolicy) throws ClientException {
        return send(HttpMethod.PUT, newAuthorizationPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AuthorizationPolicyRequest select(@Nonnull final String value) {
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
     public AuthorizationPolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

