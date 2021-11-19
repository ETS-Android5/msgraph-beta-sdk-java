// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AzureADFeatureUsage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ReportRootGetAzureADFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetAzureADFeatureUsageCollectionRequest;
import com.microsoft.graph.requests.ReportRootGetAzureADFeatureUsageCollectionResponse;
import com.microsoft.graph.models.ReportRootGetAzureADFeatureUsageParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Azure ADFeature Usage Collection Request Builder.
 */
public class ReportRootGetAzureADFeatureUsageCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AzureADFeatureUsage, ReportRootGetAzureADFeatureUsageCollectionRequestBuilder, ReportRootGetAzureADFeatureUsageCollectionResponse, ReportRootGetAzureADFeatureUsageCollectionPage, ReportRootGetAzureADFeatureUsageCollectionRequest> {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetAzureADFeatureUsageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetAzureADFeatureUsageCollectionRequestBuilder.class, ReportRootGetAzureADFeatureUsageCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetAzureADFeatureUsageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetAzureADFeatureUsageParameterSet parameters) {
        super(requestUrl, client, requestOptions, ReportRootGetAzureADFeatureUsageCollectionRequestBuilder.class, ReportRootGetAzureADFeatureUsageCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ReportRootGetAzureADFeatureUsageCollectionRequest instance
     */
    @Override
    @Nonnull
    public ReportRootGetAzureADFeatureUsageCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetAzureADFeatureUsageCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
