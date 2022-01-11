// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamworkDevice;
import com.microsoft.graph.models.TeamworkDeviceOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.TeamworkDeviceOperationCollectionResponse;
import com.microsoft.graph.requests.TeamworkDeviceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamworkDeviceOperationCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Device Operation Collection Request.
 */
public class TeamworkDeviceOperationCollectionRequest extends BaseEntityCollectionRequest<TeamworkDeviceOperation, TeamworkDeviceOperationCollectionResponse, TeamworkDeviceOperationCollectionPage> {

    /**
     * The request builder for this collection of TeamworkDeviceOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkDeviceOperationCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamworkDeviceOperationCollectionResponse.class, TeamworkDeviceOperationCollectionPage.class, TeamworkDeviceOperationCollectionRequestBuilder.class);
    }

    /**
     * Creates a new TeamworkDeviceOperation
     * @param newTeamworkDeviceOperation the TeamworkDeviceOperation to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamworkDeviceOperation> postAsync(@Nonnull final TeamworkDeviceOperation newTeamworkDeviceOperation) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamworkDeviceOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newTeamworkDeviceOperation);
    }

    /**
     * Creates a new TeamworkDeviceOperation
     * @param newTeamworkDeviceOperation the TeamworkDeviceOperation to create
     * @return the newly created object
     */
    @Nonnull
    public TeamworkDeviceOperation post(@Nonnull final TeamworkDeviceOperation newTeamworkDeviceOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamworkDeviceOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeamworkDeviceOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public TeamworkDeviceOperationCollectionRequest expand(@Nonnull final String value) {
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
    public TeamworkDeviceOperationCollectionRequest filter(@Nonnull final String value) {
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
    public TeamworkDeviceOperationCollectionRequest orderBy(@Nonnull final String value) {
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
    public TeamworkDeviceOperationCollectionRequest select(@Nonnull final String value) {
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
    public TeamworkDeviceOperationCollectionRequest top(final int value) {
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
    public TeamworkDeviceOperationCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public TeamworkDeviceOperationCollectionRequest count() {
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
    public TeamworkDeviceOperationCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public TeamworkDeviceOperationCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

