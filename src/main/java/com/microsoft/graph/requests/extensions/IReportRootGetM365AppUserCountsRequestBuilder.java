// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetM365AppUserCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get M365App User Counts Request Builder.
 */
public interface IReportRootGetM365AppUserCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetM365AppUserCountsRequest
     *
     * @return the IReportRootGetM365AppUserCountsRequest instance
     */
    IReportRootGetM365AppUserCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetM365AppUserCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetM365AppUserCountsRequest instance
     */
    IReportRootGetM365AppUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
