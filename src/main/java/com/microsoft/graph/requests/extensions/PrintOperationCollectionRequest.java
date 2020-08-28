// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.models.extensions.PrintOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrintOperationCollectionPage;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrintOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Operation Collection Request.
 */
public class PrintOperationCollectionRequest extends BaseCollectionRequest<PrintOperationCollectionResponse, IPrintOperationCollectionPage> implements IPrintOperationCollectionRequest {

    /**
     * The request builder for this collection of PrintOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintOperationCollectionResponse.class, IPrintOperationCollectionPage.class);
    }

    public void get(final ICallback<IPrintOperationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPrintOperationCollectionPage get() throws ClientException {
        final PrintOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrintOperation newPrintOperation, final ICallback<PrintOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrintOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPrintOperation, callback);
    }

    public PrintOperation post(final PrintOperation newPrintOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrintOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPrintOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrintOperationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrintOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrintOperationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrintOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrintOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrintOperationCollectionRequest)this;
    }

    public IPrintOperationCollectionPage buildFromResponse(final PrintOperationCollectionResponse response) {
        final IPrintOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrintOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrintOperationCollectionPage page = new PrintOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
