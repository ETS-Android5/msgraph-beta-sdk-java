// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.JournalLine;
import com.microsoft.graph.requests.AccountRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal Line Request.
 */
public class JournalLineRequest extends BaseRequest<JournalLine> {
	
    /**
     * The request for the JournalLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public JournalLineRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, JournalLine.class);
    }

    /**
     * Gets the JournalLine from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<JournalLine> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the JournalLine from the service
     *
     * @return the JournalLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public JournalLine get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<JournalLine> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public JournalLine delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this JournalLine with a source
     *
     * @param sourceJournalLine the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<JournalLine> patchAsync(@Nonnull final JournalLine sourceJournalLine) {
        return sendAsync(HttpMethod.PATCH, sourceJournalLine);
    }

    /**
     * Patches this JournalLine with a source
     *
     * @param sourceJournalLine the source object with updates
     * @return the updated JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public JournalLine patch(@Nonnull final JournalLine sourceJournalLine) throws ClientException {
        return send(HttpMethod.PATCH, sourceJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<JournalLine> postAsync(@Nonnull final JournalLine newJournalLine) {
        return sendAsync(HttpMethod.POST, newJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the new object to create
     * @return the created JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public JournalLine post(@Nonnull final JournalLine newJournalLine) throws ClientException {
        return send(HttpMethod.POST, newJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<JournalLine> putAsync(@Nonnull final JournalLine newJournalLine) {
        return sendAsync(HttpMethod.PUT, newJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the object to create/update
     * @return the created JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public JournalLine put(@Nonnull final JournalLine newJournalLine) throws ClientException {
        return send(HttpMethod.PUT, newJournalLine);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public JournalLineRequest select(@Nonnull final String value) {
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
     public JournalLineRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

