// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingGroupDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Group Definition Request.
 */
public class DeviceManagementConfigurationSettingGroupDefinitionRequest extends BaseRequest<DeviceManagementConfigurationSettingGroupDefinition> {
	
    /**
     * The request for the DeviceManagementConfigurationSettingGroupDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementConfigurationSettingGroupDefinitionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DeviceManagementConfigurationSettingGroupDefinition> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementConfigurationSettingGroupDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationSettingGroupDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationSettingGroupDefinition.class);
    }

    /**
     * Gets the DeviceManagementConfigurationSettingGroupDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementConfigurationSettingGroupDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementConfigurationSettingGroupDefinition from the service
     *
     * @return the DeviceManagementConfigurationSettingGroupDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationSettingGroupDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementConfigurationSettingGroupDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementConfigurationSettingGroupDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementConfigurationSettingGroupDefinition with a source
     *
     * @param sourceDeviceManagementConfigurationSettingGroupDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementConfigurationSettingGroupDefinition> patchAsync(@Nonnull final DeviceManagementConfigurationSettingGroupDefinition sourceDeviceManagementConfigurationSettingGroupDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementConfigurationSettingGroupDefinition);
    }

    /**
     * Patches this DeviceManagementConfigurationSettingGroupDefinition with a source
     *
     * @param sourceDeviceManagementConfigurationSettingGroupDefinition the source object with updates
     * @return the updated DeviceManagementConfigurationSettingGroupDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationSettingGroupDefinition patch(@Nonnull final DeviceManagementConfigurationSettingGroupDefinition sourceDeviceManagementConfigurationSettingGroupDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementConfigurationSettingGroupDefinition);
    }

    /**
     * Creates a DeviceManagementConfigurationSettingGroupDefinition with a new object
     *
     * @param newDeviceManagementConfigurationSettingGroupDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementConfigurationSettingGroupDefinition> postAsync(@Nonnull final DeviceManagementConfigurationSettingGroupDefinition newDeviceManagementConfigurationSettingGroupDefinition) {
        return sendAsync(HttpMethod.POST, newDeviceManagementConfigurationSettingGroupDefinition);
    }

    /**
     * Creates a DeviceManagementConfigurationSettingGroupDefinition with a new object
     *
     * @param newDeviceManagementConfigurationSettingGroupDefinition the new object to create
     * @return the created DeviceManagementConfigurationSettingGroupDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationSettingGroupDefinition post(@Nonnull final DeviceManagementConfigurationSettingGroupDefinition newDeviceManagementConfigurationSettingGroupDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementConfigurationSettingGroupDefinition);
    }

    /**
     * Creates a DeviceManagementConfigurationSettingGroupDefinition with a new object
     *
     * @param newDeviceManagementConfigurationSettingGroupDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementConfigurationSettingGroupDefinition> putAsync(@Nonnull final DeviceManagementConfigurationSettingGroupDefinition newDeviceManagementConfigurationSettingGroupDefinition) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementConfigurationSettingGroupDefinition);
    }

    /**
     * Creates a DeviceManagementConfigurationSettingGroupDefinition with a new object
     *
     * @param newDeviceManagementConfigurationSettingGroupDefinition the object to create/update
     * @return the created DeviceManagementConfigurationSettingGroupDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementConfigurationSettingGroupDefinition put(@Nonnull final DeviceManagementConfigurationSettingGroupDefinition newDeviceManagementConfigurationSettingGroupDefinition) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementConfigurationSettingGroupDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementConfigurationSettingGroupDefinitionRequest select(@Nonnull final String value) {
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
     public DeviceManagementConfigurationSettingGroupDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

