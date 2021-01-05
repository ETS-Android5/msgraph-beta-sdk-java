// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AzureADWindowsAutopilotDeploymentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Azure ADWindows Autopilot Deployment Profile Request Builder.
 */
public class AzureADWindowsAutopilotDeploymentProfileRequestBuilder extends BaseRequestBuilder implements IAzureADWindowsAutopilotDeploymentProfileRequestBuilder {

    /**
     * The request builder for the AzureADWindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AzureADWindowsAutopilotDeploymentProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAzureADWindowsAutopilotDeploymentProfileRequest instance
     */
    public IAzureADWindowsAutopilotDeploymentProfileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAzureADWindowsAutopilotDeploymentProfileRequest instance
     */
    public IAzureADWindowsAutopilotDeploymentProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AzureADWindowsAutopilotDeploymentProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWindowsAutopilotDeviceIdentityCollectionRequestBuilder assignedDevices() {
        return new WindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignedDevices"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityRequestBuilder assignedDevices(final String id) {
        return new WindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("assignedDevices") + "/" + id, getClient(), null);
    }
    public IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder assignments() {
        return new WindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder assignments(final String id) {
        return new WindowsAutopilotDeploymentProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
}
