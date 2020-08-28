// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISynchronizationPingRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Ping Request Builder.
 */
public interface ISynchronizationPingRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISynchronizationPingRequest
     *
     * @return the ISynchronizationPingRequest instance
     */
    ISynchronizationPingRequest buildRequest();

    /**
     * Creates the ISynchronizationPingRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationPingRequest instance
     */
    ISynchronizationPingRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
