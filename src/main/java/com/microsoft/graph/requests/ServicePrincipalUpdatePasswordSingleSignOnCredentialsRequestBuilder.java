// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.models.Credential;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ServicePrincipalUpdatePasswordSingleSignOnCredentialsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Update Password Single Sign On Credentials Request Builder.
 */
public class ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequestBuilder extends BaseActionRequestBuilder<ServicePrincipal> {

    /**
     * The request builder for this ServicePrincipalUpdatePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ServicePrincipalUpdatePasswordSingleSignOnCredentialsParameterSet body;
    /**
     * The request builder for this ServicePrincipalUpdatePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ServicePrincipalUpdatePasswordSingleSignOnCredentialsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest instance
     */
    @Nonnull
    public ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest instance
     */
    @Nonnull
    public ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest request = new ServicePrincipalUpdatePasswordSingleSignOnCredentialsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
