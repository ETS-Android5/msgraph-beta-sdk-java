// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest;
import com.microsoft.graph.models.ServicePrincipal;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ServicePrincipalDeletePasswordSingleSignOnCredentialsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Delete Password Single Sign On Credentials Request Builder.
 */
public class ServicePrincipalDeletePasswordSingleSignOnCredentialsRequestBuilder extends BaseActionRequestBuilder<ServicePrincipal> {

    /**
     * The request builder for this ServicePrincipalDeletePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalDeletePasswordSingleSignOnCredentialsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ServicePrincipalDeletePasswordSingleSignOnCredentialsParameterSet body;
    /**
     * The request builder for this ServicePrincipalDeletePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ServicePrincipalDeletePasswordSingleSignOnCredentialsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ServicePrincipalDeletePasswordSingleSignOnCredentialsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest instance
     */
    @Nonnull
    public ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest instance
     */
    @Nonnull
    public ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest request = new ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
