// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationAssignment;
import com.microsoft.graph.requests.EducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationCategoryRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentResourceRequestBuilder;
import com.microsoft.graph.requests.EducationRubricRequestBuilder;
import com.microsoft.graph.requests.EducationSubmissionCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationSubmissionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Request.
 */
public class EducationAssignmentRequest extends BaseRequest<EducationAssignment> {
	
    /**
     * The request for the EducationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationAssignment.class);
    }

    /**
     * Gets the EducationAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EducationAssignment from the service
     *
     * @return the EducationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EducationAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationAssignment with a source
     *
     * @param sourceEducationAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationAssignment> patchAsync(@Nonnull final EducationAssignment sourceEducationAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceEducationAssignment);
    }

    /**
     * Patches this EducationAssignment with a source
     *
     * @param sourceEducationAssignment the source object with updates
     * @return the updated EducationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationAssignment patch(@Nonnull final EducationAssignment sourceEducationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationAssignment);
    }

    /**
     * Creates a EducationAssignment with a new object
     *
     * @param newEducationAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationAssignment> postAsync(@Nonnull final EducationAssignment newEducationAssignment) {
        return sendAsync(HttpMethod.POST, newEducationAssignment);
    }

    /**
     * Creates a EducationAssignment with a new object
     *
     * @param newEducationAssignment the new object to create
     * @return the created EducationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationAssignment post(@Nonnull final EducationAssignment newEducationAssignment) throws ClientException {
        return send(HttpMethod.POST, newEducationAssignment);
    }

    /**
     * Creates a EducationAssignment with a new object
     *
     * @param newEducationAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationAssignment> putAsync(@Nonnull final EducationAssignment newEducationAssignment) {
        return sendAsync(HttpMethod.PUT, newEducationAssignment);
    }

    /**
     * Creates a EducationAssignment with a new object
     *
     * @param newEducationAssignment the object to create/update
     * @return the created EducationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationAssignment put(@Nonnull final EducationAssignment newEducationAssignment) throws ClientException {
        return send(HttpMethod.PUT, newEducationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EducationAssignmentRequest select(@Nonnull final String value) {
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
     public EducationAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

