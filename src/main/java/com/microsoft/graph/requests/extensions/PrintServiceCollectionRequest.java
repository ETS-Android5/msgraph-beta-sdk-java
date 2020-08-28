// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.models.extensions.PrintService;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrintServiceCollectionPage;
import com.microsoft.graph.requests.extensions.PrintServiceCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrintServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintServiceCollectionRequest;
import com.microsoft.graph.requests.extensions.PrintServiceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Service Collection Request.
 */
public class PrintServiceCollectionRequest extends BaseCollectionRequest<PrintServiceCollectionResponse, IPrintServiceCollectionPage> implements IPrintServiceCollectionRequest {

    /**
     * The request builder for this collection of PrintService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintServiceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintServiceCollectionResponse.class, IPrintServiceCollectionPage.class);
    }

    public void get(final ICallback<IPrintServiceCollectionPage> callback) {
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

    public IPrintServiceCollectionPage get() throws ClientException {
        final PrintServiceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrintService newPrintService, final ICallback<PrintService> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrintServiceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPrintService, callback);
    }

    public PrintService post(final PrintService newPrintService) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrintServiceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPrintService);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrintServiceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrintServiceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrintServiceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrintServiceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrintServiceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrintServiceCollectionRequest)this;
    }

    public IPrintServiceCollectionPage buildFromResponse(final PrintServiceCollectionResponse response) {
        final IPrintServiceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrintServiceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrintServiceCollectionPage page = new PrintServiceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
