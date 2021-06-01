// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.CredentialUserRegistrationsSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registrations Summary Request.
 */
public class CredentialUserRegistrationsSummaryRequest extends BaseRequest<CredentialUserRegistrationsSummary> {
	
    /**
     * The request for the CredentialUserRegistrationsSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CredentialUserRegistrationsSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CredentialUserRegistrationsSummary.class);
    }

    /**
     * Gets the CredentialUserRegistrationsSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationsSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CredentialUserRegistrationsSummary from the service
     *
     * @return the CredentialUserRegistrationsSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CredentialUserRegistrationsSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationsSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CredentialUserRegistrationsSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CredentialUserRegistrationsSummary with a source
     *
     * @param sourceCredentialUserRegistrationsSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationsSummary> patchAsync(@Nonnull final CredentialUserRegistrationsSummary sourceCredentialUserRegistrationsSummary) {
        return sendAsync(HttpMethod.PATCH, sourceCredentialUserRegistrationsSummary);
    }

    /**
     * Patches this CredentialUserRegistrationsSummary with a source
     *
     * @param sourceCredentialUserRegistrationsSummary the source object with updates
     * @return the updated CredentialUserRegistrationsSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CredentialUserRegistrationsSummary patch(@Nonnull final CredentialUserRegistrationsSummary sourceCredentialUserRegistrationsSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceCredentialUserRegistrationsSummary);
    }

    /**
     * Creates a CredentialUserRegistrationsSummary with a new object
     *
     * @param newCredentialUserRegistrationsSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationsSummary> postAsync(@Nonnull final CredentialUserRegistrationsSummary newCredentialUserRegistrationsSummary) {
        return sendAsync(HttpMethod.POST, newCredentialUserRegistrationsSummary);
    }

    /**
     * Creates a CredentialUserRegistrationsSummary with a new object
     *
     * @param newCredentialUserRegistrationsSummary the new object to create
     * @return the created CredentialUserRegistrationsSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CredentialUserRegistrationsSummary post(@Nonnull final CredentialUserRegistrationsSummary newCredentialUserRegistrationsSummary) throws ClientException {
        return send(HttpMethod.POST, newCredentialUserRegistrationsSummary);
    }

    /**
     * Creates a CredentialUserRegistrationsSummary with a new object
     *
     * @param newCredentialUserRegistrationsSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationsSummary> putAsync(@Nonnull final CredentialUserRegistrationsSummary newCredentialUserRegistrationsSummary) {
        return sendAsync(HttpMethod.PUT, newCredentialUserRegistrationsSummary);
    }

    /**
     * Creates a CredentialUserRegistrationsSummary with a new object
     *
     * @param newCredentialUserRegistrationsSummary the object to create/update
     * @return the created CredentialUserRegistrationsSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CredentialUserRegistrationsSummary put(@Nonnull final CredentialUserRegistrationsSummary newCredentialUserRegistrationsSummary) throws ClientException {
        return send(HttpMethod.PUT, newCredentialUserRegistrationsSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CredentialUserRegistrationsSummaryRequest select(@Nonnull final String value) {
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
     public CredentialUserRegistrationsSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

