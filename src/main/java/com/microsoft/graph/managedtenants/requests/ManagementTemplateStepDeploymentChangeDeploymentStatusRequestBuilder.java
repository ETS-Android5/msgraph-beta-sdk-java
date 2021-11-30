// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.requests.ManagementTemplateStepDeploymentChangeDeploymentStatusRequest;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStepDeployment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.managedtenants.models.ManagementTemplateStepDeploymentChangeDeploymentStatusParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Template Step Deployment Change Deployment Status Request Builder.
 */
public class ManagementTemplateStepDeploymentChangeDeploymentStatusRequestBuilder extends BaseActionRequestBuilder<ManagementTemplateStepDeployment> {

    /**
     * The request builder for this ManagementTemplateStepDeploymentChangeDeploymentStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementTemplateStepDeploymentChangeDeploymentStatusRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ManagementTemplateStepDeploymentChangeDeploymentStatusParameterSet body;
    /**
     * The request builder for this ManagementTemplateStepDeploymentChangeDeploymentStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagementTemplateStepDeploymentChangeDeploymentStatusRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagementTemplateStepDeploymentChangeDeploymentStatusParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagementTemplateStepDeploymentChangeDeploymentStatusRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagementTemplateStepDeploymentChangeDeploymentStatusRequest instance
     */
    @Nonnull
    public ManagementTemplateStepDeploymentChangeDeploymentStatusRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagementTemplateStepDeploymentChangeDeploymentStatusRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagementTemplateStepDeploymentChangeDeploymentStatusRequest instance
     */
    @Nonnull
    public ManagementTemplateStepDeploymentChangeDeploymentStatusRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagementTemplateStepDeploymentChangeDeploymentStatusRequest request = new ManagementTemplateStepDeploymentChangeDeploymentStatusRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
