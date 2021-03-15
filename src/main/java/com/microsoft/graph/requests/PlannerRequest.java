// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Planner;
import com.microsoft.graph.requests.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.PlannerRosterCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerRosterRequestBuilder;
import com.microsoft.graph.requests.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Request.
 */
public class PlannerRequest extends BaseRequest<Planner> {
	
    /**
     * The request for the Planner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Planner.class);
    }

    /**
     * Gets the Planner from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Planner> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Planner from the service
     *
     * @return the Planner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Planner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Planner> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Planner delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Planner with a source
     *
     * @param sourcePlanner the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Planner> patchAsync(@Nonnull final Planner sourcePlanner) {
        return sendAsync(HttpMethod.PATCH, sourcePlanner);
    }

    /**
     * Patches this Planner with a source
     *
     * @param sourcePlanner the source object with updates
     * @return the updated Planner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Planner patch(@Nonnull final Planner sourcePlanner) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlanner);
    }

    /**
     * Creates a Planner with a new object
     *
     * @param newPlanner the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Planner> postAsync(@Nonnull final Planner newPlanner) {
        return sendAsync(HttpMethod.POST, newPlanner);
    }

    /**
     * Creates a Planner with a new object
     *
     * @param newPlanner the new object to create
     * @return the created Planner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Planner post(@Nonnull final Planner newPlanner) throws ClientException {
        return send(HttpMethod.POST, newPlanner);
    }

    /**
     * Creates a Planner with a new object
     *
     * @param newPlanner the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Planner> putAsync(@Nonnull final Planner newPlanner) {
        return sendAsync(HttpMethod.PUT, newPlanner);
    }

    /**
     * Creates a Planner with a new object
     *
     * @param newPlanner the object to create/update
     * @return the created Planner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Planner put(@Nonnull final Planner newPlanner) throws ClientException {
        return send(HttpMethod.PUT, newPlanner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlannerRequest select(@Nonnull final String value) {
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
     public PlannerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

