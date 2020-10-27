// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonExtension;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Extension Request.
 */
public class PersonExtensionRequest extends BaseRequest implements IPersonExtensionRequest {
	
    /**
     * The request for the PersonExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonExtensionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonExtension.class);
    }

    /**
     * Gets the PersonExtension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PersonExtension> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonExtension from the service
     *
     * @return the PersonExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PersonExtension> callback) {
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
     * Patches this PersonExtension with a source
     *
     * @param sourcePersonExtension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PersonExtension sourcePersonExtension, final ICallback<? super PersonExtension> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonExtension);
    }

    /**
     * Patches this PersonExtension with a source
     *
     * @param sourcePersonExtension the source object with updates
     * @return the updated PersonExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonExtension patch(final PersonExtension sourcePersonExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PersonExtension newPersonExtension, final ICallback<? super PersonExtension> callback) {
        send(HttpMethod.POST, callback, newPersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the new object to create
     * @return the created PersonExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonExtension post(final PersonExtension newPersonExtension) throws ClientException {
        return send(HttpMethod.POST, newPersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PersonExtension newPersonExtension, final ICallback<? super PersonExtension> callback) {
        send(HttpMethod.PUT, callback, newPersonExtension);
    }

    /**
     * Creates a PersonExtension with a new object
     *
     * @param newPersonExtension the object to create/update
     * @return the created PersonExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonExtension put(final PersonExtension newPersonExtension) throws ClientException {
        return send(HttpMethod.PUT, newPersonExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonExtensionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PersonExtensionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonExtensionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PersonExtensionRequest)this;
     }

}

