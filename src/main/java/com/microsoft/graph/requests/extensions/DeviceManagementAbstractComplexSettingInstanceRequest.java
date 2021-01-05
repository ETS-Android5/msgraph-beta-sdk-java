// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementAbstractComplexSettingInstance;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Abstract Complex Setting Instance Request.
 */
public class DeviceManagementAbstractComplexSettingInstanceRequest extends BaseRequest implements IDeviceManagementAbstractComplexSettingInstanceRequest {
	
    /**
     * The request for the DeviceManagementAbstractComplexSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAbstractComplexSettingInstanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementAbstractComplexSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementAbstractComplexSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementAbstractComplexSettingInstance from the service
     *
     * @return the DeviceManagementAbstractComplexSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback) {
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
     * Patches this DeviceManagementAbstractComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementAbstractComplexSettingInstance sourceDeviceManagementAbstractComplexSettingInstance, final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementAbstractComplexSettingInstance);
    }

    /**
     * Patches this DeviceManagementAbstractComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingInstance the source object with updates
     * @return the updated DeviceManagementAbstractComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingInstance patch(final DeviceManagementAbstractComplexSettingInstance sourceDeviceManagementAbstractComplexSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementAbstractComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance, final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementAbstractComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the new object to create
     * @return the created DeviceManagementAbstractComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingInstance post(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementAbstractComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance, final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementAbstractComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the object to create/update
     * @return the created DeviceManagementAbstractComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingInstance put(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementAbstractComplexSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementAbstractComplexSettingInstanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementAbstractComplexSettingInstanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementAbstractComplexSettingInstanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementAbstractComplexSettingInstanceRequest)this;
     }

}

