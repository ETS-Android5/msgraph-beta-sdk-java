// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsUserActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetTeamsUserActivityTotalCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetTeamsUserActivityTotalCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetTeamsUserActivityTotalCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams User Activity Total Counts Collection Page.
 */
public class ReportRootGetTeamsUserActivityTotalCountsCollectionPage extends BaseCollectionPage<TeamsUserActivityCounts, ReportRootGetTeamsUserActivityTotalCountsCollectionRequestBuilder> {

    /**
     * A collection page for TeamsUserActivityCounts.
     *
     * @param response The serialized ReportRootGetTeamsUserActivityTotalCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetTeamsUserActivityTotalCountsCollectionPage(@Nonnull final ReportRootGetTeamsUserActivityTotalCountsCollectionResponse response, @Nonnull final ReportRootGetTeamsUserActivityTotalCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetTeamsUserActivityTotalCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetTeamsUserActivityTotalCountsCollectionPage(@Nonnull final java.util.List<TeamsUserActivityCounts> pageContents, @Nullable final ReportRootGetTeamsUserActivityTotalCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
