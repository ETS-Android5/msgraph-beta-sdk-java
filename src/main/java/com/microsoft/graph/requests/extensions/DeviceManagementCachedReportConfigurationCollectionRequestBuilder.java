// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementReports;
import com.microsoft.graph.models.extensions.DeviceManagementCachedReportConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Cached Report Configuration Collection Request Builder.
 */
public class DeviceManagementCachedReportConfigurationCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementCachedReportConfigurationCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementReports
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementCachedReportConfigurationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceManagementCachedReportConfigurationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementCachedReportConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementCachedReportConfigurationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementCachedReportConfigurationRequestBuilder byId(final String id) {
        return new DeviceManagementCachedReportConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
