// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.IPrinterShareWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Printer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Printer Reference Request Builder.
 */
public interface IPrinterReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrinterReferenceRequest instance
     */
    IPrinterReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPrinterReferenceRequest instance
     */
    IPrinterReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
