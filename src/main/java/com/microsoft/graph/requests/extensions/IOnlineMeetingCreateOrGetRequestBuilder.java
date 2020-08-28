// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCreateOrGetRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Online Meeting Create Or Get Request Builder.
 */
public interface IOnlineMeetingCreateOrGetRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IOnlineMeetingCreateOrGetRequest
     *
     * @return the IOnlineMeetingCreateOrGetRequest instance
     */
    IOnlineMeetingCreateOrGetRequest buildRequest();

    /**
     * Creates the IOnlineMeetingCreateOrGetRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IOnlineMeetingCreateOrGetRequest instance
     */
    IOnlineMeetingCreateOrGetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
