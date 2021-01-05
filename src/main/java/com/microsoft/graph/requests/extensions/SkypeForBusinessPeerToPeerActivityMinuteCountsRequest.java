// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityMinuteCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Peer To Peer Activity Minute Counts Request.
 */
public class SkypeForBusinessPeerToPeerActivityMinuteCountsRequest extends BaseRequest implements ISkypeForBusinessPeerToPeerActivityMinuteCountsRequest {
	
    /**
     * The request for the SkypeForBusinessPeerToPeerActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessPeerToPeerActivityMinuteCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessPeerToPeerActivityMinuteCounts.class);
    }

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityMinuteCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SkypeForBusinessPeerToPeerActivityMinuteCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityMinuteCounts from the service
     *
     * @return the SkypeForBusinessPeerToPeerActivityMinuteCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityMinuteCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SkypeForBusinessPeerToPeerActivityMinuteCounts> callback) {
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
     * Patches this SkypeForBusinessPeerToPeerActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityMinuteCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessPeerToPeerActivityMinuteCounts sourceSkypeForBusinessPeerToPeerActivityMinuteCounts, final ICallback<? super SkypeForBusinessPeerToPeerActivityMinuteCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessPeerToPeerActivityMinuteCounts);
    }

    /**
     * Patches this SkypeForBusinessPeerToPeerActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityMinuteCounts the source object with updates
     * @return the updated SkypeForBusinessPeerToPeerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityMinuteCounts patch(final SkypeForBusinessPeerToPeerActivityMinuteCounts sourceSkypeForBusinessPeerToPeerActivityMinuteCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessPeerToPeerActivityMinuteCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityMinuteCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessPeerToPeerActivityMinuteCounts newSkypeForBusinessPeerToPeerActivityMinuteCounts, final ICallback<? super SkypeForBusinessPeerToPeerActivityMinuteCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessPeerToPeerActivityMinuteCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityMinuteCounts the new object to create
     * @return the created SkypeForBusinessPeerToPeerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityMinuteCounts post(final SkypeForBusinessPeerToPeerActivityMinuteCounts newSkypeForBusinessPeerToPeerActivityMinuteCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessPeerToPeerActivityMinuteCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityMinuteCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkypeForBusinessPeerToPeerActivityMinuteCounts newSkypeForBusinessPeerToPeerActivityMinuteCounts, final ICallback<? super SkypeForBusinessPeerToPeerActivityMinuteCounts> callback) {
        send(HttpMethod.PUT, callback, newSkypeForBusinessPeerToPeerActivityMinuteCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityMinuteCounts the object to create/update
     * @return the created SkypeForBusinessPeerToPeerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityMinuteCounts put(final SkypeForBusinessPeerToPeerActivityMinuteCounts newSkypeForBusinessPeerToPeerActivityMinuteCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessPeerToPeerActivityMinuteCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessPeerToPeerActivityMinuteCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessPeerToPeerActivityMinuteCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessPeerToPeerActivityMinuteCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessPeerToPeerActivityMinuteCountsRequest)this;
     }

}

