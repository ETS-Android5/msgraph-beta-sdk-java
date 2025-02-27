// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementAbstractComplexSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Abstract Complex Setting Definition Request.
 */
public class DeviceManagementAbstractComplexSettingDefinitionRequest extends BaseRequest<DeviceManagementAbstractComplexSettingDefinition> {
	
    /**
     * The request for the DeviceManagementAbstractComplexSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAbstractComplexSettingDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementAbstractComplexSettingDefinition.class);
    }

    /**
     * Gets the DeviceManagementAbstractComplexSettingDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAbstractComplexSettingDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementAbstractComplexSettingDefinition from the service
     *
     * @return the DeviceManagementAbstractComplexSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAbstractComplexSettingDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAbstractComplexSettingDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementAbstractComplexSettingDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementAbstractComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAbstractComplexSettingDefinition> patchAsync(@Nonnull final DeviceManagementAbstractComplexSettingDefinition sourceDeviceManagementAbstractComplexSettingDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Patches this DeviceManagementAbstractComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingDefinition the source object with updates
     * @return the updated DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAbstractComplexSettingDefinition patch(@Nonnull final DeviceManagementAbstractComplexSettingDefinition sourceDeviceManagementAbstractComplexSettingDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAbstractComplexSettingDefinition> postAsync(@Nonnull final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) {
        return sendAsync(HttpMethod.POST, newDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the new object to create
     * @return the created DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAbstractComplexSettingDefinition post(@Nonnull final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAbstractComplexSettingDefinition> putAsync(@Nonnull final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the object to create/update
     * @return the created DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAbstractComplexSettingDefinition put(@Nonnull final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementAbstractComplexSettingDefinitionRequest select(@Nonnull final String value) {
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
     public DeviceManagementAbstractComplexSettingDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

