// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CustomerPaymentJournal;
import com.microsoft.graph.models.extensions.CustomerPayment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Payment Collection Request Builder.
 */
public class CustomerPaymentCollectionRequestBuilder extends BaseRequestBuilder implements ICustomerPaymentCollectionRequestBuilder {

    /**
     * The request builder for this collection of CustomerPaymentJournal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomerPaymentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ICustomerPaymentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ICustomerPaymentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CustomerPaymentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICustomerPaymentRequestBuilder byId(final String id) {
        return new CustomerPaymentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
