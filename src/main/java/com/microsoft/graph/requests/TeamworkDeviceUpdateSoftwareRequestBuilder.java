// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.TeamworkDeviceUpdateSoftwareRequest;
import com.microsoft.graph.models.TeamworkDevice;
import com.microsoft.graph.models.TeamworkSoftwareType;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.TeamworkDeviceUpdateSoftwareParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Device Update Software Request Builder.
 */
public class TeamworkDeviceUpdateSoftwareRequestBuilder extends BaseActionRequestBuilder<TeamworkDevice> {

    /**
     * The request builder for this TeamworkDeviceUpdateSoftware
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkDeviceUpdateSoftwareRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private TeamworkDeviceUpdateSoftwareParameterSet body;
    /**
     * The request builder for this TeamworkDeviceUpdateSoftware
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TeamworkDeviceUpdateSoftwareRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TeamworkDeviceUpdateSoftwareParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TeamworkDeviceUpdateSoftwareRequest
     *
     * @param requestOptions the options for the request
     * @return the TeamworkDeviceUpdateSoftwareRequest instance
     */
    @Nonnull
    public TeamworkDeviceUpdateSoftwareRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TeamworkDeviceUpdateSoftwareRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TeamworkDeviceUpdateSoftwareRequest instance
     */
    @Nonnull
    public TeamworkDeviceUpdateSoftwareRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TeamworkDeviceUpdateSoftwareRequest request = new TeamworkDeviceUpdateSoftwareRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
