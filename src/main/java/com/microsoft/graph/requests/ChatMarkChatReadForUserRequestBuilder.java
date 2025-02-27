// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ChatMarkChatReadForUserRequest;
import com.microsoft.graph.models.Chat;
import com.microsoft.graph.models.TeamworkUserIdentity;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ChatMarkChatReadForUserParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Mark Chat Read For User Request Builder.
 */
public class ChatMarkChatReadForUserRequestBuilder extends BaseActionRequestBuilder<Chat> {

    /**
     * The request builder for this ChatMarkChatReadForUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMarkChatReadForUserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ChatMarkChatReadForUserParameterSet body;
    /**
     * The request builder for this ChatMarkChatReadForUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ChatMarkChatReadForUserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ChatMarkChatReadForUserParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ChatMarkChatReadForUserRequest
     *
     * @param requestOptions the options for the request
     * @return the ChatMarkChatReadForUserRequest instance
     */
    @Nonnull
    public ChatMarkChatReadForUserRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ChatMarkChatReadForUserRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ChatMarkChatReadForUserRequest instance
     */
    @Nonnull
    public ChatMarkChatReadForUserRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ChatMarkChatReadForUserRequest request = new ChatMarkChatReadForUserRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
