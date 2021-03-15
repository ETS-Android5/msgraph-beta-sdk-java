// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetPrintUsageSummariesByGroupCollectionPage;
import com.microsoft.graph.requests.ReportRootGetPrintUsageSummariesByGroupCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By Group Collection Page.
 */
public class ReportRootGetPrintUsageSummariesByGroupCollectionPage extends BaseCollectionPage<GroupPrintUsageSummary, ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder> {

    /**
     * A collection page for GroupPrintUsageSummary.
     *
     * @param response The serialized ReportRootGetPrintUsageSummariesByGroupCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetPrintUsageSummariesByGroupCollectionPage(@Nonnull final ReportRootGetPrintUsageSummariesByGroupCollectionResponse response, @Nonnull final ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetPrintUsageSummariesByGroup
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetPrintUsageSummariesByGroupCollectionPage(@Nonnull final java.util.List<GroupPrintUsageSummary> pageContents, @Nullable final ReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
