// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceManagementReportsGetRelatedAppsStatusReportRequest;
import com.microsoft.graph.models.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReportsGetRelatedAppsStatusReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Related Apps Status Report Request Builder.
 */
public class DeviceManagementReportsGetRelatedAppsStatusReportRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this DeviceManagementReportsGetRelatedAppsStatusReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetRelatedAppsStatusReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceManagementReportsGetRelatedAppsStatusReportParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetRelatedAppsStatusReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetRelatedAppsStatusReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetRelatedAppsStatusReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetRelatedAppsStatusReportRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetRelatedAppsStatusReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetRelatedAppsStatusReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetRelatedAppsStatusReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetRelatedAppsStatusReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetRelatedAppsStatusReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementReportsGetRelatedAppsStatusReportRequest request = new DeviceManagementReportsGetRelatedAppsStatusReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
