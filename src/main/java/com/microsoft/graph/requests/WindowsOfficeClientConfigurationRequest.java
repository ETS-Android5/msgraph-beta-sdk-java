// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsOfficeClientConfiguration;
import com.microsoft.graph.models.OfficeClientConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Office Client Configuration Request.
 */
public class WindowsOfficeClientConfigurationRequest extends BaseRequest<WindowsOfficeClientConfiguration> {
	
    /**
     * The request for the WindowsOfficeClientConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsOfficeClientConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsOfficeClientConfiguration.class);
    }

    /**
     * Gets the WindowsOfficeClientConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsOfficeClientConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsOfficeClientConfiguration from the service
     *
     * @return the WindowsOfficeClientConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsOfficeClientConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsOfficeClientConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsOfficeClientConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsOfficeClientConfiguration with a source
     *
     * @param sourceWindowsOfficeClientConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsOfficeClientConfiguration> patchAsync(@Nonnull final WindowsOfficeClientConfiguration sourceWindowsOfficeClientConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsOfficeClientConfiguration);
    }

    /**
     * Patches this WindowsOfficeClientConfiguration with a source
     *
     * @param sourceWindowsOfficeClientConfiguration the source object with updates
     * @return the updated WindowsOfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsOfficeClientConfiguration patch(@Nonnull final WindowsOfficeClientConfiguration sourceWindowsOfficeClientConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsOfficeClientConfiguration> postAsync(@Nonnull final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration) {
        return sendAsync(HttpMethod.POST, newWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the new object to create
     * @return the created WindowsOfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsOfficeClientConfiguration post(@Nonnull final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsOfficeClientConfiguration> putAsync(@Nonnull final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the object to create/update
     * @return the created WindowsOfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsOfficeClientConfiguration put(@Nonnull final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsOfficeClientConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsOfficeClientConfigurationRequest select(@Nonnull final String value) {
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
     public WindowsOfficeClientConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

