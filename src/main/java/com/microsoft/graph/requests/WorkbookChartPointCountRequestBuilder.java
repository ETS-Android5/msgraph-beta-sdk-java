// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookChartPointCountRequest;
import com.microsoft.graph.models.WorkbookChartPoint;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Count Request Builder.
 */
public class WorkbookChartPointCountRequestBuilder extends BaseFunctionRequestBuilder<Integer> {

    /**
     * The request builder for this WorkbookChartPointCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointCountRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookChartPointCountRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartPointCountRequest instance
     */
    @Nonnull
    public WorkbookChartPointCountRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookChartPointCountRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartPointCountRequest instance
     */
    @Nonnull
    public WorkbookChartPointCountRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookChartPointCountRequest request = new WorkbookChartPointCountRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
