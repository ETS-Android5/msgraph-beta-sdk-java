// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignCollectionRequest;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyAssignCollectionResponse;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicyAssignParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assign Collection Request Builder.
 */
public class DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<DeviceManagementConfigurationPolicyAssignment, DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder, DeviceManagementConfigurationPolicyAssignCollectionResponse, DeviceManagementConfigurationPolicyAssignCollectionPage, DeviceManagementConfigurationPolicyAssignCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagementConfigurationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder.class, DeviceManagementConfigurationPolicyAssignCollectionRequest.class);
    }
    private DeviceManagementConfigurationPolicyAssignParameterSet body;
    /**
     * The request builder for this collection of DeviceManagementConfigurationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementConfigurationPolicyAssignParameterSet parameters) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder.class, DeviceManagementConfigurationPolicyAssignCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementConfigurationPolicyAssignCollectionRequest instance
     */
    @Override
    @Nonnull
    public DeviceManagementConfigurationPolicyAssignCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementConfigurationPolicyAssignCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
