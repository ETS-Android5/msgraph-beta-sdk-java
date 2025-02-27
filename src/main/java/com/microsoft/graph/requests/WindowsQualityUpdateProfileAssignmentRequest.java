// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsQualityUpdateProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Assignment Request.
 */
public class WindowsQualityUpdateProfileAssignmentRequest extends BaseRequest<WindowsQualityUpdateProfileAssignment> {
	
    /**
     * The request for the WindowsQualityUpdateProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsQualityUpdateProfileAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsQualityUpdateProfileAssignment.class);
    }

    /**
     * Gets the WindowsQualityUpdateProfileAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsQualityUpdateProfileAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsQualityUpdateProfileAssignment from the service
     *
     * @return the WindowsQualityUpdateProfileAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsQualityUpdateProfileAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsQualityUpdateProfileAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsQualityUpdateProfileAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsQualityUpdateProfileAssignment with a source
     *
     * @param sourceWindowsQualityUpdateProfileAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsQualityUpdateProfileAssignment> patchAsync(@Nonnull final WindowsQualityUpdateProfileAssignment sourceWindowsQualityUpdateProfileAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Patches this WindowsQualityUpdateProfileAssignment with a source
     *
     * @param sourceWindowsQualityUpdateProfileAssignment the source object with updates
     * @return the updated WindowsQualityUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsQualityUpdateProfileAssignment patch(@Nonnull final WindowsQualityUpdateProfileAssignment sourceWindowsQualityUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsQualityUpdateProfileAssignment> postAsync(@Nonnull final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment) {
        return sendAsync(HttpMethod.POST, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the new object to create
     * @return the created WindowsQualityUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsQualityUpdateProfileAssignment post(@Nonnull final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.POST, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsQualityUpdateProfileAssignment> putAsync(@Nonnull final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment) {
        return sendAsync(HttpMethod.PUT, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the object to create/update
     * @return the created WindowsQualityUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsQualityUpdateProfileAssignment put(@Nonnull final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.PUT, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsQualityUpdateProfileAssignmentRequest select(@Nonnull final String value) {
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
     public WindowsQualityUpdateProfileAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

