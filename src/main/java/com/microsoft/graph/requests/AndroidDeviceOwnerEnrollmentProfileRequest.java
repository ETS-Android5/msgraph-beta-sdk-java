// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidDeviceOwnerEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile Request.
 */
public class AndroidDeviceOwnerEnrollmentProfileRequest extends BaseRequest<AndroidDeviceOwnerEnrollmentProfile> {
	
    /**
     * The request for the AndroidDeviceOwnerEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerEnrollmentProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerEnrollmentProfile.class);
    }

    /**
     * Gets the AndroidDeviceOwnerEnrollmentProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerEnrollmentProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidDeviceOwnerEnrollmentProfile from the service
     *
     * @return the AndroidDeviceOwnerEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerEnrollmentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerEnrollmentProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidDeviceOwnerEnrollmentProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidDeviceOwnerEnrollmentProfile with a source
     *
     * @param sourceAndroidDeviceOwnerEnrollmentProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerEnrollmentProfile> patchAsync(@Nonnull final AndroidDeviceOwnerEnrollmentProfile sourceAndroidDeviceOwnerEnrollmentProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Patches this AndroidDeviceOwnerEnrollmentProfile with a source
     *
     * @param sourceAndroidDeviceOwnerEnrollmentProfile the source object with updates
     * @return the updated AndroidDeviceOwnerEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerEnrollmentProfile patch(@Nonnull final AndroidDeviceOwnerEnrollmentProfile sourceAndroidDeviceOwnerEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerEnrollmentProfile with a new object
     *
     * @param newAndroidDeviceOwnerEnrollmentProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerEnrollmentProfile> postAsync(@Nonnull final AndroidDeviceOwnerEnrollmentProfile newAndroidDeviceOwnerEnrollmentProfile) {
        return sendAsync(HttpMethod.POST, newAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerEnrollmentProfile with a new object
     *
     * @param newAndroidDeviceOwnerEnrollmentProfile the new object to create
     * @return the created AndroidDeviceOwnerEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerEnrollmentProfile post(@Nonnull final AndroidDeviceOwnerEnrollmentProfile newAndroidDeviceOwnerEnrollmentProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerEnrollmentProfile with a new object
     *
     * @param newAndroidDeviceOwnerEnrollmentProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceOwnerEnrollmentProfile> putAsync(@Nonnull final AndroidDeviceOwnerEnrollmentProfile newAndroidDeviceOwnerEnrollmentProfile) {
        return sendAsync(HttpMethod.PUT, newAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Creates a AndroidDeviceOwnerEnrollmentProfile with a new object
     *
     * @param newAndroidDeviceOwnerEnrollmentProfile the object to create/update
     * @return the created AndroidDeviceOwnerEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceOwnerEnrollmentProfile put(@Nonnull final AndroidDeviceOwnerEnrollmentProfile newAndroidDeviceOwnerEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceOwnerEnrollmentProfileRequest select(@Nonnull final String value) {
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
     public AndroidDeviceOwnerEnrollmentProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

