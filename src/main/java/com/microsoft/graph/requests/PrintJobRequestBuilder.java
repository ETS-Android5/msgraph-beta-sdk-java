// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrintJob;
import com.microsoft.graph.models.PrintJobStatus;
import com.microsoft.graph.models.PrintJobConfiguration;
import com.microsoft.graph.requests.PrintDocumentCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintDocumentRequestBuilder;
import com.microsoft.graph.requests.PrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.PrintJobAbortParameterSet;
import com.microsoft.graph.models.PrintJobRedirectParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Request Builder.
 */
public class PrintJobRequestBuilder extends BaseRequestBuilder<PrintJob> {

    /**
     * The request builder for the PrintJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PrintJobRequest instance
     */
    @Nonnull
    public PrintJobRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PrintJobRequest instance
     */
    @Nonnull
    public PrintJobRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PrintJobRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the PrintDocument collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintDocumentCollectionRequestBuilder documents() {
        return new PrintDocumentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("documents"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintDocument item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintDocumentRequestBuilder documents(@Nonnull final String id) {
        return new PrintDocumentRequestBuilder(getRequestUrlWithAdditionalSegment("documents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintTask collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintTaskCollectionRequestBuilder tasks() {
        return new PrintTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintTask item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintTaskRequestBuilder tasks(@Nonnull final String id) {
        return new PrintTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public PrintJobCancelRequestBuilder cancel() {
        return new PrintJobCancelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancel"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public PrintJobStartRequestBuilder start() {
        return new PrintJobStartRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.start"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public PrintJobAbortRequestBuilder abort(@Nonnull final PrintJobAbortParameterSet parameters) {
        return new PrintJobAbortRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.abort"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public PrintJobCancelPrintJobRequestBuilder cancelPrintJob() {
        return new PrintJobCancelPrintJobRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancelPrintJob"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public PrintJobRedirectRequestBuilder redirect(@Nonnull final PrintJobRedirectParameterSet parameters) {
        return new PrintJobRedirectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.redirect"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public PrintJobStartPrintJobRequestBuilder startPrintJob() {
        return new PrintJobStartPrintJobRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.startPrintJob"), getClient(), null);
    }
}
