// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISitePagePublishRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Page Publish Request Builder.
 */
public interface ISitePagePublishRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISitePagePublishRequest
     *
     * @return the ISitePagePublishRequest instance
     */
    ISitePagePublishRequest buildRequest();

    /**
     * Creates the ISitePagePublishRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISitePagePublishRequest instance
     */
    ISitePagePublishRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
