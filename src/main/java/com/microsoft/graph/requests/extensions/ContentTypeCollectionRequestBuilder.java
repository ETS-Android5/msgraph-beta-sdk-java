// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.ItemReference;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequest;
import com.microsoft.graph.requests.extensions.IContentTypeAddCopyRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Collection Request Builder.
 */
public class ContentTypeCollectionRequestBuilder extends BaseRequestBuilder implements IContentTypeCollectionRequestBuilder {

    /**
     * The request builder for this collection of List
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IContentTypeCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IContentTypeCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ContentTypeCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IContentTypeRequestBuilder byId(final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IContentTypeAddCopyRequestBuilder addCopy(final String contentType) {
        return new ContentTypeAddCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addCopy"), getClient(), null, contentType);
    }
}
