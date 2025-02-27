// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TermsAndConditions;
import com.microsoft.graph.requests.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsAssignmentRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.TermsAndConditionsGroupAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Request.
 */
public class TermsAndConditionsRequest extends BaseRequest<TermsAndConditions> {
	
    /**
     * The request for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditions.class);
    }

    /**
     * Gets the TermsAndConditions from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TermsAndConditions> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TermsAndConditions from the service
     *
     * @return the TermsAndConditions from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TermsAndConditions get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TermsAndConditions> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TermsAndConditions delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TermsAndConditions with a source
     *
     * @param sourceTermsAndConditions the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TermsAndConditions> patchAsync(@Nonnull final TermsAndConditions sourceTermsAndConditions) {
        return sendAsync(HttpMethod.PATCH, sourceTermsAndConditions);
    }

    /**
     * Patches this TermsAndConditions with a source
     *
     * @param sourceTermsAndConditions the source object with updates
     * @return the updated TermsAndConditions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TermsAndConditions patch(@Nonnull final TermsAndConditions sourceTermsAndConditions) throws ClientException {
        return send(HttpMethod.PATCH, sourceTermsAndConditions);
    }

    /**
     * Creates a TermsAndConditions with a new object
     *
     * @param newTermsAndConditions the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TermsAndConditions> postAsync(@Nonnull final TermsAndConditions newTermsAndConditions) {
        return sendAsync(HttpMethod.POST, newTermsAndConditions);
    }

    /**
     * Creates a TermsAndConditions with a new object
     *
     * @param newTermsAndConditions the new object to create
     * @return the created TermsAndConditions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TermsAndConditions post(@Nonnull final TermsAndConditions newTermsAndConditions) throws ClientException {
        return send(HttpMethod.POST, newTermsAndConditions);
    }

    /**
     * Creates a TermsAndConditions with a new object
     *
     * @param newTermsAndConditions the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TermsAndConditions> putAsync(@Nonnull final TermsAndConditions newTermsAndConditions) {
        return sendAsync(HttpMethod.PUT, newTermsAndConditions);
    }

    /**
     * Creates a TermsAndConditions with a new object
     *
     * @param newTermsAndConditions the object to create/update
     * @return the created TermsAndConditions
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TermsAndConditions put(@Nonnull final TermsAndConditions newTermsAndConditions) throws ClientException {
        return send(HttpMethod.PUT, newTermsAndConditions);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TermsAndConditionsRequest select(@Nonnull final String value) {
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
     public TermsAndConditionsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

