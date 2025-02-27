// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.models.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.RoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.RoleScopeTagAutoAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.RoleScopeTagAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Request Builder.
 */
public class RoleScopeTagRequestBuilder extends BaseRequestBuilder<RoleScopeTag> {

    /**
     * The request builder for the RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the RoleScopeTagRequest instance
     */
    @Nonnull
    public RoleScopeTagRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the RoleScopeTagRequest instance
     */
    @Nonnull
    public RoleScopeTagRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.RoleScopeTagRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the RoleScopeTagAutoAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RoleScopeTagAutoAssignmentCollectionRequestBuilder assignments() {
        return new RoleScopeTagAutoAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the RoleScopeTagAutoAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RoleScopeTagAutoAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new RoleScopeTagAutoAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public RoleScopeTagAssignCollectionRequestBuilder assign(@Nonnull final RoleScopeTagAssignParameterSet parameters) {
        return new RoleScopeTagAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
