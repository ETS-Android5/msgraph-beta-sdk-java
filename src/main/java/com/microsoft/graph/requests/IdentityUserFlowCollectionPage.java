// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.IdentityUserFlow;
import com.microsoft.graph.requests.IdentityUserFlowCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.IdentityUserFlowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Collection Page.
 * @deprecated The identity/userflows API is deprecated and will stop returning data on January 2022. Please use the new b2cUserflows or b2xUserflows APIs.
 */
@Deprecated
public class IdentityUserFlowCollectionPage extends BaseCollectionPage<IdentityUserFlow, IdentityUserFlowCollectionRequestBuilder> {

    /**
     * A collection page for IdentityUserFlow
     *
     * @param response the serialized IdentityUserFlowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityUserFlowCollectionPage(@Nonnull final IdentityUserFlowCollectionResponse response, @Nonnull final IdentityUserFlowCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IdentityUserFlow
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityUserFlowCollectionPage(@Nonnull final java.util.List<IdentityUserFlow> pageContents, @Nullable final IdentityUserFlowCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
