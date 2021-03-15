// Template Source: BaseEntityReferenceRequest.java.tt
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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Reference Request.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyReferenceRequest extends BaseReferenceRequest<WindowsDefenderApplicationControlSupplementalPolicy> {

    /**
     * The request for the WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderApplicationControlSupplementalPolicy.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public WindowsDefenderApplicationControlSupplementalPolicyReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
}
