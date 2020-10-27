// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCustomAttributeShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRunSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Custom Attribute Shell Script Request.
 */
public class DeviceCustomAttributeShellScriptRequest extends BaseRequest implements IDeviceCustomAttributeShellScriptRequest {
	
    /**
     * The request for the DeviceCustomAttributeShellScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCustomAttributeShellScriptRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCustomAttributeShellScript.class);
    }

    /**
     * Gets the DeviceCustomAttributeShellScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceCustomAttributeShellScript> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCustomAttributeShellScript from the service
     *
     * @return the DeviceCustomAttributeShellScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCustomAttributeShellScript get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceCustomAttributeShellScript> callback) {
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
     * Patches this DeviceCustomAttributeShellScript with a source
     *
     * @param sourceDeviceCustomAttributeShellScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCustomAttributeShellScript sourceDeviceCustomAttributeShellScript, final ICallback<? super DeviceCustomAttributeShellScript> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCustomAttributeShellScript);
    }

    /**
     * Patches this DeviceCustomAttributeShellScript with a source
     *
     * @param sourceDeviceCustomAttributeShellScript the source object with updates
     * @return the updated DeviceCustomAttributeShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCustomAttributeShellScript patch(final DeviceCustomAttributeShellScript sourceDeviceCustomAttributeShellScript) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript, final ICallback<? super DeviceCustomAttributeShellScript> callback) {
        send(HttpMethod.POST, callback, newDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the new object to create
     * @return the created DeviceCustomAttributeShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCustomAttributeShellScript post(final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript) throws ClientException {
        return send(HttpMethod.POST, newDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript, final ICallback<? super DeviceCustomAttributeShellScript> callback) {
        send(HttpMethod.PUT, callback, newDeviceCustomAttributeShellScript);
    }

    /**
     * Creates a DeviceCustomAttributeShellScript with a new object
     *
     * @param newDeviceCustomAttributeShellScript the object to create/update
     * @return the created DeviceCustomAttributeShellScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCustomAttributeShellScript put(final DeviceCustomAttributeShellScript newDeviceCustomAttributeShellScript) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCustomAttributeShellScript);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCustomAttributeShellScriptRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCustomAttributeShellScriptRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCustomAttributeShellScriptRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCustomAttributeShellScriptRequest)this;
     }

}

