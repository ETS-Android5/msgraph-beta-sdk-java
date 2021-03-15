// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyPresentationText;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Text Request.
 */
public class GroupPolicyPresentationTextRequest extends BaseRequest<GroupPolicyPresentationText> {
	
    /**
     * The request for the GroupPolicyPresentationText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationTextRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationText.class);
    }

    /**
     * Gets the GroupPolicyPresentationText from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationText> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyPresentationText from the service
     *
     * @return the GroupPolicyPresentationText from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationText get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationText> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyPresentationText delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyPresentationText with a source
     *
     * @param sourceGroupPolicyPresentationText the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationText> patchAsync(@Nonnull final GroupPolicyPresentationText sourceGroupPolicyPresentationText) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyPresentationText);
    }

    /**
     * Patches this GroupPolicyPresentationText with a source
     *
     * @param sourceGroupPolicyPresentationText the source object with updates
     * @return the updated GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationText patch(@Nonnull final GroupPolicyPresentationText sourceGroupPolicyPresentationText) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationText> postAsync(@Nonnull final GroupPolicyPresentationText newGroupPolicyPresentationText) {
        return sendAsync(HttpMethod.POST, newGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the new object to create
     * @return the created GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationText post(@Nonnull final GroupPolicyPresentationText newGroupPolicyPresentationText) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationText> putAsync(@Nonnull final GroupPolicyPresentationText newGroupPolicyPresentationText) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyPresentationText);
    }

    /**
     * Creates a GroupPolicyPresentationText with a new object
     *
     * @param newGroupPolicyPresentationText the object to create/update
     * @return the created GroupPolicyPresentationText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationText put(@Nonnull final GroupPolicyPresentationText newGroupPolicyPresentationText) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationText);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyPresentationTextRequest select(@Nonnull final String value) {
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
     public GroupPolicyPresentationTextRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

