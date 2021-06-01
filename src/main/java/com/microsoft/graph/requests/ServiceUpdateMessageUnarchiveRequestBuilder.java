// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ServiceUpdateMessageUnarchiveRequest;
import com.microsoft.graph.models.ServiceUpdateMessage;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ServiceUpdateMessageUnarchiveParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Update Message Unarchive Request Builder.
 */
public class ServiceUpdateMessageUnarchiveRequestBuilder extends BaseActionRequestBuilder<Boolean> {

    /**
     * The request builder for this ServiceUpdateMessageUnarchive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServiceUpdateMessageUnarchiveRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ServiceUpdateMessageUnarchiveParameterSet body;
    /**
     * The request builder for this ServiceUpdateMessageUnarchive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ServiceUpdateMessageUnarchiveRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ServiceUpdateMessageUnarchiveParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ServiceUpdateMessageUnarchiveRequest
     *
     * @param requestOptions the options for the request
     * @return the ServiceUpdateMessageUnarchiveRequest instance
     */
    @Nonnull
    public ServiceUpdateMessageUnarchiveRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServiceUpdateMessageUnarchiveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServiceUpdateMessageUnarchiveRequest instance
     */
    @Nonnull
    public ServiceUpdateMessageUnarchiveRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ServiceUpdateMessageUnarchiveRequest request = new ServiceUpdateMessageUnarchiveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
