// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EmailAppUsageAppsUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetEmailAppUsageAppsUserCountsCollectionResponse;
import com.microsoft.graph.models.ReportRootGetEmailAppUsageAppsUserCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email App Usage Apps User Counts Collection Request Builder.
 */
public class ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<EmailAppUsageAppsUserCounts, ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder, ReportRootGetEmailAppUsageAppsUserCountsCollectionResponse, ReportRootGetEmailAppUsageAppsUserCountsCollectionPage, ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder.class, ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetEmailAppUsageAppsUserCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetEmailAppUsageAppsUserCountsCollectionRequestBuilder.class, ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetEmailAppUsageAppsUserCountsCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
