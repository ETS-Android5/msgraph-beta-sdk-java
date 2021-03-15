// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CountryRegion;
import com.microsoft.graph.requests.CountryRegionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CountryRegionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Country Region Collection Page.
 */
public class CountryRegionCollectionPage extends BaseCollectionPage<CountryRegion, CountryRegionCollectionRequestBuilder> {

    /**
     * A collection page for CountryRegion
     *
     * @param response the serialized CountryRegionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CountryRegionCollectionPage(@Nonnull final CountryRegionCollectionResponse response, @Nonnull final CountryRegionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CountryRegion
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CountryRegionCollectionPage(@Nonnull final java.util.List<CountryRegion> pageContents, @Nullable final CountryRegionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
