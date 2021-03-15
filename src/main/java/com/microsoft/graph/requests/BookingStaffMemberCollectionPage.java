// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.BookingStaffMember;
import com.microsoft.graph.requests.BookingStaffMemberCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.BookingStaffMemberCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Staff Member Collection Page.
 */
public class BookingStaffMemberCollectionPage extends BaseCollectionPage<BookingStaffMember, BookingStaffMemberCollectionRequestBuilder> {

    /**
     * A collection page for BookingStaffMember
     *
     * @param response the serialized BookingStaffMemberCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BookingStaffMemberCollectionPage(@Nonnull final BookingStaffMemberCollectionResponse response, @Nonnull final BookingStaffMemberCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for BookingStaffMember
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public BookingStaffMemberCollectionPage(@Nonnull final java.util.List<BookingStaffMember> pageContents, @Nullable final BookingStaffMemberCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
