// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TimeCard;
import com.microsoft.graph.models.extensions.ItemBody;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Card Request.
 */
public class TimeCardRequest extends BaseRequest implements ITimeCardRequest {
	
    /**
     * The request for the TimeCard
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeCardRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeCard.class);
    }

    /**
     * Gets the TimeCard from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TimeCard> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TimeCard from the service
     *
     * @return the TimeCard from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeCard get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TimeCard> callback) {
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
     * Patches this TimeCard with a source
     *
     * @param sourceTimeCard the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TimeCard sourceTimeCard, final ICallback<? super TimeCard> callback) {
        send(HttpMethod.PATCH, callback, sourceTimeCard);
    }

    /**
     * Patches this TimeCard with a source
     *
     * @param sourceTimeCard the source object with updates
     * @return the updated TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeCard patch(final TimeCard sourceTimeCard) throws ClientException {
        return send(HttpMethod.PATCH, sourceTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TimeCard newTimeCard, final ICallback<? super TimeCard> callback) {
        send(HttpMethod.POST, callback, newTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the new object to create
     * @return the created TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeCard post(final TimeCard newTimeCard) throws ClientException {
        return send(HttpMethod.POST, newTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TimeCard newTimeCard, final ICallback<? super TimeCard> callback) {
        send(HttpMethod.PUT, callback, newTimeCard);
    }

    /**
     * Creates a TimeCard with a new object
     *
     * @param newTimeCard the object to create/update
     * @return the created TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TimeCard put(final TimeCard newTimeCard) throws ClientException {
        return send(HttpMethod.PUT, newTimeCard);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITimeCardRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TimeCardRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITimeCardRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TimeCardRequest)this;
     }

}

