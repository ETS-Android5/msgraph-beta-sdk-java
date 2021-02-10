// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementReports;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementCachedReportConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementCachedReportConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExportJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExportJobRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Request Builder.
 */
public class DeviceManagementReportsRequestBuilder extends BaseRequestBuilder implements IDeviceManagementReportsRequestBuilder {

    /**
     * The request builder for the DeviceManagementReports
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementReportsRequest instance
     */
    public IDeviceManagementReportsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementReportsRequest instance
     */
    public IDeviceManagementReportsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementReportsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementCachedReportConfigurationCollectionRequestBuilder cachedReportConfigurations() {
        return new DeviceManagementCachedReportConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cachedReportConfigurations"), getClient(), null);
    }

    public IDeviceManagementCachedReportConfigurationRequestBuilder cachedReportConfigurations(final String id) {
        return new DeviceManagementCachedReportConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("cachedReportConfigurations") + "/" + id, getClient(), null);
    }
    public IDeviceManagementExportJobCollectionRequestBuilder exportJobs() {
        return new DeviceManagementExportJobCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exportJobs"), getClient(), null);
    }

    public IDeviceManagementExportJobRequestBuilder exportJobs(final String id) {
        return new DeviceManagementExportJobRequestBuilder(getRequestUrlWithAdditionalSegment("exportJobs") + "/" + id, getClient(), null);
    }
    public IDeviceManagementReportScheduleCollectionRequestBuilder reportSchedules() {
        return new DeviceManagementReportScheduleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("reportSchedules"), getClient(), null);
    }

    public IDeviceManagementReportScheduleRequestBuilder reportSchedules(final String id) {
        return new DeviceManagementReportScheduleRequestBuilder(getRequestUrlWithAdditionalSegment("reportSchedules") + "/" + id, getClient(), null);
    }

    public IDeviceManagementReportsGetAppsInstallSummaryReportRequestBuilder getAppsInstallSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetAppsInstallSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAppsInstallSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetAppStatusOverviewReportRequestBuilder getAppStatusOverviewReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetAppStatusOverviewReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAppStatusOverviewReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetDeviceInstallStatusReportRequestBuilder getDeviceInstallStatusReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetDeviceInstallStatusReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getDeviceInstallStatusReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetFailedMobileAppsReportRequestBuilder getFailedMobileAppsReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetFailedMobileAppsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFailedMobileAppsReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetFailedMobileAppsSummaryReportRequestBuilder getFailedMobileAppsSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetFailedMobileAppsSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFailedMobileAppsSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetUserInstallStatusReportRequestBuilder getUserInstallStatusReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetUserInstallStatusReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUserInstallStatusReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationPoliciesReportForDeviceRequestBuilder getConfigurationPoliciesReportForDevice(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationPoliciesReportForDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPoliciesReportForDevice"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationPolicyDevicesReportRequestBuilder getConfigurationPolicyDevicesReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationPolicyDevicesReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyDevicesReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationPolicyDeviceSummaryReportRequestBuilder getConfigurationPolicyDeviceSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationPolicyDeviceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyDeviceSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationSettingDetailsReportRequestBuilder getConfigurationSettingDetailsReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationSettingDetailsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationSettingDetailsReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationSettingsReportRequestBuilder getConfigurationSettingsReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationSettingsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationSettingsReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetActiveMalwareReportRequestBuilder getActiveMalwareReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetActiveMalwareReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActiveMalwareReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetActiveMalwareSummaryReportRequestBuilder getActiveMalwareSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetActiveMalwareSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActiveMalwareSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetMalwareSummaryReportRequestBuilder getMalwareSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetMalwareSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMalwareSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequestBuilder getUnhealthyDefenderAgentsReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUnhealthyDefenderAgentsReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetUnhealthyFirewallReportRequestBuilder getUnhealthyFirewallReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetUnhealthyFirewallReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUnhealthyFirewallReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetUnhealthyFirewallSummaryReportRequestBuilder getUnhealthyFirewallSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetUnhealthyFirewallSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUnhealthyFirewallSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetCertificatesReportRequestBuilder getCertificatesReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetCertificatesReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCertificatesReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetCachedReportRequestBuilder getCachedReport(final String id, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top) {
        return new DeviceManagementReportsGetCachedReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCachedReport"), getClient(), null, id, select, search, groupBy, orderBy, skip, top);
    }

    public IDeviceManagementReportsGetCompliancePolicyNonComplianceReportRequestBuilder getCompliancePolicyNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetCompliancePolicyNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCompliancePolicyNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetCompliancePolicyNonComplianceSummaryReportRequestBuilder getCompliancePolicyNonComplianceSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetCompliancePolicyNonComplianceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCompliancePolicyNonComplianceSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder getComplianceSettingNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetComplianceSettingNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getComplianceSettingNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationPolicyNonComplianceReportRequestBuilder getConfigurationPolicyNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationPolicyNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder getConfigurationPolicyNonComplianceSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationPolicyNonComplianceSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder getConfigurationSettingNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetConfigurationSettingNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getConfigurationSettingNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder getDeviceNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getDeviceNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetHistoricalReportRequestBuilder getHistoricalReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String filter) {
        return new DeviceManagementReportsGetHistoricalReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getHistoricalReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, filter);
    }

    public IDeviceManagementReportsGetPolicyNonComplianceMetadataRequestBuilder getPolicyNonComplianceMetadata(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetPolicyNonComplianceMetadataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPolicyNonComplianceMetadata"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetPolicyNonComplianceReportRequestBuilder getPolicyNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetPolicyNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPolicyNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetPolicyNonComplianceSummaryReportRequestBuilder getPolicyNonComplianceSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetPolicyNonComplianceSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getPolicyNonComplianceSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetReportFiltersRequestBuilder getReportFilters(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetReportFiltersRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getReportFilters"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetSettingNonComplianceReportRequestBuilder getSettingNonComplianceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetSettingNonComplianceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getSettingNonComplianceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder getWindowsUpdateAlertsPerPolicyPerDeviceReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetWindowsUpdateAlertsPerPolicyPerDeviceReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getWindowsUpdateAlertsPerPolicyPerDeviceReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }

    public IDeviceManagementReportsGetWindowsUpdateAlertSummaryReportRequestBuilder getWindowsUpdateAlertSummaryReport(final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        return new DeviceManagementReportsGetWindowsUpdateAlertSummaryReportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getWindowsUpdateAlertSummaryReport"), getClient(), null, name, select, search, groupBy, orderBy, skip, top, sessionId, filter);
    }
}
