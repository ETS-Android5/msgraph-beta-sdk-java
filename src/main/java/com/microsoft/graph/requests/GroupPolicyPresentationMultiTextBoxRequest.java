// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.GroupPolicyPresentationMultiTextBox;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Multi Text Box Request.
 */
public class GroupPolicyPresentationMultiTextBoxRequest extends BaseRequest<GroupPolicyPresentationMultiTextBox> {
	
    /**
     * The request for the GroupPolicyPresentationMultiTextBox
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationMultiTextBoxRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationMultiTextBox.class);
    }

    /**
     * Gets the GroupPolicyPresentationMultiTextBox from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationMultiTextBox> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the GroupPolicyPresentationMultiTextBox from the service
     *
     * @return the GroupPolicyPresentationMultiTextBox from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationMultiTextBox get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationMultiTextBox> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public GroupPolicyPresentationMultiTextBox delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyPresentationMultiTextBox with a source
     *
     * @param sourceGroupPolicyPresentationMultiTextBox the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationMultiTextBox> patchAsync(@Nonnull final GroupPolicyPresentationMultiTextBox sourceGroupPolicyPresentationMultiTextBox) {
        return sendAsync(HttpMethod.PATCH, sourceGroupPolicyPresentationMultiTextBox);
    }

    /**
     * Patches this GroupPolicyPresentationMultiTextBox with a source
     *
     * @param sourceGroupPolicyPresentationMultiTextBox the source object with updates
     * @return the updated GroupPolicyPresentationMultiTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationMultiTextBox patch(@Nonnull final GroupPolicyPresentationMultiTextBox sourceGroupPolicyPresentationMultiTextBox) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationMultiTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationMultiTextBox with a new object
     *
     * @param newGroupPolicyPresentationMultiTextBox the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationMultiTextBox> postAsync(@Nonnull final GroupPolicyPresentationMultiTextBox newGroupPolicyPresentationMultiTextBox) {
        return sendAsync(HttpMethod.POST, newGroupPolicyPresentationMultiTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationMultiTextBox with a new object
     *
     * @param newGroupPolicyPresentationMultiTextBox the new object to create
     * @return the created GroupPolicyPresentationMultiTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationMultiTextBox post(@Nonnull final GroupPolicyPresentationMultiTextBox newGroupPolicyPresentationMultiTextBox) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationMultiTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationMultiTextBox with a new object
     *
     * @param newGroupPolicyPresentationMultiTextBox the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<GroupPolicyPresentationMultiTextBox> putAsync(@Nonnull final GroupPolicyPresentationMultiTextBox newGroupPolicyPresentationMultiTextBox) {
        return sendAsync(HttpMethod.PUT, newGroupPolicyPresentationMultiTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationMultiTextBox with a new object
     *
     * @param newGroupPolicyPresentationMultiTextBox the object to create/update
     * @return the created GroupPolicyPresentationMultiTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationMultiTextBox put(@Nonnull final GroupPolicyPresentationMultiTextBox newGroupPolicyPresentationMultiTextBox) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationMultiTextBox);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyPresentationMultiTextBoxRequest select(@Nonnull final String value) {
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
     public GroupPolicyPresentationMultiTextBoxRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

