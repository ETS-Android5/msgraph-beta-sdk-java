// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidDeviceOwnerPkcsCertificateProfile;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Pkcs Certificate Profile Request.
 */
public class AndroidDeviceOwnerPkcsCertificateProfileRequest extends BaseRequest<AndroidDeviceOwnerPkcsCertificateProfile> {
	
    /**
     * The request for the AndroidDeviceOwnerPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerPkcsCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerPkcsCertificateProfile.class);
    }

    /**
     * Gets the AndroidDeviceOwnerPkcsCertificateProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerPkcsCertificateProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidDeviceOwnerPkcsCertificateProfile from the service
     *
     * @return the AndroidDeviceOwnerPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerPkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerPkcsCertificateProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidDeviceOwnerPkcsCertificateProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidDeviceOwnerPkcsCertificateProfile with a source
     *
     * @param sourceAndroidDeviceOwnerPkcsCertificateProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerPkcsCertificateProfile> patchAsync(@Nonnull final AndroidDeviceOwnerPkcsCertificateProfile sourceAndroidDeviceOwnerPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Patches this AndroidDeviceOwnerPkcsCertificateProfile with a source
     *
     * @param sourceAndroidDeviceOwnerPkcsCertificateProfile the source object with updates
     * @return the updated AndroidDeviceOwnerPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerPkcsCertificateProfile patch(@Nonnull final AndroidDeviceOwnerPkcsCertificateProfile sourceAndroidDeviceOwnerPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAndroidDeviceOwnerPkcsCertificateProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerPkcsCertificateProfile> postAsync(@Nonnull final AndroidDeviceOwnerPkcsCertificateProfile newAndroidDeviceOwnerPkcsCertificateProfile) {
        return sendAsync(HttpMethod.POST, newAndroidDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAndroidDeviceOwnerPkcsCertificateProfile the new object to create
     * @return the created AndroidDeviceOwnerPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerPkcsCertificateProfile post(@Nonnull final AndroidDeviceOwnerPkcsCertificateProfile newAndroidDeviceOwnerPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAndroidDeviceOwnerPkcsCertificateProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerPkcsCertificateProfile> putAsync(@Nonnull final AndroidDeviceOwnerPkcsCertificateProfile newAndroidDeviceOwnerPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PUT, newAndroidDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAndroidDeviceOwnerPkcsCertificateProfile the object to create/update
     * @return the created AndroidDeviceOwnerPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerPkcsCertificateProfile put(@Nonnull final AndroidDeviceOwnerPkcsCertificateProfile newAndroidDeviceOwnerPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceOwnerPkcsCertificateProfileRequest select(@Nonnull final String value) {
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
     public AndroidDeviceOwnerPkcsCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

