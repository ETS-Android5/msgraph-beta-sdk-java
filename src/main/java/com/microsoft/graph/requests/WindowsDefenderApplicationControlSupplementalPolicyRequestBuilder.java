// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicyAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Request Builder.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder extends BaseRequestBuilder<WindowsDefenderApplicationControlSupplementalPolicy> {

    /**
     * The request builder for the WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WindowsDefenderApplicationControlSupplementalPolicyRequest instance
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WindowsDefenderApplicationControlSupplementalPolicyRequest instance
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WindowsDefenderApplicationControlSupplementalPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder assignments() {
        return new WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsDefenderApplicationControlSupplementalPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder instance
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder deploySummary() {
        return new WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploySummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder deviceStatuses() {
        return new WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder assign(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyAssignParameterSet parameters) {
        return new WindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
