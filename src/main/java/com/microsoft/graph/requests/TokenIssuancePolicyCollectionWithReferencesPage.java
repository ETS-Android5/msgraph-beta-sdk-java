// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServicePrincipal;
import com.microsoft.graph.models.TokenIssuancePolicy;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesPage;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionResponse;
import com.microsoft.graph.models.TokenIssuancePolicy;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection With References Page.
 */
public class TokenIssuancePolicyCollectionWithReferencesPage extends BaseCollectionPage<TokenIssuancePolicy, TokenIssuancePolicyCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for TokenIssuancePolicy
     *
     * @param response the serialized TokenIssuancePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TokenIssuancePolicyCollectionWithReferencesPage(@Nonnull final TokenIssuancePolicyCollectionResponse response, @Nullable final TokenIssuancePolicyCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for TokenIssuancePolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TokenIssuancePolicyCollectionWithReferencesPage(@Nonnull final java.util.List<TokenIssuancePolicy> pageContents, @Nullable final TokenIssuancePolicyCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
