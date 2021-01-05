// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsT_Dist_RTRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions T_Dist_RTRequest Builder.
 */
public interface IWorkbookFunctionsT_Dist_RTRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsT_Dist_RTRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_Dist_RTRequest instance
     */
    IWorkbookFunctionsT_Dist_RTRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsT_Dist_RTRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsT_Dist_RTRequest instance
     */
    IWorkbookFunctionsT_Dist_RTRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
