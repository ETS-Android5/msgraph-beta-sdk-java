// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Company;
import com.microsoft.graph.requests.CompanyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CompanyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Collection Page.
 */
public class CompanyCollectionPage extends BaseCollectionPage<Company, CompanyCollectionRequestBuilder> {

    /**
     * A collection page for Company
     *
     * @param response the serialized CompanyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CompanyCollectionPage(@Nonnull final CompanyCollectionResponse response, @Nonnull final CompanyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Company
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CompanyCollectionPage(@Nonnull final java.util.List<Company> pageContents, @Nullable final CompanyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
