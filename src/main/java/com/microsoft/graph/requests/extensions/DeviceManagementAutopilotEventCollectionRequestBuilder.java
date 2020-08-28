// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotEvent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Event Collection Request Builder.
 */
public class DeviceManagementAutopilotEventCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementAutopilotEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAutopilotEventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceManagementAutopilotEventCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementAutopilotEventCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementAutopilotEventCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementAutopilotEventRequestBuilder byId(final String id) {
        return new DeviceManagementAutopilotEventRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
