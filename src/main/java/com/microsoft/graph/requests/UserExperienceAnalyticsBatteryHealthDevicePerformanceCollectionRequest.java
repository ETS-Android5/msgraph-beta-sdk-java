// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.UserExperienceAnalyticsBatteryHealthDevicePerformance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionResponse;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Battery Health Device Performance Collection Request.
 */
public class UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest extends BaseEntityCollectionRequest<UserExperienceAnalyticsBatteryHealthDevicePerformance, UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionResponse, UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionPage> {

    /**
     * The request builder for this collection of UserExperienceAnalyticsBatteryHealthDevicePerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionResponse.class, UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionPage.class, UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequestBuilder.class);
    }

    /**
     * Creates a new UserExperienceAnalyticsBatteryHealthDevicePerformance
     * @param newUserExperienceAnalyticsBatteryHealthDevicePerformance the UserExperienceAnalyticsBatteryHealthDevicePerformance to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsBatteryHealthDevicePerformance> postAsync(@Nonnull final UserExperienceAnalyticsBatteryHealthDevicePerformance newUserExperienceAnalyticsBatteryHealthDevicePerformance) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserExperienceAnalyticsBatteryHealthDevicePerformanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newUserExperienceAnalyticsBatteryHealthDevicePerformance);
    }

    /**
     * Creates a new UserExperienceAnalyticsBatteryHealthDevicePerformance
     * @param newUserExperienceAnalyticsBatteryHealthDevicePerformance the UserExperienceAnalyticsBatteryHealthDevicePerformance to create
     * @return the newly created object
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformance post(@Nonnull final UserExperienceAnalyticsBatteryHealthDevicePerformance newUserExperienceAnalyticsBatteryHealthDevicePerformance) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserExperienceAnalyticsBatteryHealthDevicePerformanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsBatteryHealthDevicePerformance);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public UserExperienceAnalyticsBatteryHealthDevicePerformanceCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

