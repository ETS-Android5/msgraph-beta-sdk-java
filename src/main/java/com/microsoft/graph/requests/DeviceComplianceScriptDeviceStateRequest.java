// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceComplianceScriptDeviceState;
import com.microsoft.graph.requests.ManagedDeviceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Device State Request.
 */
public class DeviceComplianceScriptDeviceStateRequest extends BaseRequest<DeviceComplianceScriptDeviceState> {
	
    /**
     * The request for the DeviceComplianceScriptDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScriptDeviceStateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceScriptDeviceState.class);
    }

    /**
     * Gets the DeviceComplianceScriptDeviceState from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScriptDeviceState> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceComplianceScriptDeviceState from the service
     *
     * @return the DeviceComplianceScriptDeviceState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScriptDeviceState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScriptDeviceState> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceComplianceScriptDeviceState delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceScriptDeviceState with a source
     *
     * @param sourceDeviceComplianceScriptDeviceState the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScriptDeviceState> patchAsync(@Nonnull final DeviceComplianceScriptDeviceState sourceDeviceComplianceScriptDeviceState) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceComplianceScriptDeviceState);
    }

    /**
     * Patches this DeviceComplianceScriptDeviceState with a source
     *
     * @param sourceDeviceComplianceScriptDeviceState the source object with updates
     * @return the updated DeviceComplianceScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScriptDeviceState patch(@Nonnull final DeviceComplianceScriptDeviceState sourceDeviceComplianceScriptDeviceState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceScriptDeviceState);
    }

    /**
     * Creates a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScriptDeviceState> postAsync(@Nonnull final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState) {
        return sendAsync(HttpMethod.POST, newDeviceComplianceScriptDeviceState);
    }

    /**
     * Creates a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the new object to create
     * @return the created DeviceComplianceScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScriptDeviceState post(@Nonnull final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceScriptDeviceState);
    }

    /**
     * Creates a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScriptDeviceState> putAsync(@Nonnull final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState) {
        return sendAsync(HttpMethod.PUT, newDeviceComplianceScriptDeviceState);
    }

    /**
     * Creates a DeviceComplianceScriptDeviceState with a new object
     *
     * @param newDeviceComplianceScriptDeviceState the object to create/update
     * @return the created DeviceComplianceScriptDeviceState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScriptDeviceState put(@Nonnull final DeviceComplianceScriptDeviceState newDeviceComplianceScriptDeviceState) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceScriptDeviceState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceScriptDeviceStateRequest select(@Nonnull final String value) {
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
     public DeviceComplianceScriptDeviceStateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

