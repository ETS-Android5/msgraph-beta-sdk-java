// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Printer Share With Reference Request.
 */
public interface IPrinterShareWithReferenceRequest extends IHttpRequest {

    void post(final PrinterShare newPrinterShare, final IJsonBackedObject payload, final ICallback<PrinterShare> callback);

    PrinterShare post(final PrinterShare newPrinterShare, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<PrinterShare> callback);

    PrinterShare get() throws ClientException;

	void delete(final ICallback<PrinterShare> callback);

	void delete() throws ClientException;

	void patch(final PrinterShare sourcePrinterShare, final ICallback<PrinterShare> callback);

	PrinterShare patch(final PrinterShare sourcePrinterShare) throws ClientException;

    IPrinterShareWithReferenceRequest select(final String value);

    IPrinterShareWithReferenceRequest expand(final String value);

}
