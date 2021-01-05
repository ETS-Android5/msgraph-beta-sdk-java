// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintConnector;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Connector Request.
 */
public class PrintConnectorRequest extends BaseRequest implements IPrintConnectorRequest {
	
    /**
     * The request for the PrintConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintConnectorRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintConnector.class);
    }

    /**
     * Gets the PrintConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PrintConnector> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrintConnector from the service
     *
     * @return the PrintConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintConnector get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PrintConnector> callback) {
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
     * Patches this PrintConnector with a source
     *
     * @param sourcePrintConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrintConnector sourcePrintConnector, final ICallback<? super PrintConnector> callback) {
        send(HttpMethod.PATCH, callback, sourcePrintConnector);
    }

    /**
     * Patches this PrintConnector with a source
     *
     * @param sourcePrintConnector the source object with updates
     * @return the updated PrintConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintConnector patch(final PrintConnector sourcePrintConnector) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintConnector);
    }

    /**
     * Creates a PrintConnector with a new object
     *
     * @param newPrintConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrintConnector newPrintConnector, final ICallback<? super PrintConnector> callback) {
        send(HttpMethod.POST, callback, newPrintConnector);
    }

    /**
     * Creates a PrintConnector with a new object
     *
     * @param newPrintConnector the new object to create
     * @return the created PrintConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintConnector post(final PrintConnector newPrintConnector) throws ClientException {
        return send(HttpMethod.POST, newPrintConnector);
    }

    /**
     * Creates a PrintConnector with a new object
     *
     * @param newPrintConnector the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrintConnector newPrintConnector, final ICallback<? super PrintConnector> callback) {
        send(HttpMethod.PUT, callback, newPrintConnector);
    }

    /**
     * Creates a PrintConnector with a new object
     *
     * @param newPrintConnector the object to create/update
     * @return the created PrintConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintConnector put(final PrintConnector newPrintConnector) throws ClientException {
        return send(HttpMethod.PUT, newPrintConnector);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrintConnectorRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrintConnectorRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrintConnectorRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrintConnectorRequest)this;
     }

}

