// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerRoster;
import com.microsoft.graph.models.extensions.PlannerRosterMember;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionResponse;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequest;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster Member Collection Request.
 */
public class PlannerRosterMemberCollectionRequest extends BaseCollectionRequest<PlannerRosterMemberCollectionResponse, IPlannerRosterMemberCollectionPage> implements IPlannerRosterMemberCollectionRequest {

    /**
     * The request builder for this collection of PlannerRosterMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRosterMemberCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerRosterMemberCollectionResponse.class, IPlannerRosterMemberCollectionPage.class);
    }

    public void get(final ICallback<? super IPlannerRosterMemberCollectionPage> callback) {
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

    public IPlannerRosterMemberCollectionPage get() throws ClientException {
        final PlannerRosterMemberCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PlannerRosterMember newPlannerRosterMember, final ICallback<? super PlannerRosterMember> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PlannerRosterMemberRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPlannerRosterMember, callback);
    }

    public PlannerRosterMember post(final PlannerRosterMember newPlannerRosterMember) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PlannerRosterMemberRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPlannerRosterMember);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PlannerRosterMemberCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PlannerRosterMemberCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PlannerRosterMemberCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PlannerRosterMemberCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PlannerRosterMemberCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PlannerRosterMemberCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPlannerRosterMemberCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPlannerRosterMemberCollectionRequest)this;
    }
    public IPlannerRosterMemberCollectionPage buildFromResponse(final PlannerRosterMemberCollectionResponse response) {
        final IPlannerRosterMemberCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlannerRosterMemberCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlannerRosterMemberCollectionPage page = new PlannerRosterMemberCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
