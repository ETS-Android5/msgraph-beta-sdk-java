// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.LanguageProficiency;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Language Proficiency Request.
 */
public class LanguageProficiencyRequest extends BaseRequest<LanguageProficiency> {
	
    /**
     * The request for the LanguageProficiency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LanguageProficiencyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LanguageProficiency.class);
    }

    /**
     * Gets the LanguageProficiency from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LanguageProficiency> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the LanguageProficiency from the service
     *
     * @return the LanguageProficiency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LanguageProficiency get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LanguageProficiency> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public LanguageProficiency delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this LanguageProficiency with a source
     *
     * @param sourceLanguageProficiency the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LanguageProficiency> patchAsync(@Nonnull final LanguageProficiency sourceLanguageProficiency) {
        return sendAsync(HttpMethod.PATCH, sourceLanguageProficiency);
    }

    /**
     * Patches this LanguageProficiency with a source
     *
     * @param sourceLanguageProficiency the source object with updates
     * @return the updated LanguageProficiency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LanguageProficiency patch(@Nonnull final LanguageProficiency sourceLanguageProficiency) throws ClientException {
        return send(HttpMethod.PATCH, sourceLanguageProficiency);
    }

    /**
     * Creates a LanguageProficiency with a new object
     *
     * @param newLanguageProficiency the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LanguageProficiency> postAsync(@Nonnull final LanguageProficiency newLanguageProficiency) {
        return sendAsync(HttpMethod.POST, newLanguageProficiency);
    }

    /**
     * Creates a LanguageProficiency with a new object
     *
     * @param newLanguageProficiency the new object to create
     * @return the created LanguageProficiency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LanguageProficiency post(@Nonnull final LanguageProficiency newLanguageProficiency) throws ClientException {
        return send(HttpMethod.POST, newLanguageProficiency);
    }

    /**
     * Creates a LanguageProficiency with a new object
     *
     * @param newLanguageProficiency the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<LanguageProficiency> putAsync(@Nonnull final LanguageProficiency newLanguageProficiency) {
        return sendAsync(HttpMethod.PUT, newLanguageProficiency);
    }

    /**
     * Creates a LanguageProficiency with a new object
     *
     * @param newLanguageProficiency the object to create/update
     * @return the created LanguageProficiency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public LanguageProficiency put(@Nonnull final LanguageProficiency newLanguageProficiency) throws ClientException {
        return send(HttpMethod.PUT, newLanguageProficiency);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public LanguageProficiencyRequest select(@Nonnull final String value) {
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
     public LanguageProficiencyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

