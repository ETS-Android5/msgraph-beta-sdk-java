// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AgedAccountsReceivable;
import com.microsoft.graph.requests.AgedAccountsReceivableCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AgedAccountsReceivableCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aged Accounts Receivable Collection Page.
 */
public class AgedAccountsReceivableCollectionPage extends BaseCollectionPage<AgedAccountsReceivable, AgedAccountsReceivableCollectionRequestBuilder> {

    /**
     * A collection page for AgedAccountsReceivable
     *
     * @param response the serialized AgedAccountsReceivableCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AgedAccountsReceivableCollectionPage(@Nonnull final AgedAccountsReceivableCollectionResponse response, @Nonnull final AgedAccountsReceivableCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AgedAccountsReceivable
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AgedAccountsReceivableCollectionPage(@Nonnull final java.util.List<AgedAccountsReceivable> pageContents, @Nullable final AgedAccountsReceivableCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
