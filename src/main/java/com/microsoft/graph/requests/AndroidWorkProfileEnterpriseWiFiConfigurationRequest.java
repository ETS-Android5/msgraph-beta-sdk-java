// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidWorkProfileEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.AndroidWorkProfileCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.AndroidWorkProfileTrustedRootCertificateWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Enterprise Wi Fi Configuration Request.
 */
public class AndroidWorkProfileEnterpriseWiFiConfigurationRequest extends BaseRequest<AndroidWorkProfileEnterpriseWiFiConfiguration> {
	
    /**
     * The request for the AndroidWorkProfileEnterpriseWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileEnterpriseWiFiConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileEnterpriseWiFiConfiguration.class);
    }

    /**
     * Gets the AndroidWorkProfileEnterpriseWiFiConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileEnterpriseWiFiConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidWorkProfileEnterpriseWiFiConfiguration from the service
     *
     * @return the AndroidWorkProfileEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileEnterpriseWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileEnterpriseWiFiConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidWorkProfileEnterpriseWiFiConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidWorkProfileEnterpriseWiFiConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileEnterpriseWiFiConfiguration> patchAsync(@Nonnull final AndroidWorkProfileEnterpriseWiFiConfiguration sourceAndroidWorkProfileEnterpriseWiFiConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidWorkProfileEnterpriseWiFiConfiguration);
    }

    /**
     * Patches this AndroidWorkProfileEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidWorkProfileEnterpriseWiFiConfiguration the source object with updates
     * @return the updated AndroidWorkProfileEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileEnterpriseWiFiConfiguration patch(@Nonnull final AndroidWorkProfileEnterpriseWiFiConfiguration sourceAndroidWorkProfileEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidWorkProfileEnterpriseWiFiConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileEnterpriseWiFiConfiguration> postAsync(@Nonnull final AndroidWorkProfileEnterpriseWiFiConfiguration newAndroidWorkProfileEnterpriseWiFiConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidWorkProfileEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidWorkProfileEnterpriseWiFiConfiguration the new object to create
     * @return the created AndroidWorkProfileEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileEnterpriseWiFiConfiguration post(@Nonnull final AndroidWorkProfileEnterpriseWiFiConfiguration newAndroidWorkProfileEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidWorkProfileEnterpriseWiFiConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileEnterpriseWiFiConfiguration> putAsync(@Nonnull final AndroidWorkProfileEnterpriseWiFiConfiguration newAndroidWorkProfileEnterpriseWiFiConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidWorkProfileEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidWorkProfileEnterpriseWiFiConfiguration the object to create/update
     * @return the created AndroidWorkProfileEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileEnterpriseWiFiConfiguration put(@Nonnull final AndroidWorkProfileEnterpriseWiFiConfiguration newAndroidWorkProfileEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileEnterpriseWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileEnterpriseWiFiConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileEnterpriseWiFiConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

