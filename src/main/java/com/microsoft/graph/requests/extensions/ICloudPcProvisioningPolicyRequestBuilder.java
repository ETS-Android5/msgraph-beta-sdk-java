// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicyAssignment;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Cloud Pc Provisioning Policy Request Builder.
 */
public interface ICloudPcProvisioningPolicyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICloudPcProvisioningPolicyRequest instance
     */
    ICloudPcProvisioningPolicyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICloudPcProvisioningPolicyRequest instance
     */
    ICloudPcProvisioningPolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder assignments();

    ICloudPcProvisioningPolicyAssignmentRequestBuilder assignments(final String id);
    ICloudPcProvisioningPolicyAssignRequestBuilder assign(final java.util.List<CloudPcProvisioningPolicyAssignment> assignments);

}