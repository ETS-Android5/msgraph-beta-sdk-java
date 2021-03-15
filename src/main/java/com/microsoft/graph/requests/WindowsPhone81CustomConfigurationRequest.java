// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsPhone81CustomConfiguration;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Custom Configuration Request.
 */
public class WindowsPhone81CustomConfigurationRequest extends BaseRequest<WindowsPhone81CustomConfiguration> {
	
    /**
     * The request for the WindowsPhone81CustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CustomConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81CustomConfiguration.class);
    }

    /**
     * Gets the WindowsPhone81CustomConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CustomConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsPhone81CustomConfiguration from the service
     *
     * @return the WindowsPhone81CustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CustomConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsPhone81CustomConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsPhone81CustomConfiguration with a source
     *
     * @param sourceWindowsPhone81CustomConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CustomConfiguration> patchAsync(@Nonnull final WindowsPhone81CustomConfiguration sourceWindowsPhone81CustomConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsPhone81CustomConfiguration);
    }

    /**
     * Patches this WindowsPhone81CustomConfiguration with a source
     *
     * @param sourceWindowsPhone81CustomConfiguration the source object with updates
     * @return the updated WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CustomConfiguration patch(@Nonnull final WindowsPhone81CustomConfiguration sourceWindowsPhone81CustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CustomConfiguration> postAsync(@Nonnull final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) {
        return sendAsync(HttpMethod.POST, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the new object to create
     * @return the created WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CustomConfiguration post(@Nonnull final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsPhone81CustomConfiguration> putAsync(@Nonnull final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the object to create/update
     * @return the created WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPhone81CustomConfiguration put(@Nonnull final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsPhone81CustomConfigurationRequest select(@Nonnull final String value) {
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
     public WindowsPhone81CustomConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

