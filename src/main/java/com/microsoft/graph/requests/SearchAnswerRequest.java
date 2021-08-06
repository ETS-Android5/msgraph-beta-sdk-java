// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SearchAnswer;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Answer Request.
 */
public class SearchAnswerRequest extends BaseRequest<SearchAnswer> {
	
    /**
     * The request for the SearchAnswer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public SearchAnswerRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends SearchAnswer> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the SearchAnswer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SearchAnswerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SearchAnswer.class);
    }

    /**
     * Gets the SearchAnswer from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SearchAnswer> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SearchAnswer from the service
     *
     * @return the SearchAnswer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchAnswer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SearchAnswer> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SearchAnswer delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SearchAnswer with a source
     *
     * @param sourceSearchAnswer the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SearchAnswer> patchAsync(@Nonnull final SearchAnswer sourceSearchAnswer) {
        return sendAsync(HttpMethod.PATCH, sourceSearchAnswer);
    }

    /**
     * Patches this SearchAnswer with a source
     *
     * @param sourceSearchAnswer the source object with updates
     * @return the updated SearchAnswer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchAnswer patch(@Nonnull final SearchAnswer sourceSearchAnswer) throws ClientException {
        return send(HttpMethod.PATCH, sourceSearchAnswer);
    }

    /**
     * Creates a SearchAnswer with a new object
     *
     * @param newSearchAnswer the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SearchAnswer> postAsync(@Nonnull final SearchAnswer newSearchAnswer) {
        return sendAsync(HttpMethod.POST, newSearchAnswer);
    }

    /**
     * Creates a SearchAnswer with a new object
     *
     * @param newSearchAnswer the new object to create
     * @return the created SearchAnswer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchAnswer post(@Nonnull final SearchAnswer newSearchAnswer) throws ClientException {
        return send(HttpMethod.POST, newSearchAnswer);
    }

    /**
     * Creates a SearchAnswer with a new object
     *
     * @param newSearchAnswer the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SearchAnswer> putAsync(@Nonnull final SearchAnswer newSearchAnswer) {
        return sendAsync(HttpMethod.PUT, newSearchAnswer);
    }

    /**
     * Creates a SearchAnswer with a new object
     *
     * @param newSearchAnswer the object to create/update
     * @return the created SearchAnswer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SearchAnswer put(@Nonnull final SearchAnswer newSearchAnswer) throws ClientException {
        return send(HttpMethod.PUT, newSearchAnswer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SearchAnswerRequest select(@Nonnull final String value) {
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
     public SearchAnswerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

