// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseCreateDownloadUrlRequest;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCreateDownloadUrlRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Log Collection Response Create Download Url Request Builder.
 */
public class DeviceLogCollectionResponseCreateDownloadUrlRequestBuilder extends BaseActionRequestBuilder implements IDeviceLogCollectionResponseCreateDownloadUrlRequestBuilder {

    /**
     * The request builder for this DeviceLogCollectionResponseCreateDownloadUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceLogCollectionResponseCreateDownloadUrlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDeviceLogCollectionResponseCreateDownloadUrlRequest
     *
     * @return the IDeviceLogCollectionResponseCreateDownloadUrlRequest instance
     */
    public IDeviceLogCollectionResponseCreateDownloadUrlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDeviceLogCollectionResponseCreateDownloadUrlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceLogCollectionResponseCreateDownloadUrlRequest instance
     */
    public IDeviceLogCollectionResponseCreateDownloadUrlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceLogCollectionResponseCreateDownloadUrlRequest request = new DeviceLogCollectionResponseCreateDownloadUrlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
