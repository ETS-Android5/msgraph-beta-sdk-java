// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByTimeSpanCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByTimeSpanCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By Time Span Collection Page.
 */
public class ReportRootGetPrintUsageSummariesByTimeSpanCollectionPage extends BaseCollectionPage<PrintUsageSummary, IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder> implements IReportRootGetPrintUsageSummariesByTimeSpanCollectionPage {

    /**
     * A collection page for PrintUsageSummary.
     *
     * @param response The serialized ReportRootGetPrintUsageSummariesByTimeSpanCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetPrintUsageSummariesByTimeSpanCollectionPage(final ReportRootGetPrintUsageSummariesByTimeSpanCollectionResponse response, final IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
