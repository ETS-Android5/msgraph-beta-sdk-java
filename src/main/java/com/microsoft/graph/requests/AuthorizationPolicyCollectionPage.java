// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuthorizationPolicy;
import com.microsoft.graph.requests.AuthorizationPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuthorizationPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authorization Policy Collection Page.
 */
public class AuthorizationPolicyCollectionPage extends BaseCollectionPage<AuthorizationPolicy, AuthorizationPolicyCollectionRequestBuilder> {

    /**
     * A collection page for AuthorizationPolicy
     *
     * @param response the serialized AuthorizationPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthorizationPolicyCollectionPage(@Nonnull final AuthorizationPolicyCollectionResponse response, @Nonnull final AuthorizationPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuthorizationPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuthorizationPolicyCollectionPage(@Nonnull final java.util.List<AuthorizationPolicy> pageContents, @Nullable final AuthorizationPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
