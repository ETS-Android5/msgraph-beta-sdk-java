// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Company;
import com.microsoft.graph.models.CountryRegion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.CountryRegionCollectionResponse;
import com.microsoft.graph.requests.CountryRegionCollectionRequestBuilder;
import com.microsoft.graph.requests.CountryRegionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Country Region Collection Request.
 */
public class CountryRegionCollectionRequest extends BaseEntityCollectionRequest<CountryRegion, CountryRegionCollectionResponse, CountryRegionCollectionPage> {

    /**
     * The request builder for this collection of CountryRegion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CountryRegionCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CountryRegionCollectionResponse.class, CountryRegionCollectionPage.class, CountryRegionCollectionRequestBuilder.class);
    }

    /**
     * Creates a new CountryRegion
     * @param newCountryRegion the CountryRegion to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CountryRegion> postAsync(@Nonnull final CountryRegion newCountryRegion) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CountryRegionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newCountryRegion);
    }

    /**
     * Creates a new CountryRegion
     * @param newCountryRegion the CountryRegion to create
     * @return the newly created object
     */
    @Nonnull
    public CountryRegion post(@Nonnull final CountryRegion newCountryRegion) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CountryRegionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCountryRegion);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CountryRegionCollectionRequest expand(@Nonnull final String value) {
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
    public CountryRegionCollectionRequest filter(@Nonnull final String value) {
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
    public CountryRegionCollectionRequest orderBy(@Nonnull final String value) {
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
    public CountryRegionCollectionRequest select(@Nonnull final String value) {
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
    public CountryRegionCollectionRequest top(final int value) {
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
    public CountryRegionCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CountryRegionCollectionRequest count() {
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
    public CountryRegionCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public CountryRegionCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

