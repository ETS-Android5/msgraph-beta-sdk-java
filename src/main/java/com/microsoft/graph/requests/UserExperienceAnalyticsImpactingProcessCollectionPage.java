// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsImpactingProcess;
import com.microsoft.graph.requests.UserExperienceAnalyticsImpactingProcessCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsImpactingProcessCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Impacting Process Collection Page.
 */
public class UserExperienceAnalyticsImpactingProcessCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsImpactingProcess, UserExperienceAnalyticsImpactingProcessCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsImpactingProcess
     *
     * @param response the serialized UserExperienceAnalyticsImpactingProcessCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsImpactingProcessCollectionPage(@Nonnull final UserExperienceAnalyticsImpactingProcessCollectionResponse response, @Nonnull final UserExperienceAnalyticsImpactingProcessCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsImpactingProcess
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsImpactingProcessCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsImpactingProcess> pageContents, @Nullable final UserExperienceAnalyticsImpactingProcessCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
