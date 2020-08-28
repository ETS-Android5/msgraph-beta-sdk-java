// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import com.microsoft.graph.models.extensions.EnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.EnrollmentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileCollectionRequest;
import com.microsoft.graph.requests.extensions.EnrollmentProfileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Profile Collection Request.
 */
public class EnrollmentProfileCollectionRequest extends BaseCollectionRequest<EnrollmentProfileCollectionResponse, IEnrollmentProfileCollectionPage> implements IEnrollmentProfileCollectionRequest {

    /**
     * The request builder for this collection of EnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EnrollmentProfileCollectionResponse.class, IEnrollmentProfileCollectionPage.class);
    }

    public void get(final ICallback<IEnrollmentProfileCollectionPage> callback) {
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

    public IEnrollmentProfileCollectionPage get() throws ClientException {
        final EnrollmentProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EnrollmentProfile newEnrollmentProfile, final ICallback<EnrollmentProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EnrollmentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEnrollmentProfile, callback);
    }

    public EnrollmentProfile post(final EnrollmentProfile newEnrollmentProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EnrollmentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEnrollmentProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEnrollmentProfileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EnrollmentProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEnrollmentProfileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EnrollmentProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEnrollmentProfileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EnrollmentProfileCollectionRequest)this;
    }

    public IEnrollmentProfileCollectionPage buildFromResponse(final EnrollmentProfileCollectionResponse response) {
        final IEnrollmentProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EnrollmentProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EnrollmentProfileCollectionPage page = new EnrollmentProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
