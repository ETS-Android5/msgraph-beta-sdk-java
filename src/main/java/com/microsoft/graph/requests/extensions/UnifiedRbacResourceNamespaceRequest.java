// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRbacResourceNamespace;
import com.microsoft.graph.requests.extensions.IUnifiedRbacResourceActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRbacResourceActionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceActionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Namespace Request.
 */
public class UnifiedRbacResourceNamespaceRequest extends BaseRequest implements IUnifiedRbacResourceNamespaceRequest {
	
    /**
     * The request for the UnifiedRbacResourceNamespace
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRbacResourceNamespaceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRbacResourceNamespace.class);
    }

    /**
     * Gets the UnifiedRbacResourceNamespace from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRbacResourceNamespace> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRbacResourceNamespace from the service
     *
     * @return the UnifiedRbacResourceNamespace from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRbacResourceNamespace get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRbacResourceNamespace> callback) {
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
     * Patches this UnifiedRbacResourceNamespace with a source
     *
     * @param sourceUnifiedRbacResourceNamespace the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRbacResourceNamespace sourceUnifiedRbacResourceNamespace, final ICallback<? super UnifiedRbacResourceNamespace> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRbacResourceNamespace);
    }

    /**
     * Patches this UnifiedRbacResourceNamespace with a source
     *
     * @param sourceUnifiedRbacResourceNamespace the source object with updates
     * @return the updated UnifiedRbacResourceNamespace
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRbacResourceNamespace patch(final UnifiedRbacResourceNamespace sourceUnifiedRbacResourceNamespace) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRbacResourceNamespace);
    }

    /**
     * Creates a UnifiedRbacResourceNamespace with a new object
     *
     * @param newUnifiedRbacResourceNamespace the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRbacResourceNamespace newUnifiedRbacResourceNamespace, final ICallback<? super UnifiedRbacResourceNamespace> callback) {
        send(HttpMethod.POST, callback, newUnifiedRbacResourceNamespace);
    }

    /**
     * Creates a UnifiedRbacResourceNamespace with a new object
     *
     * @param newUnifiedRbacResourceNamespace the new object to create
     * @return the created UnifiedRbacResourceNamespace
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRbacResourceNamespace post(final UnifiedRbacResourceNamespace newUnifiedRbacResourceNamespace) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRbacResourceNamespace);
    }

    /**
     * Creates a UnifiedRbacResourceNamespace with a new object
     *
     * @param newUnifiedRbacResourceNamespace the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRbacResourceNamespace newUnifiedRbacResourceNamespace, final ICallback<? super UnifiedRbacResourceNamespace> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRbacResourceNamespace);
    }

    /**
     * Creates a UnifiedRbacResourceNamespace with a new object
     *
     * @param newUnifiedRbacResourceNamespace the object to create/update
     * @return the created UnifiedRbacResourceNamespace
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRbacResourceNamespace put(final UnifiedRbacResourceNamespace newUnifiedRbacResourceNamespace) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRbacResourceNamespace);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRbacResourceNamespaceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRbacResourceNamespaceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRbacResourceNamespaceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRbacResourceNamespaceRequest)this;
     }

}

