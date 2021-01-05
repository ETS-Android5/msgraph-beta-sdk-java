// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCanSignUpRequest;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCanSignUpRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Can Sign Up Request Builder.
 */
public class PrivilegedSignupStatusCanSignUpRequestBuilder extends BaseFunctionRequestBuilder implements IPrivilegedSignupStatusCanSignUpRequestBuilder {

    /**
     * The request builder for this PrivilegedSignupStatusCanSignUp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusCanSignUpRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrivilegedSignupStatusCanSignUpRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedSignupStatusCanSignUpRequest instance
     */
    public IPrivilegedSignupStatusCanSignUpRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrivilegedSignupStatusCanSignUpRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedSignupStatusCanSignUpRequest instance
     */
    public IPrivilegedSignupStatusCanSignUpRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrivilegedSignupStatusCanSignUpRequest request = new PrivilegedSignupStatusCanSignUpRequest(
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
