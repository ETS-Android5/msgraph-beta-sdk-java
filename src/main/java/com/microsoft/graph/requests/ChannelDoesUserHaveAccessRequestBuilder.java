// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ChannelDoesUserHaveAccessRequest;
import com.microsoft.graph.models.Channel;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.ChannelDoesUserHaveAccessParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Does User Have Access Request Builder.
 */
public class ChannelDoesUserHaveAccessRequestBuilder extends BaseFunctionRequestBuilder<Boolean> {

    /**
     * The request builder for this ChannelDoesUserHaveAccess
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelDoesUserHaveAccessRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this ChannelDoesUserHaveAccess
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ChannelDoesUserHaveAccessRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ChannelDoesUserHaveAccessParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the ChannelDoesUserHaveAccessRequest
     *
     * @param requestOptions the options for the request
     * @return the ChannelDoesUserHaveAccessRequest instance
     */
    @Nonnull
    public ChannelDoesUserHaveAccessRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ChannelDoesUserHaveAccessRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ChannelDoesUserHaveAccessRequest instance
     */
    @Nonnull
    public ChannelDoesUserHaveAccessRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ChannelDoesUserHaveAccessRequest request = new ChannelDoesUserHaveAccessRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}
