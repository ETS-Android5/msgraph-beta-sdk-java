// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CertificateConnectorDetails;
import com.microsoft.graph.models.KeyLongValuePair;
import com.microsoft.graph.models.TimeSeriesParameter;
import com.microsoft.graph.models.CertificateConnectorHealthMetricValue;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.CertificateConnectorDetailsGetHealthMetricsParameterSet;
import com.microsoft.graph.models.CertificateConnectorDetailsGetHealthMetricTimeSeriesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Connector Details Request Builder.
 */
public class CertificateConnectorDetailsRequestBuilder extends BaseRequestBuilder<CertificateConnectorDetails> {

    /**
     * The request builder for the CertificateConnectorDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateConnectorDetailsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CertificateConnectorDetailsRequest instance
     */
    @Nonnull
    public CertificateConnectorDetailsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CertificateConnectorDetailsRequest instance
     */
    @Nonnull
    public CertificateConnectorDetailsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.CertificateConnectorDetailsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CertificateConnectorDetailsGetHealthMetricsCollectionRequestBuilder getHealthMetrics(@Nonnull final CertificateConnectorDetailsGetHealthMetricsParameterSet parameters) {
        return new CertificateConnectorDetailsGetHealthMetricsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getHealthMetrics"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CertificateConnectorDetailsGetHealthMetricTimeSeriesCollectionRequestBuilder getHealthMetricTimeSeries(@Nonnull final CertificateConnectorDetailsGetHealthMetricTimeSeriesParameterSet parameters) {
        return new CertificateConnectorDetailsGetHealthMetricTimeSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getHealthMetricTimeSeries"), getClient(), null, parameters);
    }
}
