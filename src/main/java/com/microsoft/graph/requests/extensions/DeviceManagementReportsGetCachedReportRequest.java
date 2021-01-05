// Template Source: BaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetCachedReportBody;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetCachedReportRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetCachedReportRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Cached Report Request.
 */
public class DeviceManagementReportsGetCachedReportRequest extends BaseRequest implements IDeviceManagementReportsGetCachedReportRequest {
    protected final DeviceManagementReportsGetCachedReportBody body;

    /**
     * The request for this DeviceManagementReportsGetCachedReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetCachedReportRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
        body = new DeviceManagementReportsGetCachedReportBody();
    }

    public void post(final ICallback<? super java.io.InputStream> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public java.io.InputStream post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetCachedReportRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementReportsGetCachedReportRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementReportsGetCachedReportRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DeviceManagementReportsGetCachedReportRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetCachedReportRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementReportsGetCachedReportRequest)this;
    }

}
