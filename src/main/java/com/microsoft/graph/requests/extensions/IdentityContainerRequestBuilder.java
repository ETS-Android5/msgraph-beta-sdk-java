// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityContainer;
import com.microsoft.graph.requests.extensions.IConditionalAccessRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityApiConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityApiConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityApiConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityApiConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2cIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2cIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.B2cIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.B2cIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2xIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2xIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.B2xIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.B2xIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IContinuousAccessEvaluationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ContinuousAccessEvaluationPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Container Request Builder.
 */
public class IdentityContainerRequestBuilder extends BaseRequestBuilder implements IIdentityContainerRequestBuilder {

    /**
     * The request builder for the IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityContainerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIdentityContainerRequest instance
     */
    public IIdentityContainerRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIdentityContainerRequest instance
     */
    public IIdentityContainerRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IdentityContainerRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ConditionalAccessRoot
     *
     * @return the IConditionalAccessRootRequestBuilder instance
     */
    public IConditionalAccessRootRequestBuilder conditionalAccess() {
        return new ConditionalAccessRootRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccess"), getClient(), null);
    }
    public IIdentityApiConnectorCollectionRequestBuilder apiConnectors() {
        return new IdentityApiConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apiConnectors"), getClient(), null);
    }

    public IIdentityApiConnectorRequestBuilder apiConnectors(final String id) {
        return new IdentityApiConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("apiConnectors") + "/" + id, getClient(), null);
    }
    public IB2cIdentityUserFlowCollectionRequestBuilder b2cUserFlows() {
        return new B2cIdentityUserFlowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("b2cUserFlows"), getClient(), null);
    }

    public IB2cIdentityUserFlowRequestBuilder b2cUserFlows(final String id) {
        return new B2cIdentityUserFlowRequestBuilder(getRequestUrlWithAdditionalSegment("b2cUserFlows") + "/" + id, getClient(), null);
    }
    public IB2xIdentityUserFlowCollectionRequestBuilder b2xUserFlows() {
        return new B2xIdentityUserFlowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("b2xUserFlows"), getClient(), null);
    }

    public IB2xIdentityUserFlowRequestBuilder b2xUserFlows(final String id) {
        return new B2xIdentityUserFlowRequestBuilder(getRequestUrlWithAdditionalSegment("b2xUserFlows") + "/" + id, getClient(), null);
    }
    public IIdentityUserFlowAttributeCollectionRequestBuilder userFlowAttributes() {
        return new IdentityUserFlowAttributeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userFlowAttributes"), getClient(), null);
    }

    public IIdentityUserFlowAttributeRequestBuilder userFlowAttributes(final String id) {
        return new IdentityUserFlowAttributeRequestBuilder(getRequestUrlWithAdditionalSegment("userFlowAttributes") + "/" + id, getClient(), null);
    }
    public IIdentityUserFlowCollectionRequestBuilder userFlows() {
        return new IdentityUserFlowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userFlows"), getClient(), null);
    }

    public IIdentityUserFlowRequestBuilder userFlows(final String id) {
        return new IdentityUserFlowRequestBuilder(getRequestUrlWithAdditionalSegment("userFlows") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ContinuousAccessEvaluationPolicy
     *
     * @return the IContinuousAccessEvaluationPolicyRequestBuilder instance
     */
    public IContinuousAccessEvaluationPolicyRequestBuilder continuousAccessEvaluationPolicy() {
        return new ContinuousAccessEvaluationPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("continuousAccessEvaluationPolicy"), getClient(), null);
    }
}
