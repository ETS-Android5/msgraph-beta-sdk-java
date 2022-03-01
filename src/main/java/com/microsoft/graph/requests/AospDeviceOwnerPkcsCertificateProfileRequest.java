// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AospDeviceOwnerPkcsCertificateProfile;
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
 * The class for the Aosp Device Owner Pkcs Certificate Profile Request.
 */
public class AospDeviceOwnerPkcsCertificateProfileRequest extends BaseRequest<AospDeviceOwnerPkcsCertificateProfile> {
	
    /**
     * The request for the AospDeviceOwnerPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AospDeviceOwnerPkcsCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AospDeviceOwnerPkcsCertificateProfile.class);
    }

    /**
     * Gets the AospDeviceOwnerPkcsCertificateProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerPkcsCertificateProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AospDeviceOwnerPkcsCertificateProfile from the service
     *
     * @return the AospDeviceOwnerPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerPkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerPkcsCertificateProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AospDeviceOwnerPkcsCertificateProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AospDeviceOwnerPkcsCertificateProfile with a source
     *
     * @param sourceAospDeviceOwnerPkcsCertificateProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerPkcsCertificateProfile> patchAsync(@Nonnull final AospDeviceOwnerPkcsCertificateProfile sourceAospDeviceOwnerPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAospDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Patches this AospDeviceOwnerPkcsCertificateProfile with a source
     *
     * @param sourceAospDeviceOwnerPkcsCertificateProfile the source object with updates
     * @return the updated AospDeviceOwnerPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerPkcsCertificateProfile patch(@Nonnull final AospDeviceOwnerPkcsCertificateProfile sourceAospDeviceOwnerPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAospDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AospDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAospDeviceOwnerPkcsCertificateProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerPkcsCertificateProfile> postAsync(@Nonnull final AospDeviceOwnerPkcsCertificateProfile newAospDeviceOwnerPkcsCertificateProfile) {
        return sendAsync(HttpMethod.POST, newAospDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AospDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAospDeviceOwnerPkcsCertificateProfile the new object to create
     * @return the created AospDeviceOwnerPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerPkcsCertificateProfile post(@Nonnull final AospDeviceOwnerPkcsCertificateProfile newAospDeviceOwnerPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAospDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AospDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAospDeviceOwnerPkcsCertificateProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AospDeviceOwnerPkcsCertificateProfile> putAsync(@Nonnull final AospDeviceOwnerPkcsCertificateProfile newAospDeviceOwnerPkcsCertificateProfile) {
        return sendAsync(HttpMethod.PUT, newAospDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Creates a AospDeviceOwnerPkcsCertificateProfile with a new object
     *
     * @param newAospDeviceOwnerPkcsCertificateProfile the object to create/update
     * @return the created AospDeviceOwnerPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AospDeviceOwnerPkcsCertificateProfile put(@Nonnull final AospDeviceOwnerPkcsCertificateProfile newAospDeviceOwnerPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAospDeviceOwnerPkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AospDeviceOwnerPkcsCertificateProfileRequest select(@Nonnull final String value) {
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
     public AospDeviceOwnerPkcsCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

