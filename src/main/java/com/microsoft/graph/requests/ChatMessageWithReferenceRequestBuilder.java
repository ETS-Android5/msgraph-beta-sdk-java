// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.requests.ChatMessageHostedContentCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatMessageHostedContentRequestBuilder;
import com.microsoft.graph.requests.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message With Reference Request Builder.
 */
public class ChatMessageWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<ChatMessage, ChatMessageWithReferenceRequest, ChatMessageReferenceRequestBuilder> {

    /**
     * The request builder for the ChatMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatMessageWithReferenceRequest.class, ChatMessageReferenceRequestBuilder.class);
    }
}
