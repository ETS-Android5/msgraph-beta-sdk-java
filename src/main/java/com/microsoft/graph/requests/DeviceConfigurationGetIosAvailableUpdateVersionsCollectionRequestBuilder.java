// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequest;
import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Get Ios Available Update Versions Collection Request Builder.
 */
public class DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<IosAvailableUpdateVersion, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionResponse, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionPage, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequest> {

    /**
     * The request builder for this collection of DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder.class, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequest instance
     */
    @Override
    @Nonnull
    public DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
