// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.requests.TenantTagUnassignTagRequest;
import com.microsoft.graph.managedtenants.models.TenantTag;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.managedtenants.models.TenantTagUnassignTagParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Tag Unassign Tag Request Builder.
 */
public class TenantTagUnassignTagRequestBuilder extends BaseActionRequestBuilder<TenantTag> {

    /**
     * The request builder for this TenantTagUnassignTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TenantTagUnassignTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private TenantTagUnassignTagParameterSet body;
    /**
     * The request builder for this TenantTagUnassignTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TenantTagUnassignTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TenantTagUnassignTagParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TenantTagUnassignTagRequest
     *
     * @param requestOptions the options for the request
     * @return the TenantTagUnassignTagRequest instance
     */
    @Nonnull
    public TenantTagUnassignTagRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TenantTagUnassignTagRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TenantTagUnassignTagRequest instance
     */
    @Nonnull
    public TenantTagUnassignTagRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TenantTagUnassignTagRequest request = new TenantTagUnassignTagRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
