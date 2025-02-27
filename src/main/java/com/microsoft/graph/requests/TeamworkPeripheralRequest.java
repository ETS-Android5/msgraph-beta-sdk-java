// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamworkPeripheral;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Peripheral Request.
 */
public class TeamworkPeripheralRequest extends BaseRequest<TeamworkPeripheral> {
	
    /**
     * The request for the TeamworkPeripheral
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkPeripheralRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamworkPeripheral.class);
    }

    /**
     * Gets the TeamworkPeripheral from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamworkPeripheral> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamworkPeripheral from the service
     *
     * @return the TeamworkPeripheral from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamworkPeripheral get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamworkPeripheral> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamworkPeripheral delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamworkPeripheral with a source
     *
     * @param sourceTeamworkPeripheral the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamworkPeripheral> patchAsync(@Nonnull final TeamworkPeripheral sourceTeamworkPeripheral) {
        return sendAsync(HttpMethod.PATCH, sourceTeamworkPeripheral);
    }

    /**
     * Patches this TeamworkPeripheral with a source
     *
     * @param sourceTeamworkPeripheral the source object with updates
     * @return the updated TeamworkPeripheral
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamworkPeripheral patch(@Nonnull final TeamworkPeripheral sourceTeamworkPeripheral) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamworkPeripheral);
    }

    /**
     * Creates a TeamworkPeripheral with a new object
     *
     * @param newTeamworkPeripheral the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamworkPeripheral> postAsync(@Nonnull final TeamworkPeripheral newTeamworkPeripheral) {
        return sendAsync(HttpMethod.POST, newTeamworkPeripheral);
    }

    /**
     * Creates a TeamworkPeripheral with a new object
     *
     * @param newTeamworkPeripheral the new object to create
     * @return the created TeamworkPeripheral
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamworkPeripheral post(@Nonnull final TeamworkPeripheral newTeamworkPeripheral) throws ClientException {
        return send(HttpMethod.POST, newTeamworkPeripheral);
    }

    /**
     * Creates a TeamworkPeripheral with a new object
     *
     * @param newTeamworkPeripheral the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamworkPeripheral> putAsync(@Nonnull final TeamworkPeripheral newTeamworkPeripheral) {
        return sendAsync(HttpMethod.PUT, newTeamworkPeripheral);
    }

    /**
     * Creates a TeamworkPeripheral with a new object
     *
     * @param newTeamworkPeripheral the object to create/update
     * @return the created TeamworkPeripheral
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamworkPeripheral put(@Nonnull final TeamworkPeripheral newTeamworkPeripheral) throws ClientException {
        return send(HttpMethod.PUT, newTeamworkPeripheral);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamworkPeripheralRequest select(@Nonnull final String value) {
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
     public TeamworkPeripheralRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

