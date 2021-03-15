// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagementCondition;
import com.microsoft.graph.models.ManagementConditionStatement;
import com.microsoft.graph.models.ManagementConditionExpressionString;
import com.microsoft.graph.models.DevicePlatformType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ManagementConditionStatementWithReferenceRequest;
import com.microsoft.graph.requests.ManagementConditionStatementReferenceRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionStatementWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionStatementCollectionWithReferencesRequest;
import com.microsoft.graph.requests.ManagementConditionStatementCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.ManagementConditionStatement;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Collection Reference Request.
 */
public class ManagementConditionStatementCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<ManagementConditionStatement, ManagementConditionStatementWithReferenceRequest, ManagementConditionStatementReferenceRequestBuilder, ManagementConditionStatementWithReferenceRequestBuilder, ManagementConditionStatementCollectionResponse, ManagementConditionStatementCollectionWithReferencesPage, ManagementConditionStatementCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionStatementCollectionResponse.class, ManagementConditionStatementCollectionWithReferencesPage.class, ManagementConditionStatementCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new ManagementConditionStatement
     * @param newManagementConditionStatement the ManagementConditionStatement to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagementConditionStatement> postAsync(@Nonnull final ManagementConditionStatement newManagementConditionStatement) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managementConditionStatements/" + newManagementConditionStatement.id);
        return new ManagementConditionStatementWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newManagementConditionStatement, body);
    }

    /**
     * Creates a new ManagementConditionStatement
     * @param newManagementConditionStatement the ManagementConditionStatement to create
     * @return the newly created object
     */
    @Nonnull
    public ManagementConditionStatement post(@Nonnull final ManagementConditionStatement newManagementConditionStatement) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managementConditionStatements/" + newManagementConditionStatement.id);
        return new ManagementConditionStatementWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newManagementConditionStatement, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagementConditionStatementCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public ManagementConditionStatementCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public ManagementConditionStatementCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public ManagementConditionStatementCollectionReferenceRequest select(@Nonnull final String value) {
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
    public ManagementConditionStatementCollectionReferenceRequest top(final int value) {
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
    public ManagementConditionStatementCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ManagementConditionStatementCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
