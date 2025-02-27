// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyPresentationValueMultiText;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Value Multi Text Request.
 */
public class GroupPolicyPresentationValueMultiTextRequest extends BaseRequest<GroupPolicyPresentationValueMultiText> {
	
    /**
     * The request for the GroupPolicyPresentationValueMultiText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationValueMultiTextRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationValueMultiText.class);
    }

    /**
     * Gets the GroupPolicyPresentationValueMultiText from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationValueMultiText> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyPresentationValueMultiText from the service
     *
     * @return the GroupPolicyPresentationValueMultiText from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueMultiText get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationValueMultiText> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyPresentationValueMultiText delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyPresentationValueMultiText with a source
     *
     * @param sourceGroupPolicyPresentationValueMultiText the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationValueMultiText> patchAsync(@Nonnull final GroupPolicyPresentationValueMultiText sourceGroupPolicyPresentationValueMultiText) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyPresentationValueMultiText);
    }

    /**
     * Patches this GroupPolicyPresentationValueMultiText with a source
     *
     * @param sourceGroupPolicyPresentationValueMultiText the source object with updates
     * @return the updated GroupPolicyPresentationValueMultiText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueMultiText patch(@Nonnull final GroupPolicyPresentationValueMultiText sourceGroupPolicyPresentationValueMultiText) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationValueMultiText);
    }

    /**
     * Creates a GroupPolicyPresentationValueMultiText with a new object
     *
     * @param newGroupPolicyPresentationValueMultiText the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationValueMultiText> postAsync(@Nonnull final GroupPolicyPresentationValueMultiText newGroupPolicyPresentationValueMultiText) {
        return sendAsync(HttpMethod.POST, newGroupPolicyPresentationValueMultiText);
    }

    /**
     * Creates a GroupPolicyPresentationValueMultiText with a new object
     *
     * @param newGroupPolicyPresentationValueMultiText the new object to create
     * @return the created GroupPolicyPresentationValueMultiText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueMultiText post(@Nonnull final GroupPolicyPresentationValueMultiText newGroupPolicyPresentationValueMultiText) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationValueMultiText);
    }

    /**
     * Creates a GroupPolicyPresentationValueMultiText with a new object
     *
     * @param newGroupPolicyPresentationValueMultiText the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationValueMultiText> putAsync(@Nonnull final GroupPolicyPresentationValueMultiText newGroupPolicyPresentationValueMultiText) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyPresentationValueMultiText);
    }

    /**
     * Creates a GroupPolicyPresentationValueMultiText with a new object
     *
     * @param newGroupPolicyPresentationValueMultiText the object to create/update
     * @return the created GroupPolicyPresentationValueMultiText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueMultiText put(@Nonnull final GroupPolicyPresentationValueMultiText newGroupPolicyPresentationValueMultiText) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationValueMultiText);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyPresentationValueMultiTextRequest select(@Nonnull final String value) {
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
     public GroupPolicyPresentationValueMultiTextRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

