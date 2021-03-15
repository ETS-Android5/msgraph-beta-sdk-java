// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest;
import com.microsoft.graph.models.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationSettingNonComplianceReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Configuration Setting Non Compliance Report Request Builder.
 */
public class DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this DeviceManagementReportsGetConfigurationSettingNonComplianceReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceManagementReportsGetConfigurationSettingNonComplianceReportParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetConfigurationSettingNonComplianceReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetConfigurationSettingNonComplianceReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest request = new DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
