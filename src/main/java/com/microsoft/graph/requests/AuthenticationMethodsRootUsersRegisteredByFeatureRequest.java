// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserRegistrationFeatureSummary;
import com.microsoft.graph.models.AuthenticationMethodsRoot;
import com.microsoft.graph.requests.AuthenticationMethodsRootUsersRegisteredByFeatureRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Root Users Registered By Feature Request.
 */
public class AuthenticationMethodsRootUsersRegisteredByFeatureRequest extends BaseRequest<UserRegistrationFeatureSummary> {
    /**
     * The request for this AuthenticationMethodsRootUsersRegisteredByFeature
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserRegistrationFeatureSummary.class);
    }

    /**
     * Gets the UserRegistrationFeatureSummary
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserRegistrationFeatureSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserRegistrationFeatureSummary
     *
     * @return the UserRegistrationFeatureSummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public UserRegistrationFeatureSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public AuthenticationMethodsRootUsersRegisteredByFeatureRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
