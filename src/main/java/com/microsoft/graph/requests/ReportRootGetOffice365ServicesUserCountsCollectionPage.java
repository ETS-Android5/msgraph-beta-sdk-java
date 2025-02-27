// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365ServicesUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365ServicesUserCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOffice365ServicesUserCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Services User Counts Collection Page.
 */
public class ReportRootGetOffice365ServicesUserCountsCollectionPage extends BaseCollectionPage<Office365ServicesUserCounts, ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder> {

    /**
     * A collection page for Office365ServicesUserCounts.
     *
     * @param response The serialized ReportRootGetOffice365ServicesUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365ServicesUserCountsCollectionPage(@Nonnull final ReportRootGetOffice365ServicesUserCountsCollectionResponse response, @Nonnull final ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOffice365ServicesUserCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOffice365ServicesUserCountsCollectionPage(@Nonnull final java.util.List<Office365ServicesUserCounts> pageContents, @Nullable final ReportRootGetOffice365ServicesUserCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
