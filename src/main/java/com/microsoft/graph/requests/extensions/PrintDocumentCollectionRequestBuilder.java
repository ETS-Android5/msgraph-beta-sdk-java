// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.PrintDocument;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintDocumentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Document Collection Request Builder.
 */
public class PrintDocumentCollectionRequestBuilder extends BaseRequestBuilder implements IPrintDocumentCollectionRequestBuilder {

    /**
     * The request builder for this collection of PrintJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintDocumentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPrintDocumentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPrintDocumentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintDocumentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintDocumentRequestBuilder byId(final String id) {
        return new PrintDocumentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
