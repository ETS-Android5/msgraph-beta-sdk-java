// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.externalconnectors.models.ExternalGroup;
import com.microsoft.graph.externalconnectors.requests.ExternalGroupMemberCollectionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalGroupMemberRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Group Request.
 */
public class ExternalGroupRequest extends BaseRequest<ExternalGroup> {
	
    /**
     * The request for the ExternalGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalGroupRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExternalGroup.class);
    }

    /**
     * Gets the ExternalGroup from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalGroup> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ExternalGroup from the service
     *
     * @return the ExternalGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalGroup> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ExternalGroup delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExternalGroup with a source
     *
     * @param sourceExternalGroup the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalGroup> patchAsync(@Nonnull final ExternalGroup sourceExternalGroup) {
        return sendAsync(HttpMethod.PATCH, sourceExternalGroup);
    }

    /**
     * Patches this ExternalGroup with a source
     *
     * @param sourceExternalGroup the source object with updates
     * @return the updated ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalGroup patch(@Nonnull final ExternalGroup sourceExternalGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceExternalGroup);
    }

    /**
     * Creates a ExternalGroup with a new object
     *
     * @param newExternalGroup the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalGroup> postAsync(@Nonnull final ExternalGroup newExternalGroup) {
        return sendAsync(HttpMethod.POST, newExternalGroup);
    }

    /**
     * Creates a ExternalGroup with a new object
     *
     * @param newExternalGroup the new object to create
     * @return the created ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalGroup post(@Nonnull final ExternalGroup newExternalGroup) throws ClientException {
        return send(HttpMethod.POST, newExternalGroup);
    }

    /**
     * Creates a ExternalGroup with a new object
     *
     * @param newExternalGroup the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalGroup> putAsync(@Nonnull final ExternalGroup newExternalGroup) {
        return sendAsync(HttpMethod.PUT, newExternalGroup);
    }

    /**
     * Creates a ExternalGroup with a new object
     *
     * @param newExternalGroup the object to create/update
     * @return the created ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExternalGroup put(@Nonnull final ExternalGroup newExternalGroup) throws ClientException {
        return send(HttpMethod.PUT, newExternalGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExternalGroupRequest select(@Nonnull final String value) {
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
     public ExternalGroupRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

