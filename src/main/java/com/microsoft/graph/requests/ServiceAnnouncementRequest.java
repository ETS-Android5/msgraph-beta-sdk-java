// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServiceAnnouncement;
import com.microsoft.graph.requests.ServiceHealthCollectionRequestBuilder;
import com.microsoft.graph.requests.ServiceHealthRequestBuilder;
import com.microsoft.graph.requests.ServiceHealthIssueCollectionRequestBuilder;
import com.microsoft.graph.requests.ServiceHealthIssueRequestBuilder;
import com.microsoft.graph.requests.ServiceUpdateMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.ServiceUpdateMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Announcement Request.
 */
public class ServiceAnnouncementRequest extends BaseRequest<ServiceAnnouncement> {
	
    /**
     * The request for the ServiceAnnouncement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServiceAnnouncementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServiceAnnouncement.class);
    }

    /**
     * Gets the ServiceAnnouncement from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncement> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ServiceAnnouncement from the service
     *
     * @return the ServiceAnnouncement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncement> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ServiceAnnouncement delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ServiceAnnouncement with a source
     *
     * @param sourceServiceAnnouncement the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncement> patchAsync(@Nonnull final ServiceAnnouncement sourceServiceAnnouncement) {
        return sendAsync(HttpMethod.PATCH, sourceServiceAnnouncement);
    }

    /**
     * Patches this ServiceAnnouncement with a source
     *
     * @param sourceServiceAnnouncement the source object with updates
     * @return the updated ServiceAnnouncement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncement patch(@Nonnull final ServiceAnnouncement sourceServiceAnnouncement) throws ClientException {
        return send(HttpMethod.PATCH, sourceServiceAnnouncement);
    }

    /**
     * Creates a ServiceAnnouncement with a new object
     *
     * @param newServiceAnnouncement the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncement> postAsync(@Nonnull final ServiceAnnouncement newServiceAnnouncement) {
        return sendAsync(HttpMethod.POST, newServiceAnnouncement);
    }

    /**
     * Creates a ServiceAnnouncement with a new object
     *
     * @param newServiceAnnouncement the new object to create
     * @return the created ServiceAnnouncement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncement post(@Nonnull final ServiceAnnouncement newServiceAnnouncement) throws ClientException {
        return send(HttpMethod.POST, newServiceAnnouncement);
    }

    /**
     * Creates a ServiceAnnouncement with a new object
     *
     * @param newServiceAnnouncement the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncement> putAsync(@Nonnull final ServiceAnnouncement newServiceAnnouncement) {
        return sendAsync(HttpMethod.PUT, newServiceAnnouncement);
    }

    /**
     * Creates a ServiceAnnouncement with a new object
     *
     * @param newServiceAnnouncement the object to create/update
     * @return the created ServiceAnnouncement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncement put(@Nonnull final ServiceAnnouncement newServiceAnnouncement) throws ClientException {
        return send(HttpMethod.PUT, newServiceAnnouncement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ServiceAnnouncementRequest select(@Nonnull final String value) {
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
     public ServiceAnnouncementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

