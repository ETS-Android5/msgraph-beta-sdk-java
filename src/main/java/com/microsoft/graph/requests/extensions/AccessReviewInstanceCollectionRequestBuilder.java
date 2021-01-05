// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewScheduleDefinition;
import com.microsoft.graph.models.extensions.AccessReviewInstance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Collection Request Builder.
 */
public class AccessReviewInstanceCollectionRequestBuilder extends BaseRequestBuilder implements IAccessReviewInstanceCollectionRequestBuilder {

    /**
     * The request builder for this collection of AccessReviewScheduleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAccessReviewInstanceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAccessReviewInstanceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AccessReviewInstanceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAccessReviewInstanceRequestBuilder byId(final String id) {
        return new AccessReviewInstanceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
