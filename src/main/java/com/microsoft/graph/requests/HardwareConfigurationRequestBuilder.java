// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.HardwareConfiguration;
import com.microsoft.graph.models.HardwareConfigurationAssignment;
import com.microsoft.graph.requests.HardwareConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationDeviceStateRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationRunSummaryRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationUserStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.HardwareConfigurationAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hardware Configuration Request Builder.
 */
public class HardwareConfigurationRequestBuilder extends BaseRequestBuilder<HardwareConfiguration> {

    /**
     * The request builder for the HardwareConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HardwareConfigurationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the HardwareConfigurationRequest instance
     */
    @Nonnull
    public HardwareConfigurationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the HardwareConfigurationRequest instance
     */
    @Nonnull
    public HardwareConfigurationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.HardwareConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the HardwareConfigurationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public HardwareConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new HardwareConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the HardwareConfigurationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public HardwareConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new HardwareConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the HardwareConfigurationDeviceState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public HardwareConfigurationDeviceStateCollectionRequestBuilder deviceRunStates() {
        return new HardwareConfigurationDeviceStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceRunStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the HardwareConfigurationDeviceState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public HardwareConfigurationDeviceStateRequestBuilder deviceRunStates(@Nonnull final String id) {
        return new HardwareConfigurationDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceRunStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for HardwareConfigurationRunSummary
     *
     * @return the HardwareConfigurationRunSummaryRequestBuilder instance
     */
    @Nonnull
    public HardwareConfigurationRunSummaryRequestBuilder runSummary() {
        return new HardwareConfigurationRunSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("runSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the HardwareConfigurationUserState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public HardwareConfigurationUserStateCollectionRequestBuilder userRunStates() {
        return new HardwareConfigurationUserStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userRunStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the HardwareConfigurationUserState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public HardwareConfigurationUserStateRequestBuilder userRunStates(@Nonnull final String id) {
        return new HardwareConfigurationUserStateRequestBuilder(getRequestUrlWithAdditionalSegment("userRunStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public HardwareConfigurationAssignCollectionRequestBuilder assign(@Nonnull final HardwareConfigurationAssignParameterSet parameters) {
        return new HardwareConfigurationAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
