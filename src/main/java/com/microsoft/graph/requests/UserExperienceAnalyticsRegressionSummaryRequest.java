// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.UserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Regression Summary Request.
 */
public class UserExperienceAnalyticsRegressionSummaryRequest extends BaseRequest<UserExperienceAnalyticsRegressionSummary> {
	
    /**
     * The request for the UserExperienceAnalyticsRegressionSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsRegressionSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsRegressionSummary.class);
    }

    /**
     * Gets the UserExperienceAnalyticsRegressionSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsRegressionSummary from the service
     *
     * @return the UserExperienceAnalyticsRegressionSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRegressionSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsRegressionSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsRegressionSummary with a source
     *
     * @param sourceUserExperienceAnalyticsRegressionSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> patchAsync(@Nonnull final UserExperienceAnalyticsRegressionSummary sourceUserExperienceAnalyticsRegressionSummary) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsRegressionSummary);
    }

    /**
     * Patches this UserExperienceAnalyticsRegressionSummary with a source
     *
     * @param sourceUserExperienceAnalyticsRegressionSummary the source object with updates
     * @return the updated UserExperienceAnalyticsRegressionSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRegressionSummary patch(@Nonnull final UserExperienceAnalyticsRegressionSummary sourceUserExperienceAnalyticsRegressionSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsRegressionSummary);
    }

    /**
     * Creates a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> postAsync(@Nonnull final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsRegressionSummary);
    }

    /**
     * Creates a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the new object to create
     * @return the created UserExperienceAnalyticsRegressionSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRegressionSummary post(@Nonnull final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsRegressionSummary);
    }

    /**
     * Creates a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRegressionSummary> putAsync(@Nonnull final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsRegressionSummary);
    }

    /**
     * Creates a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the object to create/update
     * @return the created UserExperienceAnalyticsRegressionSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRegressionSummary put(@Nonnull final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsRegressionSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsRegressionSummaryRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsRegressionSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

