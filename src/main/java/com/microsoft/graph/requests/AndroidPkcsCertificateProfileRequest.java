// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidPkcsCertificateProfile;
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
 * The class for the Android Pkcs Certificate Profile Request.
 */
public class AndroidPkcsCertificateProfileRequest extends BaseRequest<AndroidPkcsCertificateProfile> {
	
    /**
     * The request for the AndroidPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidPkcsCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidPkcsCertificateProfile.class);
    }

    /**
     * Gets the AndroidPkcsCertificateProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidPkcsCertificateProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidPkcsCertificateProfile from the service
     *
     * @return the AndroidPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidPkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidPkcsCertificateProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidPkcsCertificateProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidPkcsCertificateProfile with a source
     *
     * @param sourceAndroidPkcsCertificateProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidPkcsCertificateProfile> patchAsync(@Nonnull final AndroidPkcsCertificateProfile sourceAndroidPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidPkcsCertificateProfile);
    }

    /**
     * Patches this AndroidPkcsCertificateProfile with a source
     *
     * @param sourceAndroidPkcsCertificateProfile the source object with updates
     * @return the updated AndroidPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidPkcsCertificateProfile patch(@Nonnull final AndroidPkcsCertificateProfile sourceAndroidPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidPkcsCertificateProfile> postAsync(@Nonnull final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile) {
        return sendAsync(HttpMethod.POST, newAndroidPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the new object to create
     * @return the created AndroidPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidPkcsCertificateProfile post(@Nonnull final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidPkcsCertificateProfile> putAsync(@Nonnull final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PUT, newAndroidPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidPkcsCertificateProfile with a new object
     *
     * @param newAndroidPkcsCertificateProfile the object to create/update
     * @return the created AndroidPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidPkcsCertificateProfile put(@Nonnull final AndroidPkcsCertificateProfile newAndroidPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidPkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidPkcsCertificateProfileRequest select(@Nonnull final String value) {
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
     public AndroidPkcsCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

