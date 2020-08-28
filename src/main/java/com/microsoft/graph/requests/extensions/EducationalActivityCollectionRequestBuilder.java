// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.EducationalActivity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationalActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationalActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationalActivityCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Educational Activity Collection Request Builder.
 */
public class EducationalActivityCollectionRequestBuilder extends BaseRequestBuilder implements IEducationalActivityCollectionRequestBuilder {

    /**
     * The request builder for this collection of Profile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationalActivityCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEducationalActivityCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEducationalActivityCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new EducationalActivityCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationalActivityRequestBuilder byId(final String id) {
        return new EducationalActivityRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
