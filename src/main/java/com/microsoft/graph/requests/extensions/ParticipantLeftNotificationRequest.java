// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ParticipantLeftNotification;
import com.microsoft.graph.requests.extensions.ICallRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Left Notification Request.
 */
public class ParticipantLeftNotificationRequest extends BaseRequest implements IParticipantLeftNotificationRequest {
	
    /**
     * The request for the ParticipantLeftNotification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantLeftNotificationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ParticipantLeftNotification.class);
    }

    /**
     * Gets the ParticipantLeftNotification from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ParticipantLeftNotification> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ParticipantLeftNotification from the service
     *
     * @return the ParticipantLeftNotification from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantLeftNotification get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ParticipantLeftNotification> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ParticipantLeftNotification with a source
     *
     * @param sourceParticipantLeftNotification the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ParticipantLeftNotification sourceParticipantLeftNotification, final ICallback<? super ParticipantLeftNotification> callback) {
        send(HttpMethod.PATCH, callback, sourceParticipantLeftNotification);
    }

    /**
     * Patches this ParticipantLeftNotification with a source
     *
     * @param sourceParticipantLeftNotification the source object with updates
     * @return the updated ParticipantLeftNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantLeftNotification patch(final ParticipantLeftNotification sourceParticipantLeftNotification) throws ClientException {
        return send(HttpMethod.PATCH, sourceParticipantLeftNotification);
    }

    /**
     * Creates a ParticipantLeftNotification with a new object
     *
     * @param newParticipantLeftNotification the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ParticipantLeftNotification newParticipantLeftNotification, final ICallback<? super ParticipantLeftNotification> callback) {
        send(HttpMethod.POST, callback, newParticipantLeftNotification);
    }

    /**
     * Creates a ParticipantLeftNotification with a new object
     *
     * @param newParticipantLeftNotification the new object to create
     * @return the created ParticipantLeftNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantLeftNotification post(final ParticipantLeftNotification newParticipantLeftNotification) throws ClientException {
        return send(HttpMethod.POST, newParticipantLeftNotification);
    }

    /**
     * Creates a ParticipantLeftNotification with a new object
     *
     * @param newParticipantLeftNotification the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ParticipantLeftNotification newParticipantLeftNotification, final ICallback<? super ParticipantLeftNotification> callback) {
        send(HttpMethod.PUT, callback, newParticipantLeftNotification);
    }

    /**
     * Creates a ParticipantLeftNotification with a new object
     *
     * @param newParticipantLeftNotification the object to create/update
     * @return the created ParticipantLeftNotification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ParticipantLeftNotification put(final ParticipantLeftNotification newParticipantLeftNotification) throws ClientException {
        return send(HttpMethod.PUT, newParticipantLeftNotification);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IParticipantLeftNotificationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ParticipantLeftNotificationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IParticipantLeftNotificationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ParticipantLeftNotificationRequest)this;
     }

}

