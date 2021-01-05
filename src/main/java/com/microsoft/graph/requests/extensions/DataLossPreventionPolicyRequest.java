// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;
import com.microsoft.graph.models.extensions.DlpEvaluationInput;
import com.microsoft.graph.models.extensions.DlpNotification;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Loss Prevention Policy Request.
 */
public class DataLossPreventionPolicyRequest extends BaseRequest implements IDataLossPreventionPolicyRequest {
	
    /**
     * The request for the DataLossPreventionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataLossPreventionPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataLossPreventionPolicy.class);
    }

    /**
     * Gets the DataLossPreventionPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DataLossPreventionPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DataLossPreventionPolicy from the service
     *
     * @return the DataLossPreventionPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataLossPreventionPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DataLossPreventionPolicy> callback) {
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
     * Patches this DataLossPreventionPolicy with a source
     *
     * @param sourceDataLossPreventionPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DataLossPreventionPolicy sourceDataLossPreventionPolicy, final ICallback<? super DataLossPreventionPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceDataLossPreventionPolicy);
    }

    /**
     * Patches this DataLossPreventionPolicy with a source
     *
     * @param sourceDataLossPreventionPolicy the source object with updates
     * @return the updated DataLossPreventionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataLossPreventionPolicy patch(final DataLossPreventionPolicy sourceDataLossPreventionPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceDataLossPreventionPolicy);
    }

    /**
     * Creates a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DataLossPreventionPolicy newDataLossPreventionPolicy, final ICallback<? super DataLossPreventionPolicy> callback) {
        send(HttpMethod.POST, callback, newDataLossPreventionPolicy);
    }

    /**
     * Creates a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the new object to create
     * @return the created DataLossPreventionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataLossPreventionPolicy post(final DataLossPreventionPolicy newDataLossPreventionPolicy) throws ClientException {
        return send(HttpMethod.POST, newDataLossPreventionPolicy);
    }

    /**
     * Creates a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DataLossPreventionPolicy newDataLossPreventionPolicy, final ICallback<? super DataLossPreventionPolicy> callback) {
        send(HttpMethod.PUT, callback, newDataLossPreventionPolicy);
    }

    /**
     * Creates a DataLossPreventionPolicy with a new object
     *
     * @param newDataLossPreventionPolicy the object to create/update
     * @return the created DataLossPreventionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataLossPreventionPolicy put(final DataLossPreventionPolicy newDataLossPreventionPolicy) throws ClientException {
        return send(HttpMethod.PUT, newDataLossPreventionPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDataLossPreventionPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DataLossPreventionPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDataLossPreventionPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DataLossPreventionPolicyRequest)this;
     }

}

