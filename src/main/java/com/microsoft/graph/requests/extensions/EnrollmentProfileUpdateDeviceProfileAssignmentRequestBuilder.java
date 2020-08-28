// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileUpdateDeviceProfileAssignmentRequest;
import com.microsoft.graph.requests.extensions.EnrollmentProfileUpdateDeviceProfileAssignmentRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Profile Update Device Profile Assignment Request Builder.
 */
public class EnrollmentProfileUpdateDeviceProfileAssignmentRequestBuilder extends BaseActionRequestBuilder implements IEnrollmentProfileUpdateDeviceProfileAssignmentRequestBuilder {

    /**
     * The request builder for this EnrollmentProfileUpdateDeviceProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deviceIds the deviceIds
     */
    public EnrollmentProfileUpdateDeviceProfileAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> deviceIds) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("deviceIds", deviceIds);
    }

    /**
     * Creates the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest
     *
     * @return the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest instance
     */
    public IEnrollmentProfileUpdateDeviceProfileAssignmentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest instance
     */
    public IEnrollmentProfileUpdateDeviceProfileAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EnrollmentProfileUpdateDeviceProfileAssignmentRequest request = new EnrollmentProfileUpdateDeviceProfileAssignmentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("deviceIds")) {
            request.body.deviceIds = getParameter("deviceIds");
        }

        return request;
    }
}
