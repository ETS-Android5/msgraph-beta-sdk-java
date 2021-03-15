// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.YammerGroupsActivityGroupCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetYammerGroupsActivityGroupCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetYammerGroupsActivityGroupCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Groups Activity Group Counts Collection Page.
 */
public class ReportRootGetYammerGroupsActivityGroupCountsCollectionPage extends BaseCollectionPage<YammerGroupsActivityGroupCounts, ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder> {

    /**
     * A collection page for YammerGroupsActivityGroupCounts.
     *
     * @param response The serialized ReportRootGetYammerGroupsActivityGroupCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetYammerGroupsActivityGroupCountsCollectionPage(@Nonnull final ReportRootGetYammerGroupsActivityGroupCountsCollectionResponse response, @Nonnull final ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetYammerGroupsActivityGroupCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetYammerGroupsActivityGroupCountsCollectionPage(@Nonnull final java.util.List<YammerGroupsActivityGroupCounts> pageContents, @Nullable final ReportRootGetYammerGroupsActivityGroupCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
