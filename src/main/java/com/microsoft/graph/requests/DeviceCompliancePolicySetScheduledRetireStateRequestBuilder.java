// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceCompliancePolicySetScheduledRetireStateRequest;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.ScheduledRetireState;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicySetScheduledRetireStateParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Set Scheduled Retire State Request Builder.
 */
public class DeviceCompliancePolicySetScheduledRetireStateRequestBuilder extends BaseActionRequestBuilder<DeviceCompliancePolicy> {

    /**
     * The request builder for this DeviceCompliancePolicySetScheduledRetireState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicySetScheduledRetireStateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceCompliancePolicySetScheduledRetireStateParameterSet body;
    /**
     * The request builder for this DeviceCompliancePolicySetScheduledRetireState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceCompliancePolicySetScheduledRetireStateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceCompliancePolicySetScheduledRetireStateParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceCompliancePolicySetScheduledRetireStateRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceCompliancePolicySetScheduledRetireStateRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicySetScheduledRetireStateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceCompliancePolicySetScheduledRetireStateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceCompliancePolicySetScheduledRetireStateRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicySetScheduledRetireStateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceCompliancePolicySetScheduledRetireStateRequest request = new DeviceCompliancePolicySetScheduledRetireStateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
