// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ConditionalAccessPolicyCoverage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Coverage Request.
 */
public class ConditionalAccessPolicyCoverageRequest extends BaseRequest<ConditionalAccessPolicyCoverage> {
	
    /**
     * The request for the ConditionalAccessPolicyCoverage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessPolicyCoverageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConditionalAccessPolicyCoverage.class);
    }

    /**
     * Gets the ConditionalAccessPolicyCoverage from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicyCoverage> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ConditionalAccessPolicyCoverage from the service
     *
     * @return the ConditionalAccessPolicyCoverage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicyCoverage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicyCoverage> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ConditionalAccessPolicyCoverage delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ConditionalAccessPolicyCoverage with a source
     *
     * @param sourceConditionalAccessPolicyCoverage the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicyCoverage> patchAsync(@Nonnull final ConditionalAccessPolicyCoverage sourceConditionalAccessPolicyCoverage) {
        return sendAsync(HttpMethod.PATCH, sourceConditionalAccessPolicyCoverage);
    }

    /**
     * Patches this ConditionalAccessPolicyCoverage with a source
     *
     * @param sourceConditionalAccessPolicyCoverage the source object with updates
     * @return the updated ConditionalAccessPolicyCoverage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicyCoverage patch(@Nonnull final ConditionalAccessPolicyCoverage sourceConditionalAccessPolicyCoverage) throws ClientException {
        return send(HttpMethod.PATCH, sourceConditionalAccessPolicyCoverage);
    }

    /**
     * Creates a ConditionalAccessPolicyCoverage with a new object
     *
     * @param newConditionalAccessPolicyCoverage the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicyCoverage> postAsync(@Nonnull final ConditionalAccessPolicyCoverage newConditionalAccessPolicyCoverage) {
        return sendAsync(HttpMethod.POST, newConditionalAccessPolicyCoverage);
    }

    /**
     * Creates a ConditionalAccessPolicyCoverage with a new object
     *
     * @param newConditionalAccessPolicyCoverage the new object to create
     * @return the created ConditionalAccessPolicyCoverage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicyCoverage post(@Nonnull final ConditionalAccessPolicyCoverage newConditionalAccessPolicyCoverage) throws ClientException {
        return send(HttpMethod.POST, newConditionalAccessPolicyCoverage);
    }

    /**
     * Creates a ConditionalAccessPolicyCoverage with a new object
     *
     * @param newConditionalAccessPolicyCoverage the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConditionalAccessPolicyCoverage> putAsync(@Nonnull final ConditionalAccessPolicyCoverage newConditionalAccessPolicyCoverage) {
        return sendAsync(HttpMethod.PUT, newConditionalAccessPolicyCoverage);
    }

    /**
     * Creates a ConditionalAccessPolicyCoverage with a new object
     *
     * @param newConditionalAccessPolicyCoverage the object to create/update
     * @return the created ConditionalAccessPolicyCoverage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConditionalAccessPolicyCoverage put(@Nonnull final ConditionalAccessPolicyCoverage newConditionalAccessPolicyCoverage) throws ClientException {
        return send(HttpMethod.PUT, newConditionalAccessPolicyCoverage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ConditionalAccessPolicyCoverageRequest select(@Nonnull final String value) {
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
     public ConditionalAccessPolicyCoverageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

