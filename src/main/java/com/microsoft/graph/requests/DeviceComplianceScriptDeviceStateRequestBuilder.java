// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceComplianceScriptDeviceState;
import com.microsoft.graph.requests.ManagedDeviceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Device State Request Builder.
 */
public class DeviceComplianceScriptDeviceStateRequestBuilder extends BaseRequestBuilder<DeviceComplianceScriptDeviceState> {

    /**
     * The request builder for the DeviceComplianceScriptDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScriptDeviceStateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceComplianceScriptDeviceStateRequest instance
     */
    @Nonnull
    public DeviceComplianceScriptDeviceStateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceComplianceScriptDeviceStateRequest instance
     */
    @Nonnull
    public DeviceComplianceScriptDeviceStateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DeviceComplianceScriptDeviceStateRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ManagedDevice
     *
     * @return the ManagedDeviceWithReferenceRequestBuilder instance
     */
    @Nonnull
    public ManagedDeviceWithReferenceRequestBuilder managedDevice() {
        return new ManagedDeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevice"), getClient(), null);
    }
}
