// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoverySearch;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceWithReferenceRequest;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceReferenceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionWithReferencesRequest;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSource;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source Collection Reference Request.
 */
public class EdiscoveryNoncustodialDataSourceCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<EdiscoveryNoncustodialDataSource, EdiscoveryNoncustodialDataSourceWithReferenceRequest, EdiscoveryNoncustodialDataSourceReferenceRequestBuilder, EdiscoveryNoncustodialDataSourceWithReferenceRequestBuilder, EdiscoveryNoncustodialDataSourceCollectionResponse, EdiscoveryNoncustodialDataSourceCollectionWithReferencesPage, EdiscoveryNoncustodialDataSourceCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EdiscoveryNoncustodialDataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryNoncustodialDataSourceCollectionResponse.class, EdiscoveryNoncustodialDataSourceCollectionWithReferencesPage.class, EdiscoveryNoncustodialDataSourceCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest select(@Nonnull final String value) {
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
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest top(final int value) {
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
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
