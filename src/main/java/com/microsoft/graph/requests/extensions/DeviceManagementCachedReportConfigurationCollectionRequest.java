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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Cached Report Configuration Collection Request.
 */
public class DeviceManagementCachedReportConfigurationCollectionRequest extends BaseCollectionRequest<DeviceManagementCachedReportConfigurationCollectionResponse, IDeviceManagementCachedReportConfigurationCollectionPage> implements IDeviceManagementCachedReportConfigurationCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementCachedReportConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementCachedReportConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementCachedReportConfigurationCollectionResponse.class, IDeviceManagementCachedReportConfigurationCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementCachedReportConfigurationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementCachedReportConfigurationCollectionPage get() throws ClientException {
        final DeviceManagementCachedReportConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration, final ICallback<DeviceManagementCachedReportConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementCachedReportConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementCachedReportConfiguration, callback);
    }

    public DeviceManagementCachedReportConfiguration post(final DeviceManagementCachedReportConfiguration newDeviceManagementCachedReportConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementCachedReportConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementCachedReportConfiguration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementCachedReportConfigurationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementCachedReportConfigurationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementCachedReportConfigurationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementCachedReportConfigurationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementCachedReportConfigurationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementCachedReportConfigurationCollectionRequest)this;
    }

    public IDeviceManagementCachedReportConfigurationCollectionPage buildFromResponse(final DeviceManagementCachedReportConfigurationCollectionResponse response) {
        final IDeviceManagementCachedReportConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementCachedReportConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementCachedReportConfigurationCollectionPage page = new DeviceManagementCachedReportConfigurationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
