// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365ActivationsUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserCountsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetOffice365ActivationsUserCountsCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activations User Counts Collection Request Builder.
 */
public class ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Office365ActivationsUserCounts, ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder, ReportRootGetOffice365ActivationsUserCountsCollectionResponse, ReportRootGetOffice365ActivationsUserCountsCollectionPage, ReportRootGetOffice365ActivationsUserCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365ActivationsUserCountsCollectionRequestBuilder.class, ReportRootGetOffice365ActivationsUserCountsCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetOffice365ActivationsUserCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetOffice365ActivationsUserCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365ActivationsUserCountsCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
