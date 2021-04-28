// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyAssignment;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyAssignParameterSet;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyCreateCopyParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Request Builder.
 */
public class DeviceManagementConfigurationPolicyRequestBuilder extends BaseRequestBuilder<DeviceManagementConfigurationPolicy> {

    /**
     * The request builder for the DeviceManagementConfigurationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementConfigurationPolicyRequest instance
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementConfigurationPolicyRequest instance
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DeviceManagementConfigurationPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceManagementConfigurationPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder assignments() {
        return new DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementConfigurationPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceManagementConfigurationPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementConfigurationSetting collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementConfigurationSettingCollectionRequestBuilder settings() {
        return new DeviceManagementConfigurationSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementConfigurationSetting item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementConfigurationSettingRequestBuilder settings(@Nonnull final String id) {
        return new DeviceManagementConfigurationSettingRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder assign(@Nonnull final DeviceManagementConfigurationPolicyAssignParameterSet parameters) {
        return new DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementConfigurationPolicyCreateCopyRequestBuilder createCopy(@Nonnull final DeviceManagementConfigurationPolicyCreateCopyParameterSet parameters) {
        return new DeviceManagementConfigurationPolicyCreateCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createCopy"), getClient(), null, parameters);
    }
}
