// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EmailActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email Activity Summary Request.
 */
public class EmailActivitySummaryRequest extends BaseRequest<EmailActivitySummary> {
	
    /**
     * The request for the EmailActivitySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailActivitySummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailActivitySummary.class);
    }

    /**
     * Gets the EmailActivitySummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivitySummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EmailActivitySummary from the service
     *
     * @return the EmailActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivitySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivitySummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EmailActivitySummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EmailActivitySummary with a source
     *
     * @param sourceEmailActivitySummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivitySummary> patchAsync(@Nonnull final EmailActivitySummary sourceEmailActivitySummary) {
        return sendAsync(HttpMethod.PATCH, sourceEmailActivitySummary);
    }

    /**
     * Patches this EmailActivitySummary with a source
     *
     * @param sourceEmailActivitySummary the source object with updates
     * @return the updated EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivitySummary patch(@Nonnull final EmailActivitySummary sourceEmailActivitySummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailActivitySummary);
    }

    /**
     * Creates a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivitySummary> postAsync(@Nonnull final EmailActivitySummary newEmailActivitySummary) {
        return sendAsync(HttpMethod.POST, newEmailActivitySummary);
    }

    /**
     * Creates a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the new object to create
     * @return the created EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivitySummary post(@Nonnull final EmailActivitySummary newEmailActivitySummary) throws ClientException {
        return send(HttpMethod.POST, newEmailActivitySummary);
    }

    /**
     * Creates a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivitySummary> putAsync(@Nonnull final EmailActivitySummary newEmailActivitySummary) {
        return sendAsync(HttpMethod.PUT, newEmailActivitySummary);
    }

    /**
     * Creates a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the object to create/update
     * @return the created EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivitySummary put(@Nonnull final EmailActivitySummary newEmailActivitySummary) throws ClientException {
        return send(HttpMethod.PUT, newEmailActivitySummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EmailActivitySummaryRequest select(@Nonnull final String value) {
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
     public EmailActivitySummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

