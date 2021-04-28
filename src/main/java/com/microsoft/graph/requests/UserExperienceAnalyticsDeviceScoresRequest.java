// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsDeviceScores;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Scores Request.
 */
public class UserExperienceAnalyticsDeviceScoresRequest extends BaseRequest<UserExperienceAnalyticsDeviceScores> {
	
    /**
     * The request for the UserExperienceAnalyticsDeviceScores
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsDeviceScoresRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDeviceScores.class);
    }

    /**
     * Gets the UserExperienceAnalyticsDeviceScores from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDeviceScores> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsDeviceScores from the service
     *
     * @return the UserExperienceAnalyticsDeviceScores from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDeviceScores get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDeviceScores> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsDeviceScores delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsDeviceScores with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceScores the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDeviceScores> patchAsync(@Nonnull final UserExperienceAnalyticsDeviceScores sourceUserExperienceAnalyticsDeviceScores) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsDeviceScores);
    }

    /**
     * Patches this UserExperienceAnalyticsDeviceScores with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceScores the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceScores
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDeviceScores patch(@Nonnull final UserExperienceAnalyticsDeviceScores sourceUserExperienceAnalyticsDeviceScores) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsDeviceScores);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceScores with a new object
     *
     * @param newUserExperienceAnalyticsDeviceScores the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDeviceScores> postAsync(@Nonnull final UserExperienceAnalyticsDeviceScores newUserExperienceAnalyticsDeviceScores) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsDeviceScores);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceScores with a new object
     *
     * @param newUserExperienceAnalyticsDeviceScores the new object to create
     * @return the created UserExperienceAnalyticsDeviceScores
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDeviceScores post(@Nonnull final UserExperienceAnalyticsDeviceScores newUserExperienceAnalyticsDeviceScores) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsDeviceScores);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceScores with a new object
     *
     * @param newUserExperienceAnalyticsDeviceScores the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsDeviceScores> putAsync(@Nonnull final UserExperienceAnalyticsDeviceScores newUserExperienceAnalyticsDeviceScores) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsDeviceScores);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceScores with a new object
     *
     * @param newUserExperienceAnalyticsDeviceScores the object to create/update
     * @return the created UserExperienceAnalyticsDeviceScores
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsDeviceScores put(@Nonnull final UserExperienceAnalyticsDeviceScores newUserExperienceAnalyticsDeviceScores) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsDeviceScores);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsDeviceScoresRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsDeviceScoresRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

