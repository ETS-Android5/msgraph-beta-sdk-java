// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.VirtualEndpoint;
import com.microsoft.graph.requests.CloudPCCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPCRequestBuilder;
import com.microsoft.graph.requests.CloudPcDeviceImageCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPcDeviceImageRequestBuilder;
import com.microsoft.graph.requests.CloudPcOnPremisesConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPcOnPremisesConnectionRequestBuilder;
import com.microsoft.graph.requests.CloudPcProvisioningPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudPcProvisioningPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Virtual Endpoint Request Builder.
 */
public class VirtualEndpointRequestBuilder extends BaseRequestBuilder<VirtualEndpoint> {

    /**
     * The request builder for the VirtualEndpoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VirtualEndpointRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the VirtualEndpointRequest instance
     */
    @Nonnull
    public VirtualEndpointRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the VirtualEndpointRequest instance
     */
    @Nonnull
    public VirtualEndpointRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.VirtualEndpointRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the CloudPC collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPCCollectionRequestBuilder cloudPCs() {
        return new CloudPCCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPCs"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPC item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPCRequestBuilder cloudPCs(@Nonnull final String id) {
        return new CloudPCRequestBuilder(getRequestUrlWithAdditionalSegment("cloudPCs") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudPcDeviceImage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPcDeviceImageCollectionRequestBuilder deviceImages() {
        return new CloudPcDeviceImageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceImages"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPcDeviceImage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPcDeviceImageRequestBuilder deviceImages(@Nonnull final String id) {
        return new CloudPcDeviceImageRequestBuilder(getRequestUrlWithAdditionalSegment("deviceImages") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudPcOnPremisesConnection collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPcOnPremisesConnectionCollectionRequestBuilder onPremisesConnections() {
        return new CloudPcOnPremisesConnectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onPremisesConnections"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPcOnPremisesConnection item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPcOnPremisesConnectionRequestBuilder onPremisesConnections(@Nonnull final String id) {
        return new CloudPcOnPremisesConnectionRequestBuilder(getRequestUrlWithAdditionalSegment("onPremisesConnections") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CloudPcProvisioningPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CloudPcProvisioningPolicyCollectionRequestBuilder provisioningPolicies() {
        return new CloudPcProvisioningPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("provisioningPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the CloudPcProvisioningPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CloudPcProvisioningPolicyRequestBuilder provisioningPolicies(@Nonnull final String id) {
        return new CloudPcProvisioningPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("provisioningPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public VirtualEndpointGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions() {
        return new VirtualEndpointGetEffectivePermissionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectivePermissions"), getClient(), null);
    }
}
