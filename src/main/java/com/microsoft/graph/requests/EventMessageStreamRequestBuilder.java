// Template Source: BaseEntityStreamRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EventMessage;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.requests.EventRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.io.InputStream;
import com.microsoft.graph.models.MessageForwardParameterSet;
import com.microsoft.graph.models.MessageCopyParameterSet;
import com.microsoft.graph.models.MessageMoveParameterSet;
import com.microsoft.graph.models.MessageCreateForwardParameterSet;
import com.microsoft.graph.models.MessageCreateReplyParameterSet;
import com.microsoft.graph.models.MessageCreateReplyAllParameterSet;
import com.microsoft.graph.models.MessageReplyParameterSet;
import com.microsoft.graph.models.MessageReplyAllParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Stream Request Builder.
 */
public class EventMessageStreamRequestBuilder extends BaseRequestBuilder<InputStream> {

    /**
     * The request builder for the EventMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageStreamRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EventMessageStreamRequest instance
     */
    @Nonnull
    public EventMessageStreamRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the EventMessageStreamRequest instance
     */
    @Nonnull
    public EventMessageStreamRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new EventMessageStreamRequest(getRequestUrl(), getClient(), requestOptions);
    }

    /**
     * Gets the request builder for Event
     *
     * @return the EventRequestBuilder
     */
    @Nonnull
    public EventRequestBuilder event() {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("event"), getClient(), null);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageForwardRequestBuilder forward(@Nonnull final MessageForwardParameterSet parameters) {
        return new MessageForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.forward"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageCopyRequestBuilder copy(@Nonnull final MessageCopyParameterSet parameters) {
        return new MessageCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copy"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageMoveRequestBuilder move(@Nonnull final MessageMoveParameterSet parameters) {
        return new MessageMoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.move"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageCreateForwardRequestBuilder createForward(@Nonnull final MessageCreateForwardParameterSet parameters) {
        return new MessageCreateForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createForward"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageCreateReplyRequestBuilder createReply(@Nonnull final MessageCreateReplyParameterSet parameters) {
        return new MessageCreateReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createReply"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageCreateReplyAllRequestBuilder createReplyAll(@Nonnull final MessageCreateReplyAllParameterSet parameters) {
        return new MessageCreateReplyAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createReplyAll"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageReplyRequestBuilder reply(@Nonnull final MessageReplyParameterSet parameters) {
        return new MessageReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reply"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MessageReplyAllRequestBuilder replyAll(@Nonnull final MessageReplyAllParameterSet parameters) {
        return new MessageReplyAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.replyAll"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public MessageSendRequestBuilder send() {
        return new MessageSendRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.send"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public MessageUnsubscribeRequestBuilder unsubscribe() {
        return new MessageUnsubscribeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unsubscribe"), getClient(), null);
    }
}
