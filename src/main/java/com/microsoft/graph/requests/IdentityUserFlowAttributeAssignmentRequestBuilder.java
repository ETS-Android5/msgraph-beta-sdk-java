// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.AssignmentOrder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Request Builder.
 */
public class IdentityUserFlowAttributeAssignmentRequestBuilder extends BaseRequestBuilder<IdentityUserFlowAttributeAssignment> {

    /**
     * The request builder for the IdentityUserFlowAttributeAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowAttributeAssignmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IdentityUserFlowAttributeAssignmentRequest instance
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IdentityUserFlowAttributeAssignmentRequest instance
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for IdentityUserFlowAttribute
     *
     * @return the IdentityUserFlowAttributeWithReferenceRequestBuilder instance
     */
    @Nonnull
    public IdentityUserFlowAttributeWithReferenceRequestBuilder userAttribute() {
        return new IdentityUserFlowAttributeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("userAttribute"), getClient(), null);
    }
}
