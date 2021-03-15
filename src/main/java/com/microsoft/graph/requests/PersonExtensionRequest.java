// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PersonExtension;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Extension Request.
 */
public class PersonExtensionRequest extends BaseRequest<PersonExtension> {
	
    /**
     * The request for the PersonExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonExtensionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonExtension.class);
    }

    /**
     * Gets the PersonExtension from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonExtension> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PersonExtension from the service
     *
     * @return the PersonExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonExtension> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PersonExtension delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PersonExtension with a source
     *
     * @param sourcePersonExtension the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonExtension> patchAsync(@Nonnull final PersonExtension sourcePersonExtension) {
        return sendAsync(HttpMethod.PATCH, sourcePersonExtension);
    }

    /**
     * Patches this PersonExtension with a source
     *
     * @param sourcePersonExtension the source object with updates
     * @return the updated PersonExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonExtension patch(@Nonnull final PersonExtension sourcePersonExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonExtension> postAsync(@Nonnull final PersonExtension newPersonExtension) {
        return sendAsync(HttpMethod.POST, newPersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the new object to create
     * @return the created PersonExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonExtension post(@Nonnull final PersonExtension newPersonExtension) throws ClientException {
        return send(HttpMethod.POST, newPersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PersonExtension> putAsync(@Nonnull final PersonExtension newPersonExtension) {
        return sendAsync(HttpMethod.PUT, newPersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the object to create/update
     * @return the created PersonExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PersonExtension put(@Nonnull final PersonExtension newPersonExtension) throws ClientException {
        return send(HttpMethod.PUT, newPersonExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PersonExtensionRequest select(@Nonnull final String value) {
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
     public PersonExtensionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

