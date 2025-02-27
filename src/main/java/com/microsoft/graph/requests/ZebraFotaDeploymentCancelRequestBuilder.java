// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ZebraFotaDeploymentCancelRequest;
import com.microsoft.graph.models.ZebraFotaDeployment;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Zebra Fota Deployment Cancel Request Builder.
 */
public class ZebraFotaDeploymentCancelRequestBuilder extends BaseActionRequestBuilder<Boolean> {

    /**
     * The request builder for this ZebraFotaDeploymentCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ZebraFotaDeploymentCancelRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ZebraFotaDeploymentCancelRequest
     *
     * @param requestOptions the options for the request
     * @return the ZebraFotaDeploymentCancelRequest instance
     */
    @Nonnull
    public ZebraFotaDeploymentCancelRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ZebraFotaDeploymentCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ZebraFotaDeploymentCancelRequest instance
     */
    @Nonnull
    public ZebraFotaDeploymentCancelRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ZebraFotaDeploymentCancelRequest request = new ZebraFotaDeploymentCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
