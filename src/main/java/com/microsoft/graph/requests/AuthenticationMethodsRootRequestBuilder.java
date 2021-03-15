// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuthenticationMethodsRoot;
import com.microsoft.graph.models.UserRegistrationFeatureSummary;
import com.microsoft.graph.models.IncludedUserTypes;
import com.microsoft.graph.models.IncludedUserRoles;
import com.microsoft.graph.models.UserRegistrationMethodSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet;
import com.microsoft.graph.models.AuthenticationMethodsRootUsersRegisteredByMethodParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Root Request Builder.
 */
public class AuthenticationMethodsRootRequestBuilder extends BaseRequestBuilder<AuthenticationMethodsRoot> {

    /**
     * The request builder for the AuthenticationMethodsRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodsRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AuthenticationMethodsRootRequest instance
     */
    @Nonnull
    public AuthenticationMethodsRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AuthenticationMethodsRootRequest instance
     */
    @Nonnull
    public AuthenticationMethodsRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AuthenticationMethodsRootRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder usersRegisteredByFeature() {
        return new AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usersRegisteredByFeature"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder usersRegisteredByFeature(@Nonnull final AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet parameters) {
        return new AuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usersRegisteredByFeature"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder usersRegisteredByMethod() {
        return new AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usersRegisteredByMethod"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder usersRegisteredByMethod(@Nonnull final AuthenticationMethodsRootUsersRegisteredByMethodParameterSet parameters) {
        return new AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.usersRegisteredByMethod"), getClient(), null, parameters);
    }
}
