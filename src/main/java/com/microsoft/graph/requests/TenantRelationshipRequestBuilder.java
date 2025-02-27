// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TenantRelationship;
import com.microsoft.graph.managedtenants.requests.ManagedTenantRequestBuilder;
import com.microsoft.graph.requests.DelegatedAdminCustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.DelegatedAdminCustomerRequestBuilder;
import com.microsoft.graph.requests.DelegatedAdminRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.DelegatedAdminRelationshipRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Relationship Request Builder.
 */
public class TenantRelationshipRequestBuilder extends BaseRequestBuilder<TenantRelationship> {

    /**
     * The request builder for the TenantRelationship
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TenantRelationshipRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TenantRelationshipRequest instance
     */
    @Nonnull
    public TenantRelationshipRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TenantRelationshipRequest instance
     */
    @Nonnull
    public TenantRelationshipRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.TenantRelationshipRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ManagedTenant
     *
     * @return the ManagedTenantRequestBuilder instance
     */
    @Nonnull
    public ManagedTenantRequestBuilder managedTenants() {
        return new ManagedTenantRequestBuilder(getRequestUrlWithAdditionalSegment("managedTenants"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DelegatedAdminCustomer collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DelegatedAdminCustomerCollectionRequestBuilder delegatedAdminCustomers() {
        return new DelegatedAdminCustomerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedAdminCustomers"), getClient(), null);
    }

    /**
     * Gets a request builder for the DelegatedAdminCustomer item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DelegatedAdminCustomerRequestBuilder delegatedAdminCustomers(@Nonnull final String id) {
        return new DelegatedAdminCustomerRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedAdminCustomers") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DelegatedAdminRelationship collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DelegatedAdminRelationshipCollectionRequestBuilder delegatedAdminRelationships() {
        return new DelegatedAdminRelationshipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedAdminRelationships"), getClient(), null);
    }

    /**
     * Gets a request builder for the DelegatedAdminRelationship item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DelegatedAdminRelationshipRequestBuilder delegatedAdminRelationships(@Nonnull final String id) {
        return new DelegatedAdminRelationshipRequestBuilder(getRequestUrlWithAdditionalSegment("delegatedAdminRelationships") + "/" + id, getClient(), null);
    }
}
