// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.requests.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AttachmentRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import com.microsoft.graph.requests.MentionCollectionRequestBuilder;
import com.microsoft.graph.requests.MentionRequestBuilder;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Request.
 */
public class MessageRequest extends BaseRequest<Message> {
	
    /**
     * The request for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MessageRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends Message> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Message
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Message.class);
    }

    /**
     * Gets the Message from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Message> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Message from the service
     *
     * @return the Message from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Message> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Message delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Message> patchAsync(@Nonnull final Message sourceMessage) {
        return sendAsync(HttpMethod.PATCH, sourceMessage);
    }

    /**
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @return the updated Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message patch(@Nonnull final Message sourceMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Message> postAsync(@Nonnull final Message newMessage) {
        return sendAsync(HttpMethod.POST, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the new object to create
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message post(@Nonnull final Message newMessage) throws ClientException {
        return send(HttpMethod.POST, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Message> putAsync(@Nonnull final Message newMessage) {
        return sendAsync(HttpMethod.PUT, newMessage);
    }

    /**
     * Creates a Message with a new object
     *
     * @param newMessage the object to create/update
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Message put(@Nonnull final Message newMessage) throws ClientException {
        return send(HttpMethod.PUT, newMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MessageRequest select(@Nonnull final String value) {
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
     public MessageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

