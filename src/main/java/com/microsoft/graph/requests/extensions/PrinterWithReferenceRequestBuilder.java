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
import com.microsoft.graph.requests.extensions.IPrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareRequestBuilder;
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
     * @return the IPrinterWithReferenceRequest instance
     */
    public IPrinterWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
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
