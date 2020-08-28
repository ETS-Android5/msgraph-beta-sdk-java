// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.NdesConnector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.INdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ndes Connector Collection Request Builder.
 */
public class NdesConnectorCollectionRequestBuilder extends BaseRequestBuilder implements INdesConnectorCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NdesConnectorCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public INdesConnectorCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public INdesConnectorCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new NdesConnectorCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public INdesConnectorRequestBuilder byId(final String id) {
        return new NdesConnectorRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
