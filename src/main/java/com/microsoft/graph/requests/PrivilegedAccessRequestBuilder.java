// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrivilegedAccess;
import com.microsoft.graph.requests.GovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Request Builder.
 */
public class PrivilegedAccessRequestBuilder extends BaseRequestBuilder<PrivilegedAccess> {

    /**
     * The request builder for the PrivilegedAccess
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedAccessRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedAccessRequest instance
     */
    @Nonnull
    public PrivilegedAccessRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedAccessRequest instance
     */
    @Nonnull
    public PrivilegedAccessRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PrivilegedAccessRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the GovernanceResource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GovernanceResourceCollectionRequestBuilder resources() {
        return new GovernanceResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    /**
     * Gets a request builder for the GovernanceResource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GovernanceResourceRequestBuilder resources(@Nonnull final String id) {
        return new GovernanceResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GovernanceRoleAssignmentRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GovernanceRoleAssignmentRequestCollectionRequestBuilder roleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignmentRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the GovernanceRoleAssignmentRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GovernanceRoleAssignmentRequestRequestBuilder roleAssignmentRequests(@Nonnull final String id) {
        return new GovernanceRoleAssignmentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignmentRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GovernanceRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GovernanceRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new GovernanceRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the GovernanceRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GovernanceRoleAssignmentRequestBuilder roleAssignments(@Nonnull final String id) {
        return new GovernanceRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GovernanceRoleDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GovernanceRoleDefinitionCollectionRequestBuilder roleDefinitions() {
        return new GovernanceRoleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the GovernanceRoleDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GovernanceRoleDefinitionRequestBuilder roleDefinitions(@Nonnull final String id) {
        return new GovernanceRoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the GovernanceRoleSetting collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GovernanceRoleSettingCollectionRequestBuilder roleSettings() {
        return new GovernanceRoleSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleSettings"), getClient(), null);
    }

    /**
     * Gets a request builder for the GovernanceRoleSetting item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GovernanceRoleSettingRequestBuilder roleSettings(@Nonnull final String id) {
        return new GovernanceRoleSettingRequestBuilder(getRequestUrlWithAdditionalSegment("roleSettings") + "/" + id, getClient(), null);
    }
}
