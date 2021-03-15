// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AzureADWindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WindowsAutopilotDeploymentProfileAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Azure ADWindows Autopilot Deployment Profile Request Builder.
 */
public class AzureADWindowsAutopilotDeploymentProfileRequestBuilder extends BaseRequestBuilder<AzureADWindowsAutopilotDeploymentProfile> {

    /**
     * The request builder for the AzureADWindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AzureADWindowsAutopilotDeploymentProfileRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AzureADWindowsAutopilotDeploymentProfileRequest instance
     */
    @Nonnull
    public AzureADWindowsAutopilotDeploymentProfileRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AzureADWindowsAutopilotDeploymentProfileRequest instance
     */
    @Nonnull
    public AzureADWindowsAutopilotDeploymentProfileRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AzureADWindowsAutopilotDeploymentProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WindowsAutopilotDeviceIdentity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityCollectionRequestBuilder assignedDevices() {
        return new WindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsAutopilotDeviceIdentity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityRequestBuilder assignedDevices(@Nonnull final String id) {
        return new WindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("assignedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsAutopilotDeploymentProfileAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder assignments() {
        return new WindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsAutopilotDeploymentProfileAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new WindowsAutopilotDeploymentProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileAssignRequestBuilder assign(@Nonnull final WindowsAutopilotDeploymentProfileAssignParameterSet parameters) {
        return new WindowsAutopilotDeploymentProfileAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
