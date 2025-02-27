// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Channel;
import com.microsoft.graph.models.ProvisionChannelEmailResult;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.requests.DriveItemRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatMessageRequestBuilder;
import com.microsoft.graph.requests.SharedWithChannelTeamInfoCollectionRequestBuilder;
import com.microsoft.graph.requests.SharedWithChannelTeamInfoRequestBuilder;
import com.microsoft.graph.requests.TeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsTabRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Request.
 */
public class ChannelRequest extends BaseRequest<Channel> {
	
    /**
     * The request for the Channel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Channel.class);
    }

    /**
     * Gets the Channel from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Channel> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Channel from the service
     *
     * @return the Channel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Channel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Channel> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Channel delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Channel with a source
     *
     * @param sourceChannel the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Channel> patchAsync(@Nonnull final Channel sourceChannel) {
        return sendAsync(HttpMethod.PATCH, sourceChannel);
    }

    /**
     * Patches this Channel with a source
     *
     * @param sourceChannel the source object with updates
     * @return the updated Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Channel patch(@Nonnull final Channel sourceChannel) throws ClientException {
        return send(HttpMethod.PATCH, sourceChannel);
    }

    /**
     * Creates a Channel with a new object
     *
     * @param newChannel the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Channel> postAsync(@Nonnull final Channel newChannel) {
        return sendAsync(HttpMethod.POST, newChannel);
    }

    /**
     * Creates a Channel with a new object
     *
     * @param newChannel the new object to create
     * @return the created Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Channel post(@Nonnull final Channel newChannel) throws ClientException {
        return send(HttpMethod.POST, newChannel);
    }

    /**
     * Creates a Channel with a new object
     *
     * @param newChannel the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Channel> putAsync(@Nonnull final Channel newChannel) {
        return sendAsync(HttpMethod.PUT, newChannel);
    }

    /**
     * Creates a Channel with a new object
     *
     * @param newChannel the object to create/update
     * @return the created Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Channel put(@Nonnull final Channel newChannel) throws ClientException {
        return send(HttpMethod.PUT, newChannel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ChannelRequest select(@Nonnull final String value) {
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
     public ChannelRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

