// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrintJobCancelRequest;
import com.microsoft.graph.requests.extensions.PrintJobCancelRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Cancel Request Builder.
 */
public class PrintJobCancelRequestBuilder extends BaseActionRequestBuilder implements IPrintJobCancelRequestBuilder {

    /**
     * The request builder for this PrintJobCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobCancelRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrintJobCancelRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobCancelRequest instance
     */
    public IPrintJobCancelRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrintJobCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobCancelRequest instance
     */
    public IPrintJobCancelRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrintJobCancelRequest request = new PrintJobCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
