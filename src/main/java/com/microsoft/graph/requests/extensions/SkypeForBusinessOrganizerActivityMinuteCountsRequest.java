// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityMinuteCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Organizer Activity Minute Counts Request.
 */
public class SkypeForBusinessOrganizerActivityMinuteCountsRequest extends BaseRequest implements ISkypeForBusinessOrganizerActivityMinuteCountsRequest {
	
    /**
     * The request for the SkypeForBusinessOrganizerActivityMinuteCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessOrganizerActivityMinuteCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessOrganizerActivityMinuteCounts.class);
    }

    /**
     * Gets the SkypeForBusinessOrganizerActivityMinuteCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SkypeForBusinessOrganizerActivityMinuteCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessOrganizerActivityMinuteCounts from the service
     *
     * @return the SkypeForBusinessOrganizerActivityMinuteCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityMinuteCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SkypeForBusinessOrganizerActivityMinuteCounts> callback) {
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
     * Patches this SkypeForBusinessOrganizerActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityMinuteCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessOrganizerActivityMinuteCounts sourceSkypeForBusinessOrganizerActivityMinuteCounts, final ICallback<SkypeForBusinessOrganizerActivityMinuteCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessOrganizerActivityMinuteCounts);
    }

    /**
     * Patches this SkypeForBusinessOrganizerActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityMinuteCounts the source object with updates
     * @return the updated SkypeForBusinessOrganizerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityMinuteCounts patch(final SkypeForBusinessOrganizerActivityMinuteCounts sourceSkypeForBusinessOrganizerActivityMinuteCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessOrganizerActivityMinuteCounts);
    }

    /**
     * Creates a SkypeForBusinessOrganizerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityMinuteCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessOrganizerActivityMinuteCounts newSkypeForBusinessOrganizerActivityMinuteCounts, final ICallback<SkypeForBusinessOrganizerActivityMinuteCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessOrganizerActivityMinuteCounts);
    }

    /**
     * Creates a SkypeForBusinessOrganizerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityMinuteCounts the new object to create
     * @return the created SkypeForBusinessOrganizerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessOrganizerActivityMinuteCounts post(final SkypeForBusinessOrganizerActivityMinuteCounts newSkypeForBusinessOrganizerActivityMinuteCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessOrganizerActivityMinuteCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessOrganizerActivityMinuteCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessOrganizerActivityMinuteCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessOrganizerActivityMinuteCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessOrganizerActivityMinuteCountsRequest)this;
     }

}

