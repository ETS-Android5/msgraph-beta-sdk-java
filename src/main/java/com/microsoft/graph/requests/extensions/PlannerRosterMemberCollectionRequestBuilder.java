// Template Source: BaseEntityCollectionRequestBuilder.java.tt
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

import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster Member Collection Request Builder.
 */
public class PlannerRosterMemberCollectionRequestBuilder extends BaseRequestBuilder implements IPlannerRosterMemberCollectionRequestBuilder {

    /**
     * The request builder for this collection of PlannerRoster
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRosterMemberCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPlannerRosterMemberCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPlannerRosterMemberCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PlannerRosterMemberCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerRosterMemberRequestBuilder byId(final String id) {
        return new PlannerRosterMemberRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
