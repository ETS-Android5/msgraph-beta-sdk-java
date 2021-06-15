// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.models.Tenant;
import com.microsoft.graph.managedtenants.requests.TenantCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.managedtenants.requests.TenantCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Collection Page.
 */
public class TenantCollectionPage extends BaseCollectionPage<Tenant, TenantCollectionRequestBuilder> {

    /**
     * A collection page for Tenant
     *
     * @param response the serialized TenantCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TenantCollectionPage(@Nonnull final TenantCollectionResponse response, @Nonnull final TenantCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Tenant
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TenantCollectionPage(@Nonnull final java.util.List<Tenant> pageContents, @Nullable final TenantCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
