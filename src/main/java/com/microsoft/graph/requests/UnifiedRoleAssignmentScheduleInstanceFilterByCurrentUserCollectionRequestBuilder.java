// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RoleAssignmentScheduleInstanceFilterByCurrentUserOptions;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleInstance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Instance Filter By Current User Collection Request Builder.
 */
public class UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<UnifiedRoleAssignmentScheduleInstance, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionResponse, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionPage, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest> {

    /**
     * The request builder for this collection of UnifiedRoleAssignmentScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder.class, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest.class);
    }
    /**
     * The request builder for this collection of UnifiedRoleAssignmentScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserParameterSet parameters) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder.class, UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest instance
     */
    @Override
    @Nonnull
    public UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
