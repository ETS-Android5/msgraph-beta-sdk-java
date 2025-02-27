// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;

import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;import com.microsoft.graph.models.RbacApplication;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;
import com.microsoft.graph.models.RoleEligibilityScheduleRequestFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestCollectionRequest;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequestFilterByCurrentUserParameterSet;
import com.microsoft.graph.models.RequestRecordDecisionsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Request Collection Request Builder.
 */
public class UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder extends BaseCollectionRequestBuilder<UnifiedRoleEligibilityScheduleRequest, UnifiedRoleEligibilityScheduleRequestRequestBuilder, UnifiedRoleEligibilityScheduleRequestCollectionResponse, UnifiedRoleEligibilityScheduleRequestCollectionPage, UnifiedRoleEligibilityScheduleRequestCollectionRequest> {

    /**
     * The request builder for this collection of RbacApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityScheduleRequestRequestBuilder.class, UnifiedRoleEligibilityScheduleRequestCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UnifiedRoleEligibilityScheduleRequestFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(@Nonnull final UnifiedRoleEligibilityScheduleRequestFilterByCurrentUserParameterSet parameters) {
        return new UnifiedRoleEligibilityScheduleRequestFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, parameters);
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
