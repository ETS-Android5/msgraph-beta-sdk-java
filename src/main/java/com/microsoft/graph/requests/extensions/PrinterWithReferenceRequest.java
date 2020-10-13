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
import com.microsoft.graph.requests.extensions.IPrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareRequestBuilder;
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
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer With Reference Request.
 */
public class PrinterWithReferenceRequest extends BaseRequest implements IPrinterWithReferenceRequest {

    /**
     * The request for the Printer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Printer.class);
    }

    public void post(final Printer newPrinter, final IJsonBackedObject payload, final ICallback<? super Printer> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Printer post(final Printer newPrinter, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newPrinter;
        }
        return null;
    }

    public void get(final ICallback<? super Printer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Printer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super Printer> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Printer sourcePrinter, final ICallback<? super Printer> callback) {
		send(HttpMethod.PATCH, callback, sourcePrinter);
	}

	public Printer patch(final Printer sourcePrinter) throws ClientException {
		return send(HttpMethod.PATCH, sourcePrinter);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrinterWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IPrinterWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrinterWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrinterWithReferenceRequest)this;
    }
}
