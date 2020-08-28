// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.TermsAndConditionsGroupAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Group Assignment Collection Request.
 */
public class TermsAndConditionsGroupAssignmentCollectionRequest extends BaseCollectionRequest<TermsAndConditionsGroupAssignmentCollectionResponse, ITermsAndConditionsGroupAssignmentCollectionPage> implements ITermsAndConditionsGroupAssignmentCollectionRequest {

    /**
     * The request builder for this collection of TermsAndConditionsGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsGroupAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditionsGroupAssignmentCollectionResponse.class, ITermsAndConditionsGroupAssignmentCollectionPage.class);
    }

    public void get(final ICallback<ITermsAndConditionsGroupAssignmentCollectionPage> callback) {
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

    public ITermsAndConditionsGroupAssignmentCollectionPage get() throws ClientException {
        final TermsAndConditionsGroupAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TermsAndConditionsGroupAssignment newTermsAndConditionsGroupAssignment, final ICallback<TermsAndConditionsGroupAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TermsAndConditionsGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTermsAndConditionsGroupAssignment, callback);
    }

    public TermsAndConditionsGroupAssignment post(final TermsAndConditionsGroupAssignment newTermsAndConditionsGroupAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TermsAndConditionsGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTermsAndConditionsGroupAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITermsAndConditionsGroupAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TermsAndConditionsGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITermsAndConditionsGroupAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TermsAndConditionsGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITermsAndConditionsGroupAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TermsAndConditionsGroupAssignmentCollectionRequest)this;
    }

    public ITermsAndConditionsGroupAssignmentCollectionPage buildFromResponse(final TermsAndConditionsGroupAssignmentCollectionResponse response) {
        final ITermsAndConditionsGroupAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TermsAndConditionsGroupAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TermsAndConditionsGroupAssignmentCollectionPage page = new TermsAndConditionsGroupAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
