// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EdiscoveryCase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ediscovery Case Request.
 */
public interface IEdiscoveryCaseRequest extends IHttpRequest {

    /**
     * Gets the EdiscoveryCase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EdiscoveryCase> callback);

    /**
     * Gets the EdiscoveryCase from the service
     *
     * @return the EdiscoveryCase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EdiscoveryCase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EdiscoveryCase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EdiscoveryCase with a source
     *
     * @param sourceEdiscoveryCase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EdiscoveryCase sourceEdiscoveryCase, final ICallback<EdiscoveryCase> callback);

    /**
     * Patches this EdiscoveryCase with a source
     *
     * @param sourceEdiscoveryCase the source object with updates
     * @return the updated EdiscoveryCase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EdiscoveryCase patch(final EdiscoveryCase sourceEdiscoveryCase) throws ClientException;

    /**
     * Posts a EdiscoveryCase with a new object
     *
     * @param newEdiscoveryCase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EdiscoveryCase newEdiscoveryCase, final ICallback<EdiscoveryCase> callback);

    /**
     * Posts a EdiscoveryCase with a new object
     *
     * @param newEdiscoveryCase the new object to create
     * @return the created EdiscoveryCase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EdiscoveryCase post(final EdiscoveryCase newEdiscoveryCase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEdiscoveryCaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEdiscoveryCaseRequest expand(final String value);

}

