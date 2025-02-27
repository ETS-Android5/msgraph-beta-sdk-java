// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AllowedDataLocation;
import com.microsoft.graph.requests.AllowedDataLocationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AllowedDataLocationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Allowed Data Location Collection Page.
 */
public class AllowedDataLocationCollectionPage extends BaseCollectionPage<AllowedDataLocation, AllowedDataLocationCollectionRequestBuilder> {

    /**
     * A collection page for AllowedDataLocation
     *
     * @param response the serialized AllowedDataLocationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AllowedDataLocationCollectionPage(@Nonnull final AllowedDataLocationCollectionResponse response, @Nonnull final AllowedDataLocationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AllowedDataLocation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AllowedDataLocationCollectionPage(@Nonnull final java.util.List<AllowedDataLocation> pageContents, @Nullable final AllowedDataLocationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
