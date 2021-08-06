// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceEnrollmentPlatformRestrictionConfiguration;
import com.microsoft.graph.models.EnrollmentConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Platform Restriction Configuration Request.
 */
public class DeviceEnrollmentPlatformRestrictionConfigurationRequest extends BaseRequest<DeviceEnrollmentPlatformRestrictionConfiguration> {
	
    /**
     * The request for the DeviceEnrollmentPlatformRestrictionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentPlatformRestrictionConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentPlatformRestrictionConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentPlatformRestrictionConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentPlatformRestrictionConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceEnrollmentPlatformRestrictionConfiguration from the service
     *
     * @return the DeviceEnrollmentPlatformRestrictionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentPlatformRestrictionConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceEnrollmentPlatformRestrictionConfiguration with a source
     *
     * @param sourceDeviceEnrollmentPlatformRestrictionConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentPlatformRestrictionConfiguration> patchAsync(@Nonnull final DeviceEnrollmentPlatformRestrictionConfiguration sourceDeviceEnrollmentPlatformRestrictionConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceEnrollmentPlatformRestrictionConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentPlatformRestrictionConfiguration with a source
     *
     * @param sourceDeviceEnrollmentPlatformRestrictionConfiguration the source object with updates
     * @return the updated DeviceEnrollmentPlatformRestrictionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionConfiguration patch(@Nonnull final DeviceEnrollmentPlatformRestrictionConfiguration sourceDeviceEnrollmentPlatformRestrictionConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentPlatformRestrictionConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentPlatformRestrictionConfiguration> postAsync(@Nonnull final DeviceEnrollmentPlatformRestrictionConfiguration newDeviceEnrollmentPlatformRestrictionConfiguration) {
        return sendAsync(HttpMethod.POST, newDeviceEnrollmentPlatformRestrictionConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionConfiguration the new object to create
     * @return the created DeviceEnrollmentPlatformRestrictionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionConfiguration post(@Nonnull final DeviceEnrollmentPlatformRestrictionConfiguration newDeviceEnrollmentPlatformRestrictionConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentPlatformRestrictionConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentPlatformRestrictionConfiguration> putAsync(@Nonnull final DeviceEnrollmentPlatformRestrictionConfiguration newDeviceEnrollmentPlatformRestrictionConfiguration) {
        return sendAsync(HttpMethod.PUT, newDeviceEnrollmentPlatformRestrictionConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionConfiguration the object to create/update
     * @return the created DeviceEnrollmentPlatformRestrictionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionConfiguration put(@Nonnull final DeviceEnrollmentPlatformRestrictionConfiguration newDeviceEnrollmentPlatformRestrictionConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentPlatformRestrictionConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceEnrollmentPlatformRestrictionConfigurationRequest select(@Nonnull final String value) {
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
     public DeviceEnrollmentPlatformRestrictionConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

