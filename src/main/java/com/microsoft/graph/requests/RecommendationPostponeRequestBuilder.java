// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.RecommendationPostponeRequest;
import com.microsoft.graph.models.Recommendation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.RecommendationPostponeParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recommendation Postpone Request Builder.
 */
public class RecommendationPostponeRequestBuilder extends BaseActionRequestBuilder<Recommendation> {

    /**
     * The request builder for this RecommendationPostpone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RecommendationPostponeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private RecommendationPostponeParameterSet body;
    /**
     * The request builder for this RecommendationPostpone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public RecommendationPostponeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final RecommendationPostponeParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the RecommendationPostponeRequest
     *
     * @param requestOptions the options for the request
     * @return the RecommendationPostponeRequest instance
     */
    @Nonnull
    public RecommendationPostponeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the RecommendationPostponeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the RecommendationPostponeRequest instance
     */
    @Nonnull
    public RecommendationPostponeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final RecommendationPostponeRequest request = new RecommendationPostponeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
