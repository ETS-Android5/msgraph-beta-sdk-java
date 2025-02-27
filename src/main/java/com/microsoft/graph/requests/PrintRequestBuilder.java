// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Print;
import com.microsoft.graph.requests.PrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintConnectorRequestBuilder;
import com.microsoft.graph.requests.PrintOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintOperationRequestBuilder;
import com.microsoft.graph.requests.PrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.PrinterRequestBuilder;
import com.microsoft.graph.requests.PrinterShareCollectionRequestBuilder;
import com.microsoft.graph.requests.PrinterShareRequestBuilder;
import com.microsoft.graph.requests.ReportRootRequestBuilder;
import com.microsoft.graph.requests.PrintServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintServiceRequestBuilder;
import com.microsoft.graph.requests.PrintTaskDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.PrintTaskDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Request Builder.
 */
public class PrintRequestBuilder extends BaseRequestBuilder<Print> {

    /**
     * The request builder for the Print
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PrintRequest instance
     */
    @Nonnull
    public PrintRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PrintRequest instance
     */
    @Nonnull
    public PrintRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PrintRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the PrintConnector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintConnectorCollectionRequestBuilder connectors() {
        return new PrintConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("connectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintConnectorRequestBuilder connectors(@Nonnull final String id) {
        return new PrintConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("connectors") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintOperationCollectionRequestBuilder operations() {
        return new PrintOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintOperationRequestBuilder operations(@Nonnull final String id) {
        return new PrintOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Printer collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrinterCollectionRequestBuilder printers() {
        return new PrinterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("printers"), getClient(), null);
    }

    /**
     * Gets a request builder for the Printer item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrinterRequestBuilder printers(@Nonnull final String id) {
        return new PrinterRequestBuilder(getRequestUrlWithAdditionalSegment("printers") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrinterShare collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrinterShareCollectionRequestBuilder printerShares() {
        return new PrinterShareCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("printerShares"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrinterShare item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrinterShareRequestBuilder printerShares(@Nonnull final String id) {
        return new PrinterShareRequestBuilder(getRequestUrlWithAdditionalSegment("printerShares") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ReportRoot
     *
     * @return the ReportRootRequestBuilder instance
     */
    @Nonnull
    public ReportRootRequestBuilder reports() {
        return new ReportRootRequestBuilder(getRequestUrlWithAdditionalSegment("reports"), getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintService collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintServiceCollectionRequestBuilder services() {
        return new PrintServiceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("services"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintService item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintServiceRequestBuilder services(@Nonnull final String id) {
        return new PrintServiceRequestBuilder(getRequestUrlWithAdditionalSegment("services") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrinterShare collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrinterShareCollectionRequestBuilder shares() {
        return new PrinterShareCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("shares"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrinterShare item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrinterShareRequestBuilder shares(@Nonnull final String id) {
        return new PrinterShareRequestBuilder(getRequestUrlWithAdditionalSegment("shares") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PrintTaskDefinition collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PrintTaskDefinitionCollectionRequestBuilder taskDefinitions() {
        return new PrintTaskDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taskDefinitions"), getClient(), null);
    }

    /**
     * Gets a request builder for the PrintTaskDefinition item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PrintTaskDefinitionRequestBuilder taskDefinitions(@Nonnull final String id) {
        return new PrintTaskDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("taskDefinitions") + "/" + id, getClient(), null);
    }
}
