// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementIntentSettingCategory;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Setting Category Request.
 */
public class DeviceManagementIntentSettingCategoryRequest extends BaseRequest<DeviceManagementIntentSettingCategory> {
	
    /**
     * The request for the DeviceManagementIntentSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentSettingCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntentSettingCategory.class);
    }

    /**
     * Gets the DeviceManagementIntentSettingCategory from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntentSettingCategory> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementIntentSettingCategory from the service
     *
     * @return the DeviceManagementIntentSettingCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementIntentSettingCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntentSettingCategory> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementIntentSettingCategory delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementIntentSettingCategory with a source
     *
     * @param sourceDeviceManagementIntentSettingCategory the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntentSettingCategory> patchAsync(@Nonnull final DeviceManagementIntentSettingCategory sourceDeviceManagementIntentSettingCategory) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementIntentSettingCategory);
    }

    /**
     * Patches this DeviceManagementIntentSettingCategory with a source
     *
     * @param sourceDeviceManagementIntentSettingCategory the source object with updates
     * @return the updated DeviceManagementIntentSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementIntentSettingCategory patch(@Nonnull final DeviceManagementIntentSettingCategory sourceDeviceManagementIntentSettingCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementIntentSettingCategory);
    }

    /**
     * Creates a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntentSettingCategory> postAsync(@Nonnull final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) {
        return sendAsync(HttpMethod.POST, newDeviceManagementIntentSettingCategory);
    }

    /**
     * Creates a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the new object to create
     * @return the created DeviceManagementIntentSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementIntentSettingCategory post(@Nonnull final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementIntentSettingCategory);
    }

    /**
     * Creates a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementIntentSettingCategory> putAsync(@Nonnull final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementIntentSettingCategory);
    }

    /**
     * Creates a DeviceManagementIntentSettingCategory with a new object
     *
     * @param newDeviceManagementIntentSettingCategory the object to create/update
     * @return the created DeviceManagementIntentSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementIntentSettingCategory put(@Nonnull final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementIntentSettingCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementIntentSettingCategoryRequest select(@Nonnull final String value) {
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
     public DeviceManagementIntentSettingCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

