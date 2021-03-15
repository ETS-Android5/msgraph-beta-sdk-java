// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ActivityStatistics;
import com.microsoft.graph.requests.ActivityStatisticsCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ActivityStatisticsCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Statistics Collection Page.
 */
public class ActivityStatisticsCollectionPage extends BaseCollectionPage<ActivityStatistics, ActivityStatisticsCollectionRequestBuilder> {

    /**
     * A collection page for ActivityStatistics
     *
     * @param response the serialized ActivityStatisticsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ActivityStatisticsCollectionPage(@Nonnull final ActivityStatisticsCollectionResponse response, @Nonnull final ActivityStatisticsCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ActivityStatistics
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ActivityStatisticsCollectionPage(@Nonnull final java.util.List<ActivityStatistics> pageContents, @Nullable final ActivityStatisticsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
