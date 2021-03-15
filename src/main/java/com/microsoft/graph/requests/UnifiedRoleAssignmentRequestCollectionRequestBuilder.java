// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;

import com.microsoft.graph.models.UnifiedRoleAssignmentRequest;import com.microsoft.graph.models.RbacApplication;
import com.microsoft.graph.models.UnifiedRoleAssignmentRequest;
import com.microsoft.graph.models.RoleAssignmentRequestFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UnifiedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleAssignmentRequestCollectionRequest;
import com.microsoft.graph.requests.UnifiedRoleAssignmentRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.UnifiedRoleAssignmentRequestFilterByCurrentUserParameterSet;
import com.microsoft.graph.models.RequestRecordDecisionsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Request Collection Request Builder.
 */
public class UnifiedRoleAssignmentRequestCollectionRequestBuilder extends BaseCollectionRequestBuilder<UnifiedRoleAssignmentRequest, UnifiedRoleAssignmentRequestRequestBuilder, UnifiedRoleAssignmentRequestCollectionResponse, UnifiedRoleAssignmentRequestCollectionPage, UnifiedRoleAssignmentRequestCollectionRequest> {

    /**
     * The request builder for this collection of RbacApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentRequestCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentRequestRequestBuilder.class, UnifiedRoleAssignmentRequestCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UnifiedRoleAssignmentRequestFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(@Nonnull final UnifiedRoleAssignmentRequestFilterByCurrentUserParameterSet parameters) {
        return new UnifiedRoleAssignmentRequestFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
