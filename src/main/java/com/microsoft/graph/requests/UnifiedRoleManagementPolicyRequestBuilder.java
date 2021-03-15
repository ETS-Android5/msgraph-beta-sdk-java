// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleManagementPolicy;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyRuleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Request Builder.
 */
public class UnifiedRoleManagementPolicyRequestBuilder extends BaseRequestBuilder<UnifiedRoleManagementPolicy> {

    /**
     * The request builder for the UnifiedRoleManagementPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleManagementPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleManagementPolicyRequest instance
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleManagementPolicyRequest instance
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.UnifiedRoleManagementPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the UnifiedRoleManagementPolicyRule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRuleCollectionRequestBuilder effectiveRules() {
        return new UnifiedRoleManagementPolicyRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("effectiveRules"), getClient(), null);
    }

    /**
     * Gets a request builder for the UnifiedRoleManagementPolicyRule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRuleRequestBuilder effectiveRules(@Nonnull final String id) {
        return new UnifiedRoleManagementPolicyRuleRequestBuilder(getRequestUrlWithAdditionalSegment("effectiveRules") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UnifiedRoleManagementPolicyRule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRuleCollectionRequestBuilder rules() {
        return new UnifiedRoleManagementPolicyRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rules"), getClient(), null);
    }

    /**
     * Gets a request builder for the UnifiedRoleManagementPolicyRule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UnifiedRoleManagementPolicyRuleRequestBuilder rules(@Nonnull final String id) {
        return new UnifiedRoleManagementPolicyRuleRequestBuilder(getRequestUrlWithAdditionalSegment("rules") + "/" + id, getClient(), null);
    }
}
