// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AppleEnrollmentProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Enrollment Profile Assignment Request.
 */
public class AppleEnrollmentProfileAssignmentRequest extends BaseRequest<AppleEnrollmentProfileAssignment> {
	
    /**
     * The request for the AppleEnrollmentProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleEnrollmentProfileAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleEnrollmentProfileAssignment.class);
    }

    /**
     * Gets the AppleEnrollmentProfileAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleEnrollmentProfileAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AppleEnrollmentProfileAssignment from the service
     *
     * @return the AppleEnrollmentProfileAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleEnrollmentProfileAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleEnrollmentProfileAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AppleEnrollmentProfileAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AppleEnrollmentProfileAssignment with a source
     *
     * @param sourceAppleEnrollmentProfileAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleEnrollmentProfileAssignment> patchAsync(@Nonnull final AppleEnrollmentProfileAssignment sourceAppleEnrollmentProfileAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceAppleEnrollmentProfileAssignment);
    }

    /**
     * Patches this AppleEnrollmentProfileAssignment with a source
     *
     * @param sourceAppleEnrollmentProfileAssignment the source object with updates
     * @return the updated AppleEnrollmentProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleEnrollmentProfileAssignment patch(@Nonnull final AppleEnrollmentProfileAssignment sourceAppleEnrollmentProfileAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppleEnrollmentProfileAssignment);
    }

    /**
     * Creates a AppleEnrollmentProfileAssignment with a new object
     *
     * @param newAppleEnrollmentProfileAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleEnrollmentProfileAssignment> postAsync(@Nonnull final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) {
        return sendAsync(HttpMethod.POST, newAppleEnrollmentProfileAssignment);
    }

    /**
     * Creates a AppleEnrollmentProfileAssignment with a new object
     *
     * @param newAppleEnrollmentProfileAssignment the new object to create
     * @return the created AppleEnrollmentProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleEnrollmentProfileAssignment post(@Nonnull final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) throws ClientException {
        return send(HttpMethod.POST, newAppleEnrollmentProfileAssignment);
    }

    /**
     * Creates a AppleEnrollmentProfileAssignment with a new object
     *
     * @param newAppleEnrollmentProfileAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleEnrollmentProfileAssignment> putAsync(@Nonnull final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) {
        return sendAsync(HttpMethod.PUT, newAppleEnrollmentProfileAssignment);
    }

    /**
     * Creates a AppleEnrollmentProfileAssignment with a new object
     *
     * @param newAppleEnrollmentProfileAssignment the object to create/update
     * @return the created AppleEnrollmentProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleEnrollmentProfileAssignment put(@Nonnull final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) throws ClientException {
        return send(HttpMethod.PUT, newAppleEnrollmentProfileAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AppleEnrollmentProfileAssignmentRequest select(@Nonnull final String value) {
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
     public AppleEnrollmentProfileAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

