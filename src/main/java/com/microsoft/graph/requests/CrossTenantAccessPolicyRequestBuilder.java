// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CrossTenantAccessPolicy;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.CrossTenantAccessPolicyConfigurationDefaultRequestBuilder;
import com.microsoft.graph.requests.CrossTenantAccessPolicyConfigurationPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.CrossTenantAccessPolicyConfigurationPartnerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cross Tenant Access Policy Request Builder.
 */
public class CrossTenantAccessPolicyRequestBuilder extends BaseRequestBuilder<CrossTenantAccessPolicy> {

    /**
     * The request builder for the CrossTenantAccessPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CrossTenantAccessPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CrossTenantAccessPolicyRequest instance
     */
    @Nonnull
    public CrossTenantAccessPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CrossTenantAccessPolicyRequest instance
     */
    @Nonnull
    public CrossTenantAccessPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.CrossTenantAccessPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for CrossTenantAccessPolicyConfigurationDefault
     *
     * @return the CrossTenantAccessPolicyConfigurationDefaultRequestBuilder instance
     */
    @Nonnull
    public CrossTenantAccessPolicyConfigurationDefaultRequestBuilder msgraphDefault() {
        return new CrossTenantAccessPolicyConfigurationDefaultRequestBuilder(getRequestUrlWithAdditionalSegment("default"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CrossTenantAccessPolicyConfigurationPartner collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CrossTenantAccessPolicyConfigurationPartnerCollectionRequestBuilder partners() {
        return new CrossTenantAccessPolicyConfigurationPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("partners"), getClient(), null);
    }

    /**
     * Gets a request builder for the CrossTenantAccessPolicyConfigurationPartner item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CrossTenantAccessPolicyConfigurationPartnerRequestBuilder partners(@Nonnull final String id) {
        return new CrossTenantAccessPolicyConfigurationPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("partners") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSet parameters) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(@Nonnull final DirectoryObjectCheckMemberObjectsParameterSet parameters) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(@Nonnull final DirectoryObjectGetMemberGroupsParameterSet parameters) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(@Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
