// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Definition Request.
 */
public class DirectoryDefinitionRequest extends BaseRequest implements IDirectoryDefinitionRequest {
	
    /**
     * The request for the DirectoryDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryDefinition.class);
    }

    /**
     * Gets the DirectoryDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DirectoryDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryDefinition from the service
     *
     * @return the DirectoryDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DirectoryDefinition> callback) {
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
     * Patches this DirectoryDefinition with a source
     *
     * @param sourceDirectoryDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectoryDefinition sourceDirectoryDefinition, final ICallback<DirectoryDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryDefinition);
    }

    /**
     * Patches this DirectoryDefinition with a source
     *
     * @param sourceDirectoryDefinition the source object with updates
     * @return the updated DirectoryDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryDefinition patch(final DirectoryDefinition sourceDirectoryDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryDefinition);
    }

    /**
     * Creates a DirectoryDefinition with a new object
     *
     * @param newDirectoryDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectoryDefinition newDirectoryDefinition, final ICallback<DirectoryDefinition> callback) {
        send(HttpMethod.POST, callback, newDirectoryDefinition);
    }

    /**
     * Creates a DirectoryDefinition with a new object
     *
     * @param newDirectoryDefinition the new object to create
     * @return the created DirectoryDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryDefinition post(final DirectoryDefinition newDirectoryDefinition) throws ClientException {
        return send(HttpMethod.POST, newDirectoryDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectoryDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DirectoryDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectoryDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DirectoryDefinitionRequest)this;
     }

}

