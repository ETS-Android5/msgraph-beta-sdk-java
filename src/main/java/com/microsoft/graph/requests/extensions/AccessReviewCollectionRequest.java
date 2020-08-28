// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReview;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionPage;
import com.microsoft.graph.requests.extensions.AccessReviewCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessReviewCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Collection Request.
 */
public class AccessReviewCollectionRequest extends BaseCollectionRequest<AccessReviewCollectionResponse, IAccessReviewCollectionPage> implements IAccessReviewCollectionRequest {

    /**
     * The request builder for this collection of AccessReview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewCollectionResponse.class, IAccessReviewCollectionPage.class);
    }

    public void get(final ICallback<IAccessReviewCollectionPage> callback) {
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

    public IAccessReviewCollectionPage get() throws ClientException {
        final AccessReviewCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessReview newAccessReview, final ICallback<AccessReview> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessReviewRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAccessReview, callback);
    }

    public AccessReview post(final AccessReview newAccessReview) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessReviewRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAccessReview);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessReviewCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessReviewCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessReviewCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessReviewCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessReviewCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessReviewCollectionRequest)this;
    }

    public IAccessReviewCollectionPage buildFromResponse(final AccessReviewCollectionResponse response) {
        final IAccessReviewCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessReviewCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessReviewCollectionPage page = new AccessReviewCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
