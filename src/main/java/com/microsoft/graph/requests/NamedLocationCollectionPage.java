// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.NamedLocation;
import com.microsoft.graph.requests.NamedLocationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.NamedLocationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Named Location Collection Page.
 */
public class NamedLocationCollectionPage extends BaseCollectionPage<NamedLocation, NamedLocationCollectionRequestBuilder> {

    /**
     * A collection page for NamedLocation
     *
     * @param response the serialized NamedLocationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public NamedLocationCollectionPage(@Nonnull final NamedLocationCollectionResponse response, @Nonnull final NamedLocationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for NamedLocation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public NamedLocationCollectionPage(@Nonnull final java.util.List<NamedLocation> pageContents, @Nullable final NamedLocationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
