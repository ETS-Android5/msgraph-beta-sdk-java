// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Group;
import com.microsoft.graph.termstore.requests.extensions.ISetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Request Builder.
 */
public class GroupRequestBuilder extends BaseRequestBuilder implements IGroupRequestBuilder {

    /**
     * The request builder for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IGroupRequest instance
     */
    public IGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    public IGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.termstore.requests.extensions.GroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ISetCollectionRequestBuilder sets() {
        return new SetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sets"), getClient(), null);
    }

    public ISetRequestBuilder sets(final String id) {
        return new SetRequestBuilder(getRequestUrlWithAdditionalSegment("sets") + "/" + id, getClient(), null);
    }
}
