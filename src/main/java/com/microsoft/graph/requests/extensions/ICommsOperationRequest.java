// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CommsOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Comms Operation Request.
 */
public interface ICommsOperationRequest extends IHttpRequest {

    /**
     * Gets the CommsOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<CommsOperation> callback);

    /**
     * Gets the CommsOperation from the service
     *
     * @return the CommsOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CommsOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<CommsOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CommsOperation with a source
     *
     * @param sourceCommsOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CommsOperation sourceCommsOperation, final ICallback<CommsOperation> callback);

    /**
     * Patches this CommsOperation with a source
     *
     * @param sourceCommsOperation the source object with updates
     * @return the updated CommsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CommsOperation patch(final CommsOperation sourceCommsOperation) throws ClientException;

    /**
     * Posts a CommsOperation with a new object
     *
     * @param newCommsOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CommsOperation newCommsOperation, final ICallback<CommsOperation> callback);

    /**
     * Posts a CommsOperation with a new object
     *
     * @param newCommsOperation the new object to create
     * @return the created CommsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CommsOperation post(final CommsOperation newCommsOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICommsOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICommsOperationRequest expand(final String value);

}

