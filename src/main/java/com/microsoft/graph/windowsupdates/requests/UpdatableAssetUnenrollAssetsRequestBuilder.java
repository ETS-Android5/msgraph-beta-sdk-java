// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;
import com.microsoft.graph.windowsupdates.requests.UpdatableAssetUnenrollAssetsRequest;
import com.microsoft.graph.windowsupdates.models.UpdatableAsset;
import com.microsoft.graph.windowsupdates.models.UpdateCategory;
import com.microsoft.graph.windowsupdates.models.UpdatableAsset;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.windowsupdates.models.UpdatableAssetUnenrollAssetsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Updatable Asset Unenroll Assets Request Builder.
 */
public class UpdatableAssetUnenrollAssetsRequestBuilder extends BaseActionRequestBuilder<UpdatableAsset> {

    /**
     * The request builder for this UpdatableAssetUnenrollAssets
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UpdatableAssetUnenrollAssetsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private UpdatableAssetUnenrollAssetsParameterSet body;
    /**
     * The request builder for this UpdatableAssetUnenrollAssets
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UpdatableAssetUnenrollAssetsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UpdatableAssetUnenrollAssetsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the UpdatableAssetUnenrollAssetsRequest
     *
     * @param requestOptions the options for the request
     * @return the UpdatableAssetUnenrollAssetsRequest instance
     */
    @Nonnull
    public UpdatableAssetUnenrollAssetsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UpdatableAssetUnenrollAssetsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UpdatableAssetUnenrollAssetsRequest instance
     */
    @Nonnull
    public UpdatableAssetUnenrollAssetsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UpdatableAssetUnenrollAssetsRequest request = new UpdatableAssetUnenrollAssetsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
