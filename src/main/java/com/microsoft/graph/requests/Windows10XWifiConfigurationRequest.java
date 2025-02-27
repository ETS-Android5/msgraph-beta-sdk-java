// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10XWifiConfiguration;
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
 * The class for the Windows10XWifi Configuration Request.
 */
public class Windows10XWifiConfigurationRequest extends BaseRequest<Windows10XWifiConfiguration> {
	
    /**
     * The request for the Windows10XWifiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10XWifiConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10XWifiConfiguration.class);
    }

    /**
     * Gets the Windows10XWifiConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XWifiConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10XWifiConfiguration from the service
     *
     * @return the Windows10XWifiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XWifiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XWifiConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10XWifiConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10XWifiConfiguration with a source
     *
     * @param sourceWindows10XWifiConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XWifiConfiguration> patchAsync(@Nonnull final Windows10XWifiConfiguration sourceWindows10XWifiConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindows10XWifiConfiguration);
    }

    /**
     * Patches this Windows10XWifiConfiguration with a source
     *
     * @param sourceWindows10XWifiConfiguration the source object with updates
     * @return the updated Windows10XWifiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XWifiConfiguration patch(@Nonnull final Windows10XWifiConfiguration sourceWindows10XWifiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10XWifiConfiguration);
    }

    /**
     * Creates a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XWifiConfiguration> postAsync(@Nonnull final Windows10XWifiConfiguration newWindows10XWifiConfiguration) {
        return sendAsync(HttpMethod.POST, newWindows10XWifiConfiguration);
    }

    /**
     * Creates a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the new object to create
     * @return the created Windows10XWifiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XWifiConfiguration post(@Nonnull final Windows10XWifiConfiguration newWindows10XWifiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10XWifiConfiguration);
    }

    /**
     * Creates a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10XWifiConfiguration> putAsync(@Nonnull final Windows10XWifiConfiguration newWindows10XWifiConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindows10XWifiConfiguration);
    }

    /**
     * Creates a Windows10XWifiConfiguration with a new object
     *
     * @param newWindows10XWifiConfiguration the object to create/update
     * @return the created Windows10XWifiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10XWifiConfiguration put(@Nonnull final Windows10XWifiConfiguration newWindows10XWifiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10XWifiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10XWifiConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10XWifiConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

