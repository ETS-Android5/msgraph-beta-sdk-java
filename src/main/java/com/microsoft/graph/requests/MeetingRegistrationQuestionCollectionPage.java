// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MeetingRegistrationQuestion;
import com.microsoft.graph.requests.MeetingRegistrationQuestionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MeetingRegistrationQuestionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Meeting Registration Question Collection Page.
 */
public class MeetingRegistrationQuestionCollectionPage extends BaseCollectionPage<MeetingRegistrationQuestion, MeetingRegistrationQuestionCollectionRequestBuilder> {

    /**
     * A collection page for MeetingRegistrationQuestion
     *
     * @param response the serialized MeetingRegistrationQuestionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MeetingRegistrationQuestionCollectionPage(@Nonnull final MeetingRegistrationQuestionCollectionResponse response, @Nonnull final MeetingRegistrationQuestionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MeetingRegistrationQuestion
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MeetingRegistrationQuestionCollectionPage(@Nonnull final java.util.List<MeetingRegistrationQuestion> pageContents, @Nullable final MeetingRegistrationQuestionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
