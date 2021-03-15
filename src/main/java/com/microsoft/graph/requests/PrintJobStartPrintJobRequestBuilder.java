// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.PrintJobStartPrintJobRequest;
import com.microsoft.graph.models.PrintJob;
import com.microsoft.graph.models.PrintJobStatus;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Start Print Job Request Builder.
 */
public class PrintJobStartPrintJobRequestBuilder extends BaseActionRequestBuilder<PrintJobStatus> {

    /**
     * The request builder for this PrintJobStartPrintJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobStartPrintJobRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the PrintJobStartPrintJobRequest
     *
     * @param requestOptions the options for the request
     * @return the PrintJobStartPrintJobRequest instance
     */
    @Nonnull
    public PrintJobStartPrintJobRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the PrintJobStartPrintJobRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the PrintJobStartPrintJobRequest instance
     */
    @Nonnull
    public PrintJobStartPrintJobRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final PrintJobStartPrintJobRequest request = new PrintJobStartPrintJobRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
