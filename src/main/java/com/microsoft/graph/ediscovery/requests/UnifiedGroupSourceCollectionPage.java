// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.models.UnifiedGroupSource;
import com.microsoft.graph.ediscovery.requests.UnifiedGroupSourceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.ediscovery.requests.UnifiedGroupSourceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Group Source Collection Page.
 */
public class UnifiedGroupSourceCollectionPage extends BaseCollectionPage<UnifiedGroupSource, UnifiedGroupSourceCollectionRequestBuilder> {

    /**
     * A collection page for UnifiedGroupSource
     *
     * @param response the serialized UnifiedGroupSourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedGroupSourceCollectionPage(@Nonnull final UnifiedGroupSourceCollectionResponse response, @Nonnull final UnifiedGroupSourceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UnifiedGroupSource
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UnifiedGroupSourceCollectionPage(@Nonnull final java.util.List<UnifiedGroupSource> pageContents, @Nullable final UnifiedGroupSourceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
