// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AnonymousGuestConversationMember;
import com.microsoft.graph.models.ConversationMember;
import com.microsoft.graph.models.ActionResultPart;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Anonymous Guest Conversation Member Request.
 */
public class AnonymousGuestConversationMemberRequest extends BaseRequest<AnonymousGuestConversationMember> {
	
    /**
     * The request for the AnonymousGuestConversationMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AnonymousGuestConversationMemberRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AnonymousGuestConversationMember.class);
    }

    /**
     * Gets the AnonymousGuestConversationMember from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AnonymousGuestConversationMember> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AnonymousGuestConversationMember from the service
     *
     * @return the AnonymousGuestConversationMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AnonymousGuestConversationMember get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AnonymousGuestConversationMember> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AnonymousGuestConversationMember delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AnonymousGuestConversationMember with a source
     *
     * @param sourceAnonymousGuestConversationMember the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AnonymousGuestConversationMember> patchAsync(@Nonnull final AnonymousGuestConversationMember sourceAnonymousGuestConversationMember) {
        return sendAsync(HttpMethod.PATCH, sourceAnonymousGuestConversationMember);
    }

    /**
     * Patches this AnonymousGuestConversationMember with a source
     *
     * @param sourceAnonymousGuestConversationMember the source object with updates
     * @return the updated AnonymousGuestConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AnonymousGuestConversationMember patch(@Nonnull final AnonymousGuestConversationMember sourceAnonymousGuestConversationMember) throws ClientException {
        return send(HttpMethod.PATCH, sourceAnonymousGuestConversationMember);
    }

    /**
     * Creates a AnonymousGuestConversationMember with a new object
     *
     * @param newAnonymousGuestConversationMember the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AnonymousGuestConversationMember> postAsync(@Nonnull final AnonymousGuestConversationMember newAnonymousGuestConversationMember) {
        return sendAsync(HttpMethod.POST, newAnonymousGuestConversationMember);
    }

    /**
     * Creates a AnonymousGuestConversationMember with a new object
     *
     * @param newAnonymousGuestConversationMember the new object to create
     * @return the created AnonymousGuestConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AnonymousGuestConversationMember post(@Nonnull final AnonymousGuestConversationMember newAnonymousGuestConversationMember) throws ClientException {
        return send(HttpMethod.POST, newAnonymousGuestConversationMember);
    }

    /**
     * Creates a AnonymousGuestConversationMember with a new object
     *
     * @param newAnonymousGuestConversationMember the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AnonymousGuestConversationMember> putAsync(@Nonnull final AnonymousGuestConversationMember newAnonymousGuestConversationMember) {
        return sendAsync(HttpMethod.PUT, newAnonymousGuestConversationMember);
    }

    /**
     * Creates a AnonymousGuestConversationMember with a new object
     *
     * @param newAnonymousGuestConversationMember the object to create/update
     * @return the created AnonymousGuestConversationMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AnonymousGuestConversationMember put(@Nonnull final AnonymousGuestConversationMember newAnonymousGuestConversationMember) throws ClientException {
        return send(HttpMethod.PUT, newAnonymousGuestConversationMember);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AnonymousGuestConversationMemberRequest select(@Nonnull final String value) {
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
     public AnonymousGuestConversationMemberRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

