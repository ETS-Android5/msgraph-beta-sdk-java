// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsNotAutopilotReadyDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Not Autopilot Ready Device Request.
 */
public class UserExperienceAnalyticsNotAutopilotReadyDeviceRequest extends BaseRequest<UserExperienceAnalyticsNotAutopilotReadyDevice> {
	
    /**
     * The request for the UserExperienceAnalyticsNotAutopilotReadyDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsNotAutopilotReadyDeviceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsNotAutopilotReadyDevice.class);
    }

    /**
     * Gets the UserExperienceAnalyticsNotAutopilotReadyDevice from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsNotAutopilotReadyDevice> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsNotAutopilotReadyDevice from the service
     *
     * @return the UserExperienceAnalyticsNotAutopilotReadyDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsNotAutopilotReadyDevice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsNotAutopilotReadyDevice> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsNotAutopilotReadyDevice delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsNotAutopilotReadyDevice with a source
     *
     * @param sourceUserExperienceAnalyticsNotAutopilotReadyDevice the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsNotAutopilotReadyDevice> patchAsync(@Nonnull final UserExperienceAnalyticsNotAutopilotReadyDevice sourceUserExperienceAnalyticsNotAutopilotReadyDevice) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsNotAutopilotReadyDevice);
    }

    /**
     * Patches this UserExperienceAnalyticsNotAutopilotReadyDevice with a source
     *
     * @param sourceUserExperienceAnalyticsNotAutopilotReadyDevice the source object with updates
     * @return the updated UserExperienceAnalyticsNotAutopilotReadyDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsNotAutopilotReadyDevice patch(@Nonnull final UserExperienceAnalyticsNotAutopilotReadyDevice sourceUserExperienceAnalyticsNotAutopilotReadyDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsNotAutopilotReadyDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsNotAutopilotReadyDevice with a new object
     *
     * @param newUserExperienceAnalyticsNotAutopilotReadyDevice the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsNotAutopilotReadyDevice> postAsync(@Nonnull final UserExperienceAnalyticsNotAutopilotReadyDevice newUserExperienceAnalyticsNotAutopilotReadyDevice) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsNotAutopilotReadyDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsNotAutopilotReadyDevice with a new object
     *
     * @param newUserExperienceAnalyticsNotAutopilotReadyDevice the new object to create
     * @return the created UserExperienceAnalyticsNotAutopilotReadyDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsNotAutopilotReadyDevice post(@Nonnull final UserExperienceAnalyticsNotAutopilotReadyDevice newUserExperienceAnalyticsNotAutopilotReadyDevice) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsNotAutopilotReadyDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsNotAutopilotReadyDevice with a new object
     *
     * @param newUserExperienceAnalyticsNotAutopilotReadyDevice the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsNotAutopilotReadyDevice> putAsync(@Nonnull final UserExperienceAnalyticsNotAutopilotReadyDevice newUserExperienceAnalyticsNotAutopilotReadyDevice) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsNotAutopilotReadyDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsNotAutopilotReadyDevice with a new object
     *
     * @param newUserExperienceAnalyticsNotAutopilotReadyDevice the object to create/update
     * @return the created UserExperienceAnalyticsNotAutopilotReadyDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsNotAutopilotReadyDevice put(@Nonnull final UserExperienceAnalyticsNotAutopilotReadyDevice newUserExperienceAnalyticsNotAutopilotReadyDevice) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsNotAutopilotReadyDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsNotAutopilotReadyDeviceRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsNotAutopilotReadyDeviceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

