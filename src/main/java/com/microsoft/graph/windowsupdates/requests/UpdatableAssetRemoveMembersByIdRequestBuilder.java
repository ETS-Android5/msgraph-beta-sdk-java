// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;
import com.microsoft.graph.windowsupdates.requests.UpdatableAssetRemoveMembersByIdRequest;
import com.microsoft.graph.windowsupdates.models.UpdatableAsset;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.windowsupdates.models.UpdatableAssetRemoveMembersByIdParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Updatable Asset Remove Members By Id Request Builder.
 */
public class UpdatableAssetRemoveMembersByIdRequestBuilder extends BaseActionRequestBuilder<UpdatableAsset> {

    /**
     * The request builder for this UpdatableAssetRemoveMembersById
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UpdatableAssetRemoveMembersByIdRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private UpdatableAssetRemoveMembersByIdParameterSet body;
    /**
     * The request builder for this UpdatableAssetRemoveMembersById
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UpdatableAssetRemoveMembersByIdRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UpdatableAssetRemoveMembersByIdParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the UpdatableAssetRemoveMembersByIdRequest
     *
     * @param requestOptions the options for the request
     * @return the UpdatableAssetRemoveMembersByIdRequest instance
     */
    @Nonnull
    public UpdatableAssetRemoveMembersByIdRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UpdatableAssetRemoveMembersByIdRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UpdatableAssetRemoveMembersByIdRequest instance
     */
    @Nonnull
    public UpdatableAssetRemoveMembersByIdRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UpdatableAssetRemoveMembersByIdRequest request = new UpdatableAssetRemoveMembersByIdRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
