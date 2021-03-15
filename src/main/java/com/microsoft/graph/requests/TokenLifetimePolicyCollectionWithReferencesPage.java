// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.models.TokenLifetimePolicy;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionResponse;
import com.microsoft.graph.models.TokenLifetimePolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Collection With References Page.
 */
public class TokenLifetimePolicyCollectionWithReferencesPage extends BaseCollectionPage<TokenLifetimePolicy, TokenLifetimePolicyCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for TokenLifetimePolicy
     *
     * @param response the serialized TokenLifetimePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TokenLifetimePolicyCollectionWithReferencesPage(@Nonnull final TokenLifetimePolicyCollectionResponse response, @Nullable final TokenLifetimePolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for TokenLifetimePolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TokenLifetimePolicyCollectionWithReferencesPage(@Nonnull final java.util.List<TokenLifetimePolicy> pageContents, @Nullable final TokenLifetimePolicyCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
