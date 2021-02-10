// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintTask;
import com.microsoft.graph.requests.extensions.IPrintTaskDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Request Builder.
 */
public class PrintTaskRequestBuilder extends BaseRequestBuilder implements IPrintTaskRequestBuilder {

    /**
     * The request builder for the PrintTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintTaskRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrintTaskRequest instance
     */
    public IPrintTaskRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPrintTaskRequest instance
     */
    public IPrintTaskRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PrintTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for PrintTaskDefinition
     *
     * @return the IPrintTaskDefinitionWithReferenceRequestBuilder instance
     */
    public IPrintTaskDefinitionWithReferenceRequestBuilder definition() {
        return new PrintTaskDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definition"), getClient(), null);
    }

    /**
     * Gets the request builder for PrintTaskTrigger
     *
     * @return the IPrintTaskTriggerWithReferenceRequestBuilder instance
     */
    public IPrintTaskTriggerWithReferenceRequestBuilder trigger() {
        return new PrintTaskTriggerWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("trigger"), getClient(), null);
    }
}
