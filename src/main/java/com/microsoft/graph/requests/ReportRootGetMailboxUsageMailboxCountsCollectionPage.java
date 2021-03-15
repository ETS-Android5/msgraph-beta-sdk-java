// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MailboxUsageMailboxCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetMailboxUsageMailboxCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetMailboxUsageMailboxCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Mailbox Counts Collection Page.
 */
public class ReportRootGetMailboxUsageMailboxCountsCollectionPage extends BaseCollectionPage<MailboxUsageMailboxCounts, ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder> {

    /**
     * A collection page for MailboxUsageMailboxCounts.
     *
     * @param response The serialized ReportRootGetMailboxUsageMailboxCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetMailboxUsageMailboxCountsCollectionPage(@Nonnull final ReportRootGetMailboxUsageMailboxCountsCollectionResponse response, @Nonnull final ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetMailboxUsageMailboxCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetMailboxUsageMailboxCountsCollectionPage(@Nonnull final java.util.List<MailboxUsageMailboxCounts> pageContents, @Nullable final ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
