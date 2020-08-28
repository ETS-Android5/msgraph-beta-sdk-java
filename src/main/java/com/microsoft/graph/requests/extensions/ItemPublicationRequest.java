// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemPublication;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Publication Request.
 */
public class ItemPublicationRequest extends BaseRequest implements IItemPublicationRequest {
	
    /**
     * The request for the ItemPublication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemPublicationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemPublication.class);
    }

    /**
     * Gets the ItemPublication from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ItemPublication> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemPublication from the service
     *
     * @return the ItemPublication from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemPublication get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ItemPublication> callback) {
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
     * Patches this ItemPublication with a source
     *
     * @param sourceItemPublication the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ItemPublication sourceItemPublication, final ICallback<ItemPublication> callback) {
        send(HttpMethod.PATCH, callback, sourceItemPublication);
    }

    /**
     * Patches this ItemPublication with a source
     *
     * @param sourceItemPublication the source object with updates
     * @return the updated ItemPublication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemPublication patch(final ItemPublication sourceItemPublication) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemPublication);
    }

    /**
     * Creates a ItemPublication with a new object
     *
     * @param newItemPublication the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ItemPublication newItemPublication, final ICallback<ItemPublication> callback) {
        send(HttpMethod.POST, callback, newItemPublication);
    }

    /**
     * Creates a ItemPublication with a new object
     *
     * @param newItemPublication the new object to create
     * @return the created ItemPublication
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemPublication post(final ItemPublication newItemPublication) throws ClientException {
        return send(HttpMethod.POST, newItemPublication);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IItemPublicationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ItemPublicationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IItemPublicationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ItemPublicationRequest)this;
     }

}

