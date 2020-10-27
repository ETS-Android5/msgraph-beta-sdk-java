// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10XWifiConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10XWifi Configuration Request.
 */
public interface IWindows10XWifiConfigurationRequest extends IHttpRequest {

    /**
     * Gets the Windows10XWifiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10XWifiConfiguration> callback);

    /**
     * Gets the Windows10XWifiConfiguration from the service
     *
     * @return the Windows10XWifiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XWifiConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10XWifiConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10XWifiConfiguration with a source
     *
     * @param sourceWindows10XWifiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10XWifiConfiguration sourceWindows10XWifiConfiguration, final ICallback<? super Windows10XWifiConfiguration> callback);

    /**
     * Patches this Windows10XWifiConfiguration with a source
     *
     * @param sourceWindows10XWifiConfiguration the source object with updates
     * @return the updated Windows10XWifiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XWifiConfiguration patch(final Windows10XWifiConfiguration sourceWindows10XWifiConfiguration) throws ClientException;

    /**
     * Posts a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10XWifiConfiguration newWindows10XWifiConfiguration, final ICallback<? super Windows10XWifiConfiguration> callback);

    /**
     * Posts a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the new object to create
     * @return the created Windows10XWifiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XWifiConfiguration post(final Windows10XWifiConfiguration newWindows10XWifiConfiguration) throws ClientException;

    /**
     * Posts a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10XWifiConfiguration newWindows10XWifiConfiguration, final ICallback<? super Windows10XWifiConfiguration> callback);

    /**
     * Posts a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the object to create/update
     * @return the created Windows10XWifiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10XWifiConfiguration put(final Windows10XWifiConfiguration newWindows10XWifiConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10XWifiConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10XWifiConfigurationRequest expand(final String value);

}

