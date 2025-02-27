// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidOmaCpConfiguration;
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
 * The class for the Android Oma Cp Configuration Request.
 */
public class AndroidOmaCpConfigurationRequest extends BaseRequest<AndroidOmaCpConfiguration> {
	
    /**
     * The request for the AndroidOmaCpConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidOmaCpConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidOmaCpConfiguration.class);
    }

    /**
     * Gets the AndroidOmaCpConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidOmaCpConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidOmaCpConfiguration from the service
     *
     * @return the AndroidOmaCpConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidOmaCpConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidOmaCpConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidOmaCpConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidOmaCpConfiguration with a source
     *
     * @param sourceAndroidOmaCpConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidOmaCpConfiguration> patchAsync(@Nonnull final AndroidOmaCpConfiguration sourceAndroidOmaCpConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidOmaCpConfiguration);
    }

    /**
     * Patches this AndroidOmaCpConfiguration with a source
     *
     * @param sourceAndroidOmaCpConfiguration the source object with updates
     * @return the updated AndroidOmaCpConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidOmaCpConfiguration patch(@Nonnull final AndroidOmaCpConfiguration sourceAndroidOmaCpConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidOmaCpConfiguration);
    }

    /**
     * Creates a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidOmaCpConfiguration> postAsync(@Nonnull final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration) {
        return sendAsync(HttpMethod.POST, newAndroidOmaCpConfiguration);
    }

    /**
     * Creates a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the new object to create
     * @return the created AndroidOmaCpConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidOmaCpConfiguration post(@Nonnull final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidOmaCpConfiguration);
    }

    /**
     * Creates a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidOmaCpConfiguration> putAsync(@Nonnull final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration) {
        return sendAsync(HttpMethod.PUT, newAndroidOmaCpConfiguration);
    }

    /**
     * Creates a AndroidOmaCpConfiguration with a new object
     *
     * @param newAndroidOmaCpConfiguration the object to create/update
     * @return the created AndroidOmaCpConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidOmaCpConfiguration put(@Nonnull final AndroidOmaCpConfiguration newAndroidOmaCpConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidOmaCpConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidOmaCpConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidOmaCpConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

