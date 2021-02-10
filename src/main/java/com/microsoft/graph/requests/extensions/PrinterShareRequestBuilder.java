// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.requests.extensions.IGroupCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share Request Builder.
 */
public class PrinterShareRequestBuilder extends BaseRequestBuilder implements IPrinterShareRequestBuilder {

    /**
     * The request builder for the PrinterShare
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterShareRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrinterShareRequest instance
     */
    public IPrinterShareRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPrinterShareRequest instance
     */
    public IPrinterShareRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PrinterShareRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPrintJobCollectionRequestBuilder jobs() {
        return new PrintJobCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("jobs"), getClient(), null);
    }

    public IPrintJobRequestBuilder jobs(final String id) {
        return new PrintJobRequestBuilder(getRequestUrlWithAdditionalSegment("jobs") + "/" + id, getClient(), null);
    }
    public IGroupCollectionWithReferencesRequestBuilder allowedGroups() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("allowedGroups"), getClient(), null);
    }

    public IGroupWithReferenceRequestBuilder allowedGroups(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("allowedGroups") + "/" + id, getClient(), null);
    }
    public IUserCollectionWithReferencesRequestBuilder allowedUsers() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("allowedUsers"), getClient(), null);
    }

    public IUserWithReferenceRequestBuilder allowedUsers(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("allowedUsers") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Printer
     *
     * @return the IPrinterWithReferenceRequestBuilder instance
     */
    public IPrinterWithReferenceRequestBuilder printer() {
        return new PrinterWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("printer"), getClient(), null);
    }
}
