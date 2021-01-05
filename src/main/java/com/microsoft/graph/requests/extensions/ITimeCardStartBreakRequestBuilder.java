// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITimeCardStartBreakRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Time Card Start Break Request Builder.
 */
public interface ITimeCardStartBreakRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITimeCardStartBreakRequest
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardStartBreakRequest instance
     */
    ITimeCardStartBreakRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ITimeCardStartBreakRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardStartBreakRequest instance
     */
    ITimeCardStartBreakRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
