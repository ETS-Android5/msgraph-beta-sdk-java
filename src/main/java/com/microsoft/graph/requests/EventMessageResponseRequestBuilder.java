// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EventMessageResponse;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Message;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
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
 * The class for the Event Message Response Request Builder.
 */
public class EventMessageResponseRequestBuilder extends BaseRequestBuilder<EventMessageResponse> {

    /**
     * The request builder for the EventMessageResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageResponseRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EventMessageResponseRequest instance
     */
    @Nonnull
    public EventMessageResponseRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EventMessageResponseRequest instance
     */
    @Nonnull
    public EventMessageResponseRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EventMessageResponseRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Attachment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AttachmentCollectionRequestBuilder attachments() {
        return new AttachmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("attachments"), getClient(), null);
    }

    /**
     * Gets a request builder for the Attachment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AttachmentRequestBuilder attachments(@Nonnull final String id) {
        return new AttachmentRequestBuilder(getRequestUrlWithAdditionalSegment("attachments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Extension collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Extension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExtensionRequestBuilder extensions(@Nonnull final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Mention collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MentionCollectionRequestBuilder mentions() {
        return new MentionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mentions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Mention item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MentionRequestBuilder mentions(@Nonnull final String id) {
        return new MentionRequestBuilder(getRequestUrlWithAdditionalSegment("mentions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MultiValueLegacyExtendedProperty collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    /**
     * Gets a request builder for the MultiValueLegacyExtendedProperty item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(@Nonnull final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SingleValueLegacyExtendedProperty collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    /**
     * Gets a request builder for the SingleValueLegacyExtendedProperty item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(@Nonnull final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Event
     *
     * @return the EventRequestBuilder instance
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
