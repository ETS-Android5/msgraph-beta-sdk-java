// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Hierarchy Model Request.
 */
public class OnenoteEntityHierarchyModelRequest extends BaseRequest implements IOnenoteEntityHierarchyModelRequest {
	
    /**
     * The request for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OnenoteEntityHierarchyModelRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends OnenoteEntityHierarchyModel> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityHierarchyModelRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteEntityHierarchyModel.class);
    }

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteEntityHierarchyModel from the service
     *
     * @return the OnenoteEntityHierarchyModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteEntityHierarchyModel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OnenoteEntityHierarchyModel> callback) {
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
     * Patches this OnenoteEntityHierarchyModel with a source
     *
     * @param sourceOnenoteEntityHierarchyModel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteEntityHierarchyModel);
    }

    /**
     * Patches this OnenoteEntityHierarchyModel with a source
     *
     * @param sourceOnenoteEntityHierarchyModel the source object with updates
     * @return the updated OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteEntityHierarchyModel patch(final OnenoteEntityHierarchyModel sourceOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.POST, callback, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the new object to create
     * @return the created OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteEntityHierarchyModel post(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.POST, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel, final ICallback<? super OnenoteEntityHierarchyModel> callback) {
        send(HttpMethod.PUT, callback, newOnenoteEntityHierarchyModel);
    }

    /**
     * Creates a OnenoteEntityHierarchyModel with a new object
     *
     * @param newOnenoteEntityHierarchyModel the object to create/update
     * @return the created OnenoteEntityHierarchyModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OnenoteEntityHierarchyModel put(final OnenoteEntityHierarchyModel newOnenoteEntityHierarchyModel) throws ClientException {
        return send(HttpMethod.PUT, newOnenoteEntityHierarchyModel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOnenoteEntityHierarchyModelRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OnenoteEntityHierarchyModelRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOnenoteEntityHierarchyModelRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OnenoteEntityHierarchyModelRequest)this;
     }

}

