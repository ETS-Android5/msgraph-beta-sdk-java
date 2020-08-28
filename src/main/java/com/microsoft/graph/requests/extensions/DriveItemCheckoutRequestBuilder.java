// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemCheckoutRequest;
import com.microsoft.graph.requests.extensions.DriveItemCheckoutRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Checkout Request Builder.
 */
public class DriveItemCheckoutRequestBuilder extends BaseActionRequestBuilder implements IDriveItemCheckoutRequestBuilder {

    /**
     * The request builder for this DriveItemCheckout
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemCheckoutRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDriveItemCheckoutRequest
     *
     * @return the IDriveItemCheckoutRequest instance
     */
    public IDriveItemCheckoutRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDriveItemCheckoutRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDriveItemCheckoutRequest instance
     */
    public IDriveItemCheckoutRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemCheckoutRequest request = new DriveItemCheckoutRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
