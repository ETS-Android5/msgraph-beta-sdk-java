// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserScopeTeamsAppInstallation;
import com.microsoft.graph.requests.UserScopeTeamsAppInstallationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserScopeTeamsAppInstallationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Collection Page.
 */
public class UserScopeTeamsAppInstallationCollectionPage extends BaseCollectionPage<UserScopeTeamsAppInstallation, UserScopeTeamsAppInstallationCollectionRequestBuilder> {

    /**
     * A collection page for UserScopeTeamsAppInstallation
     *
     * @param response the serialized UserScopeTeamsAppInstallationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserScopeTeamsAppInstallationCollectionPage(@Nonnull final UserScopeTeamsAppInstallationCollectionResponse response, @Nonnull final UserScopeTeamsAppInstallationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserScopeTeamsAppInstallation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserScopeTeamsAppInstallationCollectionPage(@Nonnull final java.util.List<UserScopeTeamsAppInstallation> pageContents, @Nullable final UserScopeTeamsAppInstallationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
