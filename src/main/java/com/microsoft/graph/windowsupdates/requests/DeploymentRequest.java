// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.windowsupdates.models.Deployment;
import com.microsoft.graph.windowsupdates.requests.DeploymentAudienceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Deployment Request.
 */
public class DeploymentRequest extends BaseRequest<Deployment> {
	
    /**
     * The request for the Deployment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeploymentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Deployment.class);
    }

    /**
     * Gets the Deployment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Deployment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Deployment from the service
     *
     * @return the Deployment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Deployment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Deployment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Deployment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Deployment with a source
     *
     * @param sourceDeployment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Deployment> patchAsync(@Nonnull final Deployment sourceDeployment) {
        return sendAsync(HttpMethod.PATCH, sourceDeployment);
    }

    /**
     * Patches this Deployment with a source
     *
     * @param sourceDeployment the source object with updates
     * @return the updated Deployment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Deployment patch(@Nonnull final Deployment sourceDeployment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeployment);
    }

    /**
     * Creates a Deployment with a new object
     *
     * @param newDeployment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Deployment> postAsync(@Nonnull final Deployment newDeployment) {
        return sendAsync(HttpMethod.POST, newDeployment);
    }

    /**
     * Creates a Deployment with a new object
     *
     * @param newDeployment the new object to create
     * @return the created Deployment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Deployment post(@Nonnull final Deployment newDeployment) throws ClientException {
        return send(HttpMethod.POST, newDeployment);
    }

    /**
     * Creates a Deployment with a new object
     *
     * @param newDeployment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Deployment> putAsync(@Nonnull final Deployment newDeployment) {
        return sendAsync(HttpMethod.PUT, newDeployment);
    }

    /**
     * Creates a Deployment with a new object
     *
     * @param newDeployment the object to create/update
     * @return the created Deployment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Deployment put(@Nonnull final Deployment newDeployment) throws ClientException {
        return send(HttpMethod.PUT, newDeployment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeploymentRequest select(@Nonnull final String value) {
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
     public DeploymentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

