// Template Source: BaseMethodCollectionPage.java.tt
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

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionPage;
import com.microsoft.graph.requests.MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Get Health Metric Time Series Collection Page.
 */
public class MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionPage extends BaseCollectionPage<MetricTimeSeriesDataPoint, MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder> {

    /**
     * A collection page for MetricTimeSeriesDataPoint.
     *
     * @param response The serialized MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionPage(@Nonnull final MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionResponse response, @Nonnull final MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for MicrosoftTunnelServerGetHealthMetricTimeSeries
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionPage(@Nonnull final java.util.List<MetricTimeSeriesDataPoint> pageContents, @Nullable final MicrosoftTunnelServerGetHealthMetricTimeSeriesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
