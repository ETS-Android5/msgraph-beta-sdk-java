// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Directory;
import com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.AttributeSetCollectionRequestBuilder;
import com.microsoft.graph.requests.AttributeSetRequestBuilder;
import com.microsoft.graph.requests.CustomSecurityAttributeDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomSecurityAttributeDefinitionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.GroupRequestBuilder;
import com.microsoft.graph.requests.ApplicationRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseRequestBuilder;
import com.microsoft.graph.requests.SharedEmailDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.SharedEmailDomainRequestBuilder;
import com.microsoft.graph.requests.FeatureRolloutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.FeatureRolloutPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Request.
 */
public class DirectoryRequest extends BaseRequest<Directory> {
	
    /**
     * The request for the Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Directory.class);
    }

    /**
     * Gets the Directory from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Directory> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Directory from the service
     *
     * @return the Directory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Directory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Directory> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Directory delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Directory with a source
     *
     * @param sourceDirectory the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patchAsync(@Nonnull final Directory sourceDirectory) {
        return sendAsync(HttpMethod.PATCH, sourceDirectory);
    }

    /**
     * Patches this Directory with a source
     *
     * @param sourceDirectory the source object with updates
     * @return the updated Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Directory patch(@Nonnull final Directory sourceDirectory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectory);
    }

    /**
     * Creates a Directory with a new object
     *
     * @param newDirectory the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Directory> postAsync(@Nonnull final Directory newDirectory) {
        return sendAsync(HttpMethod.POST, newDirectory);
    }

    /**
     * Creates a Directory with a new object
     *
     * @param newDirectory the new object to create
     * @return the created Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Directory post(@Nonnull final Directory newDirectory) throws ClientException {
        return send(HttpMethod.POST, newDirectory);
    }

    /**
     * Creates a Directory with a new object
     *
     * @param newDirectory the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Directory> putAsync(@Nonnull final Directory newDirectory) {
        return sendAsync(HttpMethod.PUT, newDirectory);
    }

    /**
     * Creates a Directory with a new object
     *
     * @param newDirectory the object to create/update
     * @return the created Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Directory put(@Nonnull final Directory newDirectory) throws ClientException {
        return send(HttpMethod.PUT, newDirectory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DirectoryRequest select(@Nonnull final String value) {
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
     public DirectoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

