// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PersonAnnualEvent;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Annual Event Request.
 */
public class PersonAnnualEventRequest extends BaseRequest<PersonAnnualEvent> {
	
    /**
     * The request for the PersonAnnualEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonAnnualEventRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonAnnualEvent.class);
    }

    /**
     * Gets the PersonAnnualEvent from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonAnnualEvent> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PersonAnnualEvent from the service
     *
     * @return the PersonAnnualEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnnualEvent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonAnnualEvent> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PersonAnnualEvent delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PersonAnnualEvent with a source
     *
     * @param sourcePersonAnnualEvent the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonAnnualEvent> patchAsync(@Nonnull final PersonAnnualEvent sourcePersonAnnualEvent) {
        return sendAsync(HttpMethod.PATCH, sourcePersonAnnualEvent);
    }

    /**
     * Patches this PersonAnnualEvent with a source
     *
     * @param sourcePersonAnnualEvent the source object with updates
     * @return the updated PersonAnnualEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnnualEvent patch(@Nonnull final PersonAnnualEvent sourcePersonAnnualEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonAnnualEvent);
    }

    /**
     * Creates a PersonAnnualEvent with a new object
     *
     * @param newPersonAnnualEvent the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonAnnualEvent> postAsync(@Nonnull final PersonAnnualEvent newPersonAnnualEvent) {
        return sendAsync(HttpMethod.POST, newPersonAnnualEvent);
    }

    /**
     * Creates a PersonAnnualEvent with a new object
     *
     * @param newPersonAnnualEvent the new object to create
     * @return the created PersonAnnualEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnnualEvent post(@Nonnull final PersonAnnualEvent newPersonAnnualEvent) throws ClientException {
        return send(HttpMethod.POST, newPersonAnnualEvent);
    }

    /**
     * Creates a PersonAnnualEvent with a new object
     *
     * @param newPersonAnnualEvent the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonAnnualEvent> putAsync(@Nonnull final PersonAnnualEvent newPersonAnnualEvent) {
        return sendAsync(HttpMethod.PUT, newPersonAnnualEvent);
    }

    /**
     * Creates a PersonAnnualEvent with a new object
     *
     * @param newPersonAnnualEvent the object to create/update
     * @return the created PersonAnnualEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonAnnualEvent put(@Nonnull final PersonAnnualEvent newPersonAnnualEvent) throws ClientException {
        return send(HttpMethod.PUT, newPersonAnnualEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PersonAnnualEventRequest select(@Nonnull final String value) {
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
     public PersonAnnualEventRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

