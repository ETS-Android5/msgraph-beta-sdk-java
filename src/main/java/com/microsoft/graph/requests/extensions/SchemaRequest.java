// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schema;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schema Request.
 */
public class SchemaRequest extends BaseRequest implements ISchemaRequest {
	
    /**
     * The request for the Schema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SchemaRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Schema.class);
    }

    /**
     * Gets the Schema from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Schema> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Schema from the service
     *
     * @return the Schema from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Schema get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Schema> callback) {
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
     * Patches this Schema with a source
     *
     * @param sourceSchema the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Schema sourceSchema, final ICallback<? super Schema> callback) {
        send(HttpMethod.PATCH, callback, sourceSchema);
    }

    /**
     * Patches this Schema with a source
     *
     * @param sourceSchema the source object with updates
     * @return the updated Schema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Schema patch(final Schema sourceSchema) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Schema newSchema, final ICallback<? super Schema> callback) {
        send(HttpMethod.POST, callback, newSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the new object to create
     * @return the created Schema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Schema post(final Schema newSchema) throws ClientException {
        return send(HttpMethod.POST, newSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Schema newSchema, final ICallback<? super Schema> callback) {
        send(HttpMethod.PUT, callback, newSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the object to create/update
     * @return the created Schema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Schema put(final Schema newSchema) throws ClientException {
        return send(HttpMethod.PUT, newSchema);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISchemaRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SchemaRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISchemaRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SchemaRequest)this;
     }

}

