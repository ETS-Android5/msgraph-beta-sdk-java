// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OutboundSharedUserProfile;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.TenantReferenceCollectionRequestBuilder;
import com.microsoft.graph.requests.TenantReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outbound Shared User Profile Request.
 */
public class OutboundSharedUserProfileRequest extends BaseRequest<OutboundSharedUserProfile> {
	
    /**
     * The request for the OutboundSharedUserProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutboundSharedUserProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutboundSharedUserProfile.class);
    }

    /**
     * Gets the OutboundSharedUserProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutboundSharedUserProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OutboundSharedUserProfile from the service
     *
     * @return the OutboundSharedUserProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutboundSharedUserProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutboundSharedUserProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OutboundSharedUserProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OutboundSharedUserProfile with a source
     *
     * @param sourceOutboundSharedUserProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutboundSharedUserProfile> patchAsync(@Nonnull final OutboundSharedUserProfile sourceOutboundSharedUserProfile) {
        return sendAsync(HttpMethod.PATCH, sourceOutboundSharedUserProfile);
    }

    /**
     * Patches this OutboundSharedUserProfile with a source
     *
     * @param sourceOutboundSharedUserProfile the source object with updates
     * @return the updated OutboundSharedUserProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutboundSharedUserProfile patch(@Nonnull final OutboundSharedUserProfile sourceOutboundSharedUserProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutboundSharedUserProfile);
    }

    /**
     * Creates a OutboundSharedUserProfile with a new object
     *
     * @param newOutboundSharedUserProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutboundSharedUserProfile> postAsync(@Nonnull final OutboundSharedUserProfile newOutboundSharedUserProfile) {
        return sendAsync(HttpMethod.POST, newOutboundSharedUserProfile);
    }

    /**
     * Creates a OutboundSharedUserProfile with a new object
     *
     * @param newOutboundSharedUserProfile the new object to create
     * @return the created OutboundSharedUserProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutboundSharedUserProfile post(@Nonnull final OutboundSharedUserProfile newOutboundSharedUserProfile) throws ClientException {
        return send(HttpMethod.POST, newOutboundSharedUserProfile);
    }

    /**
     * Creates a OutboundSharedUserProfile with a new object
     *
     * @param newOutboundSharedUserProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutboundSharedUserProfile> putAsync(@Nonnull final OutboundSharedUserProfile newOutboundSharedUserProfile) {
        return sendAsync(HttpMethod.PUT, newOutboundSharedUserProfile);
    }

    /**
     * Creates a OutboundSharedUserProfile with a new object
     *
     * @param newOutboundSharedUserProfile the object to create/update
     * @return the created OutboundSharedUserProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutboundSharedUserProfile put(@Nonnull final OutboundSharedUserProfile newOutboundSharedUserProfile) throws ClientException {
        return send(HttpMethod.PUT, newOutboundSharedUserProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OutboundSharedUserProfileRequest select(@Nonnull final String value) {
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
     public OutboundSharedUserProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

