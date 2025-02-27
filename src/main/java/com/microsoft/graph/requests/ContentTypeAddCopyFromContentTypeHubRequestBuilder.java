// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ContentTypeAddCopyFromContentTypeHubRequest;
import com.microsoft.graph.models.ContentType;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ContentTypeAddCopyFromContentTypeHubParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Add Copy From Content Type Hub Request Builder.
 */
public class ContentTypeAddCopyFromContentTypeHubRequestBuilder extends BaseActionRequestBuilder<ContentType> {

    /**
     * The request builder for this ContentTypeAddCopyFromContentTypeHub
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeAddCopyFromContentTypeHubRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ContentTypeAddCopyFromContentTypeHubParameterSet body;
    /**
     * The request builder for this ContentTypeAddCopyFromContentTypeHub
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ContentTypeAddCopyFromContentTypeHubRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ContentTypeAddCopyFromContentTypeHubParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ContentTypeAddCopyFromContentTypeHubRequest
     *
     * @param requestOptions the options for the request
     * @return the ContentTypeAddCopyFromContentTypeHubRequest instance
     */
    @Nonnull
    public ContentTypeAddCopyFromContentTypeHubRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ContentTypeAddCopyFromContentTypeHubRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ContentTypeAddCopyFromContentTypeHubRequest instance
     */
    @Nonnull
    public ContentTypeAddCopyFromContentTypeHubRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ContentTypeAddCopyFromContentTypeHubRequest request = new ContentTypeAddCopyFromContentTypeHubRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
