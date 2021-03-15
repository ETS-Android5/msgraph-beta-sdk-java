// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SiteActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOneDriveActivityFileCountsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetOneDriveActivityFileCountsCollectionResponse;
import com.microsoft.graph.models.ReportRootGetOneDriveActivityFileCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Activity File Counts Collection Request Builder.
 */
public class ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<SiteActivitySummary, ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder, ReportRootGetOneDriveActivityFileCountsCollectionResponse, ReportRootGetOneDriveActivityFileCountsCollectionPage, ReportRootGetOneDriveActivityFileCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder.class, ReportRootGetOneDriveActivityFileCountsCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetOneDriveActivityFileCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetOneDriveActivityFileCountsCollectionRequestBuilder.class, ReportRootGetOneDriveActivityFileCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetOneDriveActivityFileCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetOneDriveActivityFileCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOneDriveActivityFileCountsCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
