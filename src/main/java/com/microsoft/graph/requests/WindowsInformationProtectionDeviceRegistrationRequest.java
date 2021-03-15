// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Request.
 */
public class WindowsInformationProtectionDeviceRegistrationRequest extends BaseRequest<WindowsInformationProtectionDeviceRegistration> {
	
    /**
     * The request for the WindowsInformationProtectionDeviceRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionDeviceRegistration.class);
    }

    /**
     * Gets the WindowsInformationProtectionDeviceRegistration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsInformationProtectionDeviceRegistration from the service
     *
     * @return the WindowsInformationProtectionDeviceRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionDeviceRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsInformationProtectionDeviceRegistration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsInformationProtectionDeviceRegistration with a source
     *
     * @param sourceWindowsInformationProtectionDeviceRegistration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> patchAsync(@Nonnull final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Patches this WindowsInformationProtectionDeviceRegistration with a source
     *
     * @param sourceWindowsInformationProtectionDeviceRegistration the source object with updates
     * @return the updated WindowsInformationProtectionDeviceRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionDeviceRegistration patch(@Nonnull final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Creates a WindowsInformationProtectionDeviceRegistration with a new object
     *
     * @param newWindowsInformationProtectionDeviceRegistration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> postAsync(@Nonnull final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration) {
        return sendAsync(HttpMethod.POST, newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Creates a WindowsInformationProtectionDeviceRegistration with a new object
     *
     * @param newWindowsInformationProtectionDeviceRegistration the new object to create
     * @return the created WindowsInformationProtectionDeviceRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionDeviceRegistration post(@Nonnull final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Creates a WindowsInformationProtectionDeviceRegistration with a new object
     *
     * @param newWindowsInformationProtectionDeviceRegistration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> putAsync(@Nonnull final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration) {
        return sendAsync(HttpMethod.PUT, newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Creates a WindowsInformationProtectionDeviceRegistration with a new object
     *
     * @param newWindowsInformationProtectionDeviceRegistration the object to create/update
     * @return the created WindowsInformationProtectionDeviceRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionDeviceRegistration put(@Nonnull final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsInformationProtectionDeviceRegistrationRequest select(@Nonnull final String value) {
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
     public WindowsInformationProtectionDeviceRegistrationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

