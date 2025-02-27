// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OverallPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOverallPrintUsageSummaryCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetOverallPrintUsageSummaryCollectionResponse;
import com.microsoft.graph.models.ReportRootGetOverallPrintUsageSummaryParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Overall Print Usage Summary Collection Request Builder.
 */
public class ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<OverallPrintUsageSummary, ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder, ReportRootGetOverallPrintUsageSummaryCollectionResponse, ReportRootGetOverallPrintUsageSummaryCollectionPage, ReportRootGetOverallPrintUsageSummaryCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder.class, ReportRootGetOverallPrintUsageSummaryCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetOverallPrintUsageSummaryParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder.class, ReportRootGetOverallPrintUsageSummaryCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetOverallPrintUsageSummaryCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetOverallPrintUsageSummaryCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOverallPrintUsageSummaryCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
