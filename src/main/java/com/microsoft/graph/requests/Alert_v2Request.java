// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Alert_v2;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert_v2Request.
 */
public class Alert_v2Request extends BaseRequest<Alert_v2> {
	
    /**
     * The request for the Alert_v2
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Alert_v2Request(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Alert_v2.class);
    }

    /**
     * Gets the Alert_v2 from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Alert_v2> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Alert_v2 from the service
     *
     * @return the Alert_v2 from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Alert_v2 get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Alert_v2> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Alert_v2 delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Alert_v2 with a source
     *
     * @param sourceAlert_v2 the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Alert_v2> patchAsync(@Nonnull final Alert_v2 sourceAlert_v2) {
        return sendAsync(HttpMethod.PATCH, sourceAlert_v2);
    }

    /**
     * Patches this Alert_v2 with a source
     *
     * @param sourceAlert_v2 the source object with updates
     * @return the updated Alert_v2
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Alert_v2 patch(@Nonnull final Alert_v2 sourceAlert_v2) throws ClientException {
        return send(HttpMethod.PATCH, sourceAlert_v2);
    }

    /**
     * Creates a Alert_v2 with a new object
     *
     * @param newAlert_v2 the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Alert_v2> postAsync(@Nonnull final Alert_v2 newAlert_v2) {
        return sendAsync(HttpMethod.POST, newAlert_v2);
    }

    /**
     * Creates a Alert_v2 with a new object
     *
     * @param newAlert_v2 the new object to create
     * @return the created Alert_v2
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Alert_v2 post(@Nonnull final Alert_v2 newAlert_v2) throws ClientException {
        return send(HttpMethod.POST, newAlert_v2);
    }

    /**
     * Creates a Alert_v2 with a new object
     *
     * @param newAlert_v2 the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Alert_v2> putAsync(@Nonnull final Alert_v2 newAlert_v2) {
        return sendAsync(HttpMethod.PUT, newAlert_v2);
    }

    /**
     * Creates a Alert_v2 with a new object
     *
     * @param newAlert_v2 the object to create/update
     * @return the created Alert_v2
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Alert_v2 put(@Nonnull final Alert_v2 newAlert_v2) throws ClientException {
        return send(HttpMethod.PUT, newAlert_v2);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Alert_v2Request select(@Nonnull final String value) {
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
     public Alert_v2Request expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

