// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceEnvironmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceEnvironmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request.
 */
public class AccessPackageResourceRequest extends BaseRequest implements IAccessPackageResourceRequest {
	
    /**
     * The request for the AccessPackageResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResource.class);
    }

    /**
     * Gets the AccessPackageResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AccessPackageResource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackageResource from the service
     *
     * @return the AccessPackageResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AccessPackageResource> callback) {
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
     * Patches this AccessPackageResource with a source
     *
     * @param sourceAccessPackageResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackageResource sourceAccessPackageResource, final ICallback<? super AccessPackageResource> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackageResource);
    }

    /**
     * Patches this AccessPackageResource with a source
     *
     * @param sourceAccessPackageResource the source object with updates
     * @return the updated AccessPackageResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResource patch(final AccessPackageResource sourceAccessPackageResource) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageResource);
    }

    /**
     * Creates a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackageResource newAccessPackageResource, final ICallback<? super AccessPackageResource> callback) {
        send(HttpMethod.POST, callback, newAccessPackageResource);
    }

    /**
     * Creates a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the new object to create
     * @return the created AccessPackageResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResource post(final AccessPackageResource newAccessPackageResource) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageResource);
    }

    /**
     * Creates a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessPackageResource newAccessPackageResource, final ICallback<? super AccessPackageResource> callback) {
        send(HttpMethod.PUT, callback, newAccessPackageResource);
    }

    /**
     * Creates a AccessPackageResource with a new object
     *
     * @param newAccessPackageResource the object to create/update
     * @return the created AccessPackageResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResource put(final AccessPackageResource newAccessPackageResource) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageResource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageResourceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageResourceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageResourceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageResourceRequest)this;
     }

}

