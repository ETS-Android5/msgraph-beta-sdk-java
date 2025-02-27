// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.UserWipeManagedAppRegistrationByDeviceTagRequest;
import com.microsoft.graph.models.User;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.UserWipeManagedAppRegistrationByDeviceTagParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Wipe Managed App Registration By Device Tag Request Builder.
 */
public class UserWipeManagedAppRegistrationByDeviceTagRequestBuilder extends BaseActionRequestBuilder<User> {

    /**
     * The request builder for this UserWipeManagedAppRegistrationByDeviceTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserWipeManagedAppRegistrationByDeviceTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private UserWipeManagedAppRegistrationByDeviceTagParameterSet body;
    /**
     * The request builder for this UserWipeManagedAppRegistrationByDeviceTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserWipeManagedAppRegistrationByDeviceTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserWipeManagedAppRegistrationByDeviceTagParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the UserWipeManagedAppRegistrationByDeviceTagRequest
     *
     * @param requestOptions the options for the request
     * @return the UserWipeManagedAppRegistrationByDeviceTagRequest instance
     */
    @Nonnull
    public UserWipeManagedAppRegistrationByDeviceTagRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserWipeManagedAppRegistrationByDeviceTagRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserWipeManagedAppRegistrationByDeviceTagRequest instance
     */
    @Nonnull
    public UserWipeManagedAppRegistrationByDeviceTagRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserWipeManagedAppRegistrationByDeviceTagRequest request = new UserWipeManagedAppRegistrationByDeviceTagRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
