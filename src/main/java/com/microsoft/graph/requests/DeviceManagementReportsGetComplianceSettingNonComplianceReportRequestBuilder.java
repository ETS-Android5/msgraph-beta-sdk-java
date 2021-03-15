// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest;
import com.microsoft.graph.models.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReportsGetComplianceSettingNonComplianceReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Compliance Setting Non Compliance Report Request Builder.
 */
public class DeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this DeviceManagementReportsGetComplianceSettingNonComplianceReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceManagementReportsGetComplianceSettingNonComplianceReportParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetComplianceSettingNonComplianceReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetComplianceSettingNonComplianceReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest request = new DeviceManagementReportsGetComplianceSettingNonComplianceReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
