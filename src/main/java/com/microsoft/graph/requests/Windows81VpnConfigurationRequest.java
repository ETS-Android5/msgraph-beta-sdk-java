// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows81VpnConfiguration;
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
 * The class for the Windows81Vpn Configuration Request.
 */
public class Windows81VpnConfigurationRequest extends BaseRequest<Windows81VpnConfiguration> {
	
    /**
     * The request for the Windows81VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public Windows81VpnConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends Windows81VpnConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Windows81VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81VpnConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81VpnConfiguration.class);
    }

    /**
     * Gets the Windows81VpnConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows81VpnConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows81VpnConfiguration from the service
     *
     * @return the Windows81VpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows81VpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows81VpnConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows81VpnConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows81VpnConfiguration with a source
     *
     * @param sourceWindows81VpnConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows81VpnConfiguration> patchAsync(@Nonnull final Windows81VpnConfiguration sourceWindows81VpnConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindows81VpnConfiguration);
    }

    /**
     * Patches this Windows81VpnConfiguration with a source
     *
     * @param sourceWindows81VpnConfiguration the source object with updates
     * @return the updated Windows81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows81VpnConfiguration patch(@Nonnull final Windows81VpnConfiguration sourceWindows81VpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows81VpnConfiguration);
    }

    /**
     * Creates a Windows81VpnConfiguration with a new object
     *
     * @param newWindows81VpnConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows81VpnConfiguration> postAsync(@Nonnull final Windows81VpnConfiguration newWindows81VpnConfiguration) {
        return sendAsync(HttpMethod.POST, newWindows81VpnConfiguration);
    }

    /**
     * Creates a Windows81VpnConfiguration with a new object
     *
     * @param newWindows81VpnConfiguration the new object to create
     * @return the created Windows81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows81VpnConfiguration post(@Nonnull final Windows81VpnConfiguration newWindows81VpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows81VpnConfiguration);
    }

    /**
     * Creates a Windows81VpnConfiguration with a new object
     *
     * @param newWindows81VpnConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows81VpnConfiguration> putAsync(@Nonnull final Windows81VpnConfiguration newWindows81VpnConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindows81VpnConfiguration);
    }

    /**
     * Creates a Windows81VpnConfiguration with a new object
     *
     * @param newWindows81VpnConfiguration the object to create/update
     * @return the created Windows81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows81VpnConfiguration put(@Nonnull final Windows81VpnConfiguration newWindows81VpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows81VpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows81VpnConfigurationRequest select(@Nonnull final String value) {
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
     public Windows81VpnConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

