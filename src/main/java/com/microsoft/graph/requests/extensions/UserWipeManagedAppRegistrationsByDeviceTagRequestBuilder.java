// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserWipeManagedAppRegistrationsByDeviceTagRequest;
import com.microsoft.graph.requests.extensions.UserWipeManagedAppRegistrationsByDeviceTagRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Wipe Managed App Registrations By Device Tag Request Builder.
 */
public class UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder extends BaseActionRequestBuilder implements IUserWipeManagedAppRegistrationsByDeviceTagRequestBuilder {

    /**
     * The request builder for this UserWipeManagedAppRegistrationsByDeviceTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deviceTag the deviceTag
     */
    public UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String deviceTag) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("deviceTag", deviceTag);
    }

    /**
     * Creates the IUserWipeManagedAppRegistrationsByDeviceTagRequest
     *
     * @return the IUserWipeManagedAppRegistrationsByDeviceTagRequest instance
     */
    public IUserWipeManagedAppRegistrationsByDeviceTagRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserWipeManagedAppRegistrationsByDeviceTagRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserWipeManagedAppRegistrationsByDeviceTagRequest instance
     */
    public IUserWipeManagedAppRegistrationsByDeviceTagRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserWipeManagedAppRegistrationsByDeviceTagRequest request = new UserWipeManagedAppRegistrationsByDeviceTagRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("deviceTag")) {
            request.body.deviceTag = getParameter("deviceTag");
        }

        return request;
    }
}
