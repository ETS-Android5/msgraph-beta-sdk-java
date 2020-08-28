// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCountIfRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsCountIfRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Count If Request Builder.
 */
public class WorkbookFunctionsCountIfRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsCountIfRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCountIf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param range the range
     * @param criteria the criteria
     */
    public WorkbookFunctionsCountIfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement range, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("range", range);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the IWorkbookFunctionsCountIfRequest
     *
     * @return the IWorkbookFunctionsCountIfRequest instance
     */
    public IWorkbookFunctionsCountIfRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCountIfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCountIfRequest instance
     */
    public IWorkbookFunctionsCountIfRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsCountIfRequest request = new WorkbookFunctionsCountIfRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("range")) {
            request.body.range = getParameter("range");
        }

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
