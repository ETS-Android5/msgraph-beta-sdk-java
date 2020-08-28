// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeColumnRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Column Request Builder.
 */
public interface IWorkbookRangeColumnRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookRangeColumnRequest
     *
     * @return the IWorkbookRangeColumnRequest instance
     */
    IWorkbookRangeColumnRequest buildRequest();

    /**
     * Creates the IWorkbookRangeColumnRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookRangeColumnRequest instance
     */
    IWorkbookRangeColumnRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
