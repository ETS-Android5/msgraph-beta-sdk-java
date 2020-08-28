// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISynchronizationPingRequest;
import com.microsoft.graph.requests.extensions.SynchronizationPingRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Ping Request Builder.
 */
public class SynchronizationPingRequestBuilder extends BaseFunctionRequestBuilder implements ISynchronizationPingRequestBuilder {

    /**
     * The request builder for this SynchronizationPing
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationPingRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ISynchronizationPingRequest
     *
     * @return the ISynchronizationPingRequest instance
     */
    public ISynchronizationPingRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ISynchronizationPingRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationPingRequest instance
     */
    public ISynchronizationPingRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SynchronizationPingRequest request = new SynchronizationPingRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
