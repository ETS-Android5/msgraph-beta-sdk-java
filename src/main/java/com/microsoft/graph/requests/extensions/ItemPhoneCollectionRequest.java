// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.ItemPhone;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IItemPhoneCollectionPage;
import com.microsoft.graph.requests.extensions.ItemPhoneCollectionResponse;
import com.microsoft.graph.requests.extensions.IItemPhoneCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemPhoneCollectionRequest;
import com.microsoft.graph.requests.extensions.ItemPhoneCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Phone Collection Request.
 */
public class ItemPhoneCollectionRequest extends BaseCollectionRequest<ItemPhoneCollectionResponse, IItemPhoneCollectionPage> implements IItemPhoneCollectionRequest {

    /**
     * The request builder for this collection of ItemPhone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemPhoneCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemPhoneCollectionResponse.class, IItemPhoneCollectionPage.class);
    }

    public void get(final ICallback<IItemPhoneCollectionPage> callback) {
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

    public IItemPhoneCollectionPage get() throws ClientException {
        final ItemPhoneCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ItemPhone newItemPhone, final ICallback<ItemPhone> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ItemPhoneRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newItemPhone, callback);
    }

    public ItemPhone post(final ItemPhone newItemPhone) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ItemPhoneRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newItemPhone);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemPhoneCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemPhoneCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemPhoneCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ItemPhoneCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IItemPhoneCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ItemPhoneCollectionRequest)this;
    }

    public IItemPhoneCollectionPage buildFromResponse(final ItemPhoneCollectionResponse response) {
        final IItemPhoneCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ItemPhoneCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ItemPhoneCollectionPage page = new ItemPhoneCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
