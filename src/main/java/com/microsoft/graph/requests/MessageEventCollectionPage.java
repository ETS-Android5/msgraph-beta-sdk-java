// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MessageEvent;
import com.microsoft.graph.requests.MessageEventCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MessageEventCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Event Collection Page.
 */
public class MessageEventCollectionPage extends BaseCollectionPage<MessageEvent, MessageEventCollectionRequestBuilder> {

    /**
     * A collection page for MessageEvent
     *
     * @param response the serialized MessageEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MessageEventCollectionPage(@Nonnull final MessageEventCollectionResponse response, @Nonnull final MessageEventCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MessageEvent
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MessageEventCollectionPage(@Nonnull final java.util.List<MessageEvent> pageContents, @Nullable final MessageEventCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
