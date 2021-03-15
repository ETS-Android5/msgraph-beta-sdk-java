// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.B2cIdentityUserFlow;
import com.microsoft.graph.requests.B2cIdentityUserFlowCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.B2cIdentityUserFlowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2c Identity User Flow Collection Page.
 */
public class B2cIdentityUserFlowCollectionPage extends BaseCollectionPage<B2cIdentityUserFlow, B2cIdentityUserFlowCollectionRequestBuilder> {

    /**
     * A collection page for B2cIdentityUserFlow
     *
     * @param response the serialized B2cIdentityUserFlowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public B2cIdentityUserFlowCollectionPage(@Nonnull final B2cIdentityUserFlowCollectionResponse response, @Nonnull final B2cIdentityUserFlowCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for B2cIdentityUserFlow
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public B2cIdentityUserFlowCollectionPage(@Nonnull final java.util.List<B2cIdentityUserFlow> pageContents, @Nullable final B2cIdentityUserFlowCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
