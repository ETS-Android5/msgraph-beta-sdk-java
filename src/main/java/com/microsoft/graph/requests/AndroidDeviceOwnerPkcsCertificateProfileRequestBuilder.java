// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidDeviceOwnerPkcsCertificateProfile;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DeviceConfigurationAssignParameterSet;
import com.microsoft.graph.models.DeviceConfigurationAssignedAccessMultiModeProfilesParameterSet;
import com.microsoft.graph.models.DeviceConfigurationWindowsPrivacyAccessControlsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Pkcs Certificate Profile Request Builder.
 */
public class AndroidDeviceOwnerPkcsCertificateProfileRequestBuilder extends BaseRequestBuilder<AndroidDeviceOwnerPkcsCertificateProfile> {

    /**
     * The request builder for the AndroidDeviceOwnerPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerPkcsCertificateProfileRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AndroidDeviceOwnerPkcsCertificateProfileRequest instance
     */
    @Nonnull
    public AndroidDeviceOwnerPkcsCertificateProfileRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AndroidDeviceOwnerPkcsCertificateProfileRequest instance
     */
    @Nonnull
    public AndroidDeviceOwnerPkcsCertificateProfileRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AndroidDeviceOwnerPkcsCertificateProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceConfigurationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SettingStateDeviceSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the SettingStateDeviceSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the DeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationGroupAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments() {
        return new DeviceConfigurationGroupAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationGroupAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(@Nonnull final String id) {
        return new DeviceConfigurationGroupAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the DeviceConfigurationUserOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }

    /**
     * Gets the request builder for AndroidDeviceOwnerTrustedRootCertificate
     *
     * @return the AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequestBuilder rootCertificate() {
        return new AndroidDeviceOwnerTrustedRootCertificateWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("rootCertificate"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceCertificateState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceCertificateStateCollectionRequestBuilder managedDeviceCertificateStates() {
        return new ManagedDeviceCertificateStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceCertificateStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceCertificateState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceCertificateStateRequestBuilder managedDeviceCertificateStates(@Nonnull final String id) {
        return new ManagedDeviceCertificateStateRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceCertificateStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationAssignCollectionRequestBuilder assign(@Nonnull final DeviceConfigurationAssignParameterSet parameters) {
        return new DeviceConfigurationAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationAssignedAccessMultiModeProfilesRequestBuilder assignedAccessMultiModeProfiles(@Nonnull final DeviceConfigurationAssignedAccessMultiModeProfilesParameterSet parameters) {
        return new DeviceConfigurationAssignedAccessMultiModeProfilesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignedAccessMultiModeProfiles"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationWindowsPrivacyAccessControlsRequestBuilder windowsPrivacyAccessControls(@Nonnull final DeviceConfigurationWindowsPrivacyAccessControlsParameterSet parameters) {
        return new DeviceConfigurationWindowsPrivacyAccessControlsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsPrivacyAccessControls"), getClient(), null, parameters);
    }
}
