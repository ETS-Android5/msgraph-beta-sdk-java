// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsMicrosoftEdgeApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Microsoft Edge App Request.
 */
public interface IWindowsMicrosoftEdgeAppRequest extends IHttpRequest {

    /**
     * Gets the WindowsMicrosoftEdgeApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsMicrosoftEdgeApp> callback);

    /**
     * Gets the WindowsMicrosoftEdgeApp from the service
     *
     * @return the WindowsMicrosoftEdgeApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMicrosoftEdgeApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsMicrosoftEdgeApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsMicrosoftEdgeApp with a source
     *
     * @param sourceWindowsMicrosoftEdgeApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsMicrosoftEdgeApp sourceWindowsMicrosoftEdgeApp, final ICallback<? super WindowsMicrosoftEdgeApp> callback);

    /**
     * Patches this WindowsMicrosoftEdgeApp with a source
     *
     * @param sourceWindowsMicrosoftEdgeApp the source object with updates
     * @return the updated WindowsMicrosoftEdgeApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMicrosoftEdgeApp patch(final WindowsMicrosoftEdgeApp sourceWindowsMicrosoftEdgeApp) throws ClientException;

    /**
     * Posts a WindowsMicrosoftEdgeApp with a new object
     *
     * @param newWindowsMicrosoftEdgeApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsMicrosoftEdgeApp newWindowsMicrosoftEdgeApp, final ICallback<? super WindowsMicrosoftEdgeApp> callback);

    /**
     * Posts a WindowsMicrosoftEdgeApp with a new object
     *
     * @param newWindowsMicrosoftEdgeApp the new object to create
     * @return the created WindowsMicrosoftEdgeApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMicrosoftEdgeApp post(final WindowsMicrosoftEdgeApp newWindowsMicrosoftEdgeApp) throws ClientException;

    /**
     * Posts a WindowsMicrosoftEdgeApp with a new object
     *
     * @param newWindowsMicrosoftEdgeApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsMicrosoftEdgeApp newWindowsMicrosoftEdgeApp, final ICallback<? super WindowsMicrosoftEdgeApp> callback);

    /**
     * Posts a WindowsMicrosoftEdgeApp with a new object
     *
     * @param newWindowsMicrosoftEdgeApp the object to create/update
     * @return the created WindowsMicrosoftEdgeApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsMicrosoftEdgeApp put(final WindowsMicrosoftEdgeApp newWindowsMicrosoftEdgeApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsMicrosoftEdgeAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsMicrosoftEdgeAppRequest expand(final String value);

}

