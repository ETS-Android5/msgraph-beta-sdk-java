// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestReprocessRequest;
import com.microsoft.graph.models.AccessPackageAssignmentRequest;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request Reprocess Request Builder.
 */
public class AccessPackageAssignmentRequestReprocessRequestBuilder extends BaseActionRequestBuilder<AccessPackageAssignmentRequest> {

    /**
     * The request builder for this AccessPackageAssignmentRequestReprocess
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentRequestReprocessRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the AccessPackageAssignmentRequestReprocessRequest
     *
     * @param requestOptions the options for the request
     * @return the AccessPackageAssignmentRequestReprocessRequest instance
     */
    @Nonnull
    public AccessPackageAssignmentRequestReprocessRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AccessPackageAssignmentRequestReprocessRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AccessPackageAssignmentRequestReprocessRequest instance
     */
    @Nonnull
    public AccessPackageAssignmentRequestReprocessRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AccessPackageAssignmentRequestReprocessRequest request = new AccessPackageAssignmentRequestReprocessRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
