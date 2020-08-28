// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotEvent;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotPolicyStatusDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotPolicyStatusDetailRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotPolicyStatusDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotPolicyStatusDetailRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Event Request.
 */
public class DeviceManagementAutopilotEventRequest extends BaseRequest implements IDeviceManagementAutopilotEventRequest {
	
    /**
     * The request for the DeviceManagementAutopilotEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAutopilotEventRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementAutopilotEvent.class);
    }

    /**
     * Gets the DeviceManagementAutopilotEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementAutopilotEvent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementAutopilotEvent from the service
     *
     * @return the DeviceManagementAutopilotEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotEvent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementAutopilotEvent> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementAutopilotEvent with a source
     *
     * @param sourceDeviceManagementAutopilotEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementAutopilotEvent sourceDeviceManagementAutopilotEvent, final ICallback<DeviceManagementAutopilotEvent> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementAutopilotEvent);
    }

    /**
     * Patches this DeviceManagementAutopilotEvent with a source
     *
     * @param sourceDeviceManagementAutopilotEvent the source object with updates
     * @return the updated DeviceManagementAutopilotEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotEvent patch(final DeviceManagementAutopilotEvent sourceDeviceManagementAutopilotEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementAutopilotEvent);
    }

    /**
     * Creates a DeviceManagementAutopilotEvent with a new object
     *
     * @param newDeviceManagementAutopilotEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementAutopilotEvent newDeviceManagementAutopilotEvent, final ICallback<DeviceManagementAutopilotEvent> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementAutopilotEvent);
    }

    /**
     * Creates a DeviceManagementAutopilotEvent with a new object
     *
     * @param newDeviceManagementAutopilotEvent the new object to create
     * @return the created DeviceManagementAutopilotEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAutopilotEvent post(final DeviceManagementAutopilotEvent newDeviceManagementAutopilotEvent) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementAutopilotEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementAutopilotEventRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementAutopilotEventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementAutopilotEventRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementAutopilotEventRequest)this;
     }

}

