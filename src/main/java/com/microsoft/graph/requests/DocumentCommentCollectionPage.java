// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DocumentComment;
import com.microsoft.graph.requests.DocumentCommentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DocumentCommentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment Collection Page.
 */
public class DocumentCommentCollectionPage extends BaseCollectionPage<DocumentComment, DocumentCommentCollectionRequestBuilder> {

    /**
     * A collection page for DocumentComment
     *
     * @param response the serialized DocumentCommentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DocumentCommentCollectionPage(@Nonnull final DocumentCommentCollectionResponse response, @Nonnull final DocumentCommentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DocumentComment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DocumentCommentCollectionPage(@Nonnull final java.util.List<DocumentComment> pageContents, @Nullable final DocumentCommentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
