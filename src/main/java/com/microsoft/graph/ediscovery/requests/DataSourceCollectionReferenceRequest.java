// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.models.DataSource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.ediscovery.requests.DataSourceWithReferenceRequest;
import com.microsoft.graph.ediscovery.requests.DataSourceReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionWithReferencesRequest;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.models.DataSource;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Source Collection Reference Request.
 */
public class DataSourceCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<DataSource, DataSourceWithReferenceRequest, DataSourceReferenceRequestBuilder, DataSourceWithReferenceRequestBuilder, DataSourceCollectionResponse, DataSourceCollectionWithReferencesPage, DataSourceCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of DataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSourceCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataSourceCollectionResponse.class, DataSourceCollectionWithReferencesPage.class, DataSourceCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DataSourceCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public DataSourceCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public DataSourceCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public DataSourceCollectionReferenceRequest select(@Nonnull final String value) {
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
    public DataSourceCollectionReferenceRequest top(final int value) {
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
    public DataSourceCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DataSourceCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
