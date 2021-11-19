// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RoleAssignmentScheduleFilterByCurrentUserOptions;
import com.microsoft.graph.models.UnifiedRoleAssignmentSchedule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleFilterByCurrentUserParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Filter By Current User Collection Request Builder.
 */
public class UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<UnifiedRoleAssignmentSchedule, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionResponse, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionPage, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest> {

    /**
     * The request builder for this collection of UnifiedRoleAssignmentSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder.class, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest.class);
    }
    /**
     * The request builder for this collection of UnifiedRoleAssignmentSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UnifiedRoleAssignmentScheduleFilterByCurrentUserParameterSet parameters) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder.class, UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest instance
     */
    @Override
    @Nonnull
    public UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
