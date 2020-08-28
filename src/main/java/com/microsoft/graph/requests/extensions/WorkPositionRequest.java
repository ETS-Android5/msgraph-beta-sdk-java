// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkPosition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Work Position Request.
 */
public class WorkPositionRequest extends BaseRequest implements IWorkPositionRequest {
	
    /**
     * The request for the WorkPosition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkPositionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkPosition.class);
    }

    /**
     * Gets the WorkPosition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkPosition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkPosition from the service
     *
     * @return the WorkPosition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkPosition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkPosition> callback) {
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
     * Patches this WorkPosition with a source
     *
     * @param sourceWorkPosition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkPosition sourceWorkPosition, final ICallback<WorkPosition> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkPosition);
    }

    /**
     * Patches this WorkPosition with a source
     *
     * @param sourceWorkPosition the source object with updates
     * @return the updated WorkPosition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkPosition patch(final WorkPosition sourceWorkPosition) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkPosition);
    }

    /**
     * Creates a WorkPosition with a new object
     *
     * @param newWorkPosition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkPosition newWorkPosition, final ICallback<WorkPosition> callback) {
        send(HttpMethod.POST, callback, newWorkPosition);
    }

    /**
     * Creates a WorkPosition with a new object
     *
     * @param newWorkPosition the new object to create
     * @return the created WorkPosition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkPosition post(final WorkPosition newWorkPosition) throws ClientException {
        return send(HttpMethod.POST, newWorkPosition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkPositionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkPositionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkPositionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkPositionRequest)this;
     }

}

