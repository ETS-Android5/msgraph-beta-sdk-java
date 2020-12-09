// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.generated.ExportOptions;
import com.microsoft.graph.models.generated.ExportFileStructure;
import java.util.EnumSet;
import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Request.
 */
public class ReviewSetRequest extends BaseRequest implements IReviewSetRequest {
	
    /**
     * The request for the ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReviewSet.class);
    }

    /**
     * Gets the ReviewSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ReviewSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ReviewSet from the service
     *
     * @return the ReviewSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ReviewSet> callback) {
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
     * Patches this ReviewSet with a source
     *
     * @param sourceReviewSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ReviewSet sourceReviewSet, final ICallback<? super ReviewSet> callback) {
        send(HttpMethod.PATCH, callback, sourceReviewSet);
    }

    /**
     * Patches this ReviewSet with a source
     *
     * @param sourceReviewSet the source object with updates
     * @return the updated ReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSet patch(final ReviewSet sourceReviewSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceReviewSet);
    }

    /**
     * Creates a ReviewSet with a new object
     *
     * @param newReviewSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ReviewSet newReviewSet, final ICallback<? super ReviewSet> callback) {
        send(HttpMethod.POST, callback, newReviewSet);
    }

    /**
     * Creates a ReviewSet with a new object
     *
     * @param newReviewSet the new object to create
     * @return the created ReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSet post(final ReviewSet newReviewSet) throws ClientException {
        return send(HttpMethod.POST, newReviewSet);
    }

    /**
     * Creates a ReviewSet with a new object
     *
     * @param newReviewSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ReviewSet newReviewSet, final ICallback<? super ReviewSet> callback) {
        send(HttpMethod.PUT, callback, newReviewSet);
    }

    /**
     * Creates a ReviewSet with a new object
     *
     * @param newReviewSet the object to create/update
     * @return the created ReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSet put(final ReviewSet newReviewSet) throws ClientException {
        return send(HttpMethod.PUT, newReviewSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IReviewSetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ReviewSetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IReviewSetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ReviewSetRequest)this;
     }

}

