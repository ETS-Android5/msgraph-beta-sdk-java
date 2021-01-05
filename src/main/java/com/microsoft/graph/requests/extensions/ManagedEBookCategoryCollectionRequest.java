// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.ManagedEBookCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedEBookCategoryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Category Collection Request.
 */
public class ManagedEBookCategoryCollectionRequest extends BaseCollectionRequest<ManagedEBookCategoryCollectionResponse, IManagedEBookCategoryCollectionPage> implements IManagedEBookCategoryCollectionRequest {

    /**
     * The request builder for this collection of ManagedEBookCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookCategoryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBookCategoryCollectionResponse.class, IManagedEBookCategoryCollectionPage.class);
    }

    public void get(final ICallback<? super IManagedEBookCategoryCollectionPage> callback) {
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

    public IManagedEBookCategoryCollectionPage get() throws ClientException {
        final ManagedEBookCategoryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedEBookCategory newManagedEBookCategory, final ICallback<? super ManagedEBookCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedEBookCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedEBookCategory, callback);
    }

    public ManagedEBookCategory post(final ManagedEBookCategory newManagedEBookCategory) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedEBookCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedEBookCategory);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedEBookCategoryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedEBookCategoryCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ManagedEBookCategoryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedEBookCategoryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedEBookCategoryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedEBookCategoryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IManagedEBookCategoryCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IManagedEBookCategoryCollectionRequest)this;
    }
    public IManagedEBookCategoryCollectionPage buildFromResponse(final ManagedEBookCategoryCollectionResponse response) {
        final IManagedEBookCategoryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedEBookCategoryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedEBookCategoryCollectionPage page = new ManagedEBookCategoryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
