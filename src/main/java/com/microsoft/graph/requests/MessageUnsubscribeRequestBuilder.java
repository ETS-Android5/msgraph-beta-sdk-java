// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.MessageUnsubscribeRequest;
import com.microsoft.graph.models.Message;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Unsubscribe Request Builder.
 */
public class MessageUnsubscribeRequestBuilder extends BaseActionRequestBuilder<Message> {

    /**
     * The request builder for this MessageUnsubscribe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageUnsubscribeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the MessageUnsubscribeRequest
     *
     * @param requestOptions the options for the request
     * @return the MessageUnsubscribeRequest instance
     */
    @Nonnull
    public MessageUnsubscribeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MessageUnsubscribeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MessageUnsubscribeRequest instance
     */
    @Nonnull
    public MessageUnsubscribeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MessageUnsubscribeRequest request = new MessageUnsubscribeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
