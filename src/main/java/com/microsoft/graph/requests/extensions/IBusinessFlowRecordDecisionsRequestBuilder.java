// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IBusinessFlowRecordDecisionsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Business Flow Record Decisions Request Builder.
 */
public interface IBusinessFlowRecordDecisionsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IBusinessFlowRecordDecisionsRequest
     *
     * @return the IBusinessFlowRecordDecisionsRequest instance
     */
    IBusinessFlowRecordDecisionsRequest buildRequest();

    /**
     * Creates the IBusinessFlowRecordDecisionsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IBusinessFlowRecordDecisionsRequest instance
     */
    IBusinessFlowRecordDecisionsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
