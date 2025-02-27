// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.AuthenticationMethodsRootUsersRegisteredByMethodRequest;
import com.microsoft.graph.models.AuthenticationMethodsRoot;
import com.microsoft.graph.models.UserRegistrationMethodSummary;
import com.microsoft.graph.models.IncludedUserTypes;
import com.microsoft.graph.models.IncludedUserRoles;
import com.microsoft.graph.models.UserRegistrationMethodSummary;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.AuthenticationMethodsRootUsersRegisteredByMethodParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Root Users Registered By Method Request Builder.
 */
public class AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder extends BaseFunctionRequestBuilder<UserRegistrationMethodSummary> {

    /**
     * The request builder for this AuthenticationMethodsRootUsersRegisteredByMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this AuthenticationMethodsRootUsersRegisteredByMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AuthenticationMethodsRootUsersRegisteredByMethodParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the AuthenticationMethodsRootUsersRegisteredByMethodRequest
     *
     * @param requestOptions the options for the request
     * @return the AuthenticationMethodsRootUsersRegisteredByMethodRequest instance
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByMethodRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AuthenticationMethodsRootUsersRegisteredByMethodRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AuthenticationMethodsRootUsersRegisteredByMethodRequest instance
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByMethodRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AuthenticationMethodsRootUsersRegisteredByMethodRequest request = new AuthenticationMethodsRootUsersRegisteredByMethodRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
