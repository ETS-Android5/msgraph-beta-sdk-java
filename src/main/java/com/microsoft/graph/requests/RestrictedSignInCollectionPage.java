// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.RestrictedSignIn;
import com.microsoft.graph.requests.RestrictedSignInCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.RestrictedSignInCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Sign In Collection Page.
 */
public class RestrictedSignInCollectionPage extends BaseCollectionPage<RestrictedSignIn, RestrictedSignInCollectionRequestBuilder> {

    /**
     * A collection page for RestrictedSignIn
     *
     * @param response the serialized RestrictedSignInCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RestrictedSignInCollectionPage(@Nonnull final RestrictedSignInCollectionResponse response, @Nonnull final RestrictedSignInCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for RestrictedSignIn
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RestrictedSignInCollectionPage(@Nonnull final java.util.List<RestrictedSignIn> pageContents, @Nullable final RestrictedSignInCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
