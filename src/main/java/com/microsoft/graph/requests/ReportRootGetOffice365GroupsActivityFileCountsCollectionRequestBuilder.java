// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365GroupsActivityFileCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityFileCountsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity File Counts Collection Request Builder.
 */
public class ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<Office365GroupsActivityFileCounts, ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder, ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse, ReportRootGetOffice365GroupsActivityFileCountsCollectionPage, ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder.class, ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetOffice365GroupsActivityFileCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder.class, ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
