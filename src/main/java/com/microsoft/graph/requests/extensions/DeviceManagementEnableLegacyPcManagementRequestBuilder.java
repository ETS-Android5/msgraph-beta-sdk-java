// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementEnableLegacyPcManagementRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementEnableLegacyPcManagementRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Enable Legacy Pc Management Request Builder.
 */
public class DeviceManagementEnableLegacyPcManagementRequestBuilder extends BaseActionRequestBuilder implements IDeviceManagementEnableLegacyPcManagementRequestBuilder {

    /**
     * The request builder for this DeviceManagementEnableLegacyPcManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementEnableLegacyPcManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDeviceManagementEnableLegacyPcManagementRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementEnableLegacyPcManagementRequest instance
     */
    public IDeviceManagementEnableLegacyPcManagementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDeviceManagementEnableLegacyPcManagementRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementEnableLegacyPcManagementRequest instance
     */
    public IDeviceManagementEnableLegacyPcManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementEnableLegacyPcManagementRequest request = new DeviceManagementEnableLegacyPcManagementRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
