// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.VppTokenRevokeLicensesRequest;
import com.microsoft.graph.models.VppToken;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.VppTokenRevokeLicensesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token Revoke Licenses Request Builder.
 */
public class VppTokenRevokeLicensesRequestBuilder extends BaseActionRequestBuilder<VppToken> {

    /**
     * The request builder for this VppTokenRevokeLicenses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VppTokenRevokeLicensesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private VppTokenRevokeLicensesParameterSet body;
    /**
     * The request builder for this VppTokenRevokeLicenses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public VppTokenRevokeLicensesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final VppTokenRevokeLicensesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the VppTokenRevokeLicensesRequest
     *
     * @param requestOptions the options for the request
     * @return the VppTokenRevokeLicensesRequest instance
     */
    @Nonnull
    public VppTokenRevokeLicensesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the VppTokenRevokeLicensesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the VppTokenRevokeLicensesRequest instance
     */
    @Nonnull
    public VppTokenRevokeLicensesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final VppTokenRevokeLicensesRequest request = new VppTokenRevokeLicensesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
