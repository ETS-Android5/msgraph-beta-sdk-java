// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EmbeddedSIMDeviceState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Embedded SIMDevice State Request.
 */
public interface IEmbeddedSIMDeviceStateRequest extends IHttpRequest {

    /**
     * Gets the EmbeddedSIMDeviceState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<EmbeddedSIMDeviceState> callback);

    /**
     * Gets the EmbeddedSIMDeviceState from the service
     *
     * @return the EmbeddedSIMDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmbeddedSIMDeviceState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<EmbeddedSIMDeviceState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EmbeddedSIMDeviceState with a source
     *
     * @param sourceEmbeddedSIMDeviceState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EmbeddedSIMDeviceState sourceEmbeddedSIMDeviceState, final ICallback<EmbeddedSIMDeviceState> callback);

    /**
     * Patches this EmbeddedSIMDeviceState with a source
     *
     * @param sourceEmbeddedSIMDeviceState the source object with updates
     * @return the updated EmbeddedSIMDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmbeddedSIMDeviceState patch(final EmbeddedSIMDeviceState sourceEmbeddedSIMDeviceState) throws ClientException;

    /**
     * Posts a EmbeddedSIMDeviceState with a new object
     *
     * @param newEmbeddedSIMDeviceState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EmbeddedSIMDeviceState newEmbeddedSIMDeviceState, final ICallback<EmbeddedSIMDeviceState> callback);

    /**
     * Posts a EmbeddedSIMDeviceState with a new object
     *
     * @param newEmbeddedSIMDeviceState the new object to create
     * @return the created EmbeddedSIMDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmbeddedSIMDeviceState post(final EmbeddedSIMDeviceState newEmbeddedSIMDeviceState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmbeddedSIMDeviceStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmbeddedSIMDeviceStateRequest expand(final String value);

}

