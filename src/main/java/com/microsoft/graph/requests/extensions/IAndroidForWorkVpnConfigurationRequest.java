// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkVpnConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Vpn Configuration Request.
 */
public interface IAndroidForWorkVpnConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkVpnConfiguration> callback);

    /**
     * Gets the AndroidForWorkVpnConfiguration from the service
     *
     * @return the AndroidForWorkVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkVpnConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkVpnConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkVpnConfiguration with a source
     *
     * @param sourceAndroidForWorkVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkVpnConfiguration sourceAndroidForWorkVpnConfiguration, final ICallback<AndroidForWorkVpnConfiguration> callback);

    /**
     * Patches this AndroidForWorkVpnConfiguration with a source
     *
     * @param sourceAndroidForWorkVpnConfiguration the source object with updates
     * @return the updated AndroidForWorkVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkVpnConfiguration patch(final AndroidForWorkVpnConfiguration sourceAndroidForWorkVpnConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkVpnConfiguration with a new object
     *
     * @param newAndroidForWorkVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkVpnConfiguration newAndroidForWorkVpnConfiguration, final ICallback<AndroidForWorkVpnConfiguration> callback);

    /**
     * Posts a AndroidForWorkVpnConfiguration with a new object
     *
     * @param newAndroidForWorkVpnConfiguration the new object to create
     * @return the created AndroidForWorkVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkVpnConfiguration post(final AndroidForWorkVpnConfiguration newAndroidForWorkVpnConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkVpnConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkVpnConfigurationRequest expand(final String value);

}

