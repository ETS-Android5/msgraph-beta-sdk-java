// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AppleUserInitiatedEnrollmentProfile;
import com.microsoft.graph.requests.AppleEnrollmentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AppleEnrollmentProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple User Initiated Enrollment Profile Request.
 */
public class AppleUserInitiatedEnrollmentProfileRequest extends BaseRequest<AppleUserInitiatedEnrollmentProfile> {
	
    /**
     * The request for the AppleUserInitiatedEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleUserInitiatedEnrollmentProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleUserInitiatedEnrollmentProfile.class);
    }

    /**
     * Gets the AppleUserInitiatedEnrollmentProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleUserInitiatedEnrollmentProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AppleUserInitiatedEnrollmentProfile from the service
     *
     * @return the AppleUserInitiatedEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleUserInitiatedEnrollmentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleUserInitiatedEnrollmentProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AppleUserInitiatedEnrollmentProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AppleUserInitiatedEnrollmentProfile with a source
     *
     * @param sourceAppleUserInitiatedEnrollmentProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleUserInitiatedEnrollmentProfile> patchAsync(@Nonnull final AppleUserInitiatedEnrollmentProfile sourceAppleUserInitiatedEnrollmentProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Patches this AppleUserInitiatedEnrollmentProfile with a source
     *
     * @param sourceAppleUserInitiatedEnrollmentProfile the source object with updates
     * @return the updated AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleUserInitiatedEnrollmentProfile patch(@Nonnull final AppleUserInitiatedEnrollmentProfile sourceAppleUserInitiatedEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleUserInitiatedEnrollmentProfile> postAsync(@Nonnull final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) {
        return sendAsync(HttpMethod.POST, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the new object to create
     * @return the created AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleUserInitiatedEnrollmentProfile post(@Nonnull final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException {
        return send(HttpMethod.POST, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleUserInitiatedEnrollmentProfile> putAsync(@Nonnull final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) {
        return sendAsync(HttpMethod.PUT, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the object to create/update
     * @return the created AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleUserInitiatedEnrollmentProfile put(@Nonnull final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PUT, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AppleUserInitiatedEnrollmentProfileRequest select(@Nonnull final String value) {
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
     public AppleUserInitiatedEnrollmentProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

