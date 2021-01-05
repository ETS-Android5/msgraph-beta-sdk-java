// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppConsentApprovalRoute;
import com.microsoft.graph.models.extensions.AppConsentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Consent Request Collection Request Builder.
 */
public class AppConsentRequestCollectionRequestBuilder extends BaseRequestBuilder implements IAppConsentRequestCollectionRequestBuilder {

    /**
     * The request builder for this collection of AppConsentApprovalRoute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppConsentRequestCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAppConsentRequestCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAppConsentRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AppConsentRequestCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAppConsentRequestRequestBuilder byId(final String id) {
        return new AppConsentRequestRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
