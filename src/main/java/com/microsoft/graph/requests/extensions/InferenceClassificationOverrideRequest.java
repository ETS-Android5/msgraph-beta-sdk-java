// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InferenceClassificationOverride;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Inference Classification Override Request.
 */
public class InferenceClassificationOverrideRequest extends BaseRequest implements IInferenceClassificationOverrideRequest {
	
    /**
     * The request for the InferenceClassificationOverride
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InferenceClassificationOverrideRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InferenceClassificationOverride.class);
    }

    /**
     * Gets the InferenceClassificationOverride from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<InferenceClassificationOverride> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the InferenceClassificationOverride from the service
     *
     * @return the InferenceClassificationOverride from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassificationOverride get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<InferenceClassificationOverride> callback) {
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
     * Patches this InferenceClassificationOverride with a source
     *
     * @param sourceInferenceClassificationOverride the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final InferenceClassificationOverride sourceInferenceClassificationOverride, final ICallback<InferenceClassificationOverride> callback) {
        send(HttpMethod.PATCH, callback, sourceInferenceClassificationOverride);
    }

    /**
     * Patches this InferenceClassificationOverride with a source
     *
     * @param sourceInferenceClassificationOverride the source object with updates
     * @return the updated InferenceClassificationOverride
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassificationOverride patch(final InferenceClassificationOverride sourceInferenceClassificationOverride) throws ClientException {
        return send(HttpMethod.PATCH, sourceInferenceClassificationOverride);
    }

    /**
     * Creates a InferenceClassificationOverride with a new object
     *
     * @param newInferenceClassificationOverride the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final InferenceClassificationOverride newInferenceClassificationOverride, final ICallback<InferenceClassificationOverride> callback) {
        send(HttpMethod.POST, callback, newInferenceClassificationOverride);
    }

    /**
     * Creates a InferenceClassificationOverride with a new object
     *
     * @param newInferenceClassificationOverride the new object to create
     * @return the created InferenceClassificationOverride
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public InferenceClassificationOverride post(final InferenceClassificationOverride newInferenceClassificationOverride) throws ClientException {
        return send(HttpMethod.POST, newInferenceClassificationOverride);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IInferenceClassificationOverrideRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (InferenceClassificationOverrideRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IInferenceClassificationOverrideRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (InferenceClassificationOverrideRequest)this;
     }

}

