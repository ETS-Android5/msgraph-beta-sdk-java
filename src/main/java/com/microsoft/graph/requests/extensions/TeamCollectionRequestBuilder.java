// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequest;
import com.microsoft.graph.requests.extensions.ITeamAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Collection Request Builder.
 */
public class TeamCollectionRequestBuilder extends BaseRequestBuilder implements ITeamCollectionRequestBuilder {

    /**
     * The request builder for this collection of Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITeamCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITeamCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TeamCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITeamRequestBuilder byId(final String id) {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public ITeamAllMessagesCollectionRequestBuilder allMessages() {
        return new TeamAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.allMessages"), getClient(), null);
    }

    public ITeamGetAllMessagesCollectionRequestBuilder getAllMessages() {
        return new TeamGetAllMessagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAllMessages"), getClient(), null);
    }
}
