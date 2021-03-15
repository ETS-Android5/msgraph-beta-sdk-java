// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EmailActivityUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email Activity User Detail Request.
 */
public class EmailActivityUserDetailRequest extends BaseRequest<EmailActivityUserDetail> {
	
    /**
     * The request for the EmailActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailActivityUserDetailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailActivityUserDetail.class);
    }

    /**
     * Gets the EmailActivityUserDetail from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivityUserDetail> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EmailActivityUserDetail from the service
     *
     * @return the EmailActivityUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivityUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivityUserDetail> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EmailActivityUserDetail delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EmailActivityUserDetail with a source
     *
     * @param sourceEmailActivityUserDetail the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivityUserDetail> patchAsync(@Nonnull final EmailActivityUserDetail sourceEmailActivityUserDetail) {
        return sendAsync(HttpMethod.PATCH, sourceEmailActivityUserDetail);
    }

    /**
     * Patches this EmailActivityUserDetail with a source
     *
     * @param sourceEmailActivityUserDetail the source object with updates
     * @return the updated EmailActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivityUserDetail patch(@Nonnull final EmailActivityUserDetail sourceEmailActivityUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivityUserDetail> postAsync(@Nonnull final EmailActivityUserDetail newEmailActivityUserDetail) {
        return sendAsync(HttpMethod.POST, newEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the new object to create
     * @return the created EmailActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivityUserDetail post(@Nonnull final EmailActivityUserDetail newEmailActivityUserDetail) throws ClientException {
        return send(HttpMethod.POST, newEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailActivityUserDetail> putAsync(@Nonnull final EmailActivityUserDetail newEmailActivityUserDetail) {
        return sendAsync(HttpMethod.PUT, newEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the object to create/update
     * @return the created EmailActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailActivityUserDetail put(@Nonnull final EmailActivityUserDetail newEmailActivityUserDetail) throws ClientException {
        return send(HttpMethod.PUT, newEmailActivityUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EmailActivityUserDetailRequest select(@Nonnull final String value) {
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
     public EmailActivityUserDetailRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

