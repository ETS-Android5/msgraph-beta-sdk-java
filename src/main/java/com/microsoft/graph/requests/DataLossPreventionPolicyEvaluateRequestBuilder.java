// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DataLossPreventionPolicyEvaluateRequest;
import com.microsoft.graph.models.DataLossPreventionPolicy;
import com.microsoft.graph.models.DlpEvaluationInput;
import com.microsoft.graph.models.DlpNotification;
import com.microsoft.graph.models.DlpEvaluatePoliciesJobResponse;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DataLossPreventionPolicyEvaluateParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Loss Prevention Policy Evaluate Request Builder.
 */
public class DataLossPreventionPolicyEvaluateRequestBuilder extends BaseActionRequestBuilder<DlpEvaluatePoliciesJobResponse> {

    /**
     * The request builder for this DataLossPreventionPolicyEvaluate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataLossPreventionPolicyEvaluateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DataLossPreventionPolicyEvaluateParameterSet body;
    /**
     * The request builder for this DataLossPreventionPolicyEvaluate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DataLossPreventionPolicyEvaluateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DataLossPreventionPolicyEvaluateParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DataLossPreventionPolicyEvaluateRequest
     *
     * @param requestOptions the options for the request
     * @return the DataLossPreventionPolicyEvaluateRequest instance
     */
    @Nonnull
    public DataLossPreventionPolicyEvaluateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DataLossPreventionPolicyEvaluateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DataLossPreventionPolicyEvaluateRequest instance
     */
    @Nonnull
    public DataLossPreventionPolicyEvaluateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DataLossPreventionPolicyEvaluateRequest request = new DataLossPreventionPolicyEvaluateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
