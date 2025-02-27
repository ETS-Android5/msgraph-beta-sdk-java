// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.models.TenantGroup;
import com.microsoft.graph.managedtenants.requests.TenantGroupCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.managedtenants.requests.TenantGroupCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Group Collection Page.
 */
public class TenantGroupCollectionPage extends BaseCollectionPage<TenantGroup, TenantGroupCollectionRequestBuilder> {

    /**
     * A collection page for TenantGroup
     *
     * @param response the serialized TenantGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TenantGroupCollectionPage(@Nonnull final TenantGroupCollectionResponse response, @Nonnull final TenantGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TenantGroup
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TenantGroupCollectionPage(@Nonnull final java.util.List<TenantGroup> pageContents, @Nullable final TenantGroupCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
