// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceStartupHistory;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Startup History Collection Page.
 */
public class UserExperienceAnalyticsDeviceStartupHistoryCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsDeviceStartupHistory, UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsDeviceStartupHistory
     *
     * @param response the serialized UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionPage(@Nonnull final UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse response, @Nonnull final UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsDeviceStartupHistory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsDeviceStartupHistory> pageContents, @Nullable final UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
