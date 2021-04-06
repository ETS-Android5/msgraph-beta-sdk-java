// Template Source: BaseEntityRequestBuilder.java.tt
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
import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.requests.TeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.ConversationMemberRequestBuilder;
import com.microsoft.graph.requests.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatMessageRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.TeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsTabRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ChatSendActivityNotificationParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Request Builder.
 */
public class ChatRequestBuilder extends BaseRequestBuilder<Chat> {

    /**
     * The request builder for the Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ChatRequest instance
     */
    @Nonnull
    public ChatRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ChatRequest instance
     */
    @Nonnull
    public ChatRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ChatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TeamsAppInstallation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamsAppInstallationCollectionRequestBuilder installedApps() {
        return new TeamsAppInstallationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the TeamsAppInstallation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamsAppInstallationRequestBuilder installedApps(@Nonnull final String id) {
        return new TeamsAppInstallationRequestBuilder(getRequestUrlWithAdditionalSegment("installedApps") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ConversationMember collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConversationMemberCollectionRequestBuilder members() {
        return new ConversationMemberCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConversationMember item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConversationMemberRequestBuilder members(@Nonnull final String id) {
        return new ConversationMemberRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ChatMessage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ChatMessageCollectionRequestBuilder messages() {
        return new ChatMessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    /**
     * Gets a request builder for the ChatMessage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ChatMessageRequestBuilder messages(@Nonnull final String id) {
        return new ChatMessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ResourceSpecificPermissionGrant collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants"), getClient(), null);
    }

    /**
     * Gets a request builder for the ResourceSpecificPermissionGrant item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ResourceSpecificPermissionGrantRequestBuilder permissionGrants(@Nonnull final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getRequestUrlWithAdditionalSegment("permissionGrants") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the TeamsTab collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamsTabCollectionRequestBuilder tabs() {
        return new TeamsTabCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tabs"), getClient(), null);
    }

    /**
     * Gets a request builder for the TeamsTab item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamsTabRequestBuilder tabs(@Nonnull final String id) {
        return new TeamsTabRequestBuilder(getRequestUrlWithAdditionalSegment("tabs") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ChatSendActivityNotificationRequestBuilder sendActivityNotification(@Nonnull final ChatSendActivityNotificationParameterSet parameters) {
        return new ChatSendActivityNotificationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendActivityNotification"), getClient(), null, parameters);
    }
}
