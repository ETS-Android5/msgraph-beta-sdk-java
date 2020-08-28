// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TenantSetupInfo;
import com.microsoft.graph.models.extensions.RoleSuccessStatistics;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCompleteSetupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCompleteSetupCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCompleteSetupCollectionResponse;
import com.microsoft.graph.models.extensions.PrivilegedSignupStatusCompleteSetupBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Complete Setup Collection Request.
 */
public class PrivilegedSignupStatusCompleteSetupCollectionRequest extends BaseCollectionRequest<PrivilegedSignupStatusCompleteSetupCollectionResponse, IPrivilegedSignupStatusCompleteSetupCollectionPage> implements IPrivilegedSignupStatusCompleteSetupCollectionRequest {


    protected final PrivilegedSignupStatusCompleteSetupBody body;


    /**
     * The request for this PrivilegedSignupStatusCompleteSetup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusCompleteSetupCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedSignupStatusCompleteSetupCollectionResponse.class, IPrivilegedSignupStatusCompleteSetupCollectionPage.class);
        body = new PrivilegedSignupStatusCompleteSetupBody();
    }


    public void post(final ICallback<IPrivilegedSignupStatusCompleteSetupCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPrivilegedSignupStatusCompleteSetupCollectionPage post() throws ClientException {
        final PrivilegedSignupStatusCompleteSetupCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IPrivilegedSignupStatusCompleteSetupCollectionPage buildFromResponse(final PrivilegedSignupStatusCompleteSetupCollectionResponse response) {
        final IPrivilegedSignupStatusCompleteSetupCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrivilegedSignupStatusCompleteSetupCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (TenantSetupInfo) null);
        } else {
            builder = null;
        }
        final IPrivilegedSignupStatusCompleteSetupCollectionPage page = new PrivilegedSignupStatusCompleteSetupCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedSignupStatusCompleteSetupCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IPrivilegedSignupStatusCompleteSetupCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrivilegedSignupStatusCompleteSetupCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IPrivilegedSignupStatusCompleteSetupCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedSignupStatusCompleteSetupCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IPrivilegedSignupStatusCompleteSetupCollectionRequest)this;
    }

}
