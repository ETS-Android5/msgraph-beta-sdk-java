// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosGeneralDeviceConfiguration;
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
 * The class for the Ios General Device Configuration Request.
 */
public class IosGeneralDeviceConfigurationRequest extends BaseRequest<IosGeneralDeviceConfiguration> {
	
    /**
     * The request for the IosGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosGeneralDeviceConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosGeneralDeviceConfiguration.class);
    }

    /**
     * Gets the IosGeneralDeviceConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosGeneralDeviceConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosGeneralDeviceConfiguration from the service
     *
     * @return the IosGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosGeneralDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosGeneralDeviceConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosGeneralDeviceConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosGeneralDeviceConfiguration with a source
     *
     * @param sourceIosGeneralDeviceConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosGeneralDeviceConfiguration> patchAsync(@Nonnull final IosGeneralDeviceConfiguration sourceIosGeneralDeviceConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceIosGeneralDeviceConfiguration);
    }

    /**
     * Patches this IosGeneralDeviceConfiguration with a source
     *
     * @param sourceIosGeneralDeviceConfiguration the source object with updates
     * @return the updated IosGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosGeneralDeviceConfiguration patch(@Nonnull final IosGeneralDeviceConfiguration sourceIosGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosGeneralDeviceConfiguration);
    }

    /**
     * Creates a IosGeneralDeviceConfiguration with a new object
     *
     * @param newIosGeneralDeviceConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosGeneralDeviceConfiguration> postAsync(@Nonnull final IosGeneralDeviceConfiguration newIosGeneralDeviceConfiguration) {
        return sendAsync(HttpMethod.POST, newIosGeneralDeviceConfiguration);
    }

    /**
     * Creates a IosGeneralDeviceConfiguration with a new object
     *
     * @param newIosGeneralDeviceConfiguration the new object to create
     * @return the created IosGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosGeneralDeviceConfiguration post(@Nonnull final IosGeneralDeviceConfiguration newIosGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosGeneralDeviceConfiguration);
    }

    /**
     * Creates a IosGeneralDeviceConfiguration with a new object
     *
     * @param newIosGeneralDeviceConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosGeneralDeviceConfiguration> putAsync(@Nonnull final IosGeneralDeviceConfiguration newIosGeneralDeviceConfiguration) {
        return sendAsync(HttpMethod.PUT, newIosGeneralDeviceConfiguration);
    }

    /**
     * Creates a IosGeneralDeviceConfiguration with a new object
     *
     * @param newIosGeneralDeviceConfiguration the object to create/update
     * @return the created IosGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosGeneralDeviceConfiguration put(@Nonnull final IosGeneralDeviceConfiguration newIosGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosGeneralDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosGeneralDeviceConfigurationRequest select(@Nonnull final String value) {
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
     public IosGeneralDeviceConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

