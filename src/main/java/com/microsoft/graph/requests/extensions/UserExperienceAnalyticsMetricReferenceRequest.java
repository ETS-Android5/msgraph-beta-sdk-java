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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric Reference Request.
 */
public class UserExperienceAnalyticsMetricReferenceRequest extends BaseRequest implements IUserExperienceAnalyticsMetricReferenceRequest {

    /**
     * The request for the UserExperienceAnalyticsMetric
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsMetricReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsMetric.class);
    }

    public void delete(final ICallback<UserExperienceAnalyticsMetric> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public UserExperienceAnalyticsMetric delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserExperienceAnalyticsMetricReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsMetricReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserExperienceAnalyticsMetricReferenceRequest)this;
    }
    /**
     * Puts the UserExperienceAnalyticsMetric
     *
     * @param srcUserExperienceAnalyticsMetric the UserExperienceAnalyticsMetric reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(UserExperienceAnalyticsMetric srcUserExperienceAnalyticsMetric, final ICallback<UserExperienceAnalyticsMetric> callback) {
        send(HttpMethod.PUT, callback, srcUserExperienceAnalyticsMetric);
    }

    /**
     * Puts the UserExperienceAnalyticsMetric
     *
     * @param srcUserExperienceAnalyticsMetric the UserExperienceAnalyticsMetric reference to PUT
     * @return the UserExperienceAnalyticsMetric
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public UserExperienceAnalyticsMetric put(UserExperienceAnalyticsMetric srcUserExperienceAnalyticsMetric) throws ClientException {
        return send(HttpMethod.PUT, srcUserExperienceAnalyticsMetric);
    }
}
