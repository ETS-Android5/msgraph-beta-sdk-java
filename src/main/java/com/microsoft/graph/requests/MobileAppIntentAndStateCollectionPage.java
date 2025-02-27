// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MobileAppIntentAndState;
import com.microsoft.graph.requests.MobileAppIntentAndStateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MobileAppIntentAndStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Intent And State Collection Page.
 */
public class MobileAppIntentAndStateCollectionPage extends BaseCollectionPage<MobileAppIntentAndState, MobileAppIntentAndStateCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppIntentAndState
     *
     * @param response the serialized MobileAppIntentAndStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppIntentAndStateCollectionPage(@Nonnull final MobileAppIntentAndStateCollectionResponse response, @Nonnull final MobileAppIntentAndStateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileAppIntentAndState
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppIntentAndStateCollectionPage(@Nonnull final java.util.List<MobileAppIntentAndState> pageContents, @Nullable final MobileAppIntentAndStateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
