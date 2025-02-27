// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.Team;
import com.microsoft.graph.models.TeamVisibilityType;
import com.microsoft.graph.models.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.TeamworkActivityTopic;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.KeyValuePair;
import com.microsoft.graph.models.TeamworkNotificationRecipient;
import com.microsoft.graph.models.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.TeamCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TeamCollectionWithReferencesPage;
import com.microsoft.graph.requests.TeamCollectionResponse;
import com.microsoft.graph.models.Team;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Collection With References Page.
 */
public class TeamCollectionWithReferencesPage extends BaseCollectionPage<Team, TeamCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for Team
     *
     * @param response the serialized TeamCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamCollectionWithReferencesPage(@Nonnull final TeamCollectionResponse response, @Nullable final TeamCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for Team
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TeamCollectionWithReferencesPage(@Nonnull final java.util.List<Team> pageContents, @Nullable final TeamCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
