// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ConversationThread;
import com.microsoft.graph.requests.ConversationThreadReplyRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.ConversationThreadReplyParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread Reply Request.
 */
public class ConversationThreadReplyRequest extends BaseRequest<Void> {
    /**
     * The request for this ConversationThreadReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationThreadReplyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
    }

	/** The body for the method */
    @Nullable
    public ConversationThreadReplyParameterSet body;
    /**
     * Creates the ConversationThreadReply
     *
     * @return a future for the operation
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Void> postAsync() {
        return this.sendAsync(HttpMethod.POST, body);
    }

    /**
     * Creates the ConversationThreadReply
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public void post() throws ClientException {
        this.send(HttpMethod.POST, body);
    }
}
