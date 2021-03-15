// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentity;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Unassign Resource Account From Device Request Builder.
 */
public class WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder extends BaseActionRequestBuilder<WindowsAutopilotDeviceIdentity> {

    /**
     * The request builder for this WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest
     *
     * @param requestOptions the options for the request
     * @return the WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest instance
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest instance
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest request = new WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
