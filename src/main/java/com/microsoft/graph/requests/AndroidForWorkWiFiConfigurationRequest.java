// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidForWorkWiFiConfiguration;
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
 * The class for the Android For Work Wi Fi Configuration Request.
 */
public class AndroidForWorkWiFiConfigurationRequest extends BaseRequest<AndroidForWorkWiFiConfiguration> {
	
    /**
     * The request for the AndroidForWorkWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidForWorkWiFiConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AndroidForWorkWiFiConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidForWorkWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkWiFiConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkWiFiConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkWiFiConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkWiFiConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidForWorkWiFiConfiguration from the service
     *
     * @return the AndroidForWorkWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkWiFiConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidForWorkWiFiConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidForWorkWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkWiFiConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkWiFiConfiguration> patchAsync(@Nonnull final AndroidForWorkWiFiConfiguration sourceAndroidForWorkWiFiConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidForWorkWiFiConfiguration);
    }

    /**
     * Patches this AndroidForWorkWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkWiFiConfiguration the source object with updates
     * @return the updated AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkWiFiConfiguration patch(@Nonnull final AndroidForWorkWiFiConfiguration sourceAndroidForWorkWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkWiFiConfiguration> postAsync(@Nonnull final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the new object to create
     * @return the created AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkWiFiConfiguration post(@Nonnull final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkWiFiConfiguration> putAsync(@Nonnull final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the object to create/update
     * @return the created AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkWiFiConfiguration put(@Nonnull final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkWiFiConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidForWorkWiFiConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

