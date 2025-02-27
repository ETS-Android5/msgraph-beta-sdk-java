// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.models.TenantTag;
import com.microsoft.graph.managedtenants.requests.TenantTagCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.managedtenants.requests.TenantTagCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Tag Collection Page.
 */
public class TenantTagCollectionPage extends BaseCollectionPage<TenantTag, TenantTagCollectionRequestBuilder> {

    /**
     * A collection page for TenantTag
     *
     * @param response the serialized TenantTagCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TenantTagCollectionPage(@Nonnull final TenantTagCollectionResponse response, @Nonnull final TenantTagCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TenantTag
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TenantTagCollectionPage(@Nonnull final java.util.List<TenantTag> pageContents, @Nullable final TenantTagCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
