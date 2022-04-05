// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AospDeviceOwnerWiFiConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aosp Device Owner Wi Fi Configuration Request.
 */
public class AospDeviceOwnerWiFiConfigurationRequest extends BaseRequest<AospDeviceOwnerWiFiConfiguration> {
	
    /**
     * The request for the AospDeviceOwnerWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AospDeviceOwnerWiFiConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AospDeviceOwnerWiFiConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AospDeviceOwnerWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AospDeviceOwnerWiFiConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AospDeviceOwnerWiFiConfiguration.class);
    }

    /**
     * Gets the AospDeviceOwnerWiFiConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerWiFiConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AospDeviceOwnerWiFiConfiguration from the service
     *
     * @return the AospDeviceOwnerWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerWiFiConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AospDeviceOwnerWiFiConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AospDeviceOwnerWiFiConfiguration with a source
     *
     * @param sourceAospDeviceOwnerWiFiConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerWiFiConfiguration> patchAsync(@Nonnull final AospDeviceOwnerWiFiConfiguration sourceAospDeviceOwnerWiFiConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAospDeviceOwnerWiFiConfiguration);
    }

    /**
     * Patches this AospDeviceOwnerWiFiConfiguration with a source
     *
     * @param sourceAospDeviceOwnerWiFiConfiguration the source object with updates
     * @return the updated AospDeviceOwnerWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerWiFiConfiguration patch(@Nonnull final AospDeviceOwnerWiFiConfiguration sourceAospDeviceOwnerWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAospDeviceOwnerWiFiConfiguration);
    }

    /**
     * Creates a AospDeviceOwnerWiFiConfiguration with a new object
     *
     * @param newAospDeviceOwnerWiFiConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerWiFiConfiguration> postAsync(@Nonnull final AospDeviceOwnerWiFiConfiguration newAospDeviceOwnerWiFiConfiguration) {
        return sendAsync(HttpMethod.POST, newAospDeviceOwnerWiFiConfiguration);
    }

    /**
     * Creates a AospDeviceOwnerWiFiConfiguration with a new object
     *
     * @param newAospDeviceOwnerWiFiConfiguration the new object to create
     * @return the created AospDeviceOwnerWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerWiFiConfiguration post(@Nonnull final AospDeviceOwnerWiFiConfiguration newAospDeviceOwnerWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAospDeviceOwnerWiFiConfiguration);
    }

    /**
     * Creates a AospDeviceOwnerWiFiConfiguration with a new object
     *
     * @param newAospDeviceOwnerWiFiConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerWiFiConfiguration> putAsync(@Nonnull final AospDeviceOwnerWiFiConfiguration newAospDeviceOwnerWiFiConfiguration) {
        return sendAsync(HttpMethod.PUT, newAospDeviceOwnerWiFiConfiguration);
    }

    /**
     * Creates a AospDeviceOwnerWiFiConfiguration with a new object
     *
     * @param newAospDeviceOwnerWiFiConfiguration the object to create/update
     * @return the created AospDeviceOwnerWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerWiFiConfiguration put(@Nonnull final AospDeviceOwnerWiFiConfiguration newAospDeviceOwnerWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAospDeviceOwnerWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AospDeviceOwnerWiFiConfigurationRequest select(@Nonnull final String value) {
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
     public AospDeviceOwnerWiFiConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

