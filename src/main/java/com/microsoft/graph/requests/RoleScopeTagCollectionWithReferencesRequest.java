// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.models.RoleScopeTagAutoAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.requests.RoleScopeTagWithReferenceRequest;
import com.microsoft.graph.requests.RoleScopeTagReferenceRequestBuilder;
import com.microsoft.graph.requests.RoleScopeTagWithReferenceRequestBuilder;
import com.microsoft.graph.requests.RoleScopeTagCollectionWithReferencesRequest;
import com.microsoft.graph.requests.RoleScopeTagCollectionWithReferencesRequest;
import com.microsoft.graph.requests.RoleScopeTagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Collection With References Request.
 */
public class RoleScopeTagCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<RoleScopeTag, RoleScopeTagWithReferenceRequest, RoleScopeTagReferenceRequestBuilder, RoleScopeTagWithReferenceRequestBuilder, RoleScopeTagCollectionResponse, RoleScopeTagCollectionWithReferencesPage, RoleScopeTagCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleScopeTagCollectionResponse.class, RoleScopeTagCollectionWithReferencesPage.class, RoleScopeTagCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public RoleScopeTagCollectionWithReferencesRequest expand(@Nonnull final String value) {
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
    public RoleScopeTagCollectionWithReferencesRequest filter(@Nonnull final String value) {
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
    public RoleScopeTagCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
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
    public RoleScopeTagCollectionWithReferencesRequest select(@Nonnull final String value) {
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
    public RoleScopeTagCollectionWithReferencesRequest top(final int value) {
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
    public RoleScopeTagCollectionWithReferencesRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public RoleScopeTagCollectionWithReferencesRequest count() {
        addCountOption(true);
        return this;
    }
}
