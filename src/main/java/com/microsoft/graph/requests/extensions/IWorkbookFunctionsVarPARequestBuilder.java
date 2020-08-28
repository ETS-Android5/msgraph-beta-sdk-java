// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsVarPARequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Var PARequest Builder.
 */
public interface IWorkbookFunctionsVarPARequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsVarPARequest
     *
     * @return the IWorkbookFunctionsVarPARequest instance
     */
    IWorkbookFunctionsVarPARequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsVarPARequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsVarPARequest instance
     */
    IWorkbookFunctionsVarPARequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
