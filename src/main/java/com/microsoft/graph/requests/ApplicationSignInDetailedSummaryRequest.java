// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ApplicationSignInDetailedSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Sign In Detailed Summary Request.
 */
public class ApplicationSignInDetailedSummaryRequest extends BaseRequest<ApplicationSignInDetailedSummary> {
	
    /**
     * The request for the ApplicationSignInDetailedSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationSignInDetailedSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationSignInDetailedSummary.class);
    }

    /**
     * Gets the ApplicationSignInDetailedSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplicationSignInDetailedSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ApplicationSignInDetailedSummary from the service
     *
     * @return the ApplicationSignInDetailedSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplicationSignInDetailedSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplicationSignInDetailedSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ApplicationSignInDetailedSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ApplicationSignInDetailedSummary with a source
     *
     * @param sourceApplicationSignInDetailedSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplicationSignInDetailedSummary> patchAsync(@Nonnull final ApplicationSignInDetailedSummary sourceApplicationSignInDetailedSummary) {
        return sendAsync(HttpMethod.PATCH, sourceApplicationSignInDetailedSummary);
    }

    /**
     * Patches this ApplicationSignInDetailedSummary with a source
     *
     * @param sourceApplicationSignInDetailedSummary the source object with updates
     * @return the updated ApplicationSignInDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplicationSignInDetailedSummary patch(@Nonnull final ApplicationSignInDetailedSummary sourceApplicationSignInDetailedSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceApplicationSignInDetailedSummary);
    }

    /**
     * Creates a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplicationSignInDetailedSummary> postAsync(@Nonnull final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary) {
        return sendAsync(HttpMethod.POST, newApplicationSignInDetailedSummary);
    }

    /**
     * Creates a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the new object to create
     * @return the created ApplicationSignInDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplicationSignInDetailedSummary post(@Nonnull final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary) throws ClientException {
        return send(HttpMethod.POST, newApplicationSignInDetailedSummary);
    }

    /**
     * Creates a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplicationSignInDetailedSummary> putAsync(@Nonnull final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary) {
        return sendAsync(HttpMethod.PUT, newApplicationSignInDetailedSummary);
    }

    /**
     * Creates a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the object to create/update
     * @return the created ApplicationSignInDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplicationSignInDetailedSummary put(@Nonnull final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary) throws ClientException {
        return send(HttpMethod.PUT, newApplicationSignInDetailedSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ApplicationSignInDetailedSummaryRequest select(@Nonnull final String value) {
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
     public ApplicationSignInDetailedSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

