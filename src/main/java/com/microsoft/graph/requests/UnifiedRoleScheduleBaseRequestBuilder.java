// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleScheduleBase;
import com.microsoft.graph.requests.AppScopeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Schedule Base Request Builder.
 */
public class UnifiedRoleScheduleBaseRequestBuilder extends BaseRequestBuilder<UnifiedRoleScheduleBase> {

    /**
     * The request builder for the UnifiedRoleScheduleBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleScheduleBaseRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleScheduleBaseRequest instance
     */
    @Nonnull
    public UnifiedRoleScheduleBaseRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UnifiedRoleScheduleBaseRequest instance
     */
    @Nonnull
    public UnifiedRoleScheduleBaseRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.UnifiedRoleScheduleBaseRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AppScope
     *
     * @return the AppScopeWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AppScopeWithReferenceRequestBuilder appScope() {
        return new AppScopeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("appScope"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder directoryScope() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directoryScope"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder principal() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("principal"), getClient(), null);
    }

    /**
     * Gets the request builder for UnifiedRoleDefinition
     *
     * @return the UnifiedRoleDefinitionWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UnifiedRoleDefinitionWithReferenceRequestBuilder roleDefinition() {
        return new UnifiedRoleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }
}
