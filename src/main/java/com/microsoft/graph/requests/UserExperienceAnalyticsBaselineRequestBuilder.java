// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsBaseline;
import com.microsoft.graph.requests.UserExperienceAnalyticsCategoryWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Baseline Request Builder.
 */
public class UserExperienceAnalyticsBaselineRequestBuilder extends BaseRequestBuilder<UserExperienceAnalyticsBaseline> {

    /**
     * The request builder for the UserExperienceAnalyticsBaseline
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsBaselineRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserExperienceAnalyticsBaselineRequest instance
     */
    @Nonnull
    public UserExperienceAnalyticsBaselineRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UserExperienceAnalyticsBaselineRequest instance
     */
    @Nonnull
    public UserExperienceAnalyticsBaselineRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.UserExperienceAnalyticsBaselineRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryWithReferenceRequestBuilder appHealthMetrics() {
        return new UserExperienceAnalyticsCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("appHealthMetrics"), getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryWithReferenceRequestBuilder bestPracticesMetrics() {
        return new UserExperienceAnalyticsCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("bestPracticesMetrics"), getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryWithReferenceRequestBuilder deviceBootPerformanceMetrics() {
        return new UserExperienceAnalyticsCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("deviceBootPerformanceMetrics"), getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryWithReferenceRequestBuilder rebootAnalyticsMetrics() {
        return new UserExperienceAnalyticsCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("rebootAnalyticsMetrics"), getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryWithReferenceRequestBuilder resourcePerformanceMetrics() {
        return new UserExperienceAnalyticsCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("resourcePerformanceMetrics"), getClient(), null);
    }

    /**
     * Gets the request builder for UserExperienceAnalyticsCategory
     *
     * @return the UserExperienceAnalyticsCategoryWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserExperienceAnalyticsCategoryWithReferenceRequestBuilder workFromAnywhereMetrics() {
        return new UserExperienceAnalyticsCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("workFromAnywhereMetrics"), getClient(), null);
    }
}
