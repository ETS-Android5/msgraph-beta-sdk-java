// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyDefinitionFile;
import com.microsoft.graph.models.GroupPolicyDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.models.GroupPolicyDefinition;
import com.microsoft.graph.requests.GroupPolicyDefinitionWithReferenceRequest;
import com.microsoft.graph.requests.GroupPolicyDefinitionReferenceRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionCollectionWithReferencesRequest;
import com.microsoft.graph.requests.GroupPolicyDefinitionCollectionWithReferencesRequest;
import com.microsoft.graph.requests.GroupPolicyDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Collection With References Request.
 */
public class GroupPolicyDefinitionCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<GroupPolicyDefinition, GroupPolicyDefinitionWithReferenceRequest, GroupPolicyDefinitionReferenceRequestBuilder, GroupPolicyDefinitionWithReferenceRequestBuilder, GroupPolicyDefinitionCollectionResponse, GroupPolicyDefinitionCollectionWithReferencesPage, GroupPolicyDefinitionCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of GroupPolicyDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionCollectionResponse.class, GroupPolicyDefinitionCollectionWithReferencesPage.class, GroupPolicyDefinitionCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public GroupPolicyDefinitionCollectionWithReferencesRequest expand(@Nonnull final String value) {
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
    public GroupPolicyDefinitionCollectionWithReferencesRequest filter(@Nonnull final String value) {
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
    public GroupPolicyDefinitionCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
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
    public GroupPolicyDefinitionCollectionWithReferencesRequest select(@Nonnull final String value) {
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
    public GroupPolicyDefinitionCollectionWithReferencesRequest top(final int value) {
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
    public GroupPolicyDefinitionCollectionWithReferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public GroupPolicyDefinitionCollectionWithReferencesRequest count() {
        addCountOption(true);
        return this;
    }
}
