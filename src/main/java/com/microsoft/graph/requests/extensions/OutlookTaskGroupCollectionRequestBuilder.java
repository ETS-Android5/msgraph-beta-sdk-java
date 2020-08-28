// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.OutlookTaskGroup;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOutlookTaskGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskGroupCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Group Collection Request Builder.
 */
public class OutlookTaskGroupCollectionRequestBuilder extends BaseRequestBuilder implements IOutlookTaskGroupCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookTaskGroupCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOutlookTaskGroupCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOutlookTaskGroupCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OutlookTaskGroupCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOutlookTaskGroupRequestBuilder byId(final String id) {
        return new OutlookTaskGroupRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
