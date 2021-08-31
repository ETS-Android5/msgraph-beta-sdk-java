// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10XVpnConfiguration;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileAssignment;
import com.microsoft.graph.models.PolicyPlatformType;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10XVpn Configuration Request.
 */
public class Windows10XVpnConfigurationRequest extends BaseRequest<Windows10XVpnConfiguration> {
	
    /**
     * The request for the Windows10XVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10XVpnConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10XVpnConfiguration.class);
    }

    /**
     * Gets the Windows10XVpnConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XVpnConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10XVpnConfiguration from the service
     *
     * @return the Windows10XVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XVpnConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10XVpnConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10XVpnConfiguration with a source
     *
     * @param sourceWindows10XVpnConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XVpnConfiguration> patchAsync(@Nonnull final Windows10XVpnConfiguration sourceWindows10XVpnConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindows10XVpnConfiguration);
    }

    /**
     * Patches this Windows10XVpnConfiguration with a source
     *
     * @param sourceWindows10XVpnConfiguration the source object with updates
     * @return the updated Windows10XVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XVpnConfiguration patch(@Nonnull final Windows10XVpnConfiguration sourceWindows10XVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10XVpnConfiguration);
    }

    /**
     * Creates a Windows10XVpnConfiguration with a new object
     *
     * @param newWindows10XVpnConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XVpnConfiguration> postAsync(@Nonnull final Windows10XVpnConfiguration newWindows10XVpnConfiguration) {
        return sendAsync(HttpMethod.POST, newWindows10XVpnConfiguration);
    }

    /**
     * Creates a Windows10XVpnConfiguration with a new object
     *
     * @param newWindows10XVpnConfiguration the new object to create
     * @return the created Windows10XVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XVpnConfiguration post(@Nonnull final Windows10XVpnConfiguration newWindows10XVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10XVpnConfiguration);
    }

    /**
     * Creates a Windows10XVpnConfiguration with a new object
     *
     * @param newWindows10XVpnConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XVpnConfiguration> putAsync(@Nonnull final Windows10XVpnConfiguration newWindows10XVpnConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindows10XVpnConfiguration);
    }

    /**
     * Creates a Windows10XVpnConfiguration with a new object
     *
     * @param newWindows10XVpnConfiguration the object to create/update
     * @return the created Windows10XVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XVpnConfiguration put(@Nonnull final Windows10XVpnConfiguration newWindows10XVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10XVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10XVpnConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10XVpnConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

