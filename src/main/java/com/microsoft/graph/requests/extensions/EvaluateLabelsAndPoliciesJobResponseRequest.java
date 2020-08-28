// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EvaluateLabelsAndPoliciesJobResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Evaluate Labels And Policies Job Response Request.
 */
public class EvaluateLabelsAndPoliciesJobResponseRequest extends BaseRequest implements IEvaluateLabelsAndPoliciesJobResponseRequest {
	
    /**
     * The request for the EvaluateLabelsAndPoliciesJobResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EvaluateLabelsAndPoliciesJobResponseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EvaluateLabelsAndPoliciesJobResponse.class);
    }

    /**
     * Gets the EvaluateLabelsAndPoliciesJobResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EvaluateLabelsAndPoliciesJobResponse> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EvaluateLabelsAndPoliciesJobResponse from the service
     *
     * @return the EvaluateLabelsAndPoliciesJobResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EvaluateLabelsAndPoliciesJobResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EvaluateLabelsAndPoliciesJobResponse> callback) {
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
     * Patches this EvaluateLabelsAndPoliciesJobResponse with a source
     *
     * @param sourceEvaluateLabelsAndPoliciesJobResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EvaluateLabelsAndPoliciesJobResponse sourceEvaluateLabelsAndPoliciesJobResponse, final ICallback<EvaluateLabelsAndPoliciesJobResponse> callback) {
        send(HttpMethod.PATCH, callback, sourceEvaluateLabelsAndPoliciesJobResponse);
    }

    /**
     * Patches this EvaluateLabelsAndPoliciesJobResponse with a source
     *
     * @param sourceEvaluateLabelsAndPoliciesJobResponse the source object with updates
     * @return the updated EvaluateLabelsAndPoliciesJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EvaluateLabelsAndPoliciesJobResponse patch(final EvaluateLabelsAndPoliciesJobResponse sourceEvaluateLabelsAndPoliciesJobResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourceEvaluateLabelsAndPoliciesJobResponse);
    }

    /**
     * Creates a EvaluateLabelsAndPoliciesJobResponse with a new object
     *
     * @param newEvaluateLabelsAndPoliciesJobResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EvaluateLabelsAndPoliciesJobResponse newEvaluateLabelsAndPoliciesJobResponse, final ICallback<EvaluateLabelsAndPoliciesJobResponse> callback) {
        send(HttpMethod.POST, callback, newEvaluateLabelsAndPoliciesJobResponse);
    }

    /**
     * Creates a EvaluateLabelsAndPoliciesJobResponse with a new object
     *
     * @param newEvaluateLabelsAndPoliciesJobResponse the new object to create
     * @return the created EvaluateLabelsAndPoliciesJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EvaluateLabelsAndPoliciesJobResponse post(final EvaluateLabelsAndPoliciesJobResponse newEvaluateLabelsAndPoliciesJobResponse) throws ClientException {
        return send(HttpMethod.POST, newEvaluateLabelsAndPoliciesJobResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEvaluateLabelsAndPoliciesJobResponseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EvaluateLabelsAndPoliciesJobResponseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEvaluateLabelsAndPoliciesJobResponseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EvaluateLabelsAndPoliciesJobResponseRequest)this;
     }

}

