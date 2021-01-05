// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReports;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Request.
 */
public interface IDeviceManagementReportsRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementReports from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementReports> callback);

    /**
     * Gets the DeviceManagementReports from the service
     *
     * @return the DeviceManagementReports from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReports get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementReports> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementReports with a source
     *
     * @param sourceDeviceManagementReports the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementReports sourceDeviceManagementReports, final ICallback<? super DeviceManagementReports> callback);

    /**
     * Patches this DeviceManagementReports with a source
     *
     * @param sourceDeviceManagementReports the source object with updates
     * @return the updated DeviceManagementReports
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReports patch(final DeviceManagementReports sourceDeviceManagementReports) throws ClientException;

    /**
     * Posts a DeviceManagementReports with a new object
     *
     * @param newDeviceManagementReports the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementReports newDeviceManagementReports, final ICallback<? super DeviceManagementReports> callback);

    /**
     * Posts a DeviceManagementReports with a new object
     *
     * @param newDeviceManagementReports the new object to create
     * @return the created DeviceManagementReports
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReports post(final DeviceManagementReports newDeviceManagementReports) throws ClientException;

    /**
     * Posts a DeviceManagementReports with a new object
     *
     * @param newDeviceManagementReports the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementReports newDeviceManagementReports, final ICallback<? super DeviceManagementReports> callback);

    /**
     * Posts a DeviceManagementReports with a new object
     *
     * @param newDeviceManagementReports the object to create/update
     * @return the created DeviceManagementReports
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReports put(final DeviceManagementReports newDeviceManagementReports) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementReportsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementReportsRequest expand(final String value);

}

