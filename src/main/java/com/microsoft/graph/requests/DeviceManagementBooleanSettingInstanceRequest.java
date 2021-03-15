// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementBooleanSettingInstance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Boolean Setting Instance Request.
 */
public class DeviceManagementBooleanSettingInstanceRequest extends BaseRequest<DeviceManagementBooleanSettingInstance> {
	
    /**
     * The request for the DeviceManagementBooleanSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementBooleanSettingInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementBooleanSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementBooleanSettingInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementBooleanSettingInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementBooleanSettingInstance from the service
     *
     * @return the DeviceManagementBooleanSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementBooleanSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementBooleanSettingInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementBooleanSettingInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementBooleanSettingInstance with a source
     *
     * @param sourceDeviceManagementBooleanSettingInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementBooleanSettingInstance> patchAsync(@Nonnull final DeviceManagementBooleanSettingInstance sourceDeviceManagementBooleanSettingInstance) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementBooleanSettingInstance);
    }

    /**
     * Patches this DeviceManagementBooleanSettingInstance with a source
     *
     * @param sourceDeviceManagementBooleanSettingInstance the source object with updates
     * @return the updated DeviceManagementBooleanSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementBooleanSettingInstance patch(@Nonnull final DeviceManagementBooleanSettingInstance sourceDeviceManagementBooleanSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementBooleanSettingInstance);
    }

    /**
     * Creates a DeviceManagementBooleanSettingInstance with a new object
     *
     * @param newDeviceManagementBooleanSettingInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementBooleanSettingInstance> postAsync(@Nonnull final DeviceManagementBooleanSettingInstance newDeviceManagementBooleanSettingInstance) {
        return sendAsync(HttpMethod.POST, newDeviceManagementBooleanSettingInstance);
    }

    /**
     * Creates a DeviceManagementBooleanSettingInstance with a new object
     *
     * @param newDeviceManagementBooleanSettingInstance the new object to create
     * @return the created DeviceManagementBooleanSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementBooleanSettingInstance post(@Nonnull final DeviceManagementBooleanSettingInstance newDeviceManagementBooleanSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementBooleanSettingInstance);
    }

    /**
     * Creates a DeviceManagementBooleanSettingInstance with a new object
     *
     * @param newDeviceManagementBooleanSettingInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementBooleanSettingInstance> putAsync(@Nonnull final DeviceManagementBooleanSettingInstance newDeviceManagementBooleanSettingInstance) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementBooleanSettingInstance);
    }

    /**
     * Creates a DeviceManagementBooleanSettingInstance with a new object
     *
     * @param newDeviceManagementBooleanSettingInstance the object to create/update
     * @return the created DeviceManagementBooleanSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementBooleanSettingInstance put(@Nonnull final DeviceManagementBooleanSettingInstance newDeviceManagementBooleanSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementBooleanSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementBooleanSettingInstanceRequest select(@Nonnull final String value) {
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
     public DeviceManagementBooleanSettingInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

