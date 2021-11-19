// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsDeviceUsageDistributionUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionResponse;
import com.microsoft.graph.models.ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams Device Usage Distribution User Counts Collection Request Builder.
 */
public class ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<TeamsDeviceUsageDistributionUserCounts, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionResponse, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionPage, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder.class, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetTeamsDeviceUsageDistributionUserCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder.class, ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
