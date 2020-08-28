// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Program;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IProgramCollectionPage;
import com.microsoft.graph.requests.extensions.ProgramCollectionResponse;
import com.microsoft.graph.requests.extensions.IProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramCollectionRequest;
import com.microsoft.graph.requests.extensions.ProgramCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Collection Request.
 */
public class ProgramCollectionRequest extends BaseCollectionRequest<ProgramCollectionResponse, IProgramCollectionPage> implements IProgramCollectionRequest {

    /**
     * The request builder for this collection of Program
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProgramCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProgramCollectionResponse.class, IProgramCollectionPage.class);
    }

    public void get(final ICallback<IProgramCollectionPage> callback) {
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

    public IProgramCollectionPage get() throws ClientException {
        final ProgramCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Program newProgram, final ICallback<Program> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ProgramRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newProgram, callback);
    }

    public Program post(final Program newProgram) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ProgramRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newProgram);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IProgramCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ProgramCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IProgramCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ProgramCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IProgramCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ProgramCollectionRequest)this;
    }

    public IProgramCollectionPage buildFromResponse(final ProgramCollectionResponse response) {
        final IProgramCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ProgramCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ProgramCollectionPage page = new ProgramCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
