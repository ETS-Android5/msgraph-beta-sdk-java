// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DefaultManagedAppProtection;
import com.microsoft.graph.requests.DefaultManagedAppProtectionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DefaultManagedAppProtectionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection Collection Page.
 */
public class DefaultManagedAppProtectionCollectionPage extends BaseCollectionPage<DefaultManagedAppProtection, DefaultManagedAppProtectionCollectionRequestBuilder> {

    /**
     * A collection page for DefaultManagedAppProtection
     *
     * @param response the serialized DefaultManagedAppProtectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DefaultManagedAppProtectionCollectionPage(@Nonnull final DefaultManagedAppProtectionCollectionResponse response, @Nonnull final DefaultManagedAppProtectionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DefaultManagedAppProtection
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DefaultManagedAppProtectionCollectionPage(@Nonnull final java.util.List<DefaultManagedAppProtection> pageContents, @Nullable final DefaultManagedAppProtectionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
