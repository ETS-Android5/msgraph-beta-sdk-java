// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagedTenant;
import com.microsoft.graph.managedtenants.models.CredentialUserRegistrationsSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionResponse;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registrations Summary Collection Request.
 */
public class CredentialUserRegistrationsSummaryCollectionRequest extends BaseEntityCollectionRequest<CredentialUserRegistrationsSummary, CredentialUserRegistrationsSummaryCollectionResponse, CredentialUserRegistrationsSummaryCollectionPage> {

    /**
     * The request builder for this collection of CredentialUserRegistrationsSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CredentialUserRegistrationsSummaryCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CredentialUserRegistrationsSummaryCollectionResponse.class, CredentialUserRegistrationsSummaryCollectionPage.class, CredentialUserRegistrationsSummaryCollectionRequestBuilder.class);
    }

    /**
     * Creates a new CredentialUserRegistrationsSummary
     * @param newCredentialUserRegistrationsSummary the CredentialUserRegistrationsSummary to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationsSummary> postAsync(@Nonnull final CredentialUserRegistrationsSummary newCredentialUserRegistrationsSummary) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CredentialUserRegistrationsSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newCredentialUserRegistrationsSummary);
    }

    /**
     * Creates a new CredentialUserRegistrationsSummary
     * @param newCredentialUserRegistrationsSummary the CredentialUserRegistrationsSummary to create
     * @return the newly created object
     */
    @Nonnull
    public CredentialUserRegistrationsSummary post(@Nonnull final CredentialUserRegistrationsSummary newCredentialUserRegistrationsSummary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CredentialUserRegistrationsSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCredentialUserRegistrationsSummary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CredentialUserRegistrationsSummaryCollectionRequest expand(@Nonnull final String value) {
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
    public CredentialUserRegistrationsSummaryCollectionRequest filter(@Nonnull final String value) {
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
    public CredentialUserRegistrationsSummaryCollectionRequest orderBy(@Nonnull final String value) {
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
    public CredentialUserRegistrationsSummaryCollectionRequest select(@Nonnull final String value) {
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
    public CredentialUserRegistrationsSummaryCollectionRequest top(final int value) {
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
    public CredentialUserRegistrationsSummaryCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CredentialUserRegistrationsSummaryCollectionRequest count() {
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
    public CredentialUserRegistrationsSummaryCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public CredentialUserRegistrationsSummaryCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

