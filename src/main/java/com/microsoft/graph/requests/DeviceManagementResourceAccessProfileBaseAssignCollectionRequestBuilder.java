// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseAssignCollectionRequest;
import com.microsoft.graph.requests.DeviceManagementResourceAccessProfileBaseAssignCollectionResponse;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBaseAssignParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Base Assign Collection Request Builder.
 */
public class DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<DeviceManagementResourceAccessProfileAssignment, DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder, DeviceManagementResourceAccessProfileBaseAssignCollectionResponse, DeviceManagementResourceAccessProfileBaseAssignCollectionPage, DeviceManagementResourceAccessProfileBaseAssignCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagementResourceAccessProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder.class, DeviceManagementResourceAccessProfileBaseAssignCollectionRequest.class);
    }
    private DeviceManagementResourceAccessProfileBaseAssignParameterSet body;
    /**
     * The request builder for this collection of DeviceManagementResourceAccessProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementResourceAccessProfileBaseAssignParameterSet parameters) {
        super(requestUrl, client, requestOptions, DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder.class, DeviceManagementResourceAccessProfileBaseAssignCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementResourceAccessProfileBaseAssignCollectionRequest instance
     */
    @Override
    @Nonnull
    public DeviceManagementResourceAccessProfileBaseAssignCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementResourceAccessProfileBaseAssignCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
