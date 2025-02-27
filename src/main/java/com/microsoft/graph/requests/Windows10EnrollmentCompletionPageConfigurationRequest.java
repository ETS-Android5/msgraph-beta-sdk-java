// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10EnrollmentCompletionPageConfiguration;
import com.microsoft.graph.models.EnrollmentConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Enrollment Completion Page Configuration Request.
 */
public class Windows10EnrollmentCompletionPageConfigurationRequest extends BaseRequest<Windows10EnrollmentCompletionPageConfiguration> {
	
    /**
     * The request for the Windows10EnrollmentCompletionPageConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EnrollmentCompletionPageConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EnrollmentCompletionPageConfiguration.class);
    }

    /**
     * Gets the Windows10EnrollmentCompletionPageConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10EnrollmentCompletionPageConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10EnrollmentCompletionPageConfiguration from the service
     *
     * @return the Windows10EnrollmentCompletionPageConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10EnrollmentCompletionPageConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10EnrollmentCompletionPageConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10EnrollmentCompletionPageConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10EnrollmentCompletionPageConfiguration with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10EnrollmentCompletionPageConfiguration> patchAsync(@Nonnull final Windows10EnrollmentCompletionPageConfiguration sourceWindows10EnrollmentCompletionPageConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Patches this Windows10EnrollmentCompletionPageConfiguration with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfiguration the source object with updates
     * @return the updated Windows10EnrollmentCompletionPageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10EnrollmentCompletionPageConfiguration patch(@Nonnull final Windows10EnrollmentCompletionPageConfiguration sourceWindows10EnrollmentCompletionPageConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10EnrollmentCompletionPageConfiguration> postAsync(@Nonnull final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration) {
        return sendAsync(HttpMethod.POST, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the new object to create
     * @return the created Windows10EnrollmentCompletionPageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10EnrollmentCompletionPageConfiguration post(@Nonnull final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10EnrollmentCompletionPageConfiguration> putAsync(@Nonnull final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Creates a Windows10EnrollmentCompletionPageConfiguration with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfiguration the object to create/update
     * @return the created Windows10EnrollmentCompletionPageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10EnrollmentCompletionPageConfiguration put(@Nonnull final Windows10EnrollmentCompletionPageConfiguration newWindows10EnrollmentCompletionPageConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10EnrollmentCompletionPageConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10EnrollmentCompletionPageConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10EnrollmentCompletionPageConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

