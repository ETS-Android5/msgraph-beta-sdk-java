// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PayloadResponse;
import com.microsoft.graph.requests.PayloadResponseCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PayloadResponseCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payload Response Collection Page.
 */
public class PayloadResponseCollectionPage extends BaseCollectionPage<PayloadResponse, PayloadResponseCollectionRequestBuilder> {

    /**
     * A collection page for PayloadResponse
     *
     * @param response the serialized PayloadResponseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PayloadResponseCollectionPage(@Nonnull final PayloadResponseCollectionResponse response, @Nonnull final PayloadResponseCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PayloadResponse
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PayloadResponseCollectionPage(@Nonnull final java.util.List<PayloadResponse> pageContents, @Nullable final PayloadResponseCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
