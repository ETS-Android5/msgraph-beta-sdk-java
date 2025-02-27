// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamworkDevice;
import com.microsoft.graph.models.TeamworkSoftwareType;
import com.microsoft.graph.requests.TeamworkDeviceActivityRequestBuilder;
import com.microsoft.graph.requests.TeamworkDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.TeamworkDeviceHealthRequestBuilder;
import com.microsoft.graph.requests.TeamworkDeviceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamworkDeviceOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.TeamworkDeviceUpdateSoftwareParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Device Request Builder.
 */
public class TeamworkDeviceRequestBuilder extends BaseRequestBuilder<TeamworkDevice> {

    /**
     * The request builder for the TeamworkDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TeamworkDeviceRequest instance
     */
    @Nonnull
    public TeamworkDeviceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TeamworkDeviceRequest instance
     */
    @Nonnull
    public TeamworkDeviceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TeamworkDeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for TeamworkDeviceActivity
     *
     * @return the TeamworkDeviceActivityRequestBuilder instance
     */
    @Nonnull
    public TeamworkDeviceActivityRequestBuilder activity() {
        return new TeamworkDeviceActivityRequestBuilder(getRequestUrlWithAdditionalSegment("activity"), getClient(), null);
    }

    /**
     * Gets the request builder for TeamworkDeviceConfiguration
     *
     * @return the TeamworkDeviceConfigurationRequestBuilder instance
     */
    @Nonnull
    public TeamworkDeviceConfigurationRequestBuilder configuration() {
        return new TeamworkDeviceConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("configuration"), getClient(), null);
    }

    /**
     * Gets the request builder for TeamworkDeviceHealth
     *
     * @return the TeamworkDeviceHealthRequestBuilder instance
     */
    @Nonnull
    public TeamworkDeviceHealthRequestBuilder health() {
        return new TeamworkDeviceHealthRequestBuilder(getRequestUrlWithAdditionalSegment("health"), getClient(), null);
    }
    /**
     *  Gets a request builder for the TeamworkDeviceOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamworkDeviceOperationCollectionRequestBuilder operations() {
        return new TeamworkDeviceOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the TeamworkDeviceOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamworkDeviceOperationRequestBuilder operations(@Nonnull final String id) {
        return new TeamworkDeviceOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public TeamworkDeviceRestartRequestBuilder restart() {
        return new TeamworkDeviceRestartRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restart"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public TeamworkDeviceRunDiagnosticsRequestBuilder runDiagnostics() {
        return new TeamworkDeviceRunDiagnosticsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.runDiagnostics"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TeamworkDeviceUpdateSoftwareRequestBuilder updateSoftware(@Nonnull final TeamworkDeviceUpdateSoftwareParameterSet parameters) {
        return new TeamworkDeviceUpdateSoftwareRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateSoftware"), getClient(), null, parameters);
    }
}
