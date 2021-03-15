// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;

import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.GovernanceRoleAssignmentExportCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentExportCollectionRequest;
import com.microsoft.graph.requests.GovernanceRoleAssignmentExportCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Export Collection Request Builder.
 */
public class GovernanceRoleAssignmentExportCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<String, GovernanceRoleAssignmentExportCollectionRequestBuilder, GovernanceRoleAssignmentExportCollectionResponse, GovernanceRoleAssignmentExportCollectionPage, GovernanceRoleAssignmentExportCollectionRequest> {

    /**
     * The request builder for this collection of GovernanceRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentExportCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleAssignmentExportCollectionRequestBuilder.class, GovernanceRoleAssignmentExportCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the GovernanceRoleAssignmentExportCollectionRequest instance
     */
    @Override
    @Nonnull
    public GovernanceRoleAssignmentExportCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GovernanceRoleAssignmentExportCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
