// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidDeviceOwnerVpnConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.DeviceManagementDerivedCredentialSettingsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.AndroidDeviceOwnerCertificateProfileBaseWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Vpn Configuration Request.
 */
public class AndroidDeviceOwnerVpnConfigurationRequest extends BaseRequest<AndroidDeviceOwnerVpnConfiguration> {
	
    /**
     * The request for the AndroidDeviceOwnerVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerVpnConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerVpnConfiguration.class);
    }

    /**
     * Gets the AndroidDeviceOwnerVpnConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerVpnConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidDeviceOwnerVpnConfiguration from the service
     *
     * @return the AndroidDeviceOwnerVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerVpnConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidDeviceOwnerVpnConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidDeviceOwnerVpnConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerVpnConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerVpnConfiguration> patchAsync(@Nonnull final AndroidDeviceOwnerVpnConfiguration sourceAndroidDeviceOwnerVpnConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Patches this AndroidDeviceOwnerVpnConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerVpnConfiguration the source object with updates
     * @return the updated AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerVpnConfiguration patch(@Nonnull final AndroidDeviceOwnerVpnConfiguration sourceAndroidDeviceOwnerVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerVpnConfiguration> postAsync(@Nonnull final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the new object to create
     * @return the created AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerVpnConfiguration post(@Nonnull final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerVpnConfiguration> putAsync(@Nonnull final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Creates a AndroidDeviceOwnerVpnConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerVpnConfiguration the object to create/update
     * @return the created AndroidDeviceOwnerVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerVpnConfiguration put(@Nonnull final AndroidDeviceOwnerVpnConfiguration newAndroidDeviceOwnerVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceOwnerVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceOwnerVpnConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidDeviceOwnerVpnConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

