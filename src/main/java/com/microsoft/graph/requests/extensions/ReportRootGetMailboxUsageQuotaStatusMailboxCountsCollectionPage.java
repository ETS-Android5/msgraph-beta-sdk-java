// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailboxUsageQuotaStatusMailboxCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Quota Status Mailbox Counts Collection Page.
 */
public class ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionPage extends BaseCollectionPage<MailboxUsageQuotaStatusMailboxCounts, IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder> implements IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionPage {

    /**
     * A collection page for MailboxUsageQuotaStatusMailboxCounts.
     *
     * @param response The serialized ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionPage(final ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionResponse response, final IReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
