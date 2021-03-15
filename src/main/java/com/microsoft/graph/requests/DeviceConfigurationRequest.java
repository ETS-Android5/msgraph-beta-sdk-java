// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.DeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Request.
 */
public class DeviceConfigurationRequest extends BaseRequest<DeviceConfiguration> {
	
    /**
     * The request for the DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DeviceConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfiguration.class);
    }

    /**
     * Gets the DeviceConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceConfiguration from the service
     *
     * @return the DeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfiguration with a source
     *
     * @param sourceDeviceConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> patchAsync(@Nonnull final DeviceConfiguration sourceDeviceConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceConfiguration);
    }

    /**
     * Patches this DeviceConfiguration with a source
     *
     * @param sourceDeviceConfiguration the source object with updates
     * @return the updated DeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfiguration patch(@Nonnull final DeviceConfiguration sourceDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfiguration);
    }

    /**
     * Creates a DeviceConfiguration with a new object
     *
     * @param newDeviceConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> postAsync(@Nonnull final DeviceConfiguration newDeviceConfiguration) {
        return sendAsync(HttpMethod.POST, newDeviceConfiguration);
    }

    /**
     * Creates a DeviceConfiguration with a new object
     *
     * @param newDeviceConfiguration the new object to create
     * @return the created DeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfiguration post(@Nonnull final DeviceConfiguration newDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfiguration);
    }

    /**
     * Creates a DeviceConfiguration with a new object
     *
     * @param newDeviceConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfiguration> putAsync(@Nonnull final DeviceConfiguration newDeviceConfiguration) {
        return sendAsync(HttpMethod.PUT, newDeviceConfiguration);
    }

    /**
     * Creates a DeviceConfiguration with a new object
     *
     * @param newDeviceConfiguration the object to create/update
     * @return the created DeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfiguration put(@Nonnull final DeviceConfiguration newDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceConfigurationRequest select(@Nonnull final String value) {
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
     public DeviceConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

