// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionResponse;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionRequest;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registration Details Collection Request.
 */
public class CredentialUserRegistrationDetailsCollectionRequest extends BaseCollectionRequest<CredentialUserRegistrationDetailsCollectionResponse, ICredentialUserRegistrationDetailsCollectionPage> implements ICredentialUserRegistrationDetailsCollectionRequest {

    /**
     * The request builder for this collection of CredentialUserRegistrationDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CredentialUserRegistrationDetailsCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CredentialUserRegistrationDetailsCollectionResponse.class, ICredentialUserRegistrationDetailsCollectionPage.class);
    }

    public void get(final ICallback<ICredentialUserRegistrationDetailsCollectionPage> callback) {
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

    public ICredentialUserRegistrationDetailsCollectionPage get() throws ClientException {
        final CredentialUserRegistrationDetailsCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CredentialUserRegistrationDetails newCredentialUserRegistrationDetails, final ICallback<CredentialUserRegistrationDetails> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CredentialUserRegistrationDetailsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCredentialUserRegistrationDetails, callback);
    }

    public CredentialUserRegistrationDetails post(final CredentialUserRegistrationDetails newCredentialUserRegistrationDetails) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CredentialUserRegistrationDetailsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCredentialUserRegistrationDetails);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICredentialUserRegistrationDetailsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CredentialUserRegistrationDetailsCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICredentialUserRegistrationDetailsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CredentialUserRegistrationDetailsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICredentialUserRegistrationDetailsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CredentialUserRegistrationDetailsCollectionRequest)this;
    }

    public ICredentialUserRegistrationDetailsCollectionPage buildFromResponse(final CredentialUserRegistrationDetailsCollectionResponse response) {
        final ICredentialUserRegistrationDetailsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CredentialUserRegistrationDetailsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CredentialUserRegistrationDetailsCollectionPage page = new CredentialUserRegistrationDetailsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
