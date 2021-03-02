// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.requests.extensions.IContentTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Request.
 */
public class ContentTypeRequest extends BaseRequest implements IContentTypeRequest {
	
    /**
     * The request for the ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ContentType.class);
    }

    /**
     * Gets the ContentType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ContentType> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ContentType from the service
     *
     * @return the ContentType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ContentType> callback) {
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
     * Patches this ContentType with a source
     *
     * @param sourceContentType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ContentType sourceContentType, final ICallback<? super ContentType> callback) {
        send(HttpMethod.PATCH, callback, sourceContentType);
    }

    /**
     * Patches this ContentType with a source
     *
     * @param sourceContentType the source object with updates
     * @return the updated ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType patch(final ContentType sourceContentType) throws ClientException {
        return send(HttpMethod.PATCH, sourceContentType);
    }

    /**
     * Creates a ContentType with a new object
     *
     * @param newContentType the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ContentType newContentType, final ICallback<? super ContentType> callback) {
        send(HttpMethod.POST, callback, newContentType);
    }

    /**
     * Creates a ContentType with a new object
     *
     * @param newContentType the new object to create
     * @return the created ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType post(final ContentType newContentType) throws ClientException {
        return send(HttpMethod.POST, newContentType);
    }

    /**
     * Creates a ContentType with a new object
     *
     * @param newContentType the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ContentType newContentType, final ICallback<? super ContentType> callback) {
        send(HttpMethod.PUT, callback, newContentType);
    }

    /**
     * Creates a ContentType with a new object
     *
     * @param newContentType the object to create/update
     * @return the created ContentType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ContentType put(final ContentType newContentType) throws ClientException {
        return send(HttpMethod.PUT, newContentType);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IContentTypeRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ContentTypeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IContentTypeRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ContentTypeRequest)this;
     }

}

