// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValue;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionResponse;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Value Collection Request.
 */
public class GroupPolicyPresentationValueCollectionRequest extends BaseCollectionRequest<GroupPolicyPresentationValueCollectionResponse, IGroupPolicyPresentationValueCollectionPage> implements IGroupPolicyPresentationValueCollectionRequest {

    /**
     * The request builder for this collection of GroupPolicyPresentationValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationValueCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationValueCollectionResponse.class, IGroupPolicyPresentationValueCollectionPage.class);
    }

    public void get(final ICallback<? super IGroupPolicyPresentationValueCollectionPage> callback) {
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

    public IGroupPolicyPresentationValueCollectionPage get() throws ClientException {
        final GroupPolicyPresentationValueCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupPolicyPresentationValue newGroupPolicyPresentationValue, final ICallback<? super GroupPolicyPresentationValue> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupPolicyPresentationValueRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyPresentationValue, callback);
    }

    public GroupPolicyPresentationValue post(final GroupPolicyPresentationValue newGroupPolicyPresentationValue) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupPolicyPresentationValueRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyPresentationValue);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyPresentationValueCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GroupPolicyPresentationValueCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (GroupPolicyPresentationValueCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyPresentationValueCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupPolicyPresentationValueCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (GroupPolicyPresentationValueCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IGroupPolicyPresentationValueCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IGroupPolicyPresentationValueCollectionRequest)this;
    }
    public IGroupPolicyPresentationValueCollectionPage buildFromResponse(final GroupPolicyPresentationValueCollectionResponse response) {
        final IGroupPolicyPresentationValueCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyPresentationValueCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyPresentationValueCollectionPage page = new GroupPolicyPresentationValueCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
