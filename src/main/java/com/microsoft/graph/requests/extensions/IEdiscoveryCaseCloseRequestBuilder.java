// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEdiscoveryCaseCloseRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ediscovery Case Close Request Builder.
 */
public interface IEdiscoveryCaseCloseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEdiscoveryCaseCloseRequest
     *
     * @return the IEdiscoveryCaseCloseRequest instance
     */
    IEdiscoveryCaseCloseRequest buildRequest();

    /**
     * Creates the IEdiscoveryCaseCloseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEdiscoveryCaseCloseRequest instance
     */
    IEdiscoveryCaseCloseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
