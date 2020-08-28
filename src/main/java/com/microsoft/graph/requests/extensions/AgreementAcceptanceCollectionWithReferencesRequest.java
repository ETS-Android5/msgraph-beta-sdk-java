// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AgreementAcceptance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement Acceptance Collection With References Request.
 */
public class AgreementAcceptanceCollectionWithReferencesRequest extends BaseCollectionRequest<AgreementAcceptanceCollectionResponse, IAgreementAcceptanceCollectionPage> implements IAgreementAcceptanceCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of AgreementAcceptance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementAcceptanceCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementAcceptanceCollectionResponse.class, IAgreementAcceptanceCollectionPage.class);
    }

    public void get(final ICallback<IAgreementAcceptanceCollectionWithReferencesPage> callback) {
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

    public IAgreementAcceptanceCollectionWithReferencesPage get() throws ClientException {
        final AgreementAcceptanceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IAgreementAcceptanceCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AgreementAcceptanceCollectionWithReferencesRequest)this;
    }

    public IAgreementAcceptanceCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AgreementAcceptanceCollectionWithReferencesRequest)this;
    }

    public IAgreementAcceptanceCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AgreementAcceptanceCollectionWithReferencesRequest)this;
    }

    public IAgreementAcceptanceCollectionWithReferencesPage buildFromResponse(final AgreementAcceptanceCollectionResponse response) {
        final IAgreementAcceptanceCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AgreementAcceptanceCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AgreementAcceptanceCollectionWithReferencesPage page = new AgreementAcceptanceCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
