// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceResource;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource Request.
 */
public class GovernanceResourceRequest extends BaseRequest implements IGovernanceResourceRequest {
	
    /**
     * The request for the GovernanceResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceResourceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceResource.class);
    }

    /**
     * Gets the GovernanceResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super GovernanceResource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GovernanceResource from the service
     *
     * @return the GovernanceResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceResource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super GovernanceResource> callback) {
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
     * Patches this GovernanceResource with a source
     *
     * @param sourceGovernanceResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GovernanceResource sourceGovernanceResource, final ICallback<? super GovernanceResource> callback) {
        send(HttpMethod.PATCH, callback, sourceGovernanceResource);
    }

    /**
     * Patches this GovernanceResource with a source
     *
     * @param sourceGovernanceResource the source object with updates
     * @return the updated GovernanceResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceResource patch(final GovernanceResource sourceGovernanceResource) throws ClientException {
        return send(HttpMethod.PATCH, sourceGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GovernanceResource newGovernanceResource, final ICallback<? super GovernanceResource> callback) {
        send(HttpMethod.POST, callback, newGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the new object to create
     * @return the created GovernanceResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceResource post(final GovernanceResource newGovernanceResource) throws ClientException {
        return send(HttpMethod.POST, newGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GovernanceResource newGovernanceResource, final ICallback<? super GovernanceResource> callback) {
        send(HttpMethod.PUT, callback, newGovernanceResource);
    }

    /**
     * Creates a GovernanceResource with a new object
     *
     * @param newGovernanceResource the object to create/update
     * @return the created GovernanceResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceResource put(final GovernanceResource newGovernanceResource) throws ClientException {
        return send(HttpMethod.PUT, newGovernanceResource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGovernanceResourceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GovernanceResourceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGovernanceResourceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GovernanceResourceRequest)this;
     }

}

