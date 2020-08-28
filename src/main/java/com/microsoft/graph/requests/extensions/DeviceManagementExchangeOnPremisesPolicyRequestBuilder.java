// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeOnPremisesPolicy;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange On Premises Policy Request Builder.
 */
public class DeviceManagementExchangeOnPremisesPolicyRequestBuilder extends BaseRequestBuilder implements IDeviceManagementExchangeOnPremisesPolicyRequestBuilder {

    /**
     * The request builder for the DeviceManagementExchangeOnPremisesPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementExchangeOnPremisesPolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceManagementExchangeOnPremisesPolicyRequest instance
     */
    public IDeviceManagementExchangeOnPremisesPolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementExchangeOnPremisesPolicyRequest instance
     */
    public IDeviceManagementExchangeOnPremisesPolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the IOnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    public IOnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new OnPremisesConditionalAccessSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessSettings"), getClient(), null);
    }
}
