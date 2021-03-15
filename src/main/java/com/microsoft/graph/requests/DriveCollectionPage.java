// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.requests.DriveCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DriveCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Collection Page.
 */
public class DriveCollectionPage extends BaseCollectionPage<Drive, DriveCollectionRequestBuilder> {

    /**
     * A collection page for Drive
     *
     * @param response the serialized DriveCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveCollectionPage(@Nonnull final DriveCollectionResponse response, @Nonnull final DriveCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Drive
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DriveCollectionPage(@Nonnull final java.util.List<Drive> pageContents, @Nullable final DriveCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
