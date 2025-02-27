// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.BookingCustomer;
import com.microsoft.graph.requests.BookingCustomerCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.BookingCustomerCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer Collection Page.
 */
public class BookingCustomerCollectionPage extends BaseCollectionPage<BookingCustomer, BookingCustomerCollectionRequestBuilder> {

    /**
     * A collection page for BookingCustomer
     *
     * @param response the serialized BookingCustomerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BookingCustomerCollectionPage(@Nonnull final BookingCustomerCollectionResponse response, @Nonnull final BookingCustomerCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for BookingCustomer
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public BookingCustomerCollectionPage(@Nonnull final java.util.List<BookingCustomer> pageContents, @Nullable final BookingCustomerCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
