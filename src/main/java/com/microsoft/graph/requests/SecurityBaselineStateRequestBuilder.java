// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SecurityBaselineState;
import com.microsoft.graph.requests.SecurityBaselineSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityBaselineSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State Request Builder.
 */
public class SecurityBaselineStateRequestBuilder extends BaseRequestBuilder<SecurityBaselineState> {

    /**
     * The request builder for the SecurityBaselineState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineStateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SecurityBaselineStateRequest instance
     */
    @Nonnull
    public SecurityBaselineStateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SecurityBaselineStateRequest instance
     */
    @Nonnull
    public SecurityBaselineStateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SecurityBaselineStateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the SecurityBaselineSettingState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SecurityBaselineSettingStateCollectionRequestBuilder settingStates() {
        return new SecurityBaselineSettingStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settingStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the SecurityBaselineSettingState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SecurityBaselineSettingStateRequestBuilder settingStates(@Nonnull final String id) {
        return new SecurityBaselineSettingStateRequestBuilder(getRequestUrlWithAdditionalSegment("settingStates") + "/" + id, getClient(), null);
    }
}
