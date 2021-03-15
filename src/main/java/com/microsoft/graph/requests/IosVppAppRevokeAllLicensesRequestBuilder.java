// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.IosVppAppRevokeAllLicensesRequest;
import com.microsoft.graph.models.IosVppApp;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.IosVppAppRevokeAllLicensesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Revoke All Licenses Request Builder.
 */
public class IosVppAppRevokeAllLicensesRequestBuilder extends BaseActionRequestBuilder<IosVppApp> {

    /**
     * The request builder for this IosVppAppRevokeAllLicenses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppAppRevokeAllLicensesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private IosVppAppRevokeAllLicensesParameterSet body;
    /**
     * The request builder for this IosVppAppRevokeAllLicenses
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public IosVppAppRevokeAllLicensesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final IosVppAppRevokeAllLicensesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the IosVppAppRevokeAllLicensesRequest
     *
     * @param requestOptions the options for the request
     * @return the IosVppAppRevokeAllLicensesRequest instance
     */
    @Nonnull
    public IosVppAppRevokeAllLicensesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IosVppAppRevokeAllLicensesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IosVppAppRevokeAllLicensesRequest instance
     */
    @Nonnull
    public IosVppAppRevokeAllLicensesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final IosVppAppRevokeAllLicensesRequest request = new IosVppAppRevokeAllLicensesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
