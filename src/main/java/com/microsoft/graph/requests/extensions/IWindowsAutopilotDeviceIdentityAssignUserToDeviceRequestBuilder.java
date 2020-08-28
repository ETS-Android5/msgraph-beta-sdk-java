// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Device Identity Assign User To Device Request Builder.
 */
public interface IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest
     *
     * @return the IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest instance
     */
    IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest buildRequest();

    /**
     * Creates the IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest instance
     */
    IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
