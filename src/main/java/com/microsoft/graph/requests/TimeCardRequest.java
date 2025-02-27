// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TimeCard;
import com.microsoft.graph.models.ItemBody;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Card Request.
 */
public class TimeCardRequest extends BaseRequest<TimeCard> {
	
    /**
     * The request for the TimeCard
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeCardRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeCard.class);
    }

    /**
     * Gets the TimeCard from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeCard> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TimeCard from the service
     *
     * @return the TimeCard from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeCard get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeCard> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TimeCard delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TimeCard with a source
     *
     * @param sourceTimeCard the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeCard> patchAsync(@Nonnull final TimeCard sourceTimeCard) {
        return sendAsync(HttpMethod.PATCH, sourceTimeCard);
    }

    /**
     * Patches this TimeCard with a source
     *
     * @param sourceTimeCard the source object with updates
     * @return the updated TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeCard patch(@Nonnull final TimeCard sourceTimeCard) throws ClientException {
        return send(HttpMethod.PATCH, sourceTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeCard> postAsync(@Nonnull final TimeCard newTimeCard) {
        return sendAsync(HttpMethod.POST, newTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the new object to create
     * @return the created TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeCard post(@Nonnull final TimeCard newTimeCard) throws ClientException {
        return send(HttpMethod.POST, newTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeCard> putAsync(@Nonnull final TimeCard newTimeCard) {
        return sendAsync(HttpMethod.PUT, newTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the object to create/update
     * @return the created TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeCard put(@Nonnull final TimeCard newTimeCard) throws ClientException {
        return send(HttpMethod.PUT, newTimeCard);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TimeCardRequest select(@Nonnull final String value) {
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
     public TimeCardRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

