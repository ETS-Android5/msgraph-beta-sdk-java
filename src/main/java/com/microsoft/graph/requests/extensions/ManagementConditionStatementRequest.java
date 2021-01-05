// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Request.
 */
public class ManagementConditionStatementRequest extends BaseRequest implements IManagementConditionStatementRequest {
	
    /**
     * The request for the ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionStatement.class);
    }

    /**
     * Gets the ManagementConditionStatement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagementConditionStatement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagementConditionStatement from the service
     *
     * @return the ManagementConditionStatement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementConditionStatement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagementConditionStatement> callback) {
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
     * Patches this ManagementConditionStatement with a source
     *
     * @param sourceManagementConditionStatement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagementConditionStatement sourceManagementConditionStatement, final ICallback<? super ManagementConditionStatement> callback) {
        send(HttpMethod.PATCH, callback, sourceManagementConditionStatement);
    }

    /**
     * Patches this ManagementConditionStatement with a source
     *
     * @param sourceManagementConditionStatement the source object with updates
     * @return the updated ManagementConditionStatement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementConditionStatement patch(final ManagementConditionStatement sourceManagementConditionStatement) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagementConditionStatement);
    }

    /**
     * Creates a ManagementConditionStatement with a new object
     *
     * @param newManagementConditionStatement the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagementConditionStatement newManagementConditionStatement, final ICallback<? super ManagementConditionStatement> callback) {
        send(HttpMethod.POST, callback, newManagementConditionStatement);
    }

    /**
     * Creates a ManagementConditionStatement with a new object
     *
     * @param newManagementConditionStatement the new object to create
     * @return the created ManagementConditionStatement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementConditionStatement post(final ManagementConditionStatement newManagementConditionStatement) throws ClientException {
        return send(HttpMethod.POST, newManagementConditionStatement);
    }

    /**
     * Creates a ManagementConditionStatement with a new object
     *
     * @param newManagementConditionStatement the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagementConditionStatement newManagementConditionStatement, final ICallback<? super ManagementConditionStatement> callback) {
        send(HttpMethod.PUT, callback, newManagementConditionStatement);
    }

    /**
     * Creates a ManagementConditionStatement with a new object
     *
     * @param newManagementConditionStatement the object to create/update
     * @return the created ManagementConditionStatement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementConditionStatement put(final ManagementConditionStatement newManagementConditionStatement) throws ClientException {
        return send(HttpMethod.PUT, newManagementConditionStatement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagementConditionStatementRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagementConditionStatementRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagementConditionStatementRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagementConditionStatementRequest)this;
     }

}

