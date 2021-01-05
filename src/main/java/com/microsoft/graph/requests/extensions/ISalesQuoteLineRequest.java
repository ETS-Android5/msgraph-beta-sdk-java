// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SalesQuoteLine;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Quote Line Request.
 */
public interface ISalesQuoteLineRequest extends IHttpRequest {

    /**
     * Gets the SalesQuoteLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SalesQuoteLine> callback);

    /**
     * Gets the SalesQuoteLine from the service
     *
     * @return the SalesQuoteLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesQuoteLine get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SalesQuoteLine> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SalesQuoteLine with a source
     *
     * @param sourceSalesQuoteLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SalesQuoteLine sourceSalesQuoteLine, final ICallback<? super SalesQuoteLine> callback);

    /**
     * Patches this SalesQuoteLine with a source
     *
     * @param sourceSalesQuoteLine the source object with updates
     * @return the updated SalesQuoteLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesQuoteLine patch(final SalesQuoteLine sourceSalesQuoteLine) throws ClientException;

    /**
     * Posts a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SalesQuoteLine newSalesQuoteLine, final ICallback<? super SalesQuoteLine> callback);

    /**
     * Posts a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the new object to create
     * @return the created SalesQuoteLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesQuoteLine post(final SalesQuoteLine newSalesQuoteLine) throws ClientException;

    /**
     * Posts a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SalesQuoteLine newSalesQuoteLine, final ICallback<? super SalesQuoteLine> callback);

    /**
     * Posts a SalesQuoteLine with a new object
     *
     * @param newSalesQuoteLine the object to create/update
     * @return the created SalesQuoteLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SalesQuoteLine put(final SalesQuoteLine newSalesQuoteLine) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISalesQuoteLineRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISalesQuoteLineRequest expand(final String value);

}

