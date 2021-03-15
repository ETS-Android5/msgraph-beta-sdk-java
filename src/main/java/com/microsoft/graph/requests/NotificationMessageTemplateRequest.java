// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.NotificationMessageTemplate;
import com.microsoft.graph.requests.LocalizedNotificationMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.LocalizedNotificationMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template Request.
 */
public class NotificationMessageTemplateRequest extends BaseRequest<NotificationMessageTemplate> {
	
    /**
     * The request for the NotificationMessageTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotificationMessageTemplateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NotificationMessageTemplate.class);
    }

    /**
     * Gets the NotificationMessageTemplate from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NotificationMessageTemplate> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the NotificationMessageTemplate from the service
     *
     * @return the NotificationMessageTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NotificationMessageTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NotificationMessageTemplate> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public NotificationMessageTemplate delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this NotificationMessageTemplate with a source
     *
     * @param sourceNotificationMessageTemplate the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NotificationMessageTemplate> patchAsync(@Nonnull final NotificationMessageTemplate sourceNotificationMessageTemplate) {
        return sendAsync(HttpMethod.PATCH, sourceNotificationMessageTemplate);
    }

    /**
     * Patches this NotificationMessageTemplate with a source
     *
     * @param sourceNotificationMessageTemplate the source object with updates
     * @return the updated NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NotificationMessageTemplate patch(@Nonnull final NotificationMessageTemplate sourceNotificationMessageTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NotificationMessageTemplate> postAsync(@Nonnull final NotificationMessageTemplate newNotificationMessageTemplate) {
        return sendAsync(HttpMethod.POST, newNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the new object to create
     * @return the created NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NotificationMessageTemplate post(@Nonnull final NotificationMessageTemplate newNotificationMessageTemplate) throws ClientException {
        return send(HttpMethod.POST, newNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<NotificationMessageTemplate> putAsync(@Nonnull final NotificationMessageTemplate newNotificationMessageTemplate) {
        return sendAsync(HttpMethod.PUT, newNotificationMessageTemplate);
    }

    /**
     * Creates a NotificationMessageTemplate with a new object
     *
     * @param newNotificationMessageTemplate the object to create/update
     * @return the created NotificationMessageTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public NotificationMessageTemplate put(@Nonnull final NotificationMessageTemplate newNotificationMessageTemplate) throws ClientException {
        return send(HttpMethod.PUT, newNotificationMessageTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public NotificationMessageTemplateRequest select(@Nonnull final String value) {
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
     public NotificationMessageTemplateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

