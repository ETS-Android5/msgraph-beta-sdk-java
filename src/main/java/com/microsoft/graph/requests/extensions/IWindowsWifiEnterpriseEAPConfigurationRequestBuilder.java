// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsWifiEnterpriseEAPConfiguration;
import com.microsoft.graph.requests.extensions.IWindowsCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Wifi Enterprise EAPConfiguration Request Builder.
 */
public interface IWindowsWifiEnterpriseEAPConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsWifiEnterpriseEAPConfigurationRequest instance
     */
    IWindowsWifiEnterpriseEAPConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsWifiEnterpriseEAPConfigurationRequest instance
     */
    IWindowsWifiEnterpriseEAPConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceConfigurationAssignmentCollectionRequestBuilder assignments();

    IDeviceConfigurationAssignmentRequestBuilder assignments(final String id);

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview();

    IDeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments();

    IDeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(final String id);

    IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview();

    /**
     * Gets the request builder for WindowsCertificateProfileBase
     *
     * @return the IWindowsCertificateProfileBaseWithReferenceRequestBuilder instance
     */
    IWindowsCertificateProfileBaseWithReferenceRequestBuilder identityCertificateForClientAuthentication();

    /**
     * Gets the request builder for Windows81TrustedRootCertificate
     *
     * @return the IWindows81TrustedRootCertificateWithReferenceRequestBuilder instance
     */
    IWindows81TrustedRootCertificateWithReferenceRequestBuilder rootCertificateForClientValidation();

    IWindows81TrustedRootCertificateCollectionRequestBuilder rootCertificatesForServerValidation();

    IWindows81TrustedRootCertificateRequestBuilder rootCertificatesForServerValidation(final String id);

}