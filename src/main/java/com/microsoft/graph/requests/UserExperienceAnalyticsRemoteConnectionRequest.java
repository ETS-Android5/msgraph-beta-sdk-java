// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsRemoteConnection;
import com.microsoft.graph.models.UserExperienceAnalyticsSummarizedBy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Remote Connection Request.
 */
public class UserExperienceAnalyticsRemoteConnectionRequest extends BaseRequest<UserExperienceAnalyticsRemoteConnection> {
	
    /**
     * The request for the UserExperienceAnalyticsRemoteConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsRemoteConnectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsRemoteConnection.class);
    }

    /**
     * Gets the UserExperienceAnalyticsRemoteConnection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRemoteConnection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsRemoteConnection from the service
     *
     * @return the UserExperienceAnalyticsRemoteConnection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRemoteConnection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRemoteConnection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsRemoteConnection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsRemoteConnection with a source
     *
     * @param sourceUserExperienceAnalyticsRemoteConnection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRemoteConnection> patchAsync(@Nonnull final UserExperienceAnalyticsRemoteConnection sourceUserExperienceAnalyticsRemoteConnection) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsRemoteConnection);
    }

    /**
     * Patches this UserExperienceAnalyticsRemoteConnection with a source
     *
     * @param sourceUserExperienceAnalyticsRemoteConnection the source object with updates
     * @return the updated UserExperienceAnalyticsRemoteConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRemoteConnection patch(@Nonnull final UserExperienceAnalyticsRemoteConnection sourceUserExperienceAnalyticsRemoteConnection) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsRemoteConnection);
    }

    /**
     * Creates a UserExperienceAnalyticsRemoteConnection with a new object
     *
     * @param newUserExperienceAnalyticsRemoteConnection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRemoteConnection> postAsync(@Nonnull final UserExperienceAnalyticsRemoteConnection newUserExperienceAnalyticsRemoteConnection) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsRemoteConnection);
    }

    /**
     * Creates a UserExperienceAnalyticsRemoteConnection with a new object
     *
     * @param newUserExperienceAnalyticsRemoteConnection the new object to create
     * @return the created UserExperienceAnalyticsRemoteConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRemoteConnection post(@Nonnull final UserExperienceAnalyticsRemoteConnection newUserExperienceAnalyticsRemoteConnection) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsRemoteConnection);
    }

    /**
     * Creates a UserExperienceAnalyticsRemoteConnection with a new object
     *
     * @param newUserExperienceAnalyticsRemoteConnection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsRemoteConnection> putAsync(@Nonnull final UserExperienceAnalyticsRemoteConnection newUserExperienceAnalyticsRemoteConnection) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsRemoteConnection);
    }

    /**
     * Creates a UserExperienceAnalyticsRemoteConnection with a new object
     *
     * @param newUserExperienceAnalyticsRemoteConnection the object to create/update
     * @return the created UserExperienceAnalyticsRemoteConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsRemoteConnection put(@Nonnull final UserExperienceAnalyticsRemoteConnection newUserExperienceAnalyticsRemoteConnection) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsRemoteConnection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsRemoteConnectionRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsRemoteConnectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

