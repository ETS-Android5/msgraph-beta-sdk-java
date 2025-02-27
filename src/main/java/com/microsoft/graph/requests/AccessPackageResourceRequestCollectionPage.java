// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AccessPackageResourceRequest;
import com.microsoft.graph.requests.AccessPackageResourceRequestCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AccessPackageResourceRequestCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request Collection Page.
 */
public class AccessPackageResourceRequestCollectionPage extends BaseCollectionPage<AccessPackageResourceRequest, AccessPackageResourceRequestCollectionRequestBuilder> {

    /**
     * A collection page for AccessPackageResourceRequest
     *
     * @param response the serialized AccessPackageResourceRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageResourceRequestCollectionPage(@Nonnull final AccessPackageResourceRequestCollectionResponse response, @Nonnull final AccessPackageResourceRequestCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessPackageResourceRequest
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessPackageResourceRequestCollectionPage(@Nonnull final java.util.List<AccessPackageResourceRequest> pageContents, @Nullable final AccessPackageResourceRequestCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
