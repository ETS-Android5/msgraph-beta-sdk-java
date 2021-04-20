// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.B2cIdentityUserFlow;
import com.microsoft.graph.requests.IdentityProviderCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderWithReferenceRequestBuilder;
import com.microsoft.graph.requests.UserFlowLanguageConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.UserFlowLanguageConfigurationRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2c Identity User Flow Request.
 */
public class B2cIdentityUserFlowRequest extends BaseRequest<B2cIdentityUserFlow> {
	
    /**
     * The request for the B2cIdentityUserFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public B2cIdentityUserFlowRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, B2cIdentityUserFlow.class);
    }

    /**
     * Gets the B2cIdentityUserFlow from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<B2cIdentityUserFlow> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the B2cIdentityUserFlow from the service
     *
     * @return the B2cIdentityUserFlow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public B2cIdentityUserFlow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<B2cIdentityUserFlow> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public B2cIdentityUserFlow delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this B2cIdentityUserFlow with a source
     *
     * @param sourceB2cIdentityUserFlow the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<B2cIdentityUserFlow> patchAsync(@Nonnull final B2cIdentityUserFlow sourceB2cIdentityUserFlow) {
        return sendAsync(HttpMethod.PATCH, sourceB2cIdentityUserFlow);
    }

    /**
     * Patches this B2cIdentityUserFlow with a source
     *
     * @param sourceB2cIdentityUserFlow the source object with updates
     * @return the updated B2cIdentityUserFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public B2cIdentityUserFlow patch(@Nonnull final B2cIdentityUserFlow sourceB2cIdentityUserFlow) throws ClientException {
        return send(HttpMethod.PATCH, sourceB2cIdentityUserFlow);
    }

    /**
     * Creates a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<B2cIdentityUserFlow> postAsync(@Nonnull final B2cIdentityUserFlow newB2cIdentityUserFlow) {
        return sendAsync(HttpMethod.POST, newB2cIdentityUserFlow);
    }

    /**
     * Creates a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the new object to create
     * @return the created B2cIdentityUserFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public B2cIdentityUserFlow post(@Nonnull final B2cIdentityUserFlow newB2cIdentityUserFlow) throws ClientException {
        return send(HttpMethod.POST, newB2cIdentityUserFlow);
    }

    /**
     * Creates a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<B2cIdentityUserFlow> putAsync(@Nonnull final B2cIdentityUserFlow newB2cIdentityUserFlow) {
        return sendAsync(HttpMethod.PUT, newB2cIdentityUserFlow);
    }

    /**
     * Creates a B2cIdentityUserFlow with a new object
     *
     * @param newB2cIdentityUserFlow the object to create/update
     * @return the created B2cIdentityUserFlow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public B2cIdentityUserFlow put(@Nonnull final B2cIdentityUserFlow newB2cIdentityUserFlow) throws ClientException {
        return send(HttpMethod.PUT, newB2cIdentityUserFlow);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public B2cIdentityUserFlowRequest select(@Nonnull final String value) {
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
     public B2cIdentityUserFlowRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

