// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PrivilegedAccess;
import com.microsoft.graph.requests.PrivilegedAccessCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PrivilegedAccessCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Collection Page.
 */
public class PrivilegedAccessCollectionPage extends BaseCollectionPage<PrivilegedAccess, PrivilegedAccessCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedAccess
     *
     * @param response the serialized PrivilegedAccessCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedAccessCollectionPage(@Nonnull final PrivilegedAccessCollectionResponse response, @Nonnull final PrivilegedAccessCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PrivilegedAccess
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedAccessCollectionPage(@Nonnull final java.util.List<PrivilegedAccess> pageContents, @Nullable final PrivilegedAccessCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
