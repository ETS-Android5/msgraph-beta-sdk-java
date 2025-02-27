// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.RecommendationResourcePostponeRequest;
import com.microsoft.graph.models.RecommendationResource;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.RecommendationResourcePostponeParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recommendation Resource Postpone Request Builder.
 */
public class RecommendationResourcePostponeRequestBuilder extends BaseActionRequestBuilder<RecommendationResource> {

    /**
     * The request builder for this RecommendationResourcePostpone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RecommendationResourcePostponeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private RecommendationResourcePostponeParameterSet body;
    /**
     * The request builder for this RecommendationResourcePostpone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public RecommendationResourcePostponeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final RecommendationResourcePostponeParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the RecommendationResourcePostponeRequest
     *
     * @param requestOptions the options for the request
     * @return the RecommendationResourcePostponeRequest instance
     */
    @Nonnull
    public RecommendationResourcePostponeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the RecommendationResourcePostponeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the RecommendationResourcePostponeRequest instance
     */
    @Nonnull
    public RecommendationResourcePostponeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final RecommendationResourcePostponeRequest request = new RecommendationResourcePostponeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
