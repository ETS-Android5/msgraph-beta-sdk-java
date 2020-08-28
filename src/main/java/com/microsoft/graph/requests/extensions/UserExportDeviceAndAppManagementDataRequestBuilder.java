// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserExportDeviceAndAppManagementDataRequest;
import com.microsoft.graph.requests.extensions.UserExportDeviceAndAppManagementDataRequest;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementData;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementData;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Export Device And App Management Data Request Builder.
 */
public class UserExportDeviceAndAppManagementDataRequestBuilder extends BaseFunctionRequestBuilder implements IUserExportDeviceAndAppManagementDataRequestBuilder {

    /**
     * The request builder for this UserExportDeviceAndAppManagementData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExportDeviceAndAppManagementDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this UserExportDeviceAndAppManagementData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param skip the skip
     * @param top the top
     */
    public UserExportDeviceAndAppManagementDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer skip, final Integer top) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("skip", skip));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("top", top));
    }

    /**
     * Creates the IUserExportDeviceAndAppManagementDataRequest
     *
     * @return the IUserExportDeviceAndAppManagementDataRequest instance
     */
    public IUserExportDeviceAndAppManagementDataRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserExportDeviceAndAppManagementDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserExportDeviceAndAppManagementDataRequest instance
     */
    public IUserExportDeviceAndAppManagementDataRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserExportDeviceAndAppManagementDataRequest request = new UserExportDeviceAndAppManagementDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
