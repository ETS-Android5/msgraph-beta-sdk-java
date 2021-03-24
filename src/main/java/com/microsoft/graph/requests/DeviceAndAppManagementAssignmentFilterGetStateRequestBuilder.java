// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetStateRequest;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.graph.models.AssignmentFilterState;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter Get State Request Builder.
 */
public class DeviceAndAppManagementAssignmentFilterGetStateRequestBuilder extends BaseFunctionRequestBuilder<AssignmentFilterState> {

    /**
     * The request builder for this DeviceAndAppManagementAssignmentFilterGetState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementAssignmentFilterGetStateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the DeviceAndAppManagementAssignmentFilterGetStateRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceAndAppManagementAssignmentFilterGetStateRequest instance
     */
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterGetStateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceAndAppManagementAssignmentFilterGetStateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceAndAppManagementAssignmentFilterGetStateRequest instance
     */
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterGetStateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceAndAppManagementAssignmentFilterGetStateRequest request = new DeviceAndAppManagementAssignmentFilterGetStateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
