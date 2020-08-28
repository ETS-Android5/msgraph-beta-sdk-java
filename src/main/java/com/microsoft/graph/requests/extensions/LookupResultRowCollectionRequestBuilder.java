// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchLookupJob;
import com.microsoft.graph.models.extensions.LookupResultRow;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ILookupResultRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILookupResultRowRequestBuilder;
import com.microsoft.graph.requests.extensions.ILookupResultRowCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Lookup Result Row Collection Request Builder.
 */
public class LookupResultRowCollectionRequestBuilder extends BaseRequestBuilder implements ILookupResultRowCollectionRequestBuilder {

    /**
     * The request builder for this collection of ExactMatchLookupJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LookupResultRowCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ILookupResultRowCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ILookupResultRowCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new LookupResultRowCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ILookupResultRowRequestBuilder byId(final String id) {
        return new LookupResultRowRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
