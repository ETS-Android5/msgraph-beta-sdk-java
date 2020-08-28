// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExternalGroup;
import com.microsoft.graph.models.extensions.ExternalGroupMember;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IExternalGroupMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalGroupMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalGroupMemberCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Group Member Collection Request Builder.
 */
public class ExternalGroupMemberCollectionRequestBuilder extends BaseRequestBuilder implements IExternalGroupMemberCollectionRequestBuilder {

    /**
     * The request builder for this collection of ExternalGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalGroupMemberCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IExternalGroupMemberCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IExternalGroupMemberCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ExternalGroupMemberCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IExternalGroupMemberRequestBuilder byId(final String id) {
        return new ExternalGroupMemberRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
