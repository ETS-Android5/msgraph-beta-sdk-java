// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CalendarGroup;
import com.microsoft.graph.requests.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.CalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group Request.
 */
public class CalendarGroupRequest extends BaseRequest<CalendarGroup> {
	
    /**
     * The request for the CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarGroupRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarGroup.class);
    }

    /**
     * Gets the CalendarGroup from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CalendarGroup> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CalendarGroup from the service
     *
     * @return the CalendarGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CalendarGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CalendarGroup> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CalendarGroup delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CalendarGroup with a source
     *
     * @param sourceCalendarGroup the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CalendarGroup> patchAsync(@Nonnull final CalendarGroup sourceCalendarGroup) {
        return sendAsync(HttpMethod.PATCH, sourceCalendarGroup);
    }

    /**
     * Patches this CalendarGroup with a source
     *
     * @param sourceCalendarGroup the source object with updates
     * @return the updated CalendarGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CalendarGroup patch(@Nonnull final CalendarGroup sourceCalendarGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceCalendarGroup);
    }

    /**
     * Creates a CalendarGroup with a new object
     *
     * @param newCalendarGroup the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CalendarGroup> postAsync(@Nonnull final CalendarGroup newCalendarGroup) {
        return sendAsync(HttpMethod.POST, newCalendarGroup);
    }

    /**
     * Creates a CalendarGroup with a new object
     *
     * @param newCalendarGroup the new object to create
     * @return the created CalendarGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CalendarGroup post(@Nonnull final CalendarGroup newCalendarGroup) throws ClientException {
        return send(HttpMethod.POST, newCalendarGroup);
    }

    /**
     * Creates a CalendarGroup with a new object
     *
     * @param newCalendarGroup the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CalendarGroup> putAsync(@Nonnull final CalendarGroup newCalendarGroup) {
        return sendAsync(HttpMethod.PUT, newCalendarGroup);
    }

    /**
     * Creates a CalendarGroup with a new object
     *
     * @param newCalendarGroup the object to create/update
     * @return the created CalendarGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CalendarGroup put(@Nonnull final CalendarGroup newCalendarGroup) throws ClientException {
        return send(HttpMethod.PUT, newCalendarGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CalendarGroupRequest select(@Nonnull final String value) {
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
     public CalendarGroupRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

