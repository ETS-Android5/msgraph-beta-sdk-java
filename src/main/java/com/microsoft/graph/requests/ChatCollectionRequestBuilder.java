// Template Source: BaseEntityCollectionRequestBuilder.java.tt
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
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatRequestBuilder;
import com.microsoft.graph.requests.ChatCollectionRequest;
import com.microsoft.graph.requests.ChatAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.ChatSendActivityNotificationParameterSet;
import com.microsoft.graph.models.ChatHideForUserParameterSet;
import com.microsoft.graph.models.ChatMarkChatReadForUserParameterSet;
import com.microsoft.graph.models.ChatMarkChatUnreadForUserParameterSet;
import com.microsoft.graph.models.ChatUnhideForUserParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Collection Request Builder.
 */
public class ChatCollectionRequestBuilder extends BaseCollectionRequestBuilder<Chat, ChatRequestBuilder, ChatCollectionResponse, ChatCollectionPage, ChatCollectionRequest> {

    /**
     * The request builder for this collection of Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatRequestBuilder.class, ChatCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ChatAllMessagesCollectionRequestBuilder allMessages() {
        return new ChatAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.allMessages"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ChatGetAllMessagesCollectionRequestBuilder getAllMessages() {
        return new ChatGetAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAllMessages"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
