// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.File;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Request Builder.
 */
public class FileRequestBuilder extends BaseRequestBuilder<File> {

    /**
     * The request builder for the File
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the FileRequest instance
     */
    @Nonnull
    public FileRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the FileRequest instance
     */
    @Nonnull
    public FileRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.FileRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for content
     *
     * @return the FileContentStreamRequestBuilder instance
     */
    @Nonnull
    public FileContentStreamRequestBuilder content() {
        return new FileContentStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    /**
     * Gets the request builder for extractedTextContent
     *
     * @return the FileExtractedTextContentStreamRequestBuilder instance
     */
    @Nonnull
    public FileExtractedTextContentStreamRequestBuilder extractedTextContent() {
        return new FileExtractedTextContentStreamRequestBuilder(getRequestUrlWithAdditionalSegment("extractedTextContent"), getClient(), null);
    }
}
