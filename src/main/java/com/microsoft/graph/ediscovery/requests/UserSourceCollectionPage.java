// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.models.UserSource;
import com.microsoft.graph.ediscovery.requests.UserSourceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.ediscovery.requests.UserSourceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Source Collection Page.
 */
public class UserSourceCollectionPage extends BaseCollectionPage<UserSource, UserSourceCollectionRequestBuilder> {

    /**
     * A collection page for UserSource
     *
     * @param response the serialized UserSourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserSourceCollectionPage(@Nonnull final UserSourceCollectionResponse response, @Nonnull final UserSourceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserSource
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserSourceCollectionPage(@Nonnull final java.util.List<UserSource> pageContents, @Nullable final UserSourceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
