// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementComplexSettingInstance;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Complex Setting Instance Request.
 */
public class DeviceManagementComplexSettingInstanceRequest extends BaseRequest<DeviceManagementComplexSettingInstance> {
	
    /**
     * The request for the DeviceManagementComplexSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementComplexSettingInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementComplexSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementComplexSettingInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementComplexSettingInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementComplexSettingInstance from the service
     *
     * @return the DeviceManagementComplexSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementComplexSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementComplexSettingInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementComplexSettingInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementComplexSettingInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementComplexSettingInstance> patchAsync(@Nonnull final DeviceManagementComplexSettingInstance sourceDeviceManagementComplexSettingInstance) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementComplexSettingInstance);
    }

    /**
     * Patches this DeviceManagementComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementComplexSettingInstance the source object with updates
     * @return the updated DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementComplexSettingInstance patch(@Nonnull final DeviceManagementComplexSettingInstance sourceDeviceManagementComplexSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementComplexSettingInstance> postAsync(@Nonnull final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) {
        return sendAsync(HttpMethod.POST, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the new object to create
     * @return the created DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementComplexSettingInstance post(@Nonnull final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementComplexSettingInstance> putAsync(@Nonnull final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Creates a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the object to create/update
     * @return the created DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementComplexSettingInstance put(@Nonnull final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementComplexSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementComplexSettingInstanceRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementComplexSettingInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

