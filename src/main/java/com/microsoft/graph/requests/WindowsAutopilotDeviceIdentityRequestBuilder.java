// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.models.DeletedWindowsAutopilotDeviceState;
import com.microsoft.graph.requests.WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceParameterSet;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentityAssignUserToDeviceParameterSet;
import com.microsoft.graph.models.WindowsAutopilotDeviceIdentityUpdateDevicePropertiesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Request Builder.
 */
public class WindowsAutopilotDeviceIdentityRequestBuilder extends BaseRequestBuilder<WindowsAutopilotDeviceIdentity> {

    /**
     * The request builder for the WindowsAutopilotDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WindowsAutopilotDeviceIdentityRequest instance
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WindowsAutopilotDeviceIdentityRequest instance
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WindowsAutopilotDeviceIdentityRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder deploymentProfile() {
        return new WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentProfile"), getClient(), null);
    }

    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    @Nonnull
    public WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder intendedDeploymentProfile() {
        return new WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("intendedDeploymentProfile"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder assignResourceAccountToDevice(@Nonnull final WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceParameterSet parameters) {
        return new WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignResourceAccountToDevice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder assignUserToDevice(@Nonnull final WindowsAutopilotDeviceIdentityAssignUserToDeviceParameterSet parameters) {
        return new WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignUserToDevice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder unassignResourceAccountFromDevice() {
        return new WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unassignResourceAccountFromDevice"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder unassignUserFromDevice() {
        return new WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unassignUserFromDevice"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsAutopilotDeviceIdentityUpdateDevicePropertiesRequestBuilder updateDeviceProperties(@Nonnull final WindowsAutopilotDeviceIdentityUpdateDevicePropertiesParameterSet parameters) {
        return new WindowsAutopilotDeviceIdentityUpdateDevicePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateDeviceProperties"), getClient(), null, parameters);
    }
}
