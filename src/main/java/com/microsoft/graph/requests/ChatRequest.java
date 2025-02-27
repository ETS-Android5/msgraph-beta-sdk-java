// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Chat;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.microsoft.graph.models.TeamworkUserIdentity;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.requests.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.ChatMessageInfoRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatMessageRequestBuilder;
import com.microsoft.graph.requests.TeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantRequestBuilder;
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
 * The class for the Chat Request.
 */
public class ChatRequest extends BaseRequest<Chat> {
	
    /**
     * The request for the Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Chat.class);
    }

    /**
     * Gets the Chat from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Chat> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Chat from the service
     *
     * @return the Chat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Chat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Chat> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Chat delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Chat with a source
     *
     * @param sourceChat the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Chat> patchAsync(@Nonnull final Chat sourceChat) {
        return sendAsync(HttpMethod.PATCH, sourceChat);
    }

    /**
     * Patches this Chat with a source
     *
     * @param sourceChat the source object with updates
     * @return the updated Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Chat patch(@Nonnull final Chat sourceChat) throws ClientException {
        return send(HttpMethod.PATCH, sourceChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Chat> postAsync(@Nonnull final Chat newChat) {
        return sendAsync(HttpMethod.POST, newChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the new object to create
     * @return the created Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Chat post(@Nonnull final Chat newChat) throws ClientException {
        return send(HttpMethod.POST, newChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Chat> putAsync(@Nonnull final Chat newChat) {
        return sendAsync(HttpMethod.PUT, newChat);
    }

    /**
     * Creates a Chat with a new object
     *
     * @param newChat the object to create/update
     * @return the created Chat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Chat put(@Nonnull final Chat newChat) throws ClientException {
        return send(HttpMethod.PUT, newChat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ChatRequest select(@Nonnull final String value) {
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
     public ChatRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

