// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChart;
import com.microsoft.graph.models.WorkbookChartSeries;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.WorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartSeriesRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartSeriesCollectionRequest;
import com.microsoft.graph.requests.WorkbookChartSeriesCountRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartSeriesItemAtRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.WorkbookChartSeriesItemAtParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Collection Request Builder.
 */
public class WorkbookChartSeriesCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookChartSeries, WorkbookChartSeriesRequestBuilder, WorkbookChartSeriesCollectionResponse, WorkbookChartSeriesCollectionPage, WorkbookChartSeriesCollectionRequest> {

    /**
     * The request builder for this collection of WorkbookChart
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartSeriesRequestBuilder.class, WorkbookChartSeriesCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookChartSeriesCountRequestBuilder count() {
        return new WorkbookChartSeriesCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookChartSeriesItemAtRequestBuilder itemAt(@Nonnull final WorkbookChartSeriesItemAtParameterSet parameters) {
        return new WorkbookChartSeriesItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, parameters);
    }
}
