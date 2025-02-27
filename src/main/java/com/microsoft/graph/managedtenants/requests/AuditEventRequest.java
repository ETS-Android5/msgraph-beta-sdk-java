// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.AuditEvent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Event Request.
 */
public class AuditEventRequest extends BaseRequest<AuditEvent> {
	
    /**
     * The request for the AuditEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditEventRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuditEvent.class);
    }

    /**
     * Gets the AuditEvent from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditEvent> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AuditEvent from the service
     *
     * @return the AuditEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditEvent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditEvent> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AuditEvent delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuditEvent with a source
     *
     * @param sourceAuditEvent the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditEvent> patchAsync(@Nonnull final AuditEvent sourceAuditEvent) {
        return sendAsync(HttpMethod.PATCH, sourceAuditEvent);
    }

    /**
     * Patches this AuditEvent with a source
     *
     * @param sourceAuditEvent the source object with updates
     * @return the updated AuditEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditEvent patch(@Nonnull final AuditEvent sourceAuditEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuditEvent);
    }

    /**
     * Creates a AuditEvent with a new object
     *
     * @param newAuditEvent the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditEvent> postAsync(@Nonnull final AuditEvent newAuditEvent) {
        return sendAsync(HttpMethod.POST, newAuditEvent);
    }

    /**
     * Creates a AuditEvent with a new object
     *
     * @param newAuditEvent the new object to create
     * @return the created AuditEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditEvent post(@Nonnull final AuditEvent newAuditEvent) throws ClientException {
        return send(HttpMethod.POST, newAuditEvent);
    }

    /**
     * Creates a AuditEvent with a new object
     *
     * @param newAuditEvent the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditEvent> putAsync(@Nonnull final AuditEvent newAuditEvent) {
        return sendAsync(HttpMethod.PUT, newAuditEvent);
    }

    /**
     * Creates a AuditEvent with a new object
     *
     * @param newAuditEvent the object to create/update
     * @return the created AuditEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditEvent put(@Nonnull final AuditEvent newAuditEvent) throws ClientException {
        return send(HttpMethod.PUT, newAuditEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AuditEventRequest select(@Nonnull final String value) {
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
     public AuditEventRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

