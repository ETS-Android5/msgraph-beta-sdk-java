// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceRemoveHoldRequest;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSource;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source Remove Hold Request Builder.
 */
public class EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder extends BaseActionRequestBuilder<EdiscoveryNoncustodialDataSource> {

    private EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet body;
    /**
     * The request builder for this EdiscoveryNoncustodialDataSourceRemoveHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }
    /**
     * The request builder for this EdiscoveryNoncustodialDataSourceRemoveHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the EdiscoveryNoncustodialDataSourceRemoveHoldRequest
     *
     * @param requestOptions the options for the request
     * @return the EdiscoveryNoncustodialDataSourceRemoveHoldRequest instance
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceRemoveHoldRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EdiscoveryNoncustodialDataSourceRemoveHoldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EdiscoveryNoncustodialDataSourceRemoveHoldRequest instance
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceRemoveHoldRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EdiscoveryNoncustodialDataSourceRemoveHoldRequest request = new EdiscoveryNoncustodialDataSourceRemoveHoldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
