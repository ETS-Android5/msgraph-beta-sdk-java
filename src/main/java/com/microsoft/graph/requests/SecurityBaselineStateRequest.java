// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SecurityBaselineState;
import com.microsoft.graph.requests.SecurityBaselineSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityBaselineSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State Request.
 */
public class SecurityBaselineStateRequest extends BaseRequest<SecurityBaselineState> {
	
    /**
     * The request for the SecurityBaselineState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineStateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityBaselineState.class);
    }

    /**
     * Gets the SecurityBaselineState from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecurityBaselineState> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SecurityBaselineState from the service
     *
     * @return the SecurityBaselineState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecurityBaselineState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecurityBaselineState> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SecurityBaselineState delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SecurityBaselineState with a source
     *
     * @param sourceSecurityBaselineState the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecurityBaselineState> patchAsync(@Nonnull final SecurityBaselineState sourceSecurityBaselineState) {
        return sendAsync(HttpMethod.PATCH, sourceSecurityBaselineState);
    }

    /**
     * Patches this SecurityBaselineState with a source
     *
     * @param sourceSecurityBaselineState the source object with updates
     * @return the updated SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecurityBaselineState patch(@Nonnull final SecurityBaselineState sourceSecurityBaselineState) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecurityBaselineState> postAsync(@Nonnull final SecurityBaselineState newSecurityBaselineState) {
        return sendAsync(HttpMethod.POST, newSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the new object to create
     * @return the created SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecurityBaselineState post(@Nonnull final SecurityBaselineState newSecurityBaselineState) throws ClientException {
        return send(HttpMethod.POST, newSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SecurityBaselineState> putAsync(@Nonnull final SecurityBaselineState newSecurityBaselineState) {
        return sendAsync(HttpMethod.PUT, newSecurityBaselineState);
    }

    /**
     * Creates a SecurityBaselineState with a new object
     *
     * @param newSecurityBaselineState the object to create/update
     * @return the created SecurityBaselineState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SecurityBaselineState put(@Nonnull final SecurityBaselineState newSecurityBaselineState) throws ClientException {
        return send(HttpMethod.PUT, newSecurityBaselineState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SecurityBaselineStateRequest select(@Nonnull final String value) {
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
     public SecurityBaselineStateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

