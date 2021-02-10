// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.extensions.AssignmentOrder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Request Builder.
 */
public class IdentityUserFlowAttributeAssignmentRequestBuilder extends BaseRequestBuilder implements IIdentityUserFlowAttributeAssignmentRequestBuilder {

    /**
     * The request builder for the IdentityUserFlowAttributeAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowAttributeAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIdentityUserFlowAttributeAssignmentRequest instance
     */
    public IIdentityUserFlowAttributeAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIdentityUserFlowAttributeAssignmentRequest instance
     */
    public IIdentityUserFlowAttributeAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for IdentityUserFlowAttribute
     *
     * @return the IIdentityUserFlowAttributeWithReferenceRequestBuilder instance
     */
    public IIdentityUserFlowAttributeWithReferenceRequestBuilder userAttribute() {
        return new IdentityUserFlowAttributeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("userAttribute"), getClient(), null);
    }
}
