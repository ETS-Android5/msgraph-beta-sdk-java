// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CloudPCTroubleshootRequest;
import com.microsoft.graph.models.CloudPC;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PCTroubleshoot Request Builder.
 */
public class CloudPCTroubleshootRequestBuilder extends BaseActionRequestBuilder<CloudPC> {

    /**
     * The request builder for this CloudPCTroubleshoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPCTroubleshootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the CloudPCTroubleshootRequest
     *
     * @param requestOptions the options for the request
     * @return the CloudPCTroubleshootRequest instance
     */
    @Nonnull
    public CloudPCTroubleshootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CloudPCTroubleshootRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CloudPCTroubleshootRequest instance
     */
    @Nonnull
    public CloudPCTroubleshootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CloudPCTroubleshootRequest request = new CloudPCTroubleshootRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
