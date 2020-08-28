// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationHistory;
import com.microsoft.graph.models.generated.GlobalDeviceHealthScriptState;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationSummary;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptRunSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Request.
 */
public class DeviceHealthScriptRequest extends BaseRequest implements IDeviceHealthScriptRequest {
	
    /**
     * The request for the DeviceHealthScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceHealthScript.class);
    }

    /**
     * Gets the DeviceHealthScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceHealthScript> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceHealthScript from the service
     *
     * @return the DeviceHealthScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScript get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceHealthScript> callback) {
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
     * Patches this DeviceHealthScript with a source
     *
     * @param sourceDeviceHealthScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceHealthScript sourceDeviceHealthScript, final ICallback<DeviceHealthScript> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceHealthScript);
    }

    /**
     * Patches this DeviceHealthScript with a source
     *
     * @param sourceDeviceHealthScript the source object with updates
     * @return the updated DeviceHealthScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScript patch(final DeviceHealthScript sourceDeviceHealthScript) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceHealthScript);
    }

    /**
     * Creates a DeviceHealthScript with a new object
     *
     * @param newDeviceHealthScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceHealthScript newDeviceHealthScript, final ICallback<DeviceHealthScript> callback) {
        send(HttpMethod.POST, callback, newDeviceHealthScript);
    }

    /**
     * Creates a DeviceHealthScript with a new object
     *
     * @param newDeviceHealthScript the new object to create
     * @return the created DeviceHealthScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScript post(final DeviceHealthScript newDeviceHealthScript) throws ClientException {
        return send(HttpMethod.POST, newDeviceHealthScript);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceHealthScriptRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceHealthScriptRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceHealthScriptRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceHealthScriptRequest)this;
     }

}

