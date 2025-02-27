// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MobileAppPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Policy Set Item Request.
 */
public class MobileAppPolicySetItemRequest extends BaseRequest<MobileAppPolicySetItem> {
	
    /**
     * The request for the MobileAppPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppPolicySetItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppPolicySetItem.class);
    }

    /**
     * Gets the MobileAppPolicySetItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppPolicySetItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MobileAppPolicySetItem from the service
     *
     * @return the MobileAppPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppPolicySetItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MobileAppPolicySetItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MobileAppPolicySetItem with a source
     *
     * @param sourceMobileAppPolicySetItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppPolicySetItem> patchAsync(@Nonnull final MobileAppPolicySetItem sourceMobileAppPolicySetItem) {
        return sendAsync(HttpMethod.PATCH, sourceMobileAppPolicySetItem);
    }

    /**
     * Patches this MobileAppPolicySetItem with a source
     *
     * @param sourceMobileAppPolicySetItem the source object with updates
     * @return the updated MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppPolicySetItem patch(@Nonnull final MobileAppPolicySetItem sourceMobileAppPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppPolicySetItem> postAsync(@Nonnull final MobileAppPolicySetItem newMobileAppPolicySetItem) {
        return sendAsync(HttpMethod.POST, newMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the new object to create
     * @return the created MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppPolicySetItem post(@Nonnull final MobileAppPolicySetItem newMobileAppPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppPolicySetItem> putAsync(@Nonnull final MobileAppPolicySetItem newMobileAppPolicySetItem) {
        return sendAsync(HttpMethod.PUT, newMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the object to create/update
     * @return the created MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppPolicySetItem put(@Nonnull final MobileAppPolicySetItem newMobileAppPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppPolicySetItemRequest select(@Nonnull final String value) {
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
     public MobileAppPolicySetItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

