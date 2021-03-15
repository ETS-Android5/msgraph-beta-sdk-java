// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365ActiveUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365ActiveUserCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOffice365ActiveUserCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Active User Counts Collection Page.
 */
public class ReportRootGetOffice365ActiveUserCountsCollectionPage extends BaseCollectionPage<Office365ActiveUserCounts, ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder> {

    /**
     * A collection page for Office365ActiveUserCounts.
     *
     * @param response The serialized ReportRootGetOffice365ActiveUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365ActiveUserCountsCollectionPage(@Nonnull final ReportRootGetOffice365ActiveUserCountsCollectionResponse response, @Nonnull final ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOffice365ActiveUserCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOffice365ActiveUserCountsCollectionPage(@Nonnull final java.util.List<Office365ActiveUserCounts> pageContents, @Nullable final ReportRootGetOffice365ActiveUserCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
