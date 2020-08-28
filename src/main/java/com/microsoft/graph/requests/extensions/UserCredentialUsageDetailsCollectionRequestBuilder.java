// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.UserCredentialUsageDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCredentialUsageDetailsCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Credential Usage Details Collection Request Builder.
 */
public class UserCredentialUsageDetailsCollectionRequestBuilder extends BaseRequestBuilder implements IUserCredentialUsageDetailsCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserCredentialUsageDetailsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserCredentialUsageDetailsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserCredentialUsageDetailsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UserCredentialUsageDetailsCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IUserCredentialUsageDetailsRequestBuilder byId(final String id) {
        return new UserCredentialUsageDetailsRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
