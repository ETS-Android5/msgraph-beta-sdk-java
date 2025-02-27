// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.AggregatedPolicyCompliance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aggregated Policy Compliance Request.
 */
public class AggregatedPolicyComplianceRequest extends BaseRequest<AggregatedPolicyCompliance> {
	
    /**
     * The request for the AggregatedPolicyCompliance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AggregatedPolicyComplianceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AggregatedPolicyCompliance.class);
    }

    /**
     * Gets the AggregatedPolicyCompliance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AggregatedPolicyCompliance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AggregatedPolicyCompliance from the service
     *
     * @return the AggregatedPolicyCompliance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AggregatedPolicyCompliance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AggregatedPolicyCompliance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AggregatedPolicyCompliance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AggregatedPolicyCompliance with a source
     *
     * @param sourceAggregatedPolicyCompliance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AggregatedPolicyCompliance> patchAsync(@Nonnull final AggregatedPolicyCompliance sourceAggregatedPolicyCompliance) {
        return sendAsync(HttpMethod.PATCH, sourceAggregatedPolicyCompliance);
    }

    /**
     * Patches this AggregatedPolicyCompliance with a source
     *
     * @param sourceAggregatedPolicyCompliance the source object with updates
     * @return the updated AggregatedPolicyCompliance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AggregatedPolicyCompliance patch(@Nonnull final AggregatedPolicyCompliance sourceAggregatedPolicyCompliance) throws ClientException {
        return send(HttpMethod.PATCH, sourceAggregatedPolicyCompliance);
    }

    /**
     * Creates a AggregatedPolicyCompliance with a new object
     *
     * @param newAggregatedPolicyCompliance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AggregatedPolicyCompliance> postAsync(@Nonnull final AggregatedPolicyCompliance newAggregatedPolicyCompliance) {
        return sendAsync(HttpMethod.POST, newAggregatedPolicyCompliance);
    }

    /**
     * Creates a AggregatedPolicyCompliance with a new object
     *
     * @param newAggregatedPolicyCompliance the new object to create
     * @return the created AggregatedPolicyCompliance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AggregatedPolicyCompliance post(@Nonnull final AggregatedPolicyCompliance newAggregatedPolicyCompliance) throws ClientException {
        return send(HttpMethod.POST, newAggregatedPolicyCompliance);
    }

    /**
     * Creates a AggregatedPolicyCompliance with a new object
     *
     * @param newAggregatedPolicyCompliance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AggregatedPolicyCompliance> putAsync(@Nonnull final AggregatedPolicyCompliance newAggregatedPolicyCompliance) {
        return sendAsync(HttpMethod.PUT, newAggregatedPolicyCompliance);
    }

    /**
     * Creates a AggregatedPolicyCompliance with a new object
     *
     * @param newAggregatedPolicyCompliance the object to create/update
     * @return the created AggregatedPolicyCompliance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AggregatedPolicyCompliance put(@Nonnull final AggregatedPolicyCompliance newAggregatedPolicyCompliance) throws ClientException {
        return send(HttpMethod.PUT, newAggregatedPolicyCompliance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AggregatedPolicyComplianceRequest select(@Nonnull final String value) {
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
     public AggregatedPolicyComplianceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

