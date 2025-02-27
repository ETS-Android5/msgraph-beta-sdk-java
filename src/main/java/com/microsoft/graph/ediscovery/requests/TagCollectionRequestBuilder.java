// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.Case;
import com.microsoft.graph.ediscovery.models.Tag;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.ediscovery.requests.TagCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.TagRequestBuilder;
import com.microsoft.graph.ediscovery.requests.TagCollectionRequest;
import com.microsoft.graph.ediscovery.requests.TagAsHierarchyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag Collection Request Builder.
 */
public class TagCollectionRequestBuilder extends BaseCollectionRequestBuilder<Tag, TagRequestBuilder, TagCollectionResponse, TagCollectionPage, TagCollectionRequest> {

    /**
     * The request builder for this collection of Case
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TagCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TagRequestBuilder.class, TagCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public TagAsHierarchyCollectionRequestBuilder asHierarchy() {
        return new TagAsHierarchyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.asHierarchy"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
