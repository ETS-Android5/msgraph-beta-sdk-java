// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidForWorkPkcsCertificateProfile;
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
 * The class for the Android For Work Pkcs Certificate Profile Request.
 */
public class AndroidForWorkPkcsCertificateProfileRequest extends BaseRequest<AndroidForWorkPkcsCertificateProfile> {
	
    /**
     * The request for the AndroidForWorkPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkPkcsCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkPkcsCertificateProfile.class);
    }

    /**
     * Gets the AndroidForWorkPkcsCertificateProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkPkcsCertificateProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidForWorkPkcsCertificateProfile from the service
     *
     * @return the AndroidForWorkPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkPkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkPkcsCertificateProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidForWorkPkcsCertificateProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidForWorkPkcsCertificateProfile with a source
     *
     * @param sourceAndroidForWorkPkcsCertificateProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkPkcsCertificateProfile> patchAsync(@Nonnull final AndroidForWorkPkcsCertificateProfile sourceAndroidForWorkPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Patches this AndroidForWorkPkcsCertificateProfile with a source
     *
     * @param sourceAndroidForWorkPkcsCertificateProfile the source object with updates
     * @return the updated AndroidForWorkPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkPkcsCertificateProfile patch(@Nonnull final AndroidForWorkPkcsCertificateProfile sourceAndroidForWorkPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkPkcsCertificateProfile with a new object
     *
     * @param newAndroidForWorkPkcsCertificateProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkPkcsCertificateProfile> postAsync(@Nonnull final AndroidForWorkPkcsCertificateProfile newAndroidForWorkPkcsCertificateProfile) {
        return sendAsync(HttpMethod.POST, newAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkPkcsCertificateProfile with a new object
     *
     * @param newAndroidForWorkPkcsCertificateProfile the new object to create
     * @return the created AndroidForWorkPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkPkcsCertificateProfile post(@Nonnull final AndroidForWorkPkcsCertificateProfile newAndroidForWorkPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkPkcsCertificateProfile with a new object
     *
     * @param newAndroidForWorkPkcsCertificateProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkPkcsCertificateProfile> putAsync(@Nonnull final AndroidForWorkPkcsCertificateProfile newAndroidForWorkPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PUT, newAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkPkcsCertificateProfile with a new object
     *
     * @param newAndroidForWorkPkcsCertificateProfile the object to create/update
     * @return the created AndroidForWorkPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkPkcsCertificateProfile put(@Nonnull final AndroidForWorkPkcsCertificateProfile newAndroidForWorkPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkPkcsCertificateProfileRequest select(@Nonnull final String value) {
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
     public AndroidForWorkPkcsCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

