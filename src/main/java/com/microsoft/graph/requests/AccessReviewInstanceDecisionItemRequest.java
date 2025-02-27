// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItem;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItemFilterByCurrentUserOptions;
import com.microsoft.graph.requests.GovernanceInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceInsightRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item Request.
 */
public class AccessReviewInstanceDecisionItemRequest extends BaseRequest<AccessReviewInstanceDecisionItem> {
	
    /**
     * The request for the AccessReviewInstanceDecisionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceDecisionItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewInstanceDecisionItem.class);
    }

    /**
     * Gets the AccessReviewInstanceDecisionItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstanceDecisionItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AccessReviewInstanceDecisionItem from the service
     *
     * @return the AccessReviewInstanceDecisionItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstanceDecisionItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstanceDecisionItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AccessReviewInstanceDecisionItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessReviewInstanceDecisionItem with a source
     *
     * @param sourceAccessReviewInstanceDecisionItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstanceDecisionItem> patchAsync(@Nonnull final AccessReviewInstanceDecisionItem sourceAccessReviewInstanceDecisionItem) {
        return sendAsync(HttpMethod.PATCH, sourceAccessReviewInstanceDecisionItem);
    }

    /**
     * Patches this AccessReviewInstanceDecisionItem with a source
     *
     * @param sourceAccessReviewInstanceDecisionItem the source object with updates
     * @return the updated AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstanceDecisionItem patch(@Nonnull final AccessReviewInstanceDecisionItem sourceAccessReviewInstanceDecisionItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewInstanceDecisionItem);
    }

    /**
     * Creates a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstanceDecisionItem> postAsync(@Nonnull final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) {
        return sendAsync(HttpMethod.POST, newAccessReviewInstanceDecisionItem);
    }

    /**
     * Creates a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the new object to create
     * @return the created AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstanceDecisionItem post(@Nonnull final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewInstanceDecisionItem);
    }

    /**
     * Creates a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstanceDecisionItem> putAsync(@Nonnull final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) {
        return sendAsync(HttpMethod.PUT, newAccessReviewInstanceDecisionItem);
    }

    /**
     * Creates a AccessReviewInstanceDecisionItem with a new object
     *
     * @param newAccessReviewInstanceDecisionItem the object to create/update
     * @return the created AccessReviewInstanceDecisionItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstanceDecisionItem put(@Nonnull final AccessReviewInstanceDecisionItem newAccessReviewInstanceDecisionItem) throws ClientException {
        return send(HttpMethod.PUT, newAccessReviewInstanceDecisionItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessReviewInstanceDecisionItemRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AccessReviewInstanceDecisionItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

