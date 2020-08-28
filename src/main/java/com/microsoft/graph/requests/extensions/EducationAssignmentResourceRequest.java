// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationAssignmentResource;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Resource Request.
 */
public class EducationAssignmentResourceRequest extends BaseRequest implements IEducationAssignmentResourceRequest {
	
    /**
     * The request for the EducationAssignmentResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentResourceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationAssignmentResource.class);
    }

    /**
     * Gets the EducationAssignmentResource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationAssignmentResource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationAssignmentResource from the service
     *
     * @return the EducationAssignmentResource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationAssignmentResource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationAssignmentResource> callback) {
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
     * Patches this EducationAssignmentResource with a source
     *
     * @param sourceEducationAssignmentResource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationAssignmentResource sourceEducationAssignmentResource, final ICallback<EducationAssignmentResource> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationAssignmentResource);
    }

    /**
     * Patches this EducationAssignmentResource with a source
     *
     * @param sourceEducationAssignmentResource the source object with updates
     * @return the updated EducationAssignmentResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationAssignmentResource patch(final EducationAssignmentResource sourceEducationAssignmentResource) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationAssignmentResource);
    }

    /**
     * Creates a EducationAssignmentResource with a new object
     *
     * @param newEducationAssignmentResource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationAssignmentResource newEducationAssignmentResource, final ICallback<EducationAssignmentResource> callback) {
        send(HttpMethod.POST, callback, newEducationAssignmentResource);
    }

    /**
     * Creates a EducationAssignmentResource with a new object
     *
     * @param newEducationAssignmentResource the new object to create
     * @return the created EducationAssignmentResource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationAssignmentResource post(final EducationAssignmentResource newEducationAssignmentResource) throws ClientException {
        return send(HttpMethod.POST, newEducationAssignmentResource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationAssignmentResourceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationAssignmentResourceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationAssignmentResourceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationAssignmentResourceRequest)this;
     }

}

