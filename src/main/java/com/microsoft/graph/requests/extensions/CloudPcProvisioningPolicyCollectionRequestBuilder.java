// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.VirtualEndpoint;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Provisioning Policy Collection Request Builder.
 */
public class CloudPcProvisioningPolicyCollectionRequestBuilder extends BaseRequestBuilder implements ICloudPcProvisioningPolicyCollectionRequestBuilder {

    /**
     * The request builder for this collection of VirtualEndpoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPcProvisioningPolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ICloudPcProvisioningPolicyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ICloudPcProvisioningPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CloudPcProvisioningPolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICloudPcProvisioningPolicyRequestBuilder byId(final String id) {
        return new CloudPcProvisioningPolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
