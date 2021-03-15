// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidScepCertificateProfile;
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
 * The class for the Android Scep Certificate Profile Request.
 */
public class AndroidScepCertificateProfileRequest extends BaseRequest<AndroidScepCertificateProfile> {
	
    /**
     * The request for the AndroidScepCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidScepCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidScepCertificateProfile.class);
    }

    /**
     * Gets the AndroidScepCertificateProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidScepCertificateProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidScepCertificateProfile from the service
     *
     * @return the AndroidScepCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidScepCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidScepCertificateProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidScepCertificateProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidScepCertificateProfile with a source
     *
     * @param sourceAndroidScepCertificateProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidScepCertificateProfile> patchAsync(@Nonnull final AndroidScepCertificateProfile sourceAndroidScepCertificateProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidScepCertificateProfile);
    }

    /**
     * Patches this AndroidScepCertificateProfile with a source
     *
     * @param sourceAndroidScepCertificateProfile the source object with updates
     * @return the updated AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidScepCertificateProfile patch(@Nonnull final AndroidScepCertificateProfile sourceAndroidScepCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidScepCertificateProfile> postAsync(@Nonnull final AndroidScepCertificateProfile newAndroidScepCertificateProfile) {
        return sendAsync(HttpMethod.POST, newAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the new object to create
     * @return the created AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidScepCertificateProfile post(@Nonnull final AndroidScepCertificateProfile newAndroidScepCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidScepCertificateProfile> putAsync(@Nonnull final AndroidScepCertificateProfile newAndroidScepCertificateProfile) {
        return sendAsync(HttpMethod.PUT, newAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the object to create/update
     * @return the created AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidScepCertificateProfile put(@Nonnull final AndroidScepCertificateProfile newAndroidScepCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidScepCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidScepCertificateProfileRequest select(@Nonnull final String value) {
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
     public AndroidScepCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

