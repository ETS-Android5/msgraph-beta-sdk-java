// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementReportSchedule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Report Schedule Request.
 */
public class DeviceManagementReportScheduleRequest extends BaseRequest<DeviceManagementReportSchedule> {
	
    /**
     * The request for the DeviceManagementReportSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportScheduleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementReportSchedule.class);
    }

    /**
     * Gets the DeviceManagementReportSchedule from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReportSchedule> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementReportSchedule from the service
     *
     * @return the DeviceManagementReportSchedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementReportSchedule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReportSchedule> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementReportSchedule delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementReportSchedule with a source
     *
     * @param sourceDeviceManagementReportSchedule the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReportSchedule> patchAsync(@Nonnull final DeviceManagementReportSchedule sourceDeviceManagementReportSchedule) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementReportSchedule);
    }

    /**
     * Patches this DeviceManagementReportSchedule with a source
     *
     * @param sourceDeviceManagementReportSchedule the source object with updates
     * @return the updated DeviceManagementReportSchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementReportSchedule patch(@Nonnull final DeviceManagementReportSchedule sourceDeviceManagementReportSchedule) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementReportSchedule);
    }

    /**
     * Creates a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReportSchedule> postAsync(@Nonnull final DeviceManagementReportSchedule newDeviceManagementReportSchedule) {
        return sendAsync(HttpMethod.POST, newDeviceManagementReportSchedule);
    }

    /**
     * Creates a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the new object to create
     * @return the created DeviceManagementReportSchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementReportSchedule post(@Nonnull final DeviceManagementReportSchedule newDeviceManagementReportSchedule) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementReportSchedule);
    }

    /**
     * Creates a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementReportSchedule> putAsync(@Nonnull final DeviceManagementReportSchedule newDeviceManagementReportSchedule) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementReportSchedule);
    }

    /**
     * Creates a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the object to create/update
     * @return the created DeviceManagementReportSchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementReportSchedule put(@Nonnull final DeviceManagementReportSchedule newDeviceManagementReportSchedule) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementReportSchedule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementReportScheduleRequest select(@Nonnull final String value) {
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
     public DeviceManagementReportScheduleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

