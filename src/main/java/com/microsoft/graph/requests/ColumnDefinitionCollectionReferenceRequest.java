// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContentType;
import com.microsoft.graph.models.ColumnDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ColumnDefinitionWithReferenceRequest;
import com.microsoft.graph.requests.ColumnDefinitionReferenceRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionCollectionWithReferencesRequest;
import com.microsoft.graph.requests.ColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.ColumnDefinition;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Definition Collection Reference Request.
 */
public class ColumnDefinitionCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<ColumnDefinition, ColumnDefinitionWithReferenceRequest, ColumnDefinitionReferenceRequestBuilder, ColumnDefinitionWithReferenceRequestBuilder, ColumnDefinitionCollectionResponse, ColumnDefinitionCollectionWithReferencesPage, ColumnDefinitionCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ColumnDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ColumnDefinitionCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ColumnDefinitionCollectionResponse.class, ColumnDefinitionCollectionWithReferencesPage.class, ColumnDefinitionCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ColumnDefinitionCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public ColumnDefinitionCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public ColumnDefinitionCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public ColumnDefinitionCollectionReferenceRequest select(@Nonnull final String value) {
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
    public ColumnDefinitionCollectionReferenceRequest top(final int value) {
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
    public ColumnDefinitionCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ColumnDefinitionCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
