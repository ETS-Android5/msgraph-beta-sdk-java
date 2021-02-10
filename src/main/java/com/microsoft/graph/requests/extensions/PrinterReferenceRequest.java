// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintCertificateSigningRequest;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Reference Request.
 */
public class PrinterReferenceRequest extends BaseRequest implements IPrinterReferenceRequest {

    /**
     * The request for the Printer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Printer.class);
    }

    public void delete(final ICallback<? super Printer> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Printer delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrinterReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrinterReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrinterReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrinterReferenceRequest)this;
    }
    /**
     * Puts the Printer
     *
     * @param srcPrinter the Printer reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Printer srcPrinter, final ICallback<? super Printer> callback) {
        send(HttpMethod.PUT, callback, srcPrinter);
    }

    /**
     * Puts the Printer
     *
     * @param srcPrinter the Printer reference to PUT
     * @return the Printer
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Printer put(Printer srcPrinter) throws ClientException {
        return send(HttpMethod.PUT, srcPrinter);
    }
}
