// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EventMessageRequest;
import com.microsoft.graph.models.extensions.TimeSlot;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request Request.
 */
public class EventMessageRequestRequest extends BaseRequest implements IEventMessageRequestRequest {
	
    /**
     * The request for the EventMessageRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessageRequest.class);
    }

    /**
     * Gets the EventMessageRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EventMessageRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EventMessageRequest from the service
     *
     * @return the EventMessageRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EventMessageRequest> callback) {
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
     * Patches this EventMessageRequest with a source
     *
     * @param sourceEventMessageRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EventMessageRequest sourceEventMessageRequest, final ICallback<? super EventMessageRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceEventMessageRequest);
    }

    /**
     * Patches this EventMessageRequest with a source
     *
     * @param sourceEventMessageRequest the source object with updates
     * @return the updated EventMessageRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageRequest patch(final EventMessageRequest sourceEventMessageRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EventMessageRequest newEventMessageRequest, final ICallback<? super EventMessageRequest> callback) {
        send(HttpMethod.POST, callback, newEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the new object to create
     * @return the created EventMessageRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageRequest post(final EventMessageRequest newEventMessageRequest) throws ClientException {
        return send(HttpMethod.POST, newEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EventMessageRequest newEventMessageRequest, final ICallback<? super EventMessageRequest> callback) {
        send(HttpMethod.PUT, callback, newEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the object to create/update
     * @return the created EventMessageRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EventMessageRequest put(final EventMessageRequest newEventMessageRequest) throws ClientException {
        return send(HttpMethod.PUT, newEventMessageRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEventMessageRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EventMessageRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEventMessageRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EventMessageRequestRequest)this;
     }

}

