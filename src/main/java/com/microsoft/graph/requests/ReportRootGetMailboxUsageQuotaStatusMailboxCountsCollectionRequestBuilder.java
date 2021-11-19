// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MailboxUsageQuotaStatusMailboxCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionResponse;
import com.microsoft.graph.models.ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Quota Status Mailbox Counts Collection Request Builder.
 */
public class ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<MailboxUsageQuotaStatusMailboxCounts, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionResponse, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionPage, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder.class, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequestBuilder.class, ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetMailboxUsageQuotaStatusMailboxCountsCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
