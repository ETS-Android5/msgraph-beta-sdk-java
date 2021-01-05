// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityContainer;
import com.microsoft.graph.models.extensions.B2xIdentityUserFlow;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IB2xIdentityUserFlowCollectionPage;
import com.microsoft.graph.requests.extensions.B2xIdentityUserFlowCollectionResponse;
import com.microsoft.graph.requests.extensions.IB2xIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IB2xIdentityUserFlowCollectionRequest;
import com.microsoft.graph.requests.extensions.B2xIdentityUserFlowCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2x Identity User Flow Collection Request.
 */
public class B2xIdentityUserFlowCollectionRequest extends BaseCollectionRequest<B2xIdentityUserFlowCollectionResponse, IB2xIdentityUserFlowCollectionPage> implements IB2xIdentityUserFlowCollectionRequest {

    /**
     * The request builder for this collection of B2xIdentityUserFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public B2xIdentityUserFlowCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, B2xIdentityUserFlowCollectionResponse.class, IB2xIdentityUserFlowCollectionPage.class);
    }

    public void get(final ICallback<? super IB2xIdentityUserFlowCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IB2xIdentityUserFlowCollectionPage get() throws ClientException {
        final B2xIdentityUserFlowCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final B2xIdentityUserFlow newB2xIdentityUserFlow, final ICallback<? super B2xIdentityUserFlow> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new B2xIdentityUserFlowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newB2xIdentityUserFlow, callback);
    }

    public B2xIdentityUserFlow post(final B2xIdentityUserFlow newB2xIdentityUserFlow) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new B2xIdentityUserFlowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newB2xIdentityUserFlow);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (B2xIdentityUserFlowCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (B2xIdentityUserFlowCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (B2xIdentityUserFlowCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (B2xIdentityUserFlowCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (B2xIdentityUserFlowCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (B2xIdentityUserFlowCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IB2xIdentityUserFlowCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IB2xIdentityUserFlowCollectionRequest)this;
    }
    public IB2xIdentityUserFlowCollectionPage buildFromResponse(final B2xIdentityUserFlowCollectionResponse response) {
        final IB2xIdentityUserFlowCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new B2xIdentityUserFlowCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final B2xIdentityUserFlowCollectionPage page = new B2xIdentityUserFlowCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
