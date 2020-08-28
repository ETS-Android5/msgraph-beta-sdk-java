// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Document;
import com.microsoft.graph.models.extensions.DocumentComment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDocumentCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDocumentCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDocumentCommentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment Collection Request Builder.
 */
public class DocumentCommentCollectionRequestBuilder extends BaseRequestBuilder implements IDocumentCommentCollectionRequestBuilder {

    /**
     * The request builder for this collection of Document
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DocumentCommentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDocumentCommentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDocumentCommentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DocumentCommentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDocumentCommentRequestBuilder byId(final String id) {
        return new DocumentCommentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
