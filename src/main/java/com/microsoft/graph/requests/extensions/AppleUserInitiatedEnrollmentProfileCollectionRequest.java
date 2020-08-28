// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleUserInitiatedEnrollmentProfileCollectionRequest;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple User Initiated Enrollment Profile Collection Request.
 */
public class AppleUserInitiatedEnrollmentProfileCollectionRequest extends BaseCollectionRequest<AppleUserInitiatedEnrollmentProfileCollectionResponse, IAppleUserInitiatedEnrollmentProfileCollectionPage> implements IAppleUserInitiatedEnrollmentProfileCollectionRequest {

    /**
     * The request builder for this collection of AppleUserInitiatedEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleUserInitiatedEnrollmentProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleUserInitiatedEnrollmentProfileCollectionResponse.class, IAppleUserInitiatedEnrollmentProfileCollectionPage.class);
    }

    public void get(final ICallback<IAppleUserInitiatedEnrollmentProfileCollectionPage> callback) {
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

    public IAppleUserInitiatedEnrollmentProfileCollectionPage get() throws ClientException {
        final AppleUserInitiatedEnrollmentProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile, final ICallback<AppleUserInitiatedEnrollmentProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AppleUserInitiatedEnrollmentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAppleUserInitiatedEnrollmentProfile, callback);
    }

    public AppleUserInitiatedEnrollmentProfile post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AppleUserInitiatedEnrollmentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppleUserInitiatedEnrollmentProfileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AppleUserInitiatedEnrollmentProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppleUserInitiatedEnrollmentProfileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AppleUserInitiatedEnrollmentProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAppleUserInitiatedEnrollmentProfileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AppleUserInitiatedEnrollmentProfileCollectionRequest)this;
    }

    public IAppleUserInitiatedEnrollmentProfileCollectionPage buildFromResponse(final AppleUserInitiatedEnrollmentProfileCollectionResponse response) {
        final IAppleUserInitiatedEnrollmentProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AppleUserInitiatedEnrollmentProfileCollectionPage page = new AppleUserInitiatedEnrollmentProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
