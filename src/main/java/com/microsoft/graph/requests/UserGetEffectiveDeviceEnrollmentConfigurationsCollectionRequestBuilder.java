// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder;
import com.microsoft.graph.requests.UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest;
import com.microsoft.graph.requests.UserGetEffectiveDeviceEnrollmentConfigurationsCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Effective Device Enrollment Configurations Collection Request Builder.
 */
public class UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<DeviceEnrollmentConfiguration, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionResponse, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionPage, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder.class, UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
