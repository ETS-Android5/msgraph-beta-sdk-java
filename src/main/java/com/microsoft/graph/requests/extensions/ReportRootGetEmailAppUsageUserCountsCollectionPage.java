// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailAppUsageUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailAppUsageUserCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email App Usage User Counts Collection Page.
 */
public class ReportRootGetEmailAppUsageUserCountsCollectionPage extends BaseCollectionPage<EmailAppUsageUserCounts, IReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder> implements IReportRootGetEmailAppUsageUserCountsCollectionPage {

    /**
     * A collection page for EmailAppUsageUserCounts.
     *
     * @param response The serialized ReportRootGetEmailAppUsageUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetEmailAppUsageUserCountsCollectionPage(final ReportRootGetEmailAppUsageUserCountsCollectionResponse response, final IReportRootGetEmailAppUsageUserCountsCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
