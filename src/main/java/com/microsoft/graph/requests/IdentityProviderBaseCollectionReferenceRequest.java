// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.B2xIdentityUserFlow;
import com.microsoft.graph.models.IdentityProviderBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.IdentityProviderBaseWithReferenceRequest;
import com.microsoft.graph.requests.IdentityProviderBaseReferenceRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionWithReferencesRequest;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.IdentityProviderBase;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Base Collection Reference Request.
 */
public class IdentityProviderBaseCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<IdentityProviderBase, IdentityProviderBaseWithReferenceRequest, IdentityProviderBaseReferenceRequestBuilder, IdentityProviderBaseWithReferenceRequestBuilder, IdentityProviderBaseCollectionResponse, IdentityProviderBaseCollectionWithReferencesPage, IdentityProviderBaseCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of IdentityProviderBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProviderBaseCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityProviderBaseCollectionResponse.class, IdentityProviderBaseCollectionWithReferencesPage.class, IdentityProviderBaseCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new IdentityProviderBase
     * @param newIdentityProviderBase the IdentityProviderBase to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IdentityProviderBase> postAsync(@Nonnull final IdentityProviderBase newIdentityProviderBase) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/identity/userFlowIdentityProviders/" + newIdentityProviderBase.id);
        return new IdentityProviderBaseWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newIdentityProviderBase, body);
    }

    /**
     * Creates a new IdentityProviderBase
     * @param newIdentityProviderBase the IdentityProviderBase to create
     * @return the newly created object
     */
    @Nonnull
    public IdentityProviderBase post(@Nonnull final IdentityProviderBase newIdentityProviderBase) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/identity/userFlowIdentityProviders/" + newIdentityProviderBase.id);
        return new IdentityProviderBaseWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newIdentityProviderBase, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public IdentityProviderBaseCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
