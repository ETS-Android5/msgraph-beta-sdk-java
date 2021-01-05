// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment Request.
 */
public class DeviceAndAppManagementRoleAssignmentRequest extends BaseRequest implements IDeviceAndAppManagementRoleAssignmentRequest {
	
    /**
     * The request for the DeviceAndAppManagementRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementRoleAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementRoleAssignment.class);
    }

    /**
     * Gets the DeviceAndAppManagementRoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAndAppManagementRoleAssignment from the service
     *
     * @return the DeviceAndAppManagementRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
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
     * Patches this DeviceAndAppManagementRoleAssignment with a source
     *
     * @param sourceDeviceAndAppManagementRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Patches this DeviceAndAppManagementRoleAssignment with a source
     *
     * @param sourceDeviceAndAppManagementRoleAssignment the source object with updates
     * @return the updated DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleAssignment patch(final DeviceAndAppManagementRoleAssignment sourceDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the new object to create
     * @return the created DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleAssignment post(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment, final ICallback<? super DeviceAndAppManagementRoleAssignment> callback) {
        send(HttpMethod.PUT, callback, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Creates a DeviceAndAppManagementRoleAssignment with a new object
     *
     * @param newDeviceAndAppManagementRoleAssignment the object to create/update
     * @return the created DeviceAndAppManagementRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceAndAppManagementRoleAssignment put(final DeviceAndAppManagementRoleAssignment newDeviceAndAppManagementRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAndAppManagementRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceAndAppManagementRoleAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceAndAppManagementRoleAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceAndAppManagementRoleAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceAndAppManagementRoleAssignmentRequest)this;
     }

}

