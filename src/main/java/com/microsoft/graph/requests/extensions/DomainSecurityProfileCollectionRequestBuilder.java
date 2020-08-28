// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.DomainSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDomainSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainSecurityProfileCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Security Profile Collection Request Builder.
 */
public class DomainSecurityProfileCollectionRequestBuilder extends BaseRequestBuilder implements IDomainSecurityProfileCollectionRequestBuilder {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainSecurityProfileCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDomainSecurityProfileCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDomainSecurityProfileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DomainSecurityProfileCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDomainSecurityProfileRequestBuilder byId(final String id) {
        return new DomainSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
