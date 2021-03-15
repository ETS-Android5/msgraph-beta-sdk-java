// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationSchool;
import com.microsoft.graph.models.EducationUser;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.EducationUserWithReferenceRequest;
import com.microsoft.graph.requests.EducationUserReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequest;
import com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Collection Reference Request.
 */
public class EducationUserCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<EducationUser, EducationUserWithReferenceRequest, EducationUserReferenceRequestBuilder, EducationUserWithReferenceRequestBuilder, EducationUserCollectionResponse, EducationUserCollectionWithReferencesPage, EducationUserCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationUserCollectionResponse.class, EducationUserCollectionWithReferencesPage.class, EducationUserCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new EducationUser
     * @param newEducationUser the EducationUser to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationUser> postAsync(@Nonnull final EducationUser newEducationUser) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/education/users/" + newEducationUser.id);
        return new EducationUserWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newEducationUser, body);
    }

    /**
     * Creates a new EducationUser
     * @param newEducationUser the EducationUser to create
     * @return the newly created object
     */
    @Nonnull
    public EducationUser post(@Nonnull final EducationUser newEducationUser) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/education/users/" + newEducationUser.id);
        return new EducationUserWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newEducationUser, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EducationUserCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public EducationUserCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public EducationUserCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public EducationUserCollectionReferenceRequest select(@Nonnull final String value) {
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
    public EducationUserCollectionReferenceRequest top(final int value) {
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
    public EducationUserCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EducationUserCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
