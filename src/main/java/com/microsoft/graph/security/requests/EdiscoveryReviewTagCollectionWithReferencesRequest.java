// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryFile;
import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagWithReferenceRequest;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagReferenceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagWithReferenceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesRequest;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesRequest;
import com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Review Tag Collection With References Request.
 */
public class EdiscoveryReviewTagCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<EdiscoveryReviewTag, EdiscoveryReviewTagWithReferenceRequest, EdiscoveryReviewTagReferenceRequestBuilder, EdiscoveryReviewTagWithReferenceRequestBuilder, EdiscoveryReviewTagCollectionResponse, EdiscoveryReviewTagCollectionWithReferencesPage, EdiscoveryReviewTagCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EdiscoveryReviewTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryReviewTagCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryReviewTagCollectionResponse.class, EdiscoveryReviewTagCollectionWithReferencesPage.class, EdiscoveryReviewTagCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewTagCollectionWithReferencesRequest expand(@Nonnull final String value) {
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
    public EdiscoveryReviewTagCollectionWithReferencesRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewTagCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
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
    public EdiscoveryReviewTagCollectionWithReferencesRequest select(@Nonnull final String value) {
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
    public EdiscoveryReviewTagCollectionWithReferencesRequest top(final int value) {
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
    public EdiscoveryReviewTagCollectionWithReferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewTagCollectionWithReferencesRequest count() {
        addCountOption(true);
        return this;
    }
}
