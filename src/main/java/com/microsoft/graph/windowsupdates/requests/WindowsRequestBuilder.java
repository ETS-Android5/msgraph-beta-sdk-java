// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.windowsupdates.models.Windows;
import com.microsoft.graph.windowsupdates.requests.UpdatesRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Request Builder.
 */
public class WindowsRequestBuilder extends BaseRequestBuilder<Windows> {

    /**
     * The request builder for the Windows
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WindowsRequest instance
     */
    @Nonnull
    public WindowsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WindowsRequest instance
     */
    @Nonnull
    public WindowsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.windowsupdates.requests.WindowsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Updates
     *
     * @return the UpdatesRequestBuilder instance
     */
    @Nonnull
    public UpdatesRequestBuilder updates() {
        return new UpdatesRequestBuilder(getRequestUrlWithAdditionalSegment("updates"), getClient(), null);
    }
}
