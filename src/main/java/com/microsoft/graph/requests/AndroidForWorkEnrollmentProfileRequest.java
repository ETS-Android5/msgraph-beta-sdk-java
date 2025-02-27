// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidForWorkEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Enrollment Profile Request.
 */
public class AndroidForWorkEnrollmentProfileRequest extends BaseRequest<AndroidForWorkEnrollmentProfile> {
	
    /**
     * The request for the AndroidForWorkEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkEnrollmentProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkEnrollmentProfile.class);
    }

    /**
     * Gets the AndroidForWorkEnrollmentProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkEnrollmentProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidForWorkEnrollmentProfile from the service
     *
     * @return the AndroidForWorkEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkEnrollmentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkEnrollmentProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidForWorkEnrollmentProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidForWorkEnrollmentProfile with a source
     *
     * @param sourceAndroidForWorkEnrollmentProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkEnrollmentProfile> patchAsync(@Nonnull final AndroidForWorkEnrollmentProfile sourceAndroidForWorkEnrollmentProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidForWorkEnrollmentProfile);
    }

    /**
     * Patches this AndroidForWorkEnrollmentProfile with a source
     *
     * @param sourceAndroidForWorkEnrollmentProfile the source object with updates
     * @return the updated AndroidForWorkEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkEnrollmentProfile patch(@Nonnull final AndroidForWorkEnrollmentProfile sourceAndroidForWorkEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkEnrollmentProfile);
    }

    /**
     * Creates a AndroidForWorkEnrollmentProfile with a new object
     *
     * @param newAndroidForWorkEnrollmentProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkEnrollmentProfile> postAsync(@Nonnull final AndroidForWorkEnrollmentProfile newAndroidForWorkEnrollmentProfile) {
        return sendAsync(HttpMethod.POST, newAndroidForWorkEnrollmentProfile);
    }

    /**
     * Creates a AndroidForWorkEnrollmentProfile with a new object
     *
     * @param newAndroidForWorkEnrollmentProfile the new object to create
     * @return the created AndroidForWorkEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkEnrollmentProfile post(@Nonnull final AndroidForWorkEnrollmentProfile newAndroidForWorkEnrollmentProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkEnrollmentProfile);
    }

    /**
     * Creates a AndroidForWorkEnrollmentProfile with a new object
     *
     * @param newAndroidForWorkEnrollmentProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidForWorkEnrollmentProfile> putAsync(@Nonnull final AndroidForWorkEnrollmentProfile newAndroidForWorkEnrollmentProfile) {
        return sendAsync(HttpMethod.PUT, newAndroidForWorkEnrollmentProfile);
    }

    /**
     * Creates a AndroidForWorkEnrollmentProfile with a new object
     *
     * @param newAndroidForWorkEnrollmentProfile the object to create/update
     * @return the created AndroidForWorkEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidForWorkEnrollmentProfile put(@Nonnull final AndroidForWorkEnrollmentProfile newAndroidForWorkEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkEnrollmentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidForWorkEnrollmentProfileRequest select(@Nonnull final String value) {
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
     public AndroidForWorkEnrollmentProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

