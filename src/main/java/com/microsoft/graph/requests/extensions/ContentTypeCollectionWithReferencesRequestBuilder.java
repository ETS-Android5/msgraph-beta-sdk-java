// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.ItemReference;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Collection With References Request Builder.
 */
public class ContentTypeCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IContentTypeCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IContentTypeCollectionWithReferencesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IContentTypeCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ContentTypeCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IContentTypeWithReferenceRequestBuilder byId(final String id) {
        return new ContentTypeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IContentTypeCollectionReferenceRequestBuilder references(){
        return new ContentTypeCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
