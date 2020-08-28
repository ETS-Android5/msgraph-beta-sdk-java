// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CustomerPaymentJournal;
import com.microsoft.graph.requests.extensions.ICustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Payment Journal Request.
 */
public class CustomerPaymentJournalRequest extends BaseRequest implements ICustomerPaymentJournalRequest {
	
    /**
     * The request for the CustomerPaymentJournal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomerPaymentJournalRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CustomerPaymentJournal.class);
    }

    /**
     * Gets the CustomerPaymentJournal from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CustomerPaymentJournal> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CustomerPaymentJournal from the service
     *
     * @return the CustomerPaymentJournal from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CustomerPaymentJournal get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<CustomerPaymentJournal> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CustomerPaymentJournal with a source
     *
     * @param sourceCustomerPaymentJournal the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CustomerPaymentJournal sourceCustomerPaymentJournal, final ICallback<CustomerPaymentJournal> callback) {
        send(HttpMethod.PATCH, callback, sourceCustomerPaymentJournal);
    }

    /**
     * Patches this CustomerPaymentJournal with a source
     *
     * @param sourceCustomerPaymentJournal the source object with updates
     * @return the updated CustomerPaymentJournal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CustomerPaymentJournal patch(final CustomerPaymentJournal sourceCustomerPaymentJournal) throws ClientException {
        return send(HttpMethod.PATCH, sourceCustomerPaymentJournal);
    }

    /**
     * Creates a CustomerPaymentJournal with a new object
     *
     * @param newCustomerPaymentJournal the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CustomerPaymentJournal newCustomerPaymentJournal, final ICallback<CustomerPaymentJournal> callback) {
        send(HttpMethod.POST, callback, newCustomerPaymentJournal);
    }

    /**
     * Creates a CustomerPaymentJournal with a new object
     *
     * @param newCustomerPaymentJournal the new object to create
     * @return the created CustomerPaymentJournal
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CustomerPaymentJournal post(final CustomerPaymentJournal newCustomerPaymentJournal) throws ClientException {
        return send(HttpMethod.POST, newCustomerPaymentJournal);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICustomerPaymentJournalRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CustomerPaymentJournalRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICustomerPaymentJournalRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CustomerPaymentJournalRequest)this;
     }

}

