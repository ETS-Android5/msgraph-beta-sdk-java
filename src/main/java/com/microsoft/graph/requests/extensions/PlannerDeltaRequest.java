// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerDelta;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Delta Request.
 */
public class PlannerDeltaRequest extends BaseRequest implements IPlannerDeltaRequest {
	
    /**
     * The request for the PlannerDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PlannerDeltaRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends PlannerDelta> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the PlannerDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerDeltaRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerDelta.class);
    }

    /**
     * Gets the PlannerDelta from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PlannerDelta> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerDelta from the service
     *
     * @return the PlannerDelta from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerDelta get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PlannerDelta> callback) {
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
     * Patches this PlannerDelta with a source
     *
     * @param sourcePlannerDelta the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerDelta sourcePlannerDelta, final ICallback<PlannerDelta> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerDelta);
    }

    /**
     * Patches this PlannerDelta with a source
     *
     * @param sourcePlannerDelta the source object with updates
     * @return the updated PlannerDelta
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerDelta patch(final PlannerDelta sourcePlannerDelta) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerDelta);
    }

    /**
     * Creates a PlannerDelta with a new object
     *
     * @param newPlannerDelta the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerDelta newPlannerDelta, final ICallback<PlannerDelta> callback) {
        send(HttpMethod.POST, callback, newPlannerDelta);
    }

    /**
     * Creates a PlannerDelta with a new object
     *
     * @param newPlannerDelta the new object to create
     * @return the created PlannerDelta
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerDelta post(final PlannerDelta newPlannerDelta) throws ClientException {
        return send(HttpMethod.POST, newPlannerDelta);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerDeltaRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerDeltaRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerDeltaRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerDeltaRequest)this;
     }

}

