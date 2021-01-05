// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Assignment Request.
 */
public interface IDeviceHealthScriptAssignmentRequest extends IHttpRequest {

    /**
     * Gets the DeviceHealthScriptAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceHealthScriptAssignment> callback);

    /**
     * Gets the DeviceHealthScriptAssignment from the service
     *
     * @return the DeviceHealthScriptAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceHealthScriptAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceHealthScriptAssignment with a source
     *
     * @param sourceDeviceHealthScriptAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceHealthScriptAssignment sourceDeviceHealthScriptAssignment, final ICallback<? super DeviceHealthScriptAssignment> callback);

    /**
     * Patches this DeviceHealthScriptAssignment with a source
     *
     * @param sourceDeviceHealthScriptAssignment the source object with updates
     * @return the updated DeviceHealthScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptAssignment patch(final DeviceHealthScriptAssignment sourceDeviceHealthScriptAssignment) throws ClientException;

    /**
     * Posts a DeviceHealthScriptAssignment with a new object
     *
     * @param newDeviceHealthScriptAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceHealthScriptAssignment newDeviceHealthScriptAssignment, final ICallback<? super DeviceHealthScriptAssignment> callback);

    /**
     * Posts a DeviceHealthScriptAssignment with a new object
     *
     * @param newDeviceHealthScriptAssignment the new object to create
     * @return the created DeviceHealthScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptAssignment post(final DeviceHealthScriptAssignment newDeviceHealthScriptAssignment) throws ClientException;

    /**
     * Posts a DeviceHealthScriptAssignment with a new object
     *
     * @param newDeviceHealthScriptAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceHealthScriptAssignment newDeviceHealthScriptAssignment, final ICallback<? super DeviceHealthScriptAssignment> callback);

    /**
     * Posts a DeviceHealthScriptAssignment with a new object
     *
     * @param newDeviceHealthScriptAssignment the object to create/update
     * @return the created DeviceHealthScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptAssignment put(final DeviceHealthScriptAssignment newDeviceHealthScriptAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptAssignmentRequest expand(final String value);

}

