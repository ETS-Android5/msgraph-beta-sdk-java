// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.MicrosoftTunnelServerCreateServerLogCollectionRequestRequest;
import com.microsoft.graph.models.MicrosoftTunnelServer;
import com.microsoft.graph.models.MicrosoftTunnelServerLogCollectionResponse;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.MicrosoftTunnelServerCreateServerLogCollectionRequestParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Create Server Log Collection Request Request Builder.
 */
public class MicrosoftTunnelServerCreateServerLogCollectionRequestRequestBuilder extends BaseActionRequestBuilder<MicrosoftTunnelServerLogCollectionResponse> {

    /**
     * The request builder for this MicrosoftTunnelServerCreateServerLogCollectionRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftTunnelServerCreateServerLogCollectionRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private MicrosoftTunnelServerCreateServerLogCollectionRequestParameterSet body;
    /**
     * The request builder for this MicrosoftTunnelServerCreateServerLogCollectionRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MicrosoftTunnelServerCreateServerLogCollectionRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MicrosoftTunnelServerCreateServerLogCollectionRequestParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the MicrosoftTunnelServerCreateServerLogCollectionRequestRequest
     *
     * @param requestOptions the options for the request
     * @return the MicrosoftTunnelServerCreateServerLogCollectionRequestRequest instance
     */
    @Nonnull
    public MicrosoftTunnelServerCreateServerLogCollectionRequestRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MicrosoftTunnelServerCreateServerLogCollectionRequestRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MicrosoftTunnelServerCreateServerLogCollectionRequestRequest instance
     */
    @Nonnull
    public MicrosoftTunnelServerCreateServerLogCollectionRequestRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MicrosoftTunnelServerCreateServerLogCollectionRequestRequest request = new MicrosoftTunnelServerCreateServerLogCollectionRequestRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
