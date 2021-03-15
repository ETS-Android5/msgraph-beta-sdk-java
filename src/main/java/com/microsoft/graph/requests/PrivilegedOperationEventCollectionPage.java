// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PrivilegedOperationEvent;
import com.microsoft.graph.requests.PrivilegedOperationEventCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PrivilegedOperationEventCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Operation Event Collection Page.
 */
public class PrivilegedOperationEventCollectionPage extends BaseCollectionPage<PrivilegedOperationEvent, PrivilegedOperationEventCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedOperationEvent
     *
     * @param response the serialized PrivilegedOperationEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedOperationEventCollectionPage(@Nonnull final PrivilegedOperationEventCollectionResponse response, @Nonnull final PrivilegedOperationEventCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PrivilegedOperationEvent
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedOperationEventCollectionPage(@Nonnull final java.util.List<PrivilegedOperationEvent> pageContents, @Nullable final PrivilegedOperationEventCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
