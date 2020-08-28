// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsSyncAppsRequest;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsSyncAppsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings Sync Apps Request Builder.
 */
public class AndroidForWorkSettingsSyncAppsRequestBuilder extends BaseActionRequestBuilder implements IAndroidForWorkSettingsSyncAppsRequestBuilder {

    /**
     * The request builder for this AndroidForWorkSettingsSyncApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkSettingsSyncAppsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IAndroidForWorkSettingsSyncAppsRequest
     *
     * @return the IAndroidForWorkSettingsSyncAppsRequest instance
     */
    public IAndroidForWorkSettingsSyncAppsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAndroidForWorkSettingsSyncAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsSyncAppsRequest instance
     */
    public IAndroidForWorkSettingsSyncAppsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AndroidForWorkSettingsSyncAppsRequest request = new AndroidForWorkSettingsSyncAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
