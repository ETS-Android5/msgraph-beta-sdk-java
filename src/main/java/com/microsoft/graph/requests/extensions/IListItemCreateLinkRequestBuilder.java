// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IListItemCreateLinkRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the List Item Create Link Request Builder.
 */
public interface IListItemCreateLinkRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IListItemCreateLinkRequest
     *
     * @param requestOptions the options for the request
     * @return the IListItemCreateLinkRequest instance
     */
    IListItemCreateLinkRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IListItemCreateLinkRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IListItemCreateLinkRequest instance
     */
    IListItemCreateLinkRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
