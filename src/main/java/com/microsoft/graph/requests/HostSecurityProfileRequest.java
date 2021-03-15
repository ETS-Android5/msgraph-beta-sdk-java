// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.HostSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Security Profile Request.
 */
public class HostSecurityProfileRequest extends BaseRequest<HostSecurityProfile> {
	
    /**
     * The request for the HostSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HostSecurityProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HostSecurityProfile.class);
    }

    /**
     * Gets the HostSecurityProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostSecurityProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the HostSecurityProfile from the service
     *
     * @return the HostSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostSecurityProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostSecurityProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public HostSecurityProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this HostSecurityProfile with a source
     *
     * @param sourceHostSecurityProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostSecurityProfile> patchAsync(@Nonnull final HostSecurityProfile sourceHostSecurityProfile) {
        return sendAsync(HttpMethod.PATCH, sourceHostSecurityProfile);
    }

    /**
     * Patches this HostSecurityProfile with a source
     *
     * @param sourceHostSecurityProfile the source object with updates
     * @return the updated HostSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostSecurityProfile patch(@Nonnull final HostSecurityProfile sourceHostSecurityProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceHostSecurityProfile);
    }

    /**
     * Creates a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostSecurityProfile> postAsync(@Nonnull final HostSecurityProfile newHostSecurityProfile) {
        return sendAsync(HttpMethod.POST, newHostSecurityProfile);
    }

    /**
     * Creates a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the new object to create
     * @return the created HostSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostSecurityProfile post(@Nonnull final HostSecurityProfile newHostSecurityProfile) throws ClientException {
        return send(HttpMethod.POST, newHostSecurityProfile);
    }

    /**
     * Creates a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostSecurityProfile> putAsync(@Nonnull final HostSecurityProfile newHostSecurityProfile) {
        return sendAsync(HttpMethod.PUT, newHostSecurityProfile);
    }

    /**
     * Creates a HostSecurityProfile with a new object
     *
     * @param newHostSecurityProfile the object to create/update
     * @return the created HostSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostSecurityProfile put(@Nonnull final HostSecurityProfile newHostSecurityProfile) throws ClientException {
        return send(HttpMethod.PUT, newHostSecurityProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public HostSecurityProfileRequest select(@Nonnull final String value) {
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
     public HostSecurityProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

