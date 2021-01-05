// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnPremisesAgentGroup;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PublishedResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Agent Group Request Builder.
 */
public class OnPremisesAgentGroupRequestBuilder extends BaseRequestBuilder implements IOnPremisesAgentGroupRequestBuilder {

    /**
     * The request builder for the OnPremisesAgentGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnPremisesAgentGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOnPremisesAgentGroupRequest instance
     */
    public IOnPremisesAgentGroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOnPremisesAgentGroupRequest instance
     */
    public IOnPremisesAgentGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OnPremisesAgentGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOnPremisesAgentCollectionRequestBuilder agents() {
        return new OnPremisesAgentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("agents"), getClient(), null);
    }

    public IOnPremisesAgentRequestBuilder agents(final String id) {
        return new OnPremisesAgentRequestBuilder(getRequestUrlWithAdditionalSegment("agents") + "/" + id, getClient(), null);
    }
    public IPublishedResourceCollectionRequestBuilder publishedResources() {
        return new PublishedResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("publishedResources"), getClient(), null);
    }

    public IPublishedResourceRequestBuilder publishedResources(final String id) {
        return new PublishedResourceRequestBuilder(getRequestUrlWithAdditionalSegment("publishedResources") + "/" + id, getClient(), null);
    }
}
