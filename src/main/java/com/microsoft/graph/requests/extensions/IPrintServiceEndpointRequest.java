// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintServiceEndpoint;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Service Endpoint Request.
 */
public interface IPrintServiceEndpointRequest extends IHttpRequest {

    /**
     * Gets the PrintServiceEndpoint from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PrintServiceEndpoint> callback);

    /**
     * Gets the PrintServiceEndpoint from the service
     *
     * @return the PrintServiceEndpoint from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintServiceEndpoint get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<PrintServiceEndpoint> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintServiceEndpoint with a source
     *
     * @param sourcePrintServiceEndpoint the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintServiceEndpoint sourcePrintServiceEndpoint, final ICallback<PrintServiceEndpoint> callback);

    /**
     * Patches this PrintServiceEndpoint with a source
     *
     * @param sourcePrintServiceEndpoint the source object with updates
     * @return the updated PrintServiceEndpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintServiceEndpoint patch(final PrintServiceEndpoint sourcePrintServiceEndpoint) throws ClientException;

    /**
     * Posts a PrintServiceEndpoint with a new object
     *
     * @param newPrintServiceEndpoint the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintServiceEndpoint newPrintServiceEndpoint, final ICallback<PrintServiceEndpoint> callback);

    /**
     * Posts a PrintServiceEndpoint with a new object
     *
     * @param newPrintServiceEndpoint the new object to create
     * @return the created PrintServiceEndpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintServiceEndpoint post(final PrintServiceEndpoint newPrintServiceEndpoint) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintServiceEndpointRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintServiceEndpointRequest expand(final String value);

}

