// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequest;
import com.microsoft.graph.requests.extensions.IChatAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Collection Request Builder.
 */
public class ChatCollectionRequestBuilder extends BaseRequestBuilder implements IChatCollectionRequestBuilder {

    /**
     * The request builder for this collection of Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IChatCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IChatCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ChatCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IChatRequestBuilder byId(final String id) {
        return new ChatRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IChatAllMessagesCollectionRequestBuilder allMessages() {
        return new ChatAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.allMessages"), getClient(), null);
    }
}
