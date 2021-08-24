// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MetricTimeSeriesDataPoint;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionResponse;
import com.microsoft.graph.models.MicrosoftTunnelServerGetHealthMetricTimeSeriesParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Get Health Metric Time Series Collection Request Builder.
 */
public class MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<MetricTimeSeriesDataPoint, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionResponse, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionPage, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest> {

    /**
     * The request builder for this collection of MicrosoftTunnelServer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder.class, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest.class);
    }
    private MicrosoftTunnelServerGetHealthMetricTimeSeriesParameterSet body;
    /**
     * The request builder for this collection of MicrosoftTunnelServer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MicrosoftTunnelServerGetHealthMetricTimeSeriesParameterSet parameters) {
        super(requestUrl, client, requestOptions, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder.class, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest instance
     */
    @Override
    @Nonnull
    public MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
