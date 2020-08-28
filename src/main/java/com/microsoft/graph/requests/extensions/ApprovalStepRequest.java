// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApprovalStep;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Step Request.
 */
public class ApprovalStepRequest extends BaseRequest implements IApprovalStepRequest {
	
    /**
     * The request for the ApprovalStep
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApprovalStepRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApprovalStep.class);
    }

    /**
     * Gets the ApprovalStep from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ApprovalStep> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ApprovalStep from the service
     *
     * @return the ApprovalStep from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ApprovalStep get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ApprovalStep> callback) {
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
     * Patches this ApprovalStep with a source
     *
     * @param sourceApprovalStep the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ApprovalStep sourceApprovalStep, final ICallback<ApprovalStep> callback) {
        send(HttpMethod.PATCH, callback, sourceApprovalStep);
    }

    /**
     * Patches this ApprovalStep with a source
     *
     * @param sourceApprovalStep the source object with updates
     * @return the updated ApprovalStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ApprovalStep patch(final ApprovalStep sourceApprovalStep) throws ClientException {
        return send(HttpMethod.PATCH, sourceApprovalStep);
    }

    /**
     * Creates a ApprovalStep with a new object
     *
     * @param newApprovalStep the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ApprovalStep newApprovalStep, final ICallback<ApprovalStep> callback) {
        send(HttpMethod.POST, callback, newApprovalStep);
    }

    /**
     * Creates a ApprovalStep with a new object
     *
     * @param newApprovalStep the new object to create
     * @return the created ApprovalStep
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ApprovalStep post(final ApprovalStep newApprovalStep) throws ClientException {
        return send(HttpMethod.POST, newApprovalStep);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IApprovalStepRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ApprovalStepRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IApprovalStepRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ApprovalStepRequest)this;
     }

}

