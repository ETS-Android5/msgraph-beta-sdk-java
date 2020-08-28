// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Approval;
import com.microsoft.graph.models.extensions.ApprovalStep;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IApprovalStepCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalStepRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalStepCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Step Collection Request Builder.
 */
public class ApprovalStepCollectionRequestBuilder extends BaseRequestBuilder implements IApprovalStepCollectionRequestBuilder {

    /**
     * The request builder for this collection of Approval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApprovalStepCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IApprovalStepCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IApprovalStepCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ApprovalStepCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IApprovalStepRequestBuilder byId(final String id) {
        return new ApprovalStepRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
