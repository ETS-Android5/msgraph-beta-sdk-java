// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceConfigurationConflictSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Conflict Summary Request.
 */
public class DeviceConfigurationConflictSummaryRequest extends BaseRequest<DeviceConfigurationConflictSummary> {
	
    /**
     * The request for the DeviceConfigurationConflictSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationConflictSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationConflictSummary.class);
    }

    /**
     * Gets the DeviceConfigurationConflictSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationConflictSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceConfigurationConflictSummary from the service
     *
     * @return the DeviceConfigurationConflictSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationConflictSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationConflictSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceConfigurationConflictSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationConflictSummary with a source
     *
     * @param sourceDeviceConfigurationConflictSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationConflictSummary> patchAsync(@Nonnull final DeviceConfigurationConflictSummary sourceDeviceConfigurationConflictSummary) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceConfigurationConflictSummary);
    }

    /**
     * Patches this DeviceConfigurationConflictSummary with a source
     *
     * @param sourceDeviceConfigurationConflictSummary the source object with updates
     * @return the updated DeviceConfigurationConflictSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationConflictSummary patch(@Nonnull final DeviceConfigurationConflictSummary sourceDeviceConfigurationConflictSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationConflictSummary);
    }

    /**
     * Creates a DeviceConfigurationConflictSummary with a new object
     *
     * @param newDeviceConfigurationConflictSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationConflictSummary> postAsync(@Nonnull final DeviceConfigurationConflictSummary newDeviceConfigurationConflictSummary) {
        return sendAsync(HttpMethod.POST, newDeviceConfigurationConflictSummary);
    }

    /**
     * Creates a DeviceConfigurationConflictSummary with a new object
     *
     * @param newDeviceConfigurationConflictSummary the new object to create
     * @return the created DeviceConfigurationConflictSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationConflictSummary post(@Nonnull final DeviceConfigurationConflictSummary newDeviceConfigurationConflictSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationConflictSummary);
    }

    /**
     * Creates a DeviceConfigurationConflictSummary with a new object
     *
     * @param newDeviceConfigurationConflictSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationConflictSummary> putAsync(@Nonnull final DeviceConfigurationConflictSummary newDeviceConfigurationConflictSummary) {
        return sendAsync(HttpMethod.PUT, newDeviceConfigurationConflictSummary);
    }

    /**
     * Creates a DeviceConfigurationConflictSummary with a new object
     *
     * @param newDeviceConfigurationConflictSummary the object to create/update
     * @return the created DeviceConfigurationConflictSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationConflictSummary put(@Nonnull final DeviceConfigurationConflictSummary newDeviceConfigurationConflictSummary) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationConflictSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceConfigurationConflictSummaryRequest select(@Nonnull final String value) {
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
     public DeviceConfigurationConflictSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

