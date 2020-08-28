// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration State Request.
 */
public interface IDeviceConfigurationStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceConfigurationState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceConfigurationState> callback);

    /**
     * Gets the DeviceConfigurationState from the service
     *
     * @return the DeviceConfigurationState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceConfigurationState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceConfigurationState with a source
     *
     * @param sourceDeviceConfigurationState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceConfigurationState sourceDeviceConfigurationState, final ICallback<DeviceConfigurationState> callback);

    /**
     * Patches this DeviceConfigurationState with a source
     *
     * @param sourceDeviceConfigurationState the source object with updates
     * @return the updated DeviceConfigurationState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationState patch(final DeviceConfigurationState sourceDeviceConfigurationState) throws ClientException;

    /**
     * Posts a DeviceConfigurationState with a new object
     *
     * @param newDeviceConfigurationState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceConfigurationState newDeviceConfigurationState, final ICallback<DeviceConfigurationState> callback);

    /**
     * Posts a DeviceConfigurationState with a new object
     *
     * @param newDeviceConfigurationState the new object to create
     * @return the created DeviceConfigurationState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationState post(final DeviceConfigurationState newDeviceConfigurationState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceConfigurationStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceConfigurationStateRequest expand(final String value);

}

