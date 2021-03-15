
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
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

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Reference Request Builder.
 */
public class UnifiedRoleManagementPolicyReferenceRequestBuilder extends BaseReferenceRequestBuilder<UnifiedRoleManagementPolicy, UnifiedRoleManagementPolicyReferenceRequest> {

    /**
     * The request builder for the UnifiedRoleManagementPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleManagementPolicyReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleManagementPolicyReferenceRequest.class);
    }
}
