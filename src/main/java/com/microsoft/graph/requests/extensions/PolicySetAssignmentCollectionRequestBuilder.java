// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicySet;
import com.microsoft.graph.models.extensions.PolicySetAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPolicySetAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Assignment Collection Request Builder.
 */
public class PolicySetAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IPolicySetAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of PolicySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicySetAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPolicySetAssignmentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPolicySetAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PolicySetAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPolicySetAssignmentRequestBuilder byId(final String id) {
        return new PolicySetAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
