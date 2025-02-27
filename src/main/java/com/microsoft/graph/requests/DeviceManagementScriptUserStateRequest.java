// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementScriptUserState;
import com.microsoft.graph.requests.DeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementScriptDeviceStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script User State Request.
 */
public class DeviceManagementScriptUserStateRequest extends BaseRequest<DeviceManagementScriptUserState> {
	
    /**
     * The request for the DeviceManagementScriptUserState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptUserStateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptUserState.class);
    }

    /**
     * Gets the DeviceManagementScriptUserState from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScriptUserState> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementScriptUserState from the service
     *
     * @return the DeviceManagementScriptUserState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScriptUserState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScriptUserState> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementScriptUserState delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementScriptUserState with a source
     *
     * @param sourceDeviceManagementScriptUserState the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScriptUserState> patchAsync(@Nonnull final DeviceManagementScriptUserState sourceDeviceManagementScriptUserState) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementScriptUserState);
    }

    /**
     * Patches this DeviceManagementScriptUserState with a source
     *
     * @param sourceDeviceManagementScriptUserState the source object with updates
     * @return the updated DeviceManagementScriptUserState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScriptUserState patch(@Nonnull final DeviceManagementScriptUserState sourceDeviceManagementScriptUserState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementScriptUserState);
    }

    /**
     * Creates a DeviceManagementScriptUserState with a new object
     *
     * @param newDeviceManagementScriptUserState the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScriptUserState> postAsync(@Nonnull final DeviceManagementScriptUserState newDeviceManagementScriptUserState) {
        return sendAsync(HttpMethod.POST, newDeviceManagementScriptUserState);
    }

    /**
     * Creates a DeviceManagementScriptUserState with a new object
     *
     * @param newDeviceManagementScriptUserState the new object to create
     * @return the created DeviceManagementScriptUserState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScriptUserState post(@Nonnull final DeviceManagementScriptUserState newDeviceManagementScriptUserState) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementScriptUserState);
    }

    /**
     * Creates a DeviceManagementScriptUserState with a new object
     *
     * @param newDeviceManagementScriptUserState the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementScriptUserState> putAsync(@Nonnull final DeviceManagementScriptUserState newDeviceManagementScriptUserState) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementScriptUserState);
    }

    /**
     * Creates a DeviceManagementScriptUserState with a new object
     *
     * @param newDeviceManagementScriptUserState the object to create/update
     * @return the created DeviceManagementScriptUserState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementScriptUserState put(@Nonnull final DeviceManagementScriptUserState newDeviceManagementScriptUserState) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementScriptUserState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementScriptUserStateRequest select(@Nonnull final String value) {
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
     public DeviceManagementScriptUserStateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

