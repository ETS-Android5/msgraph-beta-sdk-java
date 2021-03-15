// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageResource;
import com.microsoft.graph.requests.AccessPackageResourceEnvironmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceScopeRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request Builder.
 */
public class AccessPackageResourceRequestBuilder extends BaseRequestBuilder<AccessPackageResource> {

    /**
     * The request builder for the AccessPackageResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageResourceRequest instance
     */
    @Nonnull
    public AccessPackageResourceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageResourceRequest instance
     */
    @Nonnull
    public AccessPackageResourceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessPackageResourceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessPackageResourceEnvironment
     *
     * @return the AccessPackageResourceEnvironmentWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AccessPackageResourceEnvironmentWithReferenceRequestBuilder accessPackageResourceEnvironment() {
        return new AccessPackageResourceEnvironmentWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceEnvironment"), getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessPackageResourceRole collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessPackageResourceRoleCollectionRequestBuilder accessPackageResourceRoles() {
        return new AccessPackageResourceRoleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRoles"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessPackageResourceRole item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessPackageResourceRoleRequestBuilder accessPackageResourceRoles(@Nonnull final String id) {
        return new AccessPackageResourceRoleRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceRoles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessPackageResourceScope collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessPackageResourceScopeCollectionRequestBuilder accessPackageResourceScopes() {
        return new AccessPackageResourceScopeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceScopes"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessPackageResourceScope item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessPackageResourceScopeRequestBuilder accessPackageResourceScopes(@Nonnull final String id) {
        return new AccessPackageResourceScopeRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageResourceScopes") + "/" + id, getClient(), null);
    }
}
