// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Metric Reference Request Builder.
 */
public interface IUserExperienceAnalyticsMetricReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @return the IUserExperienceAnalyticsMetricReferenceRequest instance
     */
    IUserExperienceAnalyticsMetricReferenceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IUserExperienceAnalyticsMetricReferenceRequest instance
     */
    IUserExperienceAnalyticsMetricReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
