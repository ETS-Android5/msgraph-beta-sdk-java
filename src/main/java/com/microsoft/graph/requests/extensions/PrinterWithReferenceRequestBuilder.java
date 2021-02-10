// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
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

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer With Reference Request Builder.
 */
public class PrinterWithReferenceRequestBuilder extends BaseRequestBuilder implements IPrinterWithReferenceRequestBuilder {

    /**
     * The request builder for the Printer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrinterWithReferenceRequest instance
     */
    public IPrinterWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IPrinterWithReferenceRequest instance
     */
    public IPrinterWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrinterWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrinterReferenceRequestBuilder reference(){
        return new PrinterReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
