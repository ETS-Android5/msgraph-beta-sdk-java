// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.IosTrustedRootCertificate;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.IosTrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.IosTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.IosTrustedRootCertificateCollectionRequest;
import com.microsoft.graph.requests.DeviceConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationGetTargetedUsersAndDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DeviceConfigurationAssignParameterSet;
import com.microsoft.graph.models.DeviceConfigurationHasPayloadLinksParameterSet;
import com.microsoft.graph.models.DeviceConfigurationGetTargetedUsersAndDevicesParameterSet;
import com.microsoft.graph.models.DeviceConfigurationAssignedAccessMultiModeProfilesParameterSet;
import com.microsoft.graph.models.DeviceConfigurationWindowsPrivacyAccessControlsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Trusted Root Certificate Collection Request Builder.
 */
public class IosTrustedRootCertificateCollectionRequestBuilder extends BaseCollectionRequestBuilder<IosTrustedRootCertificate, IosTrustedRootCertificateRequestBuilder, IosTrustedRootCertificateCollectionResponse, IosTrustedRootCertificateCollectionPage, IosTrustedRootCertificateCollectionRequest> {

    /**
     * The request builder for this collection of IosEnterpriseWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosTrustedRootCertificateCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosTrustedRootCertificateRequestBuilder.class, IosTrustedRootCertificateCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(@Nonnull final DeviceConfigurationHasPayloadLinksParameterSet parameters) {
        return new DeviceConfigurationHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationGetTargetedUsersAndDevicesCollectionRequestBuilder getTargetedUsersAndDevices(@Nonnull final DeviceConfigurationGetTargetedUsersAndDevicesParameterSet parameters) {
        return new DeviceConfigurationGetTargetedUsersAndDevicesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTargetedUsersAndDevices"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder getIosAvailableUpdateVersions() {
        return new DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getIosAvailableUpdateVersions"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
