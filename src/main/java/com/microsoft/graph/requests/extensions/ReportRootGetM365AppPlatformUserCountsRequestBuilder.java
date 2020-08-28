// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetM365AppPlatformUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetM365AppPlatformUserCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get M365App Platform User Counts Request Builder.
 */
public class ReportRootGetM365AppPlatformUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetM365AppPlatformUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetM365AppPlatformUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetM365AppPlatformUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetM365AppPlatformUserCountsRequest
     *
     * @return the IReportRootGetM365AppPlatformUserCountsRequest instance
     */
    public IReportRootGetM365AppPlatformUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetM365AppPlatformUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetM365AppPlatformUserCountsRequest instance
     */
    public IReportRootGetM365AppPlatformUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetM365AppPlatformUserCountsRequest request = new ReportRootGetM365AppPlatformUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
