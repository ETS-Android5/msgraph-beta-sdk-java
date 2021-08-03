// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AssignmentFilterSupportedProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequest;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter Get Supported Properties Collection Request Builder.
 */
public class DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AssignmentFilterSupportedProperty, DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequestBuilder, DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionResponse, DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionPage, DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequest> {

    /**
     * The request builder for this collection of DeviceAndAppManagementAssignmentFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequestBuilder.class, DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequest instance
     */
    @Override
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceAndAppManagementAssignmentFilterGetSupportedPropertiesCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
