// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceApplyHoldRequest;
import com.microsoft.graph.ediscovery.models.NoncustodialDataSource;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.ediscovery.models.NoncustodialDataSourceApplyHoldParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Noncustodial Data Source Apply Hold Request Builder.
 */
public class NoncustodialDataSourceApplyHoldRequestBuilder extends BaseActionRequestBuilder<NoncustodialDataSource> {

    private NoncustodialDataSourceApplyHoldParameterSet body;
    /**
     * The request builder for this NoncustodialDataSourceApplyHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public NoncustodialDataSourceApplyHoldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final NoncustodialDataSourceApplyHoldParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }
    /**
     * The request builder for this NoncustodialDataSourceApplyHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NoncustodialDataSourceApplyHoldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the NoncustodialDataSourceApplyHoldRequest
     *
     * @param requestOptions the options for the request
     * @return the NoncustodialDataSourceApplyHoldRequest instance
     */
    @Nonnull
    public NoncustodialDataSourceApplyHoldRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the NoncustodialDataSourceApplyHoldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the NoncustodialDataSourceApplyHoldRequest instance
     */
    @Nonnull
    public NoncustodialDataSourceApplyHoldRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final NoncustodialDataSourceApplyHoldRequest request = new NoncustodialDataSourceApplyHoldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
