// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.ediscovery.requests.extensions.ITagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ITagWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.TagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.TagWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag Request.
 */
public class TagRequest extends BaseRequest implements ITagRequest {
	
    /**
     * The request for the Tag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TagRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Tag.class);
    }

    /**
     * Gets the Tag from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Tag> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Tag from the service
     *
     * @return the Tag from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Tag get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Tag> callback) {
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
     * Patches this Tag with a source
     *
     * @param sourceTag the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Tag sourceTag, final ICallback<? super Tag> callback) {
        send(HttpMethod.PATCH, callback, sourceTag);
    }

    /**
     * Patches this Tag with a source
     *
     * @param sourceTag the source object with updates
     * @return the updated Tag
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Tag patch(final Tag sourceTag) throws ClientException {
        return send(HttpMethod.PATCH, sourceTag);
    }

    /**
     * Creates a Tag with a new object
     *
     * @param newTag the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Tag newTag, final ICallback<? super Tag> callback) {
        send(HttpMethod.POST, callback, newTag);
    }

    /**
     * Creates a Tag with a new object
     *
     * @param newTag the new object to create
     * @return the created Tag
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Tag post(final Tag newTag) throws ClientException {
        return send(HttpMethod.POST, newTag);
    }

    /**
     * Creates a Tag with a new object
     *
     * @param newTag the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Tag newTag, final ICallback<? super Tag> callback) {
        send(HttpMethod.PUT, callback, newTag);
    }

    /**
     * Creates a Tag with a new object
     *
     * @param newTag the object to create/update
     * @return the created Tag
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Tag put(final Tag newTag) throws ClientException {
        return send(HttpMethod.PUT, newTag);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITagRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TagRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITagRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TagRequest)this;
     }

}

