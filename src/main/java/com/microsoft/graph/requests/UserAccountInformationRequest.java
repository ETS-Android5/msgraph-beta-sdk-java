// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserAccountInformation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Account Information Request.
 */
public class UserAccountInformationRequest extends BaseRequest<UserAccountInformation> {
	
    /**
     * The request for the UserAccountInformation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserAccountInformationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserAccountInformation.class);
    }

    /**
     * Gets the UserAccountInformation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserAccountInformation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserAccountInformation from the service
     *
     * @return the UserAccountInformation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserAccountInformation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserAccountInformation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserAccountInformation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserAccountInformation with a source
     *
     * @param sourceUserAccountInformation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserAccountInformation> patchAsync(@Nonnull final UserAccountInformation sourceUserAccountInformation) {
        return sendAsync(HttpMethod.PATCH, sourceUserAccountInformation);
    }

    /**
     * Patches this UserAccountInformation with a source
     *
     * @param sourceUserAccountInformation the source object with updates
     * @return the updated UserAccountInformation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserAccountInformation patch(@Nonnull final UserAccountInformation sourceUserAccountInformation) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserAccountInformation);
    }

    /**
     * Creates a UserAccountInformation with a new object
     *
     * @param newUserAccountInformation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserAccountInformation> postAsync(@Nonnull final UserAccountInformation newUserAccountInformation) {
        return sendAsync(HttpMethod.POST, newUserAccountInformation);
    }

    /**
     * Creates a UserAccountInformation with a new object
     *
     * @param newUserAccountInformation the new object to create
     * @return the created UserAccountInformation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserAccountInformation post(@Nonnull final UserAccountInformation newUserAccountInformation) throws ClientException {
        return send(HttpMethod.POST, newUserAccountInformation);
    }

    /**
     * Creates a UserAccountInformation with a new object
     *
     * @param newUserAccountInformation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserAccountInformation> putAsync(@Nonnull final UserAccountInformation newUserAccountInformation) {
        return sendAsync(HttpMethod.PUT, newUserAccountInformation);
    }

    /**
     * Creates a UserAccountInformation with a new object
     *
     * @param newUserAccountInformation the object to create/update
     * @return the created UserAccountInformation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserAccountInformation put(@Nonnull final UserAccountInformation newUserAccountInformation) throws ClientException {
        return send(HttpMethod.PUT, newUserAccountInformation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserAccountInformationRequest select(@Nonnull final String value) {
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
     public UserAccountInformationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

