// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOsVppApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac Os Vpp App Request.
 */
public interface IMacOsVppAppRequest extends IHttpRequest {

    /**
     * Gets the MacOsVppApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MacOsVppApp> callback);

    /**
     * Gets the MacOsVppApp from the service
     *
     * @return the MacOsVppApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOsVppApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MacOsVppApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOsVppApp with a source
     *
     * @param sourceMacOsVppApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOsVppApp sourceMacOsVppApp, final ICallback<MacOsVppApp> callback);

    /**
     * Patches this MacOsVppApp with a source
     *
     * @param sourceMacOsVppApp the source object with updates
     * @return the updated MacOsVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOsVppApp patch(final MacOsVppApp sourceMacOsVppApp) throws ClientException;

    /**
     * Posts a MacOsVppApp with a new object
     *
     * @param newMacOsVppApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOsVppApp newMacOsVppApp, final ICallback<MacOsVppApp> callback);

    /**
     * Posts a MacOsVppApp with a new object
     *
     * @param newMacOsVppApp the new object to create
     * @return the created MacOsVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOsVppApp post(final MacOsVppApp newMacOsVppApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOsVppAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOsVppAppRequest expand(final String value);

}

