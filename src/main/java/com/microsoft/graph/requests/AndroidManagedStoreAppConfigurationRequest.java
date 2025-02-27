// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidManagedStoreAppConfiguration;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store App Configuration Request.
 */
public class AndroidManagedStoreAppConfigurationRequest extends BaseRequest<AndroidManagedStoreAppConfiguration> {
	
    /**
     * The request for the AndroidManagedStoreAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedStoreAppConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedStoreAppConfiguration.class);
    }

    /**
     * Gets the AndroidManagedStoreAppConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAppConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidManagedStoreAppConfiguration from the service
     *
     * @return the AndroidManagedStoreAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedStoreAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAppConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidManagedStoreAppConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidManagedStoreAppConfiguration with a source
     *
     * @param sourceAndroidManagedStoreAppConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAppConfiguration> patchAsync(@Nonnull final AndroidManagedStoreAppConfiguration sourceAndroidManagedStoreAppConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidManagedStoreAppConfiguration);
    }

    /**
     * Patches this AndroidManagedStoreAppConfiguration with a source
     *
     * @param sourceAndroidManagedStoreAppConfiguration the source object with updates
     * @return the updated AndroidManagedStoreAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedStoreAppConfiguration patch(@Nonnull final AndroidManagedStoreAppConfiguration sourceAndroidManagedStoreAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidManagedStoreAppConfiguration);
    }

    /**
     * Creates a AndroidManagedStoreAppConfiguration with a new object
     *
     * @param newAndroidManagedStoreAppConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAppConfiguration> postAsync(@Nonnull final AndroidManagedStoreAppConfiguration newAndroidManagedStoreAppConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidManagedStoreAppConfiguration);
    }

    /**
     * Creates a AndroidManagedStoreAppConfiguration with a new object
     *
     * @param newAndroidManagedStoreAppConfiguration the new object to create
     * @return the created AndroidManagedStoreAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedStoreAppConfiguration post(@Nonnull final AndroidManagedStoreAppConfiguration newAndroidManagedStoreAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidManagedStoreAppConfiguration);
    }

    /**
     * Creates a AndroidManagedStoreAppConfiguration with a new object
     *
     * @param newAndroidManagedStoreAppConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidManagedStoreAppConfiguration> putAsync(@Nonnull final AndroidManagedStoreAppConfiguration newAndroidManagedStoreAppConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidManagedStoreAppConfiguration);
    }

    /**
     * Creates a AndroidManagedStoreAppConfiguration with a new object
     *
     * @param newAndroidManagedStoreAppConfiguration the object to create/update
     * @return the created AndroidManagedStoreAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidManagedStoreAppConfiguration put(@Nonnull final AndroidManagedStoreAppConfiguration newAndroidManagedStoreAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidManagedStoreAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidManagedStoreAppConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidManagedStoreAppConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

