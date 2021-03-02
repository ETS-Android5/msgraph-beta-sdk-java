// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EntitlementManagement;
import com.microsoft.graph.models.extensions.Approval;
import com.microsoft.graph.models.generated.ApprovalFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalCollectionRequest;
import com.microsoft.graph.requests.extensions.IApprovalFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Collection Request Builder.
 */
public class ApprovalCollectionRequestBuilder extends BaseRequestBuilder implements IApprovalCollectionRequestBuilder {

    /**
     * The request builder for this collection of EntitlementManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApprovalCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IApprovalCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IApprovalCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ApprovalCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IApprovalRequestBuilder byId(final String id) {
        return new ApprovalRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IApprovalFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(final ApprovalFilterByCurrentUserOptions on) {
        return new ApprovalFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, on);
    }
}
