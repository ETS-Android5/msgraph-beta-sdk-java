// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryReviewSet;
import com.microsoft.graph.security.models.EdiscoveryReviewSetQuery;
import com.microsoft.graph.security.models.ExportOptions;
import com.microsoft.graph.security.models.ExportFileStructure;
import java.util.EnumSet;
import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import com.microsoft.graph.security.models.EdiscoveryFile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetQueryCollectionResponse;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryReviewSetQueryCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Review Set Query Collection Request.
 */
public class EdiscoveryReviewSetQueryCollectionRequest extends BaseEntityCollectionRequest<EdiscoveryReviewSetQuery, EdiscoveryReviewSetQueryCollectionResponse, EdiscoveryReviewSetQueryCollectionPage> {

    /**
     * The request builder for this collection of EdiscoveryReviewSetQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryReviewSetQueryCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryReviewSetQueryCollectionResponse.class, EdiscoveryReviewSetQueryCollectionPage.class, EdiscoveryReviewSetQueryCollectionRequestBuilder.class);
    }

    /**
     * Creates a new EdiscoveryReviewSetQuery
     * @param newEdiscoveryReviewSetQuery the EdiscoveryReviewSetQuery to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryReviewSetQuery> postAsync(@Nonnull final EdiscoveryReviewSetQuery newEdiscoveryReviewSetQuery) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EdiscoveryReviewSetQueryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newEdiscoveryReviewSetQuery);
    }

    /**
     * Creates a new EdiscoveryReviewSetQuery
     * @param newEdiscoveryReviewSetQuery the EdiscoveryReviewSetQuery to create
     * @return the newly created object
     */
    @Nonnull
    public EdiscoveryReviewSetQuery post(@Nonnull final EdiscoveryReviewSetQuery newEdiscoveryReviewSetQuery) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EdiscoveryReviewSetQueryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEdiscoveryReviewSetQuery);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewSetQueryCollectionRequest expand(@Nonnull final String value) {
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
    public EdiscoveryReviewSetQueryCollectionRequest filter(@Nonnull final String value) {
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
    public EdiscoveryReviewSetQueryCollectionRequest orderBy(@Nonnull final String value) {
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
    public EdiscoveryReviewSetQueryCollectionRequest select(@Nonnull final String value) {
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
    public EdiscoveryReviewSetQueryCollectionRequest top(final int value) {
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
    public EdiscoveryReviewSetQueryCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewSetQueryCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewSetQueryCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryReviewSetQueryCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

