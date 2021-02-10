// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosEasEmailProfileConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IosCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosCertificateProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IosCertificateProfileWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Eas Email Profile Configuration Request Builder.
 */
public class IosEasEmailProfileConfigurationRequestBuilder extends BaseRequestBuilder implements IIosEasEmailProfileConfigurationRequestBuilder {

    /**
     * The request builder for the IosEasEmailProfileConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosEasEmailProfileConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIosEasEmailProfileConfigurationRequest instance
     */
    public IIosEasEmailProfileConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosEasEmailProfileConfigurationRequest instance
     */
    public IIosEasEmailProfileConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IosEasEmailProfileConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    public ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    public IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    public IDeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments() {
        return new DeviceConfigurationGroupAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments"), getClient(), null);
    }

    public IDeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(final String id) {
        return new DeviceConfigurationGroupAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    public IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementDerivedCredentialSettings
     *
     * @return the IDeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder instance
     */
    public IDeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder derivedCredentialSettings() {
        return new DeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("derivedCredentialSettings"), getClient(), null);
    }

    /**
     * Gets the request builder for IosCertificateProfileBase
     *
     * @return the IIosCertificateProfileBaseWithReferenceRequestBuilder instance
     */
    public IIosCertificateProfileBaseWithReferenceRequestBuilder identityCertificate() {
        return new IosCertificateProfileBaseWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("identityCertificate"), getClient(), null);
    }

    /**
     * Gets the request builder for IosCertificateProfile
     *
     * @return the IIosCertificateProfileWithReferenceRequestBuilder instance
     */
    public IIosCertificateProfileWithReferenceRequestBuilder smimeEncryptionCertificate() {
        return new IosCertificateProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("smimeEncryptionCertificate"), getClient(), null);
    }

    /**
     * Gets the request builder for IosCertificateProfile
     *
     * @return the IIosCertificateProfileWithReferenceRequestBuilder instance
     */
    public IIosCertificateProfileWithReferenceRequestBuilder smimeSigningCertificate() {
        return new IosCertificateProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("smimeSigningCertificate"), getClient(), null);
    }
}
