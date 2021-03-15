// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidDeviceComplianceLocalActionLockDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Compliance Local Action Lock Device Request.
 */
public class AndroidDeviceComplianceLocalActionLockDeviceRequest extends BaseRequest<AndroidDeviceComplianceLocalActionLockDevice> {
	
    /**
     * The request for the AndroidDeviceComplianceLocalActionLockDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceComplianceLocalActionLockDeviceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceComplianceLocalActionLockDevice.class);
    }

    /**
     * Gets the AndroidDeviceComplianceLocalActionLockDevice from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceComplianceLocalActionLockDevice> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidDeviceComplianceLocalActionLockDevice from the service
     *
     * @return the AndroidDeviceComplianceLocalActionLockDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDevice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceComplianceLocalActionLockDevice> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDevice delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidDeviceComplianceLocalActionLockDevice with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionLockDevice the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceComplianceLocalActionLockDevice> patchAsync(@Nonnull final AndroidDeviceComplianceLocalActionLockDevice sourceAndroidDeviceComplianceLocalActionLockDevice) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidDeviceComplianceLocalActionLockDevice);
    }

    /**
     * Patches this AndroidDeviceComplianceLocalActionLockDevice with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionLockDevice the source object with updates
     * @return the updated AndroidDeviceComplianceLocalActionLockDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDevice patch(@Nonnull final AndroidDeviceComplianceLocalActionLockDevice sourceAndroidDeviceComplianceLocalActionLockDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceComplianceLocalActionLockDevice);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDevice with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDevice the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceComplianceLocalActionLockDevice> postAsync(@Nonnull final AndroidDeviceComplianceLocalActionLockDevice newAndroidDeviceComplianceLocalActionLockDevice) {
        return sendAsync(HttpMethod.POST, newAndroidDeviceComplianceLocalActionLockDevice);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDevice with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDevice the new object to create
     * @return the created AndroidDeviceComplianceLocalActionLockDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDevice post(@Nonnull final AndroidDeviceComplianceLocalActionLockDevice newAndroidDeviceComplianceLocalActionLockDevice) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceComplianceLocalActionLockDevice);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDevice with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDevice the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidDeviceComplianceLocalActionLockDevice> putAsync(@Nonnull final AndroidDeviceComplianceLocalActionLockDevice newAndroidDeviceComplianceLocalActionLockDevice) {
        return sendAsync(HttpMethod.PUT, newAndroidDeviceComplianceLocalActionLockDevice);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionLockDevice with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionLockDevice the object to create/update
     * @return the created AndroidDeviceComplianceLocalActionLockDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidDeviceComplianceLocalActionLockDevice put(@Nonnull final AndroidDeviceComplianceLocalActionLockDevice newAndroidDeviceComplianceLocalActionLockDevice) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceComplianceLocalActionLockDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidDeviceComplianceLocalActionLockDeviceRequest select(@Nonnull final String value) {
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
     public AndroidDeviceComplianceLocalActionLockDeviceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

