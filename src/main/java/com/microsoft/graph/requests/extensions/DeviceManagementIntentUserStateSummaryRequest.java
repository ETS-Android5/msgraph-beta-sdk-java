// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent User State Summary Request.
 */
public class DeviceManagementIntentUserStateSummaryRequest extends BaseRequest implements IDeviceManagementIntentUserStateSummaryRequest {
	
    /**
     * The request for the DeviceManagementIntentUserStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentUserStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntentUserStateSummary.class);
    }

    /**
     * Gets the DeviceManagementIntentUserStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementIntentUserStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementIntentUserStateSummary from the service
     *
     * @return the DeviceManagementIntentUserStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentUserStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementIntentUserStateSummary> callback) {
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
     * Patches this DeviceManagementIntentUserStateSummary with a source
     *
     * @param sourceDeviceManagementIntentUserStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementIntentUserStateSummary sourceDeviceManagementIntentUserStateSummary, final ICallback<DeviceManagementIntentUserStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementIntentUserStateSummary);
    }

    /**
     * Patches this DeviceManagementIntentUserStateSummary with a source
     *
     * @param sourceDeviceManagementIntentUserStateSummary the source object with updates
     * @return the updated DeviceManagementIntentUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentUserStateSummary patch(final DeviceManagementIntentUserStateSummary sourceDeviceManagementIntentUserStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementIntentUserStateSummary);
    }

    /**
     * Creates a DeviceManagementIntentUserStateSummary with a new object
     *
     * @param newDeviceManagementIntentUserStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementIntentUserStateSummary newDeviceManagementIntentUserStateSummary, final ICallback<DeviceManagementIntentUserStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementIntentUserStateSummary);
    }

    /**
     * Creates a DeviceManagementIntentUserStateSummary with a new object
     *
     * @param newDeviceManagementIntentUserStateSummary the new object to create
     * @return the created DeviceManagementIntentUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentUserStateSummary post(final DeviceManagementIntentUserStateSummary newDeviceManagementIntentUserStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementIntentUserStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementIntentUserStateSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementIntentUserStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementIntentUserStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementIntentUserStateSummaryRequest)this;
     }

}

