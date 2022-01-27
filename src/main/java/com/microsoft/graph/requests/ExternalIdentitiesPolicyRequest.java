// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ExternalIdentitiesPolicy;
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
 * The class for the External Identities Policy Request.
 */
public class ExternalIdentitiesPolicyRequest extends BaseRequest<ExternalIdentitiesPolicy> {
	
    /**
     * The request for the ExternalIdentitiesPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalIdentitiesPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExternalIdentitiesPolicy.class);
    }

    /**
     * Gets the ExternalIdentitiesPolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalIdentitiesPolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ExternalIdentitiesPolicy from the service
     *
     * @return the ExternalIdentitiesPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalIdentitiesPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalIdentitiesPolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ExternalIdentitiesPolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExternalIdentitiesPolicy with a source
     *
     * @param sourceExternalIdentitiesPolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalIdentitiesPolicy> patchAsync(@Nonnull final ExternalIdentitiesPolicy sourceExternalIdentitiesPolicy) {
        return sendAsync(HttpMethod.PATCH, sourceExternalIdentitiesPolicy);
    }

    /**
     * Patches this ExternalIdentitiesPolicy with a source
     *
     * @param sourceExternalIdentitiesPolicy the source object with updates
     * @return the updated ExternalIdentitiesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalIdentitiesPolicy patch(@Nonnull final ExternalIdentitiesPolicy sourceExternalIdentitiesPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceExternalIdentitiesPolicy);
    }

    /**
     * Creates a ExternalIdentitiesPolicy with a new object
     *
     * @param newExternalIdentitiesPolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalIdentitiesPolicy> postAsync(@Nonnull final ExternalIdentitiesPolicy newExternalIdentitiesPolicy) {
        return sendAsync(HttpMethod.POST, newExternalIdentitiesPolicy);
    }

    /**
     * Creates a ExternalIdentitiesPolicy with a new object
     *
     * @param newExternalIdentitiesPolicy the new object to create
     * @return the created ExternalIdentitiesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalIdentitiesPolicy post(@Nonnull final ExternalIdentitiesPolicy newExternalIdentitiesPolicy) throws ClientException {
        return send(HttpMethod.POST, newExternalIdentitiesPolicy);
    }

    /**
     * Creates a ExternalIdentitiesPolicy with a new object
     *
     * @param newExternalIdentitiesPolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalIdentitiesPolicy> putAsync(@Nonnull final ExternalIdentitiesPolicy newExternalIdentitiesPolicy) {
        return sendAsync(HttpMethod.PUT, newExternalIdentitiesPolicy);
    }

    /**
     * Creates a ExternalIdentitiesPolicy with a new object
     *
     * @param newExternalIdentitiesPolicy the object to create/update
     * @return the created ExternalIdentitiesPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalIdentitiesPolicy put(@Nonnull final ExternalIdentitiesPolicy newExternalIdentitiesPolicy) throws ClientException {
        return send(HttpMethod.PUT, newExternalIdentitiesPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExternalIdentitiesPolicyRequest select(@Nonnull final String value) {
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
     public ExternalIdentitiesPolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

