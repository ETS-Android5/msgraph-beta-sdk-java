// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyGroupAssignment;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Group Assignment Request.
 */
public class DeviceCompliancePolicyGroupAssignmentRequest extends BaseRequest implements IDeviceCompliancePolicyGroupAssignmentRequest {
	
    /**
     * The request for the DeviceCompliancePolicyGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyGroupAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyGroupAssignment.class);
    }

    /**
     * Gets the DeviceCompliancePolicyGroupAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyGroupAssignment from the service
     *
     * @return the DeviceCompliancePolicyGroupAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyGroupAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
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
     * Patches this DeviceCompliancePolicyGroupAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyGroupAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicyGroupAssignment sourceDeviceCompliancePolicyGroupAssignment, final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Patches this DeviceCompliancePolicyGroupAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyGroupAssignment the source object with updates
     * @return the updated DeviceCompliancePolicyGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyGroupAssignment patch(final DeviceCompliancePolicyGroupAssignment sourceDeviceCompliancePolicyGroupAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment, final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the new object to create
     * @return the created DeviceCompliancePolicyGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyGroupAssignment post(final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment, final ICallback<? super DeviceCompliancePolicyGroupAssignment> callback) {
        send(HttpMethod.PUT, callback, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyGroupAssignment with a new object
     *
     * @param newDeviceCompliancePolicyGroupAssignment the object to create/update
     * @return the created DeviceCompliancePolicyGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyGroupAssignment put(final DeviceCompliancePolicyGroupAssignment newDeviceCompliancePolicyGroupAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicyGroupAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyGroupAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCompliancePolicyGroupAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyGroupAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCompliancePolicyGroupAssignmentRequest)this;
     }

}

