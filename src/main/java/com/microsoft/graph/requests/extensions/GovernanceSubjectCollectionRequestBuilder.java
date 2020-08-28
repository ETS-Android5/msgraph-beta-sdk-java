// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceSubject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Subject Collection Request Builder.
 */
public class GovernanceSubjectCollectionRequestBuilder extends BaseRequestBuilder implements IGovernanceSubjectCollectionRequestBuilder {

    /**
     * The request builder for this collection of GovernanceSubject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceSubjectCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IGovernanceSubjectCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IGovernanceSubjectCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GovernanceSubjectCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGovernanceSubjectRequestBuilder byId(final String id) {
        return new GovernanceSubjectRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
