// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IContentTypeIsPublishedRequest;
import com.microsoft.graph.requests.extensions.ContentTypeIsPublishedRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Is Published Request Builder.
 */
public class ContentTypeIsPublishedRequestBuilder extends BaseFunctionRequestBuilder implements IContentTypeIsPublishedRequestBuilder {

    /**
     * The request builder for this ContentTypeIsPublished
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeIsPublishedRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IContentTypeIsPublishedRequest
     *
     * @param requestOptions the options for the request
     * @return the IContentTypeIsPublishedRequest instance
     */
    public IContentTypeIsPublishedRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IContentTypeIsPublishedRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IContentTypeIsPublishedRequest instance
     */
    public IContentTypeIsPublishedRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ContentTypeIsPublishedRequest request = new ContentTypeIsPublishedRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
