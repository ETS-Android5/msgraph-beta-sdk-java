// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyDefinition;
import com.microsoft.graph.requests.GroupPolicyCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionFileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyPresentationCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupPolicyPresentationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Request.
 */
public class GroupPolicyDefinitionRequest extends BaseRequest<GroupPolicyDefinition> {
	
    /**
     * The request for the GroupPolicyDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinition.class);
    }

    /**
     * Gets the GroupPolicyDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyDefinition from the service
     *
     * @return the GroupPolicyDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyDefinition with a source
     *
     * @param sourceGroupPolicyDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyDefinition> patchAsync(@Nonnull final GroupPolicyDefinition sourceGroupPolicyDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyDefinition);
    }

    /**
     * Patches this GroupPolicyDefinition with a source
     *
     * @param sourceGroupPolicyDefinition the source object with updates
     * @return the updated GroupPolicyDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyDefinition patch(@Nonnull final GroupPolicyDefinition sourceGroupPolicyDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyDefinition);
    }

    /**
     * Creates a GroupPolicyDefinition with a new object
     *
     * @param newGroupPolicyDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyDefinition> postAsync(@Nonnull final GroupPolicyDefinition newGroupPolicyDefinition) {
        return sendAsync(HttpMethod.POST, newGroupPolicyDefinition);
    }

    /**
     * Creates a GroupPolicyDefinition with a new object
     *
     * @param newGroupPolicyDefinition the new object to create
     * @return the created GroupPolicyDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyDefinition post(@Nonnull final GroupPolicyDefinition newGroupPolicyDefinition) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyDefinition);
    }

    /**
     * Creates a GroupPolicyDefinition with a new object
     *
     * @param newGroupPolicyDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyDefinition> putAsync(@Nonnull final GroupPolicyDefinition newGroupPolicyDefinition) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyDefinition);
    }

    /**
     * Creates a GroupPolicyDefinition with a new object
     *
     * @param newGroupPolicyDefinition the object to create/update
     * @return the created GroupPolicyDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyDefinition put(@Nonnull final GroupPolicyDefinition newGroupPolicyDefinition) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyDefinitionRequest select(@Nonnull final String value) {
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
     public GroupPolicyDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

